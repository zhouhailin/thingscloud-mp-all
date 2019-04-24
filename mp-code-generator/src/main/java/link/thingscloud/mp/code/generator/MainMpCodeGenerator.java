package link.thingscloud.mp.code.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.*;

/**
 * <p>
 *
 * </p>
 *
 * @author : zhouhl
 * @since : 2019/3/7
 */
public class MainMpCodeGenerator {

    private static final String className = System.getProperty("user.dir") + "/mp-common-main/src/main/java";
    private static final String resourceName = System.getProperty("user.dir") + "/mp-common-main/src/main/resources";

    public static String[] tableNames = new String[]{};
    public static String moduleName = "main";
    public static String parentName = "link.thingscloud.mp.common";

    public static void main(String[] args) {
        System.out.println(className);
        System.out.println(resourceName);
        main0();
    }

    public static void main0() {
        int result = 0;
        // 自定义需要填充的字段
        List<TableFill> tableFillList = new ArrayList<>();
        tableFillList.add(new TableFill("UPDATE_TIME", FieldFill.INSERT_UPDATE));
        tableFillList.add(new TableFill("CREATE_TIME", FieldFill.INSERT));

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
                // 全局配置
                new GlobalConfig()
                        .setOutputDir(className)//输出目录
                        .setFileOverride(true)// 是否覆盖文件
                        .setActiveRecord(false)// 开启 activeRecord 模式
                        .setEnableCache(false)// XML 二级缓存
                        .setBaseResultMap(true)// XML ResultMap
                        .setBaseColumnList(true)// XML columList
                        //.setKotlin(true) 是否生成 kotlin 代码
//                        .setAuthor("ant.zhou")
                        // 自定义文件命名，注意 %s 会自动填充表实体属性！
                        .setEntityName("%sDO")
                        .setMapperName("%sMapper")
                        .setXmlName("%sMapper")
                        .setServiceName("%sService")
                        .setServiceImplName("%sServiceImpl")
                        .setControllerName("%sController")
                        .setOpen(false)
        ).setDataSource(
                // 数据源配置
                new DataSourceConfig()
                        .setDbType(DbType.MYSQL)// 数据库类型
                        .setTypeConvert(new MySqlTypeConvert() {
                            // 自定义数据库表字段类型转换【可选】
                            @Override
                            public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                                System.out.println("转换类型：" + fieldType);
                                if (fieldType.toLowerCase().contains("tinyint")) {
                                    return DbColumnType.BOOLEAN;
                                }
//                                 if ( fieldType.toLowerCase().contains( "datetime" ) ) {
//                                     return DbColumnType.TIMESTAMP;
//                                 }
                                return super.processTypeConvert(globalConfig, fieldType);
                            }
                        })
//                        .setDriverName("org.h2.Driver")
//                        .setUsername("root")
//                        .setPassword("test")
//                        .setUrl("jdbc:h2:mem:test")
                        .setDriverName("com.mysql.jdbc.Driver")
                        .setUsername("root")
                        .setPassword("MyNewPass4!")
                        .setUrl("jdbc:mysql://192.168.254.160:3306/mp_main?characterEncoding=utf8&useSSL=false")
        ).setStrategy(
                // 策略配置
                new StrategyConfig()
//                         .setCapitalMode(true)// 全局大写命名
//                         .setDbColumnUnderline(true)//全局下划线命名
//                        .setTablePrefix(new String[]{"todo_"})// 此处可以修改为您的表前缀
                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                        .setInclude(tableNames) // 需要生成的表
                        // .setExclude(new String[]{"test"}) // 排除生成的表
                        // 自定义实体父类
//                         .setSuperEntityClass("com.baomidou.demo.TestEntity")
                        // 自定义实体，公共字段
//                        .setSuperEntityColumns(new String[]{"test_id"})
                        .setTableFillList(tableFillList)
                        // 自定义 mapper 父类
                        // .setSuperMapperClass("com.baomidou.demo.TestMapper")
                        // 自定义 service 父类
                        // .setSuperServiceClass("com.baomidou.demo.TestService")
                        // 自定义 service 实现类父类
                        // .setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl")
                        // 自定义 controller 父类
                        // .setSuperControllerClass("com.baomidou.demo.TestController")
                        // 【实体】是否生成字段常量（默认 false）
                        // public static final String ID = "test_id";
                        // .setEntityColumnConstant(true)
                        // 【实体】是否为构建者模型（默认 false）
                        // public User setName(String name) {this.name = name; return this;}
//                         .setEntityBuilderModel(true)
                        // 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
                        .setEntityLombokModel(true)
                        // Boolean类型字段是否移除is前缀处理
                        // .setEntityBooleanColumnRemoveIsPrefix(true)
                        .setRestControllerStyle(true)
                        // 逻辑删除，数据不删除，只是不在查询结果
                        .setLogicDeleteFieldName("deleted")
                // .setControllerMappingHyphenStyle(true)
        ).setPackageInfo(
                // 包配置
                new PackageConfig()
                        .setModuleName(moduleName)
                        .setParent(parentName)// 自定义包路径
//                        .setController("controller." + "demo")// 这里是控制器包名，默认 web
//                        .setService("service." + "demo")// 这里是控制器包名，默认 web
//                        .setServiceImpl("service." + "demo" + ".impl")// 这里是控制器包名，默认 web
//                        .setMapper("mapper." + "demo")// 这里是控制器包名，默认 web
                        .setEntity("domain.entity")// 这里是控制器包名，默认 web
        ).setCfg(
                // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
                new InjectionConfig() {
                    @Override
                    public void initMap() {
                        Map<String, Object> map = new HashMap<>();
                        map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                        this.setMap(map);
                    }
                }
                        .setFileOutConfigList(Collections.singletonList(new FileOutConfig(
                                "/templates/mapper.xml" + ((1 == result) ? ".ftl" : ".vm")) {
                            // 自定义输出文件目录
                            @Override
                            public String outputFile(TableInfo tableInfo) {
                                tableInfo.setConvert(true);
                                tableInfo.setImportPackages("com.baomidou.mybatisplus.annotation.TableName");
                                return resourceName + "/mapper/" + tableInfo.getMapperName() + ".xml";
                            }
                        }))
        ).setTemplate(
                // 关闭默认 xml 生成，调整生成 至 根目录
                new TemplateConfig().setXml(null)
                        // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
                        // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
                        .setController("template/controller.java.vm")
                        .setEntity("template/entity.java.vm")
                        .setMapper("template/mapper.java.vm")
                        // .setXml("template/mapper.xml.vm")
                        .setService("template/service.java.vm")
                        .setServiceImpl("template/serviceImpl.java.vm")
        );
        // 执行生成
        if (1 == result) {
            mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        }
        mpg.execute();

        // 打印注入设置，这里演示模板里面怎么获取注入内容【可无】
        // System.err.println(mpg.getCfg().getMap().get("abc"));


    }
}
