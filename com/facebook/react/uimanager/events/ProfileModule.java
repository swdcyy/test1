package com.facebook.react.uimanager.events.ProfileModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import com.facebook.react.bridge.ReactContext;
import df.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.NativeModule;
import df.f;
import od.a;
import java.util.Iterator;

public class ProfileModule extends ReactContextBaseJavaModule	// class@001340
{
    public final ArrayList mListeners;

    public void ProfileModule(ReactApplicationContext p0){
       super(p0);
       this.mListeners = new ArrayList();
    }
    public static void dispatchEvent(ReactContext p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ProfileModule.class, "1")) {
          return;
       }
       if (p0 != null) {
          ProfileModule nativeModule = p0.getNativeModule(ProfileModule.class);
          if (nativeModule != null) {
             nativeModule.dispatchEvent(p1);
          }
       }
       return;
    }
    public void addListener(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileModule.class, "3")) {
          return;
       }
       this.mListeners.add(p0);
       return;
    }
    public void dispatchEvent(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileModule.class, "2")) {
          return;
       }
       a.b(p0.i(), "Dispatched event hasn\'t been initialized");
       Iterator iterator = this.mListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onEventDispatch(p0);
       }
       return;
    }
    public String getName(){
       return "ProfileModule";
    }
    public void removeListener(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileModule.class, "4")) {
          return;
       }
       this.mListeners.remove(p0);
       return;
    }
}
