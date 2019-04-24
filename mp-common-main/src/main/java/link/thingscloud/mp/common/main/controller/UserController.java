package link.thingscloud.mp.common.main.controller;

import link.thingscloud.mp.common.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author :<a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 */
@RestController
@RequestMapping("/main/user")
public class UserController {

    @Autowired
    private UserService userService;


}

