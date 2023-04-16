package com.facebook.fbreact.specs.NativeStatusBarManagerIOSSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.util.Map;
import com.facebook.react.bridge.Callback;

public abstract class NativeStatusBarManagerIOSSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010cb
{

    public void NativeStatusBarManagerIOSSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addListener(String p0);
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract void getHeight(Callback p0);
    public abstract Map getTypedExportedConstants();
    public abstract void removeListeners(double p0);
    public abstract void setHidden(boolean p0,String p1);
    public abstract void setNetworkActivityIndicatorVisible(boolean p0);
    public abstract void setStyle(String p0,boolean p1);
}
