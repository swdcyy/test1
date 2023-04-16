package com.facebook.fbreact.specs.NativeStatusBarManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.util.Map;
import com.facebook.react.bridge.Callback;
import java.lang.Boolean;

public abstract class NativeStatusBarManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010cc
{

    public void NativeStatusBarManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addListener(String p0);
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract void getHeight(Callback p0);
    public abstract Map getTypedExportedConstants();
    public abstract void removeListeners(double p0);
    public abstract void setColor(double p0,boolean p1);
    public abstract void setHidden(boolean p0,String p1);
    public abstract void setNetworkActivityIndicatorVisible(boolean p0);
    public abstract void setStyle(String p0,Boolean p1);
    public abstract void setTranslucent(boolean p0);
}
