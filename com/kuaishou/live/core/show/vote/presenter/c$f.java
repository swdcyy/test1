package com.kuaishou.live.core.show.vote.presenter.c$f;
import com.kuaishou.live.core.show.vote.e$b;
import com.kuaishou.live.core.show.vote.presenter.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;
import z12.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import android.widget.TextView;
import lnc.a1;
import com.kwai.live.gzone.widget.LiveGzoneRingProgressImageView;
import mrd.c;
import brd.y;
import cm2.e;
import crd.b;
import lnc.b9;
import yl2.a;
import o02.e;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import brd.t;
import cjd.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import dm2.o;
import sfc.a;
import erd.g;
import com.kuaishou.live.core.show.vote.model.VoteMessageInfo;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import f37.o0;
import java.lang.CharSequence;
import t02.a0;
import n57.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import am2.a;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import android.view.View;
import k67.e$a;
import k67.g;
import com.kwai.library.widget.popup.common.c;

public class c$f implements e$b	// class@001244
{
    public final c a;

    public void c$f(c p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,long p1){
       c p;
       c$f uof = c$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, uof, "9")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       e.c("LiveAudienceVotePresenter", "on vote stop "+p0+" "+p1, stringArray);
       c$f ta = this.a;
       long l = 0;
       ta.V0 = l;
       if (b.d(ta)) {
          p = this.a.P;
          if (p != null) {
             p.setText(R.string.arg_RES_7f102e91);
             this.a.P.setTextSize(i, (float)a1.d(R.dimen.arg_RES_7f070981));
          }
       }else {
          p = this.a.O;
          if (p != null) {
             p.setTime(l);
          }
       }
       this.a.c9().onNext(Long.valueOf(l));
       p = this.a.V;
       if (p != null) {
          p.f0();
       }
       b9.a(this.a.Y);
       ta = this.a;
       if (ta.X != null) {
          ta.Y = e.p().c(this.a.X.mVote.mVoteId).map(new e()).delaySubscription(p1, TimeUnit.MILLISECONDS).subscribe(new o(this), new a());
       }
       return;
    }
    public void b(VoteMessageInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$f.class, "6")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceVotePresenter", "update vote panel"+p0, stringArray);
       this.a.b9().onNext(p0);
       c v = this.a.V;
       if (v != null) {
          v.g0(p0.mOptions);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c$f.class, "5")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceVotePresenter", "hide vote portal", stringArray);
       this.a.d9();
       return;
    }
    public void d(LiveVoterResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$f.class, "8")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceVotePresenter", "update vote context "+p0, stringArray);
       this.a.X = p0;
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$f.class, "4")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceVotePresenter", "show vote portal for login "+p0, stringArray);
       this.a.U0 = p0;
       this.g(p0, 0);
       return;
    }
    public void f(long p0){
       c p;
       c$f uof = c$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "7")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       e.c("LiveAudienceVotePresenter", "update vote count down "+p0, stringArray);
       uof = this.a;
       uof.V0 = p0;
       if (b.d(uof)) {
          p = this.a.P;
          if (p != null) {
             p.setText(o0.h(p0));
             this.a.P.setTextSize(i, (float)a1.d(R.dimen.arg_RES_7f070980));
          }
       }else {
          p = this.a.O;
          if (p != null) {
             p.setTime(p0);
          }
       }
       this.a.c9().onNext(Long.valueOf(p0));
       p = this.a.V;
       if (p != null) {
          p.c0(p0);
       }
       return;
    }
    public void g(String p0,long p1){
       c r;
       String[] stringArray1;
       View view;
       if (PatchProxy.isSupport(c$f.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, c$f.class, "1")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceVotePresenter", "show vote entry view "+p0+" "+p1, stringArray);
       c$f ta = this.a;
       ta.W0 = false;
       boolean b = true;
       if (ta.R != null) {
          c p = ta.P;
          if (p != null) {
             p.setText(o0.h(p1));
             this.a.P.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070980));
             r = this.a.R;
             if (!PatchProxy.applyVoidOneRefs(r, this, c$f.class, "3")) {
                stringArray1 = new String[0];
                e.c("LiveAudienceVotePresenter", "show vote pendant "+r, stringArray1);
                a0 h1 = this.a.M.h1;
                if (h1 == null || !h1.f()) {
                   b = false;
                }
                a.e(this.a.M.Z2.a(), b);
                c n = this.a.N;
                if (n != null && r != null) {
                   n.b(r);
                }
             }
          }else {
          label_00a6 :
             p = ta.O;
             if (p != null && ta.Q != null) {
                p.setMaxTimeMs(p1);
                r = this.a.Q;
                if (!PatchProxy.applyVoidOneRefs(r, this, c$f.class, "2")) {
                   stringArray1 = new String[0];
                   e.c("LiveAudienceVotePresenter", "show right bottom pendant "+r, stringArray1);
                   if (r != null) {
                      view = r.e();
                      if (view != null && view.getVisibility()) {
                         a0 h11 = this.a.M.h1;
                         if (h11 == null || !h11.f()) {
                            b = false;
                         }
                         a.e(this.a.M.Z2.a(), b);
                         view.setVisibility(0);
                         this.a.M.O1.y8(r, 0);
                      }
                   }
                }
             }
          }
       }else {
          goto label_00a6 ;
       }
       r = this.a.V;
       if (r != null && r.K()) {
          this.a.V.q(0);
          this.a.k9();
       }
       return;
    }
}
