package com.facebook.fbreact.specs.NativePlatformConstantsIOSSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;

public abstract class NativePlatformConstantsIOSSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010c2
{

    public void NativePlatformConstantsIOSSpec(ReactApplicationContext p0){
       super(p0);
    }
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract Map getTypedExportedConstants();
}
