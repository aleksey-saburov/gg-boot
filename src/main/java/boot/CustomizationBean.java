package boot;

import java.io.IOException;
import java.net.ServerSocket;

import org.springframework.boot.context.embedded.*;
import org.springframework.stereotype.Component;

@Component
public class CustomizationBean implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
    	int i=8080;
    	for(; i<8090; i++) {
    		try {
				ServerSocket socket = new ServerSocket(i);
				socket.close();
				break;
			} catch (IOException e) {
				continue;
			}
    	}
    		
        container.setPort(i);
    }

}