package rovpp.standalone.hijacksapi.DAO;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
import java.util.*;
import rovpp.standalone.hijacksapi.Model.ModelDeployment;
//import org.springframework.beans.factory.annotation.Qualifier;

public interface DeploymentDao {



    public List<ModelDeployment> getHijacks();
    public int activeHijacksSummary();
}