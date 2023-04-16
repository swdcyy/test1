package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$j;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jp2.s;

public final class KtvManager$j extends c	// class@001433
{
    public final KtvManager f;

    public void KtvManager$j(KtvManager p0,String p1){
       this.f = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvManager$j.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.f.i().u1();
       }
       return;
    }
}
