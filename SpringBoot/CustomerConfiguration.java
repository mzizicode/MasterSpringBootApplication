
import com.example.materClass.CustomerFakeRepository;
import com.example.materClass.CustomerRepo;
import com.example.materClass.CustomerService;
import com.example.materClass.CustomerRepository;
import org.springframework.beans.factory.annotation. Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation. Bean;
import org.springframework.context. annotation.Configuration;
//step 15 :create a new class called CustomerConfiguration or CustomerConfig //annotate it with @Configuration
@Configuration
public class CustomerConfiguration {
@Value ("${app.useFakerCustomerRepo:false}") // step 17
 private Boolean useFakeCustomerRepo;
@Bean//step 16 : annotate this step with @Bean create a CommandLineRunner
// that will return data from the database
CommandLineRunner commandLineRunner() {
    return args -> {
        System.out.println("spring Boot");
    };
}
@Bean//step 17
CustomerRepo customerRepo () {
    System.out.println("use FakeCustomerRepo = " + useFakeCustomerRepo);
     return useFakeCustomerRepo ?
            new CustomerFakeRepository() :
            new CustomerRepository();
        }
    }


//step 17 since we have two implementation to chose from the method above will
// help us switch between the two implementation