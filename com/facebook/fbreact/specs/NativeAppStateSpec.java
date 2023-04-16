package com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.util.Map;
import com.facebook.react.bridge.Callback;

public abstract class NativeAppStateSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@00109e
{

    public void NativeAppStateSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addListener(String p0);
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract void getCurrentAppState(Callback p0,Callback p1);
    public abstract Map getTypedExportedConstants();
    public abstract void removeListeners(double p0);
}
