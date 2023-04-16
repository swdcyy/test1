package com.facebook.react.bridge.JavaJSExecutor;
import java.lang.String;

public interface abstract JavaJSExecutor	// class@0011e2
{

    void close();
    String executeJSCall(String p0,String p1);
    void loadApplicationScript(String p0);
    void setGlobalVariable(String p0,String p1);
}
