package com.kwai.live.gzone.accompanyplay.audience.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k37.i;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import fq5.b;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k37.h;
import com.kwai.live.gzone.accompanyplay.audience.k0$e;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyEntranceShow;
import k37.j;
import lf3.g;
import hf3.a;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyEntranceHide;
import k37.k;
import ekd.k1;
import k67.e$a;
import k67.g;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import android.view.ViewStub;
import java.lang.Boolean;

public class s extends PresenterV2	// class@000bb2
{
    public LiveGzoneAccompanyEntryInfo A;
    public c p;
    public LiveSlidePlayService q;
    public b r;
    public a s;
    public boolean t;
    public k0$g u;
    public g v;
    public ViewStub w;
    public TextView x;
    public View y;
    public e$a z;

    public void s(){
       super();
    }
    public void E8(){
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os, "3")) {
          return;
       }
       if (PatchProxy.applyVoid(objArray, this, os, "4") || (this.t != null && this.q != null)) {
          if (this.p == null) {
             this.p = new i(this);
          }
          this.q.P4(this.p);
       }
    label_0030 :
       if (!PatchProxy.applyVoid(objArray, this, os, "5")) {
          if (TextUtils.n(this.r.d(), QCurrentUser.ME.getId())) {
             this.P8();
          }else {
             this.u.x(new h(this));
             if (!PatchProxy.applyVoid(objArray, this, os, "6")) {
                this.s.u0(740, SCGzoneAccompanyEntranceShow.class, new j(this));
                this.s.u0(741, SCGzoneAccompanyEntranceHide.class, new k(this));
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s.class, "12")) {
          return;
       }
       k1.n(this);
       if (this.t != null) {
          s tq = this.q;
          if (tq != null) {
             s tp = this.p;
             if (tp != null) {
                tq.d5(tp);
             }
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, s.class, "10")) {
          return;
       }
       s tz = this.z;
       if (tz != null) {
          this.v.sg(tz, 8);
       }
       return;
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "8")) {
          return;
       }
       s tx = this.x;
       if (tx != null) {
          tx.setText(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a1dfe);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.q = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.r8("LIVE_LONG_CONNECTION");
       this.u = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       this.t = this.v8("LIVE_IS_SLIDE_CONTAINER", Boolean.class).booleanValue();
       this.v = this.q8(g.class);
       return;
    }
}
