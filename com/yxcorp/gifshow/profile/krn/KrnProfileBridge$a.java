package com.yxcorp.gifshow.profile.krn.KrnProfileBridge$a;
import erd.g;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.ref.WeakReference;
import i3c.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;

public class KrnProfileBridge$a implements g	// class@00135f
{
    public WeakReference b;

    public void KrnProfileBridge$a(ReactContext p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnProfileBridge$a.class, "1")) {
       }else {
          p0 = this.b;
          if (p0 != null && p0.get() != null) {
             NativeToJsKt.e(this.b.get(), "FinishPhotoSelectRnEvent", Arguments.createMap());
          }
       }
       return;
    }
}
