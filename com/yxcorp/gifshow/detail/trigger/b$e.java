package com.yxcorp.gifshow.detail.trigger.b$e;
import d6a.a;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import wkd.b;
import l66.a;
import lnc.u1;
import java.util.List;
import com.kwai.framework.player.helper.f;
import java.util.Iterator;
import crd.b;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$a;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import brd.t;
import l9a.k;
import io.reactivex.internal.functions.Functions;
import erd.g;
import l9a.f;
import l9a.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import l9a.j;
import z8a.c;
import l9a.d;
import gz5.b;
import l9a.c;
import mhc.j;
import l9a.e;
import l9a.h;
import l9a.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import im8.f;
import java.lang.Boolean;

public class b$e extends a	// class@001a22
{
    public final b b;

    public void b$e(b p0){
       this.b = p0;
       super();
    }
    public void F1(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, b$e.class, "2")) {
          return;
       }
       b$e tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, uob, "4")) {
          tb.u.getPlayer().removeOnInfoListener(tb.L);
          b.a(0x6d2a4fdd).c(tb);
          u1.b(tb);
          tb.x.remove(tb.J);
          b k = tb.K;
          if (k != null) {
             k.b();
             tb.K = null;
          }
          Iterator iterator1 = tb.F.iterator();
          while (iterator1.hasNext()) {
             b uob1 = iterator1.next();
             if (!uob1.isDisposed()) {
                uob1.dispose();
             }
          }
          tb.F.clear();
          k = tb.B;
          if (k != null) {
             k.remove(tb.M);
          }
          k = tb.C;
          if (k != null) {
             k.remove(tb.N);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, uob, "20")) {
          Iterator iterator = tb.I.iterator();
          while (iterator.hasNext()) {
             ActionTrigger uActionTrigg = iterator.next();
             Objects.requireNonNull(uActionTrigg);
             if (PatchProxy.applyVoid(null, uActionTrigg, ActionTrigger.class, "5")) {
                continue ;
             }
             uActionTrigg.c.clear();
             uActionTrigg.a();
          }
       }
       this.b.H = 0;
       return;
    }
    public void i2(){
       ActionTrigger b;
       b uob = b.class;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, b$e.class, str)) {
          return;
       }
       b$e tb = this.b;
       b q = tb.q;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(q, tb, uob, "19")) {
          Iterator iterator = tb.I.iterator();
          while (iterator.hasNext()) {
             ActionTrigger uActionTrigg = iterator.next();
             Objects.requireNonNull(uActionTrigg);
             if (PatchProxy.applyVoidOneRefs(q, uActionTrigg, ActionTrigger.class, str)) {
                continue ;
             }else {
                b = uActionTrigg.b;
                boolean b1 = (b != null && (b.i != null && q == uActionTrigg.i))? true: false;
                uActionTrigg.i = q;
                ActionTrigger$a uoa = uActionTrigg.e.b();
                uActionTrigg.b = uoa;
                uoa.i = b1;
                b = uActionTrigg.e;
                if (b != null) {
                   uActionTrigg.c.addAll(b.a(q));
                }
             }
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, uob, "3")) {
          b.a(0x6d2a4fdd).a(tb);
          u1.a(tb);
          tb.u.getPlayer().addOnInfoListener(tb.L);
          f uof = new f();
          tb.K = uof;
          uof.d(tb.u.getPlayer());
          tb.F.add(tb.K.a().subscribe(new k(tb), Functions.e));
          tb.F.add(tb.v.subscribe(new f(tb)));
          b z = tb.z;
          if (z != null) {
             tb.F.add(z.subscribe(new g(tb)));
          }
          tb.x.add(tb.J);
          RxBus f = RxBus.f;
          z a = d.a;
          tb.F.add(f.f(n.class).observeOn(a).subscribe(new j(tb)));
          tb.F.add(f.f(c.class).observeOn(a).subscribe(new d(tb)));
          tb.F.add(f.f(b.class).observeOn(a).subscribe(new c(tb)));
          tb.F.add(f.f(j.class).observeOn(a).subscribe(new e(tb)));
          z = tb.D;
          if (z != null) {
             tb.F.add(z.subscribe(new h(tb), Functions.d()));
          }
          z = tb.E;
          if (z != null) {
             tb.F.add(z.subscribe(new i(tb), Functions.d()));
          }
          z = tb.B;
          if (z != null) {
             z.add(tb.M);
          }
          z = tb.C;
          if (z != null) {
             z.add(tb.N);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, uob, "2")) {
          if (tb.G.r()) {
             tb.R8(2);
          }
          if (tb.w.get().booleanValue()) {
             tb.R8(1);
          }
       }
       return;
    }
}
