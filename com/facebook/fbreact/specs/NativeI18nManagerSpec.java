package com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;

public abstract class NativeI18nManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010b1
{

    public void NativeI18nManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void allowRTL(boolean p0);
    public abstract void forceRTL(boolean p0);
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract Map getTypedExportedConstants();
    public abstract void swapLeftAndRightInRTL(boolean p0);
}
