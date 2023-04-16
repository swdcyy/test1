package com.kuaishou.live.basic.tk.LiveTkItemManager;
import java.lang.Object;
import z51.g;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import z51.c;
import tx4.w;
import com.kuaishou.live.basic.tk.LiveTkItemManager$createTkItem$1;
import com.kuaishou.live.basic.tk.LiveTkItemManager$createTkItem$2;
import z51.f;
import tx4.f;
import com.kuaishou.tk.api.a;

public final class LiveTkItemManager	// class@000d21
{
    public boolean a;

    public void LiveTkItemManager(){
       super();
    }
    public final void a(){
       this.a = true;
    }
    public final void b(g p0,l p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveTkItemManager.class, "1")) {
          return;
       }
       a.p(p0, "tkItemInfo");
       a.p(p1, "onSuccess");
       a.p(p2, "onFailure");
       c uoc = new c(p0, null);
       LiveTkItemManager$createTkItem$1 uocreateTkIt = new LiveTkItemManager$createTkItem$1(this, p1, uoc);
       LiveTkItemManager$createTkItem$2 uocreateTkIt1 = new LiveTkItemManager$createTkItem$2(this, p2);
       if (!PatchProxy.applyVoidTwoRefs(uocreateTkIt, uocreateTkIt1, uoc, c.class, "5")) {
          a.p(uocreateTkIt, "onLoadSuccess");
          a.p(uocreateTkIt1, "onLoadFailure");
          a.a(uoc.f.a(), -1, true, super(uoc, uocreateTkIt1, uocreateTkIt));
       }
       return;
    }
}
