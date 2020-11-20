package cn.cookily.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author cookily
 * @date 2020-10-14
 */
// @Configuration标注在类上，相当于把该类作为spring的xml配置文件中的<beans>，作用为：配置spring容器(应用上下文)
@Configuration
public class ApplicationContextConfig {
    // @Bean标注在方法上(返回某个实例的方法)，等价于spring的xml配置文件中的<bean>，作用为：注册bean对象
    // 也可以这么理解，@Bean相当以前的xml里applicationContext.xml的 <bean id="restTemplate" class="xxx.RestTemplate.class">
    // 反正就是 [@Configuration]声明为配置类，交给spring管理，也就是配置spring容器(应用上下文) 然后 @Bean 注解的方法都会被动态代理，因此调用该方法返回的都是同一个实例
    // 总结：注入直接用，单例
    @Bean
    @LoadBalanced //使用 @LoadBalanced 注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

/**
 * 和xml比较
 *
 * @Configuation等价于<Beans></Beans>
 * @Bean等价于<Bean></Bean>
 * @ComponentScan等价于<context:component-scan base-package=""/>
 */
