package com.danilo.EsercSkyLabs.Controller;

import com.danilo.EsercSkyLabs.Entity.Records;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest")

public class publicEndPoint {

    //Spring Boot will automagically wire this object using application.properties:
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping(value="/{offset}/{count}")
    public ResponseEntity<Records> GetDenormalizedRecords(@PathVariable(value="offset") String offset, @PathVariable(value="count")String count)
    {
        List<Object> a = jdbcTemplate.query("SELECT age FROM records", (resultSet, rowNum) -> resultSet.getString("age"));

        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i).toString());
        }

        Records r = new Records(30);


        return ResponseEntity.ok(r);
    }


    public int Stats()
    {
        return 1;
    }

}
