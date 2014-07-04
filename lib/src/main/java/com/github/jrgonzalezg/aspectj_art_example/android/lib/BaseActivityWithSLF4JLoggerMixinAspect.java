/*
 *
 */
package com.github.jrgonzalezg.aspectj_art_example.android.lib;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareMixin;

/**
 * @author jrgonzalez
 */
@Aspect
public class BaseActivityWithSLF4JLoggerMixinAspect {

    // The DeclareMixin annotation is attached to a factory method that can return instances of
    // the delegate which offers an implementation of the mixin interface.  The interface that is
    // mixed in is the return type of the method.
    @DeclareMixin("com.github.jrgonzalezg.aspectj_art_example.android.lib.BaseActivity")
    public static ActivityWithSLF4JLogger createActivityWithSLF4JLoggerImpl(Object instance) {
        return new ActivityWithSLF4JLoggerImpl(instance.getClass());
    }

}
