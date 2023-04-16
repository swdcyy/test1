package com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt$merge$1;

public final class LifecyclesExt	// class@000ff3
{

    public static final LifecycleOwner a(LifecycleOwner p0,LifecycleOwner p1){
       LifecycleOwner[] obj = PatchProxy.applyTwoRefs(p0, p1, null, LifecyclesExt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "owner1");
       a.p(p1, "owner2");
       obj = new LifecycleOwner[0];
       return LifecyclesExt.b(p0, p1, obj);
    }
    public static final LifecycleOwner b(LifecycleOwner p0,LifecycleOwner p1,LifecycleOwner[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LifecyclesExt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "owner1");
       a.p(p1, "owner2");
       a.p(p2, "others");
       return new LifecyclesExt$merge$1(p0, p1, p2);
    }
}
