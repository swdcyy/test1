package com.kuaishou.live.core.show.pk.bottombar.g;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxGiftParticleAnimationView;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxComboTextAnimationView;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.BackpressureStrategy;
import brd.h;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.pk.bottombar.f;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.b9;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.live.core.show.pk.bottombar.e;
import lnc.c3$a;
import lnc.c3;
import id2.i;
import java.util.concurrent.TimeUnit;
import id2.j;
import bp6.a;

public class g	// class@000d7e
{
    public final LiveGiftComboAnimationView a;
    public final LiveGiftBoxGiftParticleAnimationView b;
    public final LiveGiftBoxComboTextAnimationView c;
    public int d;
    public int e;
    public b f;
    public b g;
    public final b h;
    public final Object i;
    public final c j;
    public boolean k;

    public void g(LiveGiftComboAnimationView p0,LiveGiftBoxGiftParticleAnimationView p1,LiveGiftBoxComboTextAnimationView p2){
       super();
       this.d = 0;
       this.e = 0;
       this.i = new Object();
       PublishSubject publishSubje = PublishSubject.g();
       this.j = publishSubje;
       this.a = p0;
       h oh = publishSubje.toFlowable(BackpressureStrategy.DROP);
       this.h = oh.t(d.c).A(f.b, Functions.e);
       this.b = p1;
       this.c = p2;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       b9.a(this.f);
       b9.a(this.g);
       b9.a(this.h);
       this.d = 0;
       this.e = 0;
       this.k = false;
       View[] viewArray = new View[]{this.a};
       n.Z(8, viewArray);
       c3.c(this.a, e.a);
       return;
    }
    public final void b(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       b9.a(this.f);
       this.f = t.timer(3000, TimeUnit.MILLISECONDS, d.a).subscribe(new j(this, p0), new a());
       return;
    }
}
