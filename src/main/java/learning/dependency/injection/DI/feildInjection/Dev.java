package learning.dependency.injection.DI.feildInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // to connect to each other we use @Autosired here and @Component at Laptop class
    // if not the laptop default is null ;
    // we avoid create object like this Laptop laptop = new Laptop ;
    @Autowired // this is call feildInjection
    Computer comp ;



    public void build(){
        // @Component is at Laptop file it will show the Laptop.compile because laptop is implements from Computer
        // if there are @Component on both Desktop and Laptop file it will be error cuz it only want once not twice or more
        // if both haave @Component you cam give it priority by at @Primary to give it priority
        comp .compile();
        System.out.println("I building spring boot project");
    }

    public void DateILearn(){
        System.out.println("I have learn this at 1/13/2026");
    }
}
