package com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContext;
import od.a;
import java.lang.StringBuilder;
import com.facebook.react.bridge.NativeModule;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactSoftException;

public abstract class ReactContextBaseJavaModule extends BaseJavaModule	// class@001221
{
    public ReactApplicationContext mReactApplicationContext;

    public void ReactContextBaseJavaModule(){
       super();
       this.mReactApplicationContext = null;
    }
    public void ReactContextBaseJavaModule(ReactApplicationContext p0){
       super();
       this.mReactApplicationContext = p0;
    }
    public final Activity getCurrentActivity(){
       Object obj = PatchProxy.apply(null, this, ReactContextBaseJavaModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mReactApplicationContext.getCurrentActivity();
    }
    public final ReactApplicationContext getReactApplicationContext(){
       ReactContextBaseJavaModule obj = PatchProxy.apply(null, this, ReactContextBaseJavaModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mReactApplicationContext;
       a.d(obj, "Tried to get ReactApplicationContext even though NativeModule wasn\'t instantiated with one");
       return obj;
    }
    public final ReactApplicationContext getReactApplicationContextIfActiveOrWarn(){
       Object obj = PatchProxy.apply(null, this, ReactContextBaseJavaModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mReactApplicationContext.hasActiveCatalystInstance()) {
          return this.mReactApplicationContext;
       }
       ReactSoftException.logSoftException("ReactContextBaseJavaModule", new RuntimeException("Catalyst Instance has already disappeared: requested by "+this.getName()));
       return null;
    }
}
