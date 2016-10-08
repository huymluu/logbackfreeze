package child;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustPrintLogThread extends Thread {
    private static final Logger LOG = LoggerFactory.getLogger(JustPrintLogThread.class);

    @Override
    public void run() {
        LOG.info("Thread name: " + getName());
    }
}
