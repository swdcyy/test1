package com.kuaishou.live.core.show.subscribe.dosubscribe.k;
import java.lang.Runnable;
import com.kuaishou.live.core.show.subscribe.dosubscribe.l;
import android.app.Activity;
import com.kuaishou.live.core.show.subscribe.b$a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d61.g;
import java.lang.System;
import pm8.a;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import rk2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import wk2.s;
import com.yxcorp.gifshow.entity.QPhoto;
import rk2.c0;
import android.view.View$OnClickListener;
import rk2.d0;
import rk2.e0;

public final class k implements Runnable	// class@0010e9
{
    public final l b;
    public final Activity c;
    public final b$a d;

    public void k(l p0,Activity p1,b$a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       long l;
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidTwoRefs(tc, td, tb, l.class, "2")) {
       }else if(g.h(tc)){
          l = System.currentTimeMillis();
          if ((l - a.f0()) - 0xa4cb800 >= 0) {
             a.E1(l);
             boolean b = j.f(tc);
             boolean b1 = j.e(tc);
             if (!b && !b1) {
                s.s("PAGE_NAME", tb.a.a("BOTH", false), tb.a.b());
                s.j(tb.b, 1);
                j.j(tc, new c0(tb));
             }else if(!b1){
                s.s("PAGE_NAME", tb.a.a("CALENDAR", false), tb.a.b());
                s.j(tb.b, 3);
                j.k(tc, td, new d0(tb));
             }else if(!b){
                s.s("PAGE_NAME", tb.a.a("PUSH", false), tb.a.b());
                s.j(tb.b, 2);
                j.l(tc, new e0(tb));
             }
          }
       }
       return;
    }
}
