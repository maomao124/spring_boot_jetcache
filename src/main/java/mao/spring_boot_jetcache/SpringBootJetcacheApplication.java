package mao.spring_boot_jetcache;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCreateCacheAnnotation
public class SpringBootJetcacheApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootJetcacheApplication.class, args);
    }

}
