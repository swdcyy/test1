package com.kuaishou.live.common.core.component.comments.fluency.b;
import android.content.Context;
import sr5.a;
import p91.m;
import as3.a;
import g81.c;
import pe1.b;
import ft5.b;
import n81.d;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.fluency.a;
import lp3.e;
import kg1.e;
import java.lang.Class;
import lp3.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kuaishou.live.common.core.component.comments.fluency.b$a;
import xq5.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ue1.d;
import java.util.Iterator;
import java.util.List;
import te1.c;
import te1.c$a;
import ve1.a;
import ze1.a;
import com.kuaishou.live.common.core.component.comments.fluency.display.a;
import ze1.b;
import af1.x;
import te1.f;
import ok.x;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import lf3.g;
import hf3.a;
import af1.j;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.lang.RuntimeException;
import java.lang.Throwable;
import af1.e;
import vf1.a;
import io.reactivex.g;
import af1.h;
import erd.g;
import af1.g;
import af1.f;
import io.reactivex.internal.functions.Functions;
import crd.b;
import z1.a;
import fq5.b;
import com.kuaishou.live.common.core.component.comments.fluency.quick.j;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed;
import java.lang.Boolean;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import bf1.j;
import te1.e;

public class b	// class@00107c
{
    public final e a;
    public final b b;
    public final e c;
    public final c d;
    public final a e;
    public final a f;
    public final m g;
    public final b h;
    public final d i;
    public final boolean j;
    public final boolean k;
    public final Context l;
    public x m;
    public a n;
    public a o;
    public d p;
    public boolean q;

    public void b(Context p0,a p1,m p2,a p3,c p4,b p5,boolean p6,boolean p7,b p8,d p9){
       super();
       this.n = a.a;
       this.q = false;
       this.g = p2;
       e uoe = p2.t5();
       this.a = uoe;
       this.b = p5;
       this.e = p1;
       this.f = p3;
       this.c = uoe.a(e.class);
       this.d = p4;
       this.h = p8;
       this.i = p9;
       this.l = p0;
       this.j = p6;
       this.k = p7;
       LiveSlidePlayService liveSlidePla = uoe.a(LiveSlidePlayService.class);
       if (liveSlidePla.v()) {
          liveSlidePla.P4(new b$a(this));
       }
       this.b();
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       this.q = false;
       b tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(null, tp, d.class, "11")) {
          Iterator iterator = tp.d.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             uoc.a(tp.e);
             uoc.onDestroy();
          }
          tp.d();
       }
       this.o.onDestroy();
       this.b.a(null);
       return;
    }
    public void b(){
       b uob = b.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, uob, str)) {
          return;
       }
       if (this.q != null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          this.o = new a(this.d, this.j);
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          d uod = new d();
          this.p = uod;
          uod.f = this.o;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
          b uob1 = new b(this.e, this.g, this.f, this.d, this.i, this.k);
          this.b.a(v3);
          this.p.b(v3);
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "8")) {
          x ox = new x(this.l, this.a, new f(this));
          this.m = ox;
          if (!PatchProxy.applyVoid(objArray, ox, x.class, str)) {
             ox.b.u0(510, SCActionSignal.class, ox.i);
             x h = ox.h;
             Objects.requireNonNull(h);
             j oj1 = j.class;
             if (!PatchProxy.applyVoid(objArray, h, oj1, "2")) {
                b.Z(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "HighFluencyStyleController.init");
                j a = h.a;
                t ot = PatchProxy.applyOneRefs(a, objArray, oj1, "4");
                if (ot != PatchProxyResult.class) {
                }else if(a == null){
                   ot = t.error(new RuntimeException("empty delayInfoService"));
                }else {
                   ot = t.create(new e(a)).doOnError(h.b).doOnSubscribe(g.b);
                }
                h.c = ot.subscribe(new f(h), Functions.d());
             }
          }
          this.n.accept(this.m);
          this.p.b(this.m);
       }
       if (this.e.b().e() || (this.h != null && !PatchProxy.applyVoid(objArray, this, uob, "10"))) {
          j oj = new j(this.l, this.a, this.g.u(), this.d, this.h, this.j);
          if (!PatchProxy.applyVoid(objArray, uob, j.class, "3")) {
             uob.a.u0(954, LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened.class, uob.n);
             uob.a.u0(955, LiveQuickCommentContainer$SCLiveQuickCommentContainerClosed.class, uob.o);
          }
          this.p.b(uob);
       }
    label_0147 :
       b.C(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "LiveCommentBottomMessageController#init", c.k("isAnchor", Boolean.valueOf(this.e.b().e()), "mLiveAudienceSendCommentsService", this.h));
       this.q = true;
       return;
    }
    public void c(Class p0,j p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       b tm = this.m;
       if (tm != null) {
          tm.j(p0, p1);
       }else {
          this.n = new e(p0, p1);
       }
       return;
    }
}
