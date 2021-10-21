package com.danilo.EsercSkyLabs.Controller;

import com.danilo.EsercSkyLabs.Entity.RecordRowMapper;
import com.danilo.EsercSkyLabs.Entity.Records;
import javassist.expr.Cast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/rest")

public class publicEndPoint {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping(value="/offset={offset}&count={count}")
    public ResponseEntity<List<Records>> GetDenormalizedRecords(@PathVariable(value="offset") String offset, @PathVariable(value="count") String count)
    {

        String sql = "SELECT * FROM records LIMIT "+((Integer.parseInt(count)+1));

        List<Records> records = jdbcTemplate.query(sql, new RecordRowMapper());


        return ResponseEntity.ok(records);
    }


    public int Stats()
    {
        return 1;
    }

}
