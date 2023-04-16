package com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge$d;
import erd.g;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.ref.WeakReference;
import lx5.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;

public class IntimateRelationBridge$d implements g	// class@00191c
{
    public final WeakReference b;

    public void IntimateRelationBridge$d(ReactContext p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntimateRelationBridge$d.class, "1")) {
       }else {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("userId", p0.a);
          writableMap.putBoolean("showStatus", p0.b);
          if (this.b.get() != null) {
             NativeToJsKt.e(this.b.get(), "krnIntimateShowStatusDidChange", writableMap);
          }
       }
       return;
    }
}
