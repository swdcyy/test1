package com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import java.lang.String;

public abstract class NativeSourceCodeSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010c9
{

    public void NativeSourceCodeSpec(ReactApplicationContext p0){
       super(p0);
    }
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract String getSourceUrl();
    public abstract Map getTypedExportedConstants();
}
