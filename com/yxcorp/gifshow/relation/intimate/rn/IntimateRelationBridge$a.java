package com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge$a;
import erd.g;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.ref.WeakReference;
import lx5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;

public class IntimateRelationBridge$a implements g	// class@001919
{
    public final WeakReference b;

    public void IntimateRelationBridge$a(ReactContext p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntimateRelationBridge$a.class, "1")) {
       }else {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("userId", p0.a);
          writableMap.putInt("intimateType", p0.b);
          if (this.b.get() != null) {
             NativeToJsKt.e(this.b.get(), "krnIntimateRelationDidChange", writableMap);
          }
       }
       return;
    }
}
