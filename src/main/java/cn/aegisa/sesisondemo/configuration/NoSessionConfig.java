package cn.aegisa.sesisondemo.configuration;

import org.apache.catalina.Context;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018/12/4 15:39
 */
@SpringBootConfiguration
public class NoSessionConfig {

    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer() {
        return new SessionManagerCustomizer();
    }

    class SessionManagerCustomizer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

        @Override
        public void customize(TomcatServletWebServerFactory factory) {
            factory.addContextCustomizers(new TomcatContextCustomizer() {
                @Override
                public void customize(Context context) {
                    NoSessionManager manager = new NoSessionManager();
                    context.setManager(manager);
                }
            });
        }
    }
}
