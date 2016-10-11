package child;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChildProcess {
    private static final Logger LOG = LoggerFactory.getLogger(ChildProcess.class);
    private static int count;

    public static void main(String[] args) {
        while (count++ < 1000) {
            LOG.info("Line of log #" + count);
        }
    }
}
