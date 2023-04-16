package com.facebook.fbreact.specs.NativeJSDevSupportSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeJSDevSupportSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010b9
{

    public void NativeJSDevSupportSpec(ReactApplicationContext p0){
       super(p0);
    }
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract Map getTypedExportedConstants();
    public abstract void onFailure(double p0,String p1);
    public abstract void onSuccess(ReadableMap p0);
}
