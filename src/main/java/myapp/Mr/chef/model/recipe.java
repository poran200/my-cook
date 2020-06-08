package myapp.Mr.chef.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class recipe {
    @Id
    private long id;
    private String foodName;
    private String ingredients;
    private String method;
}
