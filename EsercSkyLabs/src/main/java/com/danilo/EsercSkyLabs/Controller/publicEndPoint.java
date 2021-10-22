package com.danilo.EsercSkyLabs.Controller;

import com.danilo.EsercSkyLabs.CSVUtils.CSVUtils;
import com.danilo.EsercSkyLabs.Entity.DenormalizedRecords;
import com.danilo.EsercSkyLabs.Entity.DenormalizedRecordRowMapper;
import com.danilo.EsercSkyLabs.Entity.Stats;
import com.danilo.EsercSkyLabs.Entity.StatsRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value="/rest")

public class publicEndPoint {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Denormalized Records LIST endpoint
    @GetMapping(value="/denorm/offset={offset}&count={count}")
    public ResponseEntity<List<DenormalizedRecords>> GetDenormalizedRecords(@PathVariable(value="offset") String offset, @PathVariable(value="count") String count)
    {
        String sql_select = "R.id, R.age, R.workclass_id, WS.name as 'workclass_name'," +
                "R.education_level_id, EL.name AS 'education_level_name'," +
                "R.education_num, R.marital_status_id, MS.name AS 'marital_status_name'," +
                "R.occupation_id, O.name AS 'occupation_name',R.relationship_id," +
                "RE.name AS 'relationship_name',R.race_id,RA.name AS 'race_name'," +
                "R.sex_id,S.name AS 'sex_name',R.capital_gain,R.capital_loss,R.hours_week," +
                "R.country_id,C.name AS 'country_name',R.over_50k";
        String sql_joins = "(records AS R JOIN workclasses AS WS ON R.workclass_id=WS.id " +
                "JOIN countries AS C ON R.country_id = C.id " +
                "JOIN education_levels AS EL ON R.education_level_id = EL.id " +
                "JOIN marital_statuses AS MS ON R.marital_status_id=MS.id " +
                "JOIN occupations AS O ON R.occupation_id=O.id " +
                "JOIN races AS RA ON R.race_id=RA.id " +
                "JOIN sexes AS S ON R.sex_id=S.id " +
                "JOIN relationships AS RE ON R.relationship_id=RE.id)";
        String sql_limit = ""+((Integer.parseInt(count)));
        String sql= "SELECT " + sql_select + " FROM " + sql_joins;
        if(count!="-1")
            sql += " LIMIT " + sql_limit + "OFFSET " + offset;
        List<DenormalizedRecords> results = jdbcTemplate.query(sql, new DenormalizedRecordRowMapper());

        return ResponseEntity.ok(results);
    }

    //Stats endpoint
    @GetMapping(value="/stats/type={type}&value={value}")
    public ResponseEntity<List<Stats>> Stats(@PathVariable(value="type") String type, @PathVariable(value="value") String value)
    {
        String sql = "SELECT SUM(capital_gain) AS capital_gain_sum," +
                "AVG(capital_gain) AS capital_gain_avg," +
                "SUM(capital_loss) AS capital_loss_sum,AVG(capital_loss) AS capital_loss_avg," +
                "COUNT(CASE WHEN over_50k=1 THEN over_50k END) AS over_50k_count," +
                "COUNT(CASE WHEN over_50k=0 THEN over_50k END) AS under_50k_count " +
                "FROM records " +
                "WHERE " + type + " = " + value;

        System.out.println(sql);

        List<Stats> S = jdbcTemplate.query(sql,new StatsRowMapper());

        for(int i=0;i<S.size();i++)
        {
            S.get(i).setAggregationType(type);
            S.get(i).setAggregationValue(Integer.parseInt(value));
        }
        return ResponseEntity.ok(S);
    }

    //CSV denormalized records download endpoint
    @GetMapping(value="/denorm/download")
    public void CSV_denorm_download(HttpServletResponse response) throws IOException
    {
        String filename = "denorm_records_"+java.time.LocalDateTime.now()+".csv";
        response.setContentType("text/csv");
        response.setHeader("content-disposition", "attachment; filename="+filename);
        List<DenormalizedRecords> out = GetDenormalizedRecords("0","-1").getBody();
        String head = "Id, " +
                "Age, " +
                "Workclass_id, " +
                "Workclass_name, " +
                "Education_level_id, " +
                "Education_level_name, " +
                "Education_num, " +
                "Marital_status_id, " +
                "Marital_status_name, " +
                "Occupation_id, " +
                "Occupation_name, " +
                "Relationship_id, " +
                "Relationship_name, " +
                "Race_id, Race_name, " +
                "Sex_id, Sex_name, " +
                "Capital_gain, " +
                "Capital_loss, " +
                "Hourse_week, " +
                "Country_id, " +
                "Country_name, " +
                "Over_50k\n";
        CSVUtils.downloadCsv(response.getWriter(), out, head) ;
    }
}
