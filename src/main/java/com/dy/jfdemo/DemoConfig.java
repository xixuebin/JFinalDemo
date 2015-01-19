package com.dy.jfdemo;

import com.dy.jfdemo.Interceptor.AuthInterceptor;
import com.dy.jfdemo.routes.FrontRoutes;
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
        routes.add("/",HelloController.class);
        routes.add("/hello",HelloController.class);
        routes.add(new FrontRoutes());
    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {
        interceptors.add(new AuthInterceptor());

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
