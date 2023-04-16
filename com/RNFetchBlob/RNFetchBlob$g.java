package com.RNFetchBlob.RNFetchBlob$g;
import com.facebook.react.bridge.LifecycleEventListener;
import com.RNFetchBlob.RNFetchBlob;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;

public class RNFetchBlob$g implements LifecycleEventListener	// class@000d50
{
    public final Promise b;
    public final RNFetchBlob c;

    public void RNFetchBlob$g(RNFetchBlob p0,Promise p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
    }
    public void onHostResume(){
       if (RNFetchBlob.ActionViewVisible) {
          this.b.resolve(null);
       }
       this.c.getReactApplicationContext().removeLifecycleEventListener(this);
       return;
    }
}
