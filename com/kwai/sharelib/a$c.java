package com.kwai.sharelib.a$c;
import java.lang.Runnable;
import com.kwai.sharelib.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r97.p$a;
import r97.p;
import r97.o$a;
import r97.o;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import c97.d;
import r97.a0;
import uo7.e;
import uo7.k;

public final class a$c implements Runnable	// class@0016a6
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       p op = p.builder().d(o.builder().i("ks_share_lib").h(0x3f800000).b()).e("progress_show_event").f("{\"event\":\"dismissProgressDlg\", \"shareId\":"+this.b.f+'}').b("USER_GROWTH").c();
       a.o(op, "CustomEvent.builder\(\)\n  ¡­GROWTH\"\)\n        .build\(\)");
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       uod.g().H(op);
       e uoe = this.b.g.g();
       if (uoe != null) {
          uoe.c();
       }
       return;
    }
}
