package ${package.Service};

import ${package.Entity}.${entity};
import ${superServiceClassPackage};

/**
* <p>
    * ${table.comment!} 服务类
    * </p>
*
* @author :<a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
*/
<#if kotlin>
    interface ${table.serviceName} : ${superServiceClass}<${entity}>
<#else>
    public interface ${table.serviceName} extends ${superServiceClass}<${entity}> {

    }
</#if>
