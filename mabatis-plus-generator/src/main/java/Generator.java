import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Scanner;

/**
 * Generator
 *
 * @author zhoug
 * @date 2024/12/18 16:31
 */


public class Generator {
    static String url = "jdbc:mysql://localhost:3306/%s?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    static String username = "root";
    static String password = "123456";


    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (ipt!=null||!ipt.isEmpty()) {
                return ipt;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String serviceName = scanner();
        String dbUrl = String.format(Generator.url, serviceName);
        String projectPath = System.getProperty("user.dir")+"/work-refactor-"+serviceName;

        FastAutoGenerator.create(dbUrl, username, password)
                .dataSourceConfig(builder ->
                        builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                            int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                            if (typeCode == Types.SMALLINT) {
                                // 自定义类型转换
                                return DbColumnType.INTEGER;
                            }
                            return typeRegistry.getColumnType(metaInfo);
                        })
                )
                .globalConfig(gc -> {
                    gc.outputDir(projectPath + "/src/main/java")
                            .author("mcqzht")
                            .disableOpenDir();
                })
                .packageConfig(pc->{
                    pc.parent("com.work.refactor")
                            .moduleName(serviceName)
                            .entity("model.bo")
                            .mapper("mapper")
                            .xml("mapper.xml")
                            .controller("api");
                })
                .strategyConfig(sc->{
                    sc.entityBuilder()
                            .enableFileOverride()
                            .enableTableFieldAnnotation()
                            .columnNaming(NamingStrategy.underline_to_camel)
                            .serviceBuilder()
                            .enableFileOverride()
                            .controllerBuilder()
                            .convertFileName(s->s+"Api")
                            .enableFileOverride()
                            .enableRestStyle()
                            .mapperBuilder()
                            .enableFileOverride()
                    ;

                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
