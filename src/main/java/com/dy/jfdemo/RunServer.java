package com.dy.jfdemo;

import com.jfinal.core.JFinal;
import com.jfinal.kit.PathKit;

/**
 * Created by xixuebin on 15-1-21.
 *
 */
public class RunServer {
    public static void main(String[] args){
        String rootClassPath = PathKit.getRootClassPath();
        String[] temp ;
        if (rootClassPath.contains("\\WEB-INF\\"))
            temp = rootClassPath.split("\\\\");
        else if (rootClassPath.contains("/WEB-INF/"))
            temp = rootClassPath.split("/");
        else
            throw new RuntimeException("WEB-INF directory not found.");
        String webAppDir = temp[temp.length - 3];
        JFinal.start(webAppDir,8080,"/",5);
    }
}
