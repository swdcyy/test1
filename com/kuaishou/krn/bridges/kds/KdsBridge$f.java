package com.kuaishou.krn.bridges.kds.KdsBridge$f;
import f55.g;
import com.kuaishou.krn.bridges.kds.KdsBridge;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.HashMap;
import com.kuaishou.krn.base.KrnBridge;

public final class KdsBridge$f implements g	// class@000818
{
    public final KdsBridge b;
    public final Ref$ObjectRef c;

    public void KdsBridge$f(KdsBridge p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(KdsBridge$f.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KdsBridge$f.class, "1")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("errorCode", Integer.valueOf(p0));
       hashMap.put("errorMsg", p1);
       p0.element = this.b.convertBeanToJson(hashMap);
       return;
    }
    public void onSuccess(Object p0){
       this.c.element = p0;
    }
}
