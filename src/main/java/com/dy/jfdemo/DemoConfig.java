package com.dy.jfdemo;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;

/**
 * Created by xixuebin on 2015/1/19.
 *
 */
public class DemoConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
        constants.setViewType(ViewType.JSP);

    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/hello",HelloController.class);
    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
