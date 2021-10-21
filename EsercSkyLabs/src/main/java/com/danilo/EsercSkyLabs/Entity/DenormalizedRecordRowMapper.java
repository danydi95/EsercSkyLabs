package com.danilo.EsercSkyLabs.Entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DenormalizedRecordRowMapper implements RowMapper<DenormalizedRecords> {

        @Override
        public DenormalizedRecords mapRow(ResultSet rs, int rowNum) throws SQLException {

            DenormalizedRecords DenormalizedRecords = new DenormalizedRecords(
                    rs.getInt("id"),
                    rs.getInt("age"),
                    rs.getInt("workclass_id"),
                    rs.getString("workclass_name"),
                    rs.getInt("education_level_id"),
                    rs.getString("education_level_name"),
                    rs.getInt("education_num"),
                    rs.getInt("marital_status_id"),
                    rs.getString("marital_status_name"),
                    rs.getInt("occupation_id"),
                    rs.getString("occupation_name"),
                    rs.getInt("relationship_id"),
                    rs.getString("relationship_name"),
                    rs.getInt("race_id"),
                    rs.getString("race_name"),
                    rs.getInt("sex_id"),
                    rs.getString("sex_name"),
                    rs.getInt("capital_gain"),
                    rs.getInt("capital_loss"),
                    rs.getInt("hours_week"),
                    rs.getInt("country_id"),
                    rs.getString("country_name"),
                    rs.getBoolean("over_50k"));
            return DenormalizedRecords;

        }
    }

