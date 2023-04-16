package com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.util.Map;

public abstract class NativePlatformConstantsAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010c1
{

    public void NativePlatformConstantsAndroidSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract String getAndroidID();
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract Map getTypedExportedConstants();
}
