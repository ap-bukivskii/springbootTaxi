package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Bean
//@Entity
public class User {
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
}
