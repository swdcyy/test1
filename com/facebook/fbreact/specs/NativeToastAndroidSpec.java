package com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import java.lang.String;

public abstract class NativeToastAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010d0
{

    public void NativeToastAndroidSpec(ReactApplicationContext p0){
       super(p0);
    }
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract Map getTypedExportedConstants();
    public abstract void show(String p0,double p1);
    public abstract void showWithGravity(String p0,double p1,double p2);
    public abstract void showWithGravityAndOffset(String p0,double p1,double p2,double p3,double p4);
}
