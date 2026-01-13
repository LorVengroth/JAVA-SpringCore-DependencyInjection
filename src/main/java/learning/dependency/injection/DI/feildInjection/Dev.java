package learning.dependency.injection.DI.feildInjection;


import org.springframework.stereotype.Component;

@Component
public class Dev {

    public void build(){
        System.out.println("I building spring boot project");
    }

    public void DateILearn(){
        System.out.println("I have learn this at 1/13/2026");
    }
}
