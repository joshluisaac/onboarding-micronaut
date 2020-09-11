package onboarding.micronaut;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.runtime.Micronaut;

@Controller("/hello")
public class HelloController {

    @Get
    @Produces
    public String index() {
        return "Hello World";
    }


}
