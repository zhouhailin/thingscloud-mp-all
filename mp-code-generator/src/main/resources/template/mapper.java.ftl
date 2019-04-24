package ${package.Mapper};

import ${package.Entity}.${entity};
import ${superMapperClassPackage};

/**
* <p>
    * ${table.comment!} Mapper 接口
    * </p>
*
* @author :<a href="mailto:ant.zhou@aliyun.com">zhouhailin</a>
*/
<#if kotlin>
    interface ${table.mapperName} : ${superMapperClass}<${entity}>
<#else>
    public interface ${table.mapperName} extends ${superMapperClass}<${entity}> {

    }
</#if>
