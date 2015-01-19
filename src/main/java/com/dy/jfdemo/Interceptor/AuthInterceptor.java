package com.dy.jfdemo.Interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

/**
 * Created by xixuebin on 2015/1/19.
 *
 */
public class AuthInterceptor implements Interceptor {
    @Override
    public void intercept(ActionInvocation ai) {
        System.out.println("Before action invoking");
        ai.invoke();
        System.out.println("After action invoking");

    }
}
