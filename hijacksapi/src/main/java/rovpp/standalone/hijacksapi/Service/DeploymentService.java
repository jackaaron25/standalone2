package rovpp.standalone.hijacksapi.Service;

import rovpp.standalone.hijacksapi.DAO.DeploymentDao;
import rovpp.standalone.hijacksapi.Model.ModelDeployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import java.sql.ResultSet;
//import org.springframework.jdbc.core.JdbcTemplate;

//import org.springframework.stereotype.Repository;
import java.util.*;
//import org.springframework.beans.factory.annotation.Qualifier;
@Service
public class DeploymentService {
    private final DeploymentDao deploymentDao;
    @Autowired
    public DeploymentService(DeploymentDao deploymentDao){
        this.deploymentDao = deploymentDao;
    }
    public List<ModelDeployment> getHijacks(){
        return deploymentDao.getHijacks();
    }
    public int activeHijacksSummary(){
        return deploymentDao.activeHijacksSummary();
    }
}