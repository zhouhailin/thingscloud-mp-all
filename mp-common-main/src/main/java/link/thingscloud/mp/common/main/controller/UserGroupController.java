package link.thingscloud.mp.common.main.controller;

import link.thingscloud.mp.common.main.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户群组表 前端控制器
 * </p>
 *
 * @author :<a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 */
@RestController
@RequestMapping("/main/userGroup")
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;


}

