package com.dy.jfdemo;

import com.dy.jfdemo.Interceptor.AuthInterceptor;
import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 * Created by xixuebin on 2015/1/19.
 *
 */
@Before(AuthInterceptor.class)
public class HelloController extends Controller{
    /**
     * this is the default method, access url is base_url/controllerKey
     */
    @ActionKey("/hello")
    public void index(){
        renderText("hello ,JFinal World.");
    }

    /**
     * access this method with the url is base_url/controllerKey/sayFinal
     */
    public void sayFinal(){
        renderText("hello, I am JFinal !!!");
    }


    @ClearInterceptor
    public void login() {
        renderText("清除上一级别(Controller级)的拦截器");
    }
    @ClearInterceptor(ClearLayer.ALL)
    public void clearAllLayers() {
        renderText("清除所有级别(Global级与Controller级)的拦截器");
    }
}
