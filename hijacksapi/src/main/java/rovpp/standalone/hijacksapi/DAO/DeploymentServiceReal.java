package rovpp.standalone.hijacksapi.DAO;

import rovpp.standalone.hijacksapi.Model.ModelDeployment;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.sql.ResultSet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class DeploymentServiceReal implements DeploymentDao{
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public DeploymentServiceReal(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<ModelDeployment> getHijacks(){
        final String sql = "SELECT * FROM deployment";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
                return new ModelDeployment(Integer.parseInt(resultSet.getString("id")), resultSet.getString("country"), Integer.parseInt(resultSet.getString("detected_as_path")), Integer.parseInt(resultSet.getString("detected_by_bgpmon_peers")), resultSet.getString("detected_origin_name"), Integer.parseInt(resultSet.getString("detected_origin_number")), resultSet.getString("start_time"), resultSet.getString("end_time"), Integer.parseInt(resultSet.getString("event_number")), resultSet.getString("event_type"), resultSet.getString("expected_origin_name"), Integer.parseInt(resultSet.getString("expected_origin_number")), resultSet.getString("expected_prefix"), resultSet.getString("more_specific_prefix"), resultSet.getString("url"));
        });
    }
    @Override
    public int activeHijacksSummary(){
        return 1;
    }
}