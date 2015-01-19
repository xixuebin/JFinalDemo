package com.dy.jfdemo;

import com.jfinal.core.Controller;

/**
 * Created by xixuebin on 2015/1/19.
 *
 */
public class HelloController extends Controller{
    /**
     * this is the default method, access url is base_url/controllerKey
     */
    public void index(){
        renderText("hello ,JFinal World.");
    }

    /**
     * access this method with the url is base_url/controllerKey/sayFinal
     */
    public void sayFinal(){
        renderText("hello, I am JFinal !!!");
    }
}
