package com.kuaishou.live.core.show.pk.bottombar.d;
import android.view.View$OnTouchListener;
import com.kuaishou.live.core.show.pk.bottombar.g;
import id2.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.models.Gift;
import android.view.View;
import java.lang.Object;
import android.view.MotionEvent;
import java.util.Objects;
import crd.b;
import lnc.b9;
import com.kuaishou.live.common.core.component.gift.gift.p;
import brd.y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import id2.k;
import bp6.a;
import erd.g;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxGiftParticleAnimationView;

public final class d implements View$OnTouchListener	// class@000d7b
{
    public final g b;
    public final i c;
    public final Runnable d;
    public final Gift e;
    public final View f;
    public final View g;

    public void d(g p0,i p1,Runnable p2,Gift p3,View p4,View p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       d uod = this;
       d b = uod.b;
       d c = uod.c;
       d d = uod.d;
       d e = uod.e;
       d f = uod.f;
       d g = uod.g;
       Objects.requireNonNull(b);
       if (p0.getVisibility()) {
          b.a();
       }else {
          int action = p1.getAction();
          g og = 3;
          int i = 1;
          if (action) {
             if (action != i) {
                if (action == og) {
                   b.e = 0;
                   b9.a(b.g);
                   b.b(c);
                }
             }else if(p.m(e)){
                if (b.k != null) {
                   b.j.onNext(b.i);
                   c.b(b.d);
                   c.a();
                }else {
                   c.c(b.d);
                }
                b.e = 0;
                b9.a(b.g);
                b.b(c);
             }else {
                d.run();
             }
          }else {
             g og1 = g.class;
             if (PatchProxy.isSupport(og1)) {
                Object[] objArray = new Object[]{c,d,e,f,g};
                if (PatchProxy.applyVoid(objArray, b, og1, "3")) {
                label_00be :
                   b9.a(b.f);
                }
             }
             b.e = 0;
             b9.a(b.g);
             b.d = b.d + i;
             b.e = b.e + i;
             b.k = i;
             k ok = new k(b, e, c, f, g, d);
             b.g = t.interval(500, 100, TimeUnit.MILLISECONDS, d.a).subscribe(v14, new a());
             b.b.c(e, f, g);
             goto label_00be ;
          }
       }
       return false;
    }
}
