package com.danilo.EsercSkyLabs.CSVUtils;

import com.danilo.EsercSkyLabs.Entity.DenormalizedRecords;

import java.io.PrintWriter;
import java.util.List;

public class CSVUtils
{
    public static void downloadCsv(PrintWriter writer, List<DenormalizedRecords> R, String header)
    {
        writer.write(header);
        for (DenormalizedRecords r : R) {
            writer.write(r.getId() + "," +
                    r.getAge() + "," +
                    r.getWorkclass_id() + "," +
                    r.getWorkclass_name() + "," +
                    r.getEducation_level_id() + "," +
                    r.getEducation_level_name() + "," +
                    r.getEducation_num() + "," +
                    r.getMarital_status_id() + "," +
                    r.getMarital_status_name() + "," +
                    r.getOccupation_id() + "," +
                    r.getOccupation_name() + "," +
                    r.getRelationship_id() + "," +
                    r.getRelationship_name() + "," +
                    r.getRace_id() + "," +
                    r.getRace_name() + "," +
                    r.getSex_id() + "," +
                    r.getSex_name() + "," +
                    r.getCapital_gain() + "," +
                    r.getCapital_loss() + "," +
                    r.getHours_week() + "," +
                    r.getCountry_id() + "," +
                    r.getCountry_name() + "," +
                    r.isOver_50k() + "\n");
        }
    }

}