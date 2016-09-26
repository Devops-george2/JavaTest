package hello;

import java.util.UUID;

/**
 * Created by panzer on 9/26/16.
 */
public class HelloWorld {
    public String generateUniqueKey(){
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println("Hello World : " + hw.generateUniqueKey());
    }
}
