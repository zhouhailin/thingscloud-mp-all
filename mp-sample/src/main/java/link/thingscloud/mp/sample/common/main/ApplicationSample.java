package link.thingscloud.mp.sample.common.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 *
 * </p>
 *
 * @author :<a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 */

@ComponentScan(basePackages = "link.thingscloud.mp")
@SpringBootApplication
public class ApplicationSample {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSample.class, args);
    }
}
