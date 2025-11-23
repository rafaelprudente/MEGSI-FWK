package pt.megsi.fwk.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EurekaPortFix implements ApplicationListener<WebServerInitializedEvent> {

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        int port = event.getWebServer().getPort();
        System.setProperty("eureka.instance.nonSecurePort", String.valueOf(port));

        log.info("Eureka port fixed to {}", System.getProperty("eureka.instance.nonSecurePort"));
    }
}
