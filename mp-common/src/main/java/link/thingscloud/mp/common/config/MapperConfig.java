package link.thingscloud.mp.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : <a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 */
@Configuration
@MapperScan("link.thingscloud.mp.common.main.mapper")
public class MapperConfig {
}
