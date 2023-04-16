package com.facebook.fbreact.specs.NativeBugReportingSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeBugReportingSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010a2
{

    public void NativeBugReportingSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void setCategoryID(String p0);
    public abstract void setExtraData(ReadableMap p0,ReadableMap p1);
    public abstract void startReportAProblemFlow();
}
