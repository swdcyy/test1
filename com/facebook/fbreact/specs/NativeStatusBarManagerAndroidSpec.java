package com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import java.lang.String;

public abstract class NativeStatusBarManagerAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010ca
{

    public void NativeStatusBarManagerAndroidSpec(ReactApplicationContext p0){
       super(p0);
    }
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract Map getTypedExportedConstants();
    public abstract void setColor(double p0,boolean p1);
    public abstract void setHidden(boolean p0);
    public abstract void setStyle(String p0);
    public abstract void setTranslucent(boolean p0);
}
