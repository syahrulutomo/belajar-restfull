package belajar.restfull.hallo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    private static final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("/user")
    public Object user(@RequestParam(value="username" ,defaultValue="user001") String username)
    {
        long id = counter.incrementAndGet();
        User u = new User(id,username,"irull@yahoo.com");
        return u;
    }
}
