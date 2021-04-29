package is.springdocker;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class ConnectConfig {

    private String url;
    private String usr;
    private String pass;

    @Override
    public String toString() {
        return "ConnectConfig{" +
                " url='" + url + '\'' +
                ", usr='" + usr + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}