package com.kuaishou.krn.bridges.kds.KdsBridge$c;
import f55.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class KdsBridge$c implements g	// class@000815
{
    public final Promise b;

    public void KdsBridge$c(Promise p0){
       this.b = p0;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(KdsBridge$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KdsBridge$c.class, "2")) {
          return;
       }
       this.b.reject(String.valueOf(p0), p1);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsBridge$c.class, "1")) {
          return;
       }
       this.b.resolve(p0);
       return;
    }
}
