package com.kuaishou.live.livestage.utils.CommonUtil$a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe3.e;
import com.kuaishou.live.livestage.utils.CommonUtil;
import android.os.Handler;
import com.kuaishou.live.livestage.utils.a;
import java.lang.Runnable;
import kotlin.jvm.internal.a;

public final class CommonUtil$a implements g	// class@000bf5
{
    public static final CommonUtil$a b;

    static {
       CommonUtil$a.b = new CommonUtil$a();
    }
    public void CommonUtil$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonUtil$a.class, "1")) {
          return;
       }
       e.d.c("LiveStage", "LiveStage Rx Error", p0);
       CommonUtil.e.c().postAtFrontOfQueue(new a(p0));
       a.o(p0, "it");
       throw p0;
    }
}
