package link.thingscloud.mp.common.main.controller;

import link.thingscloud.common.bean.BeanCopier;
import link.thingscloud.mp.common.main.domain.dto.AccessKeyDTO;
import link.thingscloud.mp.common.main.domain.entity.AccessKeyDO;
import link.thingscloud.mp.common.main.service.AccessKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 访问密钥AccessKey（AK） 前端控制器
 * </p>
 *
 * @author :<a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
 */
@RestController
@RequestMapping("/main/accessKey")
public class AccessKeyController {

    @Autowired
    private AccessKeyService accessKeyService;

    private final BeanCopier<AccessKeyDTO, AccessKeyDO> beanCopier = BeanCopier.create(AccessKeyDTO.class, AccessKeyDO.class);

    @PostMapping("/save")
    public boolean save(@RequestBody AccessKeyDTO accessKeyDTO) {
        AccessKeyDO copy = beanCopier.copy(accessKeyDTO, new AccessKeyDO());
        return accessKeyService.save(copy);
    }

    @PostMapping("/remove/{id}")
    public boolean remove(@PathVariable Long id) {
        return accessKeyService.removeById(id);
    }

    @PostMapping("/update/{id}")
    public boolean update(@PathVariable Long id, @RequestBody AccessKeyDTO accessKeyDTO) {
        return accessKeyService.updateById(beanCopier.copy(accessKeyDTO, new AccessKeyDO()));
    }

    @PostMapping("/list")
    public List<AccessKeyDO> list(AccessKeyDTO accessKeyDTO) {
        return accessKeyService.list();
    }

}

