package com.danilo.EsercSkyLabs.Entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StatsRowMapper implements  RowMapper<Stats> {
    @Override
    public Stats mapRow(ResultSet rs, int rowNum) throws SQLException {

        Stats S = new Stats(
                rs.getFloat("capital_gain_sum"),
                rs.getFloat("capital_gain_avg"),
                rs.getFloat("capital_loss_sum"),
                rs.getFloat("capital_loss_avg"),
                rs.getInt("over_50k_count"),
                rs.getInt("over_50k_count"));
        return S;

    }
}


