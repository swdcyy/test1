package com.kwai.live.gzone.comment.router.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g47.d;
import com.kwai.live.gzone.comment.router.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vq5.b;
import vq5.d;
import g47.f;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import oq5.c;
import oq5.a;
import ekd.k1;
import java.util.Objects;
import com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.lang.Runnable;
import java.util.List;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import fq5.b;
import ft5.b;
import java.lang.Boolean;

public class a extends PresenterV2	// class@000ca5
{
    public b p;
    public a q;
    public b r;
    public d s;
    public boolean t;
    public LiveSlidePlayService u;
    public LiveGzoneAudienceCommandIconAnimView v;
    public c w;
    public c x;
    public final b y;

    public void a(){
       super();
       this.x = new d(this);
       this.y = new a$a(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       this.s.t5("gzonegamepasswordlottery", this.y);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6") && (this.t != null && this.u != null)) {
          f uof = new f(this);
          this.w = uof;
          this.u.P4(uof);
       }
    label_0032 :
       uoa = this.q;
       if (uoa != null) {
          uoa.W0(this.x, false);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.s.Z4("gzonegamepasswordlottery");
       a tw = this.w;
       if (tw != null) {
          a tu = this.u;
          if (tu != null) {
             tu.d5(tw);
          }
       }
       tw = this.q;
       if (tw != null) {
          tw.Q0(this.x);
       }
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       k1.n(this);
       a tv = this.v;
       if (tv == null) {
          return;
       }
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoid(null, tv, LiveGzoneAudienceCommandIconAnimView.class, "2")) {
          int i = 8;
          if (tv.getVisibility() != i) {
             tv.setVisibility(i);
             tv.startAnimation(AnimationUtils.loadAnimation(tv.getContext(), R.anim.arg_RES_7f010086));
             k1.m(tv.o);
          }
          if (!PatchProxy.applyVoid(null, tv, LiveGzoneAudienceCommandIconAnimView.class, "11")) {
             tv.d.clear();
             tv.m.clear();
          }
       }
       if (this.v.getParent() != null) {
          this.v.getParent().removeView(this.v);
       }
       this.v = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.s8(a.class);
       this.r = this.r8("LIVE_AUDIENCE_SEND_COMMENTS_SERVICE");
       this.s = this.r8("LIVE_ROUTER_SERVICE");
       this.u = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.t = this.v8("LIVE_IS_SLIDE_CONTAINER", Boolean.class).booleanValue();
       return;
    }
}
