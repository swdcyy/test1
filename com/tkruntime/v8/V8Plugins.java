package com.tkruntime.v8.V8Plugins;
import java.lang.Object;
import com.tkruntime.v8.V8Plugins$ErrorHandler;

public final class V8Plugins	// class@000fc6
{
    public static V8Plugins$ErrorHandler sJSBindingErrorHandler;

    public void V8Plugins(){
       super();
    }
    public static V8Plugins$ErrorHandler getJSBindingErrorHandler(){
       return V8Plugins.sJSBindingErrorHandler;
    }
    public static void setJSBindingErrorHandler(V8Plugins$ErrorHandler p0){
       V8Plugins.sJSBindingErrorHandler = p0;
    }
}