package ${package.ServiceImpl};

<#if generateService>
import ${package.Service}.${table.serviceName};
</#if>
import org.springframework.stereotype.Service;


/**
 * <p>
 * ${table.comment!} 服务实现类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Service
<#if kotlin>
open class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>()<#if generateService>, ${table.serviceName}</#if> {

}
<#else>
public class ${table.serviceImplName}<#if generateService> implements ${table.serviceName}</#if> {

}
</#if>
