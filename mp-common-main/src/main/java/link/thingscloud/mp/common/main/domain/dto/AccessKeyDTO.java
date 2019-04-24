package link.thingscloud.mp.common.main.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 访问密钥AccessKey（AK）
 * </p>
 *
 * @author :<a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
public class AccessKeyDTO {

    /**
     * 自增标识
     */
    private Long id;

    /**
     * 用户群组标识
     */
    private Long userGroupId;

    /**
     * 标识用户
     */
    private String accessKeyId;

    /**
     * 验证用户的密钥
     */
    private String accessKeySecret;

    /**
     * 1表示禁用，0表示已启用
     */
    private Boolean status;

}
