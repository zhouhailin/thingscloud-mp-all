package link.thingscloud.mp.common.main.domain.dto;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * @author : <a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 */
public class AccessKeyDTOTest {

    @Test
    public void canEqual() {
        AccessKeyDTO accessKeyDTO = new AccessKeyDTO().setAccessKeyId("xxxxx").setAccessKeySecret("bbbb").setUserGroupId(12L);
        System.out.println(JSON.toJSONString(accessKeyDTO, true));
    }
}