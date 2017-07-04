package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetailManagerController {

    private static final String template = "ShopName, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/testRetail")
    public RetailManager retailManager(@RequestParam(value="name", defaultValue="testshopName") String shopName,String shopNumber,String shopPostcode) {
        return new RetailManager(counter.incrementAndGet(),
                            String.format(template, shopName), shopNumber, shopPostcode);
    }
}
