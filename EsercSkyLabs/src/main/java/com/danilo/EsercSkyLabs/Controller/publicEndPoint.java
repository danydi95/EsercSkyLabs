package com.danilo.EsercSkyLabs.Controller;

import com.danilo.EsercSkyLabs.Entity.DenormalizedRecords;
import com.danilo.EsercSkyLabs.Entity.DenormalizedRecordRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedWriter;
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
    public void Stats()
    {

    }

    //CSV denormalized records download endpoint
    @GetMapping(value="/download")
    public void CSV_denorm_download()
    {
        BufferedWriter fileWriter;



        ResponseEntity<List<DenormalizedRecords>> out = GetDenormalizedRecords("0","-1");


        //return Response.ok(myCsvText).header("Content-Disposition", "attachment; filename=" + fileName).build();
    }

}
