package link.thingscloud.mp.common.main.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 用户群组表
 * </p>
 *
 * @author :<a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
public class UserGroupDTO {

    /**
     * 自增标识
     */
    private Long id;

    /**
     * 组名
     */
    private String name;

    /**
     * 访问密钥数量
     */
    private Long accessKeys;

    /**
     * 1表示禁用，0表示已启用
     */
    private Boolean status;

    /**
     * 1表示删除，0表示未删除
     */
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 更新时间
     */
    private LocalDateTime gmtModified;


}
