package com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$i;
import erd.g;
import ftd.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import kotlin.Result;
import asd.c;

public final class DetailVideoNeoLivePendantController$i implements g	// class@0009b4
{
    public final k b;

    public void DetailVideoNeoLivePendantController$i(k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailVideoNeoLivePendantController$i.class, "1")) {
       }else {
          j0.b("DetailVideoNeoLivePendantController", "Unexpected net error ", p0);
          this.b.resumeWith(Result.constructor-impl(null));
       }
       return;
    }
}
