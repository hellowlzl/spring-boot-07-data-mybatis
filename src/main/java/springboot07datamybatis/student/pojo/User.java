package springboot07datamybatis.student.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

/**
 * @program:spring-boot-07-data-mybatis
 * @description:pojo
 * @author:Mr.Lzl
 * @create:2019-03-27 16:58
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;

    private String  name;

    private String password;
}
