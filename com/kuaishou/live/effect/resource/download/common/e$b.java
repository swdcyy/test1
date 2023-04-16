package com.kuaishou.live.effect.resource.download.common.e$b;
import c03.l;
import com.kuaishou.live.effect.resource.download.common.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.effect.resource.download.v2.Status;

public class e$b implements l	// class@001b35
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void a(String p0,int p1,Throwable p2){
       if (PatchProxy.isSupport(e$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, e$b.class, "2")) {
          return;
       }
       this.a.d(p0, Status.DOWNLOAD_FAIL);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       this.a.d(p0, Status.DOWNLOAD_SUCCESS);
       return;
    }
}
