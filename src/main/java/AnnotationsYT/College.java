package AnnotationsYT;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

@PropertySource("classpath:college-info.properties")
public class College {
    @Value("${college.name}")
    private String collegeName;


    @Autowired

    private Principal1 principal1;
    @Autowired
   // @Qualifier("science")
    @Qualifier("maths")
    private ITeacher teacher;


    @Required
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }



//
//    public College(Principal1 principal) {
//        this.principal1 = principal1;
//    }


    public void test()
    {
        System.out.println("Collge name is "+collegeName);
        System.out.println("test");
        principal1.principalinfo();
        teacher.teach();
    }
}
