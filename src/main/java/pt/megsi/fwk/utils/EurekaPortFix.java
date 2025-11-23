package pt.megsi.fwk.utils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EurekaPortFix implements ApplicationListener<WebServerInitializedEvent> {
    private final EurekaInstanceConfigBean eurekaInstanceConfig;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        int port = event.getWebServer().getPort();

        eurekaInstanceConfig.setNonSecurePort(port);
        // Se você também usa HTTPS:
        // eurekaInstanceConfig.setSecurePortEnabled(false);
        log.info("Eureka port fixed to {}", System.getProperty("eureka.instance.nonSecurePort"));
    }
}
