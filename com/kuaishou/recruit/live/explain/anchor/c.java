package com.kuaishou.recruit.live.explain.anchor.c;
import k51.c;
import com.kuaishou.recruit.live.explain.anchor.g;
import it4.b;
import java.lang.Object;
import ok.x;
import it4.h;
import it4.i;
import it4.g;
import it4.f;
import z1.k;
import z1.i;
import io.reactivex.subjects.PublishSubject;
import jt4.a;
import jt4.b;
import com.kuaishou.recruit.live.explain.anchor.b;
import com.kuaishou.recruit.live.explain.anchor.c$a;
import mt4.b;
import java.util.List;
import java.util.Arrays;
import com.kuaishou.recruit.live.explain.anchor.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import hf3.a;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition;
import lf3.g;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelDisplay;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fq5.b;
import sr5.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.recruit.live.explain.anchor.LiveAnchorRecruitExplainPendantView;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import t45.d;
import brd.z;
import brd.t;
import it4.k;
import bp6.a;
import erd.g;
import crd.b;
import java.util.Iterator;
import java.util.Set;
import it4.j;
import vq5.b;
import vq5.d;
import com.kuaishou.live.anchorchat.LiveAnchorChatBaseService;
import lp3.c;
import lp3.e;
import com.kuaishou.live.anchorchat.LiveAnchorChatBaseService$a;
import crd.a;
import bq5.h;
import java.lang.Boolean;
import aq5.d;
import com.kwai.robust.PatchProxyResult;
import mt4.e;
import i81.g;
import dq5.b;
import gs4.a;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import jm3.a;
import i81.f;

public class c extends c	// class@000eb9
{
    public final LiveAnchorChatBaseService$a A;
    public b p;
    public e q;
    public d r;
    public a s;
    public final g t;
    public final PublishSubject u;
    public final a v;
    public final b w;
    public final b x;
    public final b y;
    public final List z;

    public void c(){
       super();
       g og = new g(b.a.get(), new h(this), new i(this), new g(this), new f(this));
       this.t = v6;
       this.u = PublishSubject.g();
       a uoa = new a();
       this.v = uoa;
       b uob = new b();
       this.w = uob;
       b uob1 = new b();
       this.x = uob1;
       c$a uoa1 = new c$a(this);
       this.y = uoa1;
       b[] uobArray = new b[]{uoa,uob,uob1,uoa1};
       this.z = Arrays.asList(uobArray);
       this.A = new c$b(this);
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          return;
       }
       c tt = this.t;
       Objects.requireNonNull(tt);
       String str = "1";
       if (!PatchProxy.applyVoid(objArray, tt, og, str)) {
          tt.b.get().u0(987, LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition.class, tt.j);
          tt.b.get().u0(988, LivePlusRecruitMessages$LiveRecruitPanelDisplay.class, tt.k);
       }
       tt = this.x;
       View view = this.m8();
       c ts = this.s;
       c tr = this.r;
       c tu = this.u;
       ClientContent$LiveStreamPackage liveStreamPa = this.p.b().a();
       Objects.requireNonNull(tt);
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray1 = new Object[]{view,ts,tr,tu,liveStreamPa};
          if (!PatchProxy.applyVoid(objArray1, tt, b.class, str)) {
          label_007a :
             tt.b = ts;
             tt.a = tr;
             tt.c = tu;
             tt.d = liveStreamPa;
             if (!PatchProxy.applyVoidOneRefs(view, tt, b.class, "5")) {
                if (tt.g == null) {
                   tt.g = new LiveAnchorRecruitExplainPendantView(view.getContext());
                   ViewGroup viewGroup = view.findViewById(R.id.live_recruit_explain_pendant_container);
                   tt.h = viewGroup;
                   if (viewGroup != null) {
                      viewGroup.addView(tt.g);
                   }
                }
                tt.g.setVisibility(8);
             }
          }
       }else {
          goto label_007a ;
       }
       this.X7(this.u.observeOn(d.a).subscribe(new k(this), new a()));
       Iterator iterator = this.z.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          c tt1 = this.t;
          Objects.requireNonNull(tt1);
          if (PatchProxy.applyVoidOneRefs(uob, tt1, og, "5")) {
             continue ;
          }
          tt1.h.add(uob);
       }
       this.r.t5("openrecruitpaneltoggle", new j(this));
       LiveAnchorChatBaseService liveAnchorCh = this.q.a(LiveAnchorChatBaseService.class);
       if (liveAnchorCh.dj()) {
          liveAnchorCh.Ek(this.A);
       }
       return;
    }
    public void J8(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.r.Z4("openrecruitpaneltoggle");
       Iterator iterator = this.z.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          c tt = this.t;
          Objects.requireNonNull(tt);
          if (PatchProxy.applyVoidOneRefs(uob, tt, og, "6")) {
             continue ;
          }
          tt.h.remove(uob);
       }
       c tt1 = this.t;
       Objects.requireNonNull(tt1);
       if (!PatchProxy.applyVoid(null, tt1, og, "2")) {
          tt1.i.d();
          tt1.b.get().o(987, tt1.j);
          tt1.b.get().o(988, tt1.k);
       }
       c tx = this.x;
       Objects.requireNonNull(tx);
       if (!PatchProxy.applyVoid(null, tx, b.class, "2")) {
          tx.e = null;
          tx.f = null;
          tx.c();
       }
       this.P8(true);
       this.q.a(LiveAnchorChatBaseService.class).zd(this.A);
       return;
    }
    public void P8(boolean p0){
       h oh = h.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "7")) {
          return;
       }
       if (p0) {
          this.q.a(oh).e9("RECRUIT_PANEL");
       }else {
          this.q.a(oh).Kb("RECRUIT_PANEL", Integer.MAX_VALUE);
       }
       return;
    }
    public final d R8(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.b().A0();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       c tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoidOneRefs(p0, tv, a.class, "2")) {
          tv.a.b();
       }
       return;
    }
    public void j8(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_PUSH_CALLER_CONTEXT");
       b uob = this.q8(b.class);
       this.q = this.r8("LIVE_SERVICE_MANAGER");
       this.r = this.r8("LIVE_ROUTER_SERVICE");
       this.s = this.q.a(a.class);
       c tw = this.w;
       tw.a = uob;
       tw.b = this.q.a(og).i7();
       a uoa = this.q.a(a.class);
       c tv = this.v;
       c ts = this.s;
       f uof = this.q.a(og).nc();
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoidThreeRefs(uoa, ts, uof, tv, a.class, "1")) {
          tv.b = uoa;
          tv.c = ts;
          tv.d = uof;
          tv.a.c();
       }
       return;
    }
}
