package com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper$a;
import erd.r;
import java.lang.Object;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager$ScatterLoadStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class LiveTaskQueueHelper$a implements r	// class@000907
{
    public static final LiveTaskQueueHelper$a b;

    static {
       LiveTaskQueueHelper$a.b = new LiveTaskQueueHelper$a();
    }
    public void LiveTaskQueueHelper$a(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTaskQueueHelper$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0 == LiveLiteScatterLoadManager$ScatterLoadStatus.NORMAL)? true: false;
       }
       return b;
    }
}
