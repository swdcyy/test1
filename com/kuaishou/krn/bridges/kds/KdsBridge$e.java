package com.kuaishou.krn.bridges.kds.KdsBridge$e;
import f55.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.facebook.react.bridge.WritableNativeMap;

public final class KdsBridge$e implements g	// class@000817
{
    public final Ref$ObjectRef b;

    public void KdsBridge$e(Ref$ObjectRef p0){
       this.b = p0;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(KdsBridge$e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KdsBridge$e.class, "1")) {
          return;
       }
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.putInt("errorCode", p0);
       writableNati.putString("errorMsg", p1);
       p0.element = writableNati;
       return;
    }
    public void onSuccess(Object p0){
       this.b.element = p0;
    }
}
