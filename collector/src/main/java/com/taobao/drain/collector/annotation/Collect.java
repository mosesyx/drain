/**
 * 
 */
package com.taobao.drain.collector.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is indicate a method which needs to collect either input parameters, or return result, or both of them.
 * With given rule, the collect module will follow the rule to abstract value from input parameters or return result into local
 * container, then send those result host in container to an Drain agent at regular interval.
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Collect {

	/**
	 * Rule defined what properties need to be collected and how to doing math with those values.
	 * @return
	 */
	String rule() default "com.taobao.drain.collect.rule.default";
	
	/**
	 * Condition defined collect data when the condition is true.
	 * @return
	 */
	String condition() default "com.taobao.drain.collect.condition.default";
		
}
