package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d;
import im8.g;
import k51.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d$b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView;
import ekd.m1;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGradientRotateButton;
import com.kuaishou.live.core.show.wealthgrade.widget.LiveWealthGradeTopCoolShimmerLayout;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import lnc.a1;
import com.kuaishou.live.widget.LiveWealthGradeShimmerLayout;
import android.view.View$OnClickListener;
import vz0.e;
import vz0.d$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.h;
import vz0.d;
import uz0.j;
import cl1.b;
import uz0.e;
import erd.g;
import crd.b;
import brd.t;
import oh1.c;
import wk1.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.yxcorp.gifshow.models.Gift;
import ik1.a0;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a;
import ql1.c;
import ql1.d$b;
import uz0.f;
import java.lang.Runnable;
import e93.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import mk1.b;
import mk1.h;
import mk1.w;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kuaishou.live.common.core.component.gift.gift.p;
import uz0.g;
import uz0.m;
import java.util.Map;
import java.util.HashMap;
import mrd.c;
import bl1.a;
import fq5.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.c;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$ComboBatchSendGiftConfig;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a$b;

public class d extends c implements g	// class@000b4d
{
    public final c A;
    public final c B;
    public final a$b C;
    public h p;
    public a0 q;
    public b r;
    public b s;
    public c t;
    public a u;
    public d$b v;
    public a w;
    public ViewGroup x;
    public a y;
    public List z;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxHandleViewPresenter";

    public void d(){
       super();
       this.A = new d$a(this);
       this.B = new d$b(this);
       this.C = new d$c(this);
    }
    public void E8(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "3")) {
          return;
       }
       a uoa = a.class;
       if (!PatchProxy.applyVoid(null, this, uod, "5")) {
          uod = this.w;
          Activity activity = this.getActivity();
          d tp = this.p;
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidTwoRefs(activity, tp, uod, uoa, "1")) {
             a.c(activity, R.layout.arg_RES_7f0d0a0f, uod.c);
             a c = uod.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoidOneRefs(tp, c, LiveAudienceGiftBoxHandleView.class, "6")) {
                LiveGradientRotateButton liveGradient = m1.f(c, R.id.gift_box_send_button_view);
                c.c = liveGradient;
                liveGradient.setEffectDisabled(true);
                LiveWealthGradeTopCoolShimmerLayout liveWealthGr = m1.f(c, R.id.gift_box_send_button_shimmer_view);
                c.d = liveWealthGr;
                liveWealthGr.setShimmerBitmap(BitmapFactory.decodeResource(a.a().a().getResources(), R.drawable.arg_RES_7f0811f0));
                int i = 0x7f0702b8;
                c.d.setRadius((float)a1.d(i));
                c.d.setShimmerRadiusDp(a1.d(i));
             }
             uod.c.setHandleButtonClickListener(uod.g);
             uod.d = new e(uod.c, uod.f);
          }
          uod = this.w;
          h oh = new h(this);
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidOneRefs(oh, uod, uoa, "11")) {
             uod.d.d = oh;
          }
          this.w.b(new j(this));
       }
       this.X7(this.t.subscribe(new e(this)));
       this.r.b(this.A);
       a0.p(this.q.Z2.a(), null, 0);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d ty = this.y;
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoid(null, ty, a.class, "1")) {
          ty.f.p3(ty.h);
       }
       this.r.a(this.A);
       f.h("GiftBoxHandleVC.release", new f(this));
       this.z = null;
       return;
    }
    public int P8(){
       Gift obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = w.h(this.s, this.p);
       int i = (obj == null)? -1: obj.mId;
       return i;
    }
    public String R8(){
       Object obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.a(this.s.d());
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       f.h("updateHandleView", new g(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a10a2);
       this.w = new a(m1.f(p0, 0x7f0a1d26));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new m());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.v = this.r8("LIVE_GIFT_PANEL_EVENT_SERVICE");
       this.p = this.q8(h.class);
       this.q = this.q8(a0.class);
       this.r = this.r8("LIVE_AUDIENCE_GIFT_BOX_COMBO_SEND_BUTTON_SERVICE");
       this.s = this.q8(b.class);
       this.t = this.r8("gift_tab_changed_subject");
       this.u = this.q8(a.class);
       a uoa = new a(this.x, this.C, this.p.A, this.q.b().getLiveStreamId(), k0.b(this.q.b3, b.a, c.a).orNull(), this.v);
       this.y = v0;
       return;
    }
}
