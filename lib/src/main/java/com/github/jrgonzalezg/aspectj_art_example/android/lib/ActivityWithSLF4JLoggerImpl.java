package com.github.jrgonzalezg.aspectj_art_example.android.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jrgonzalez on 4/07/14.
 */
public class ActivityWithSLF4JLoggerImpl implements ActivityWithSLF4JLogger {
    public Logger logger;

    public ActivityWithSLF4JLoggerImpl(Class clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
    }

    @Override
    public Logger getLogger() {
        return this.logger;
    }

}
