package com.facebook.react.transientpage.TransientBundleLoaderSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.ReactContext;
import ze.v;

public abstract class TransientBundleLoaderSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@001301
{

    public void TransientBundleLoaderSpec(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "TransientBundleLoader";
    }
    public abstract boolean loadFirstPage(JSBundleLoaderDelegate p0,boolean p1);
    public abstract void notifyFirstPageAttached(ReactContext p0,v p1);
    public abstract boolean shouldAttachFirstPage(ReactContext p0,int p1);
}
