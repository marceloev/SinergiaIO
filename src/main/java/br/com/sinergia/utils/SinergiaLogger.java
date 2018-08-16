package br.com.sinergia.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.net.URL;

public class SinergiaLogger {

    private static Logger logger;
    private static final String LOG4J_FILE = "/static/properties/log4j.properties";
    private static final URL urlProperties = SinergiaLogger.class.getResource(LOG4J_FILE);

    public static final Logger setLogger(Class classe) {
        PropertyConfigurator.configure(urlProperties);
        logger = Logger.getLogger(classe.getName());
        return logger;
    }

    public static final Logger getLogger() {
        return logger;
    }
}
