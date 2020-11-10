package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FiltredLog {
    static Logger LOG = LogManager.getLogger(FiltredLog.class);
    public static void main() {
        LOG.trace("log-trace");
        LOG.debug("log-debug");
        LOG.info("log-info");
        LOG.warn("log-warn");
        LOG.error("log-error");
        LOG.fatal("log-fatal");
    }
}
