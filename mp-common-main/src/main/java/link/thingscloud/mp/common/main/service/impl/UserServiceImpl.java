package link.thingscloud.mp.common.main.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import link.thingscloud.mp.common.main.domain.entity.UserDO;
import link.thingscloud.mp.common.main.mapper.UserMapper;
import link.thingscloud.mp.common.main.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author :<a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

}
