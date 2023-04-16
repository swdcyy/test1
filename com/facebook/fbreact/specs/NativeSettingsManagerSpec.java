package com.facebook.fbreact.specs.NativeSettingsManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.Map;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeSettingsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010c6
{

    public void NativeSettingsManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void deleteValues(ReadableArray p0);
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract Map getTypedExportedConstants();
    public abstract void setValues(ReadableMap p0);
}
