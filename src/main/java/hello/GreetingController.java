package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
    @RequestMapping("/test")
    public Greeting greeting2(@RequestParam(value="name", defaultValue="Death") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }
    @RequestMapping("/")
    public Learn learn(@RequestParam(value="name", defaultValue="Index") String name){
        return new Learn(counter.incrementAndGet(), String.format(template,name));
    }

    @RequestMapping
    public Greeting whatPage(){
        return new Greeting(404, "What page did you want?");
    }
}
