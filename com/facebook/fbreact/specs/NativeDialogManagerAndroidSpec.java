package com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;

public abstract class NativeDialogManagerAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010ab
{

    public void NativeDialogManagerAndroidSpec(ReactApplicationContext p0){
       super(p0);
    }
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract Map getTypedExportedConstants();
    public abstract void showAlert(ReadableMap p0,Callback p1,Callback p2);
}
