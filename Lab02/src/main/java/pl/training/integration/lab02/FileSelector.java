package pl.training.integration.lab02;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

import java.io.File;

public class FileSelector implements MessageSelector {

    private String fileNameStart;

    public FileSelector(String fileNameStart) {
        this.fileNameStart = fileNameStart;
    }

    @Override
    public boolean accept(Message<?> message) {
        Object payload = message.getPayload();
        if (payload instanceof File) {
            File file = (File) payload;
            return file.getName().startsWith(fileNameStart);
        }
        return false;
    }

}
