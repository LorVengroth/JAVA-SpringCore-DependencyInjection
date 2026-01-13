package learning.dependency.injection.DI.feildInjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compiling with laptop");
    }
}
