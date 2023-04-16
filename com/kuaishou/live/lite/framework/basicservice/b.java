package com.kuaishou.live.lite.framework.basicservice.b;
import erd.r;
import java.lang.Object;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager$ScatterLoadStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class b implements r	// class@00090c
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0 == LiveLiteScatterLoadManager$ScatterLoadStatus.NORMAL)? true: false;
       }
       return b;
    }
}
