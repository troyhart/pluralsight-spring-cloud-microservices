package pluralsight.springcloud.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer
public class PluralsightSpringcloudM4SecureserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(PluralsightSpringcloudM4SecureserviceApplication.class, args);
  }


  @RequestMapping("/tolldata")
 // @PreAuthorize("#oauth2.hasScope('toll_read') and hasAuthority('ROLE_OPERATOR')")
  public ArrayList<TollUsage> getTollData() {

    TollUsage instance1 = new TollUsage("100", "station150", "B65GT1W", "2016-09-30T06:31:22");
    TollUsage instance2 = new TollUsage("101", "station119", "AHY673B", "2016-09-30T06:32:50");
    TollUsage instance3 = new TollUsage("102", "station150", "ZN2GP0", "2016-09-30T06:37:01");

    ArrayList<TollUsage> tolls = new ArrayList<>();
    tolls.add(instance1);
    tolls.add(instance2);
    tolls.add(instance3);

    return tolls;
  }


  public class TollUsage {

    public String Id;
    public String stationId;
    public String licensePlate;
    public String timestamp;

    public TollUsage() {
    }

    public TollUsage(String id, String stationid, String licenseplate, String timestamp) {
      this.Id = id;
      this.stationId = stationid;
      this.licensePlate = licenseplate;
      this.timestamp = timestamp;
    }


  }
}
