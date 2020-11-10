//import log.Log;

import log.FiltredLog;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static final Logger LOG = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Exception e = new RuntimeException("RuntimeException example");
        LOG.trace("trace");
        LOG.debug("debug");
        LOG.info("info");
        LOG.warn("warn");
        LOG.error("error", e);
        LOG.fatal("fatal");

        LOG.fatal("------------------");

        LOG.atLevel(Level.ERROR);
        LOG.debug("after atLevel debug");
        LOG.error("after atLevel error");

        LOG.fatal("------------------");

        FiltredLog.main();
    }
}
