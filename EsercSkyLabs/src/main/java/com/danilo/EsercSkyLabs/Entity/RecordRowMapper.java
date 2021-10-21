package com.danilo.EsercSkyLabs.Entity;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RecordRowMapper implements RowMapper<Records> {

    @Override
    public Records mapRow(ResultSet rs, int rowNum) throws SQLException {

        Records Records = new Records(
                rs.getInt("id"),
                rs.getInt("age"),
                rs.getInt("workclass_id"),
                rs.getInt("education_level_id"),
                rs.getInt("education_num"),
                rs.getInt("marital_status_id"),
                rs.getInt("occupation_id"),
                rs.getInt("relationship_id"),
                rs.getInt("race_id"),
                rs.getInt("sex_id"),
                rs.getInt("capital_gain"),
                rs.getInt("capital_loss"),
                rs.getInt("hours_week"),
                rs.getInt("country_id"),
                rs.getBoolean("over_50k"));

        return Records;

    }
}