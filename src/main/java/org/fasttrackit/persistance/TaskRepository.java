package org.fasttrackit.persistance;

import org.fasttrackit.domain.config.DataBaseConfiguration;
import org.fasttrackit.transfer.CreateTaskRequest;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//DAO (Data Acces Object)

public class TaskRepository {

    public void createTask(CreateTaskRequest request) throws SQLException {
// preventing SQL injection useing placeholders and PreparedStatement
        String sql = "INSERT INTO task (description, deadline) VALUES (?, ?)";

      // try with resources
                try (
            PreparedStatement preparedStatement = DataBaseConfiguration.getConnection().prepareStatement(sql)) {

preparedStatement.setString(1, request.getDescription());
preparedStatement.setDate(2, Date.valueOf(request.getDeadline()));


preparedStatement.executeUpdate();

                }

    }
}
