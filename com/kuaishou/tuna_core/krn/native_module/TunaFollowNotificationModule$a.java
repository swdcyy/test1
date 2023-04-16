package com.kuaishou.tuna_core.krn.native_module.TunaFollowNotificationModule$a;
import erd.g;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.ref.WeakReference;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;

public class TunaFollowNotificationModule$a implements g	// class@0010dc
{
    public final WeakReference b;

    public void TunaFollowNotificationModule$a(ReactContext p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       TunaFollowNotificationModule$a uoa = TunaFollowNotificationModule$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
       }else if(this.b.get() != null){
          ReactContext reactContext = this.b.get();
          if (!PatchProxy.applyVoidTwoRefs(reactContext, p0, this, uoa, "2")) {
             HashMap hashMap = new HashMap();
             hashMap.put("status", Integer.valueOf(p0.g));
             hashMap.put("userId", Long.valueOf(p0.b));
             NativeToJsKt.e(reactContext, "followingChanged", Arguments.makeNativeMap(hashMap));
          }
       }
       return;
    }
}
