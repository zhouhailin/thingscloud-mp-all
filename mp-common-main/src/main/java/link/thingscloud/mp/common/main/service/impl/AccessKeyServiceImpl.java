package link.thingscloud.mp.common.main.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import link.thingscloud.mp.common.main.domain.entity.AccessKeyDO;
import link.thingscloud.mp.common.main.mapper.AccessKeyMapper;
import link.thingscloud.mp.common.main.service.AccessKeyService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 访问密钥AccessKey（AK） 服务实现类
 * </p>
 *
 * @author :<a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 */
@Service
public class AccessKeyServiceImpl extends ServiceImpl<AccessKeyMapper, AccessKeyDO> implements AccessKeyService {

}
