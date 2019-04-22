package net.wanho.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by DELL on 2019/4/22.
 */
@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Person {
    private Integer id;
    private  String name;

}
