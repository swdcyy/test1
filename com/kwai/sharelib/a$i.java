package com.kwai.sharelib.a$i;
import erd.a;
import com.kwai.sharelib.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import uo7.e;
import uo7.k;
import r97.p$a;
import r97.p;
import r97.o$a;
import r97.o;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import c97.d;
import r97.a0;

public final class a$i implements a	// class@0016ac
{
    public final a b;

    public void a$i(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$i.class, "1")) {
          return;
       }
       this.b.f = System.currentTimeMillis();
       this.b.g.g().b();
       p op = p.builder().d(o.builder().i("ks_share_lib").h(0x3f800000).b()).e("progress_show_event").f("{\"event\":\"showProgressDlg\", \"shareId\":"+this.b.f+'}').b("USER_GROWTH").c();
       a.o(op, "CustomEvent.builder\(\)\n  ¡­OWTH\"\)\n          .build\(\)");
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       uod.g().H(op);
       return;
    }
}
