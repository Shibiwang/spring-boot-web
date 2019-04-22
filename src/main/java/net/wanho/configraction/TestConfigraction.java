package net.wanho.configraction;

import net.wanho.pojo.Score;
import net.wanho.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by DELL on 2019/4/22.
 */
@Configuration
public class TestConfigraction {

    @Bean
    public Student student(){
        Student student=new Student();
        student.setId(1);
        student.setName("zhangsan");
        student.setScore(score());
        return student;
    }

    @Bean
    public Score score(){
       Score score=new Score();
       score.setId(1);
       score.setSco(120);
       return  score;

    }
}
