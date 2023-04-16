package com.kuaishou.live.ad.fanstop.g;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import d61.l0;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import pl0.w0;
import com.kwai.framework.abtest.f;
import com.kuaishou.live.ad.fanstop.g$a;
import pl0.v;
import pl0.u;
import pl0.t;
import x61.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import os5.d;
import pl0.x;
import hf3.a;
import sr5.b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveFansTopOpened;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveFansTopClosed;
import pl0.q;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import com.kuaishou.live.ad.fanstop.widget.FansTopNoticeBubbleView;
import lnc.a1;
import fq5.b;
import aq5.d;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.b;
import com.kuaishou.live.common.ad.fanstop.a;
import pl0.w;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.live.bottombarapi.LiveAnchorBottomBarId;
import z61.b;
import pl0.r;
import z61.l;
import com.kuaishou.live.common.ad.fanstop.UpdateFansTopStatusListener$FansTopStatus;
import or5.a;
import lp3.c;
import lp3.i;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Boolean;
import pl0.s;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge;
import ekd.b;
import ks5.b;
import ks5.c;
import pl0.y;
import pl0.d0;
import java.util.Objects;
import com.kuaishou.live.common.ad.fanstop.model.LiveFansTopRealTimeInfo;
import x81.d;
import rl0.c;
import cs3.a;
import wkd.b;
import va1.s0;
import android.app.Activity;
import rp5.a;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.ad.fanstop.f;
import android.content.DialogInterface$OnDismissListener;
import android.view.View;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import pl0.b0;
import java.util.Map;
import java.util.HashMap;

public class g extends PresenterV2 implements g	// class@0009a3
{
    public final MutableLiveData A;
    public final LiveNormalBottomBarItem B;
    public final MutableLiveData C;
    public final LiveNormalBottomBarItem D;
    public final w0 E;
    public boolean F;
    public c0 G;
    public final b H;
    public final g I;
    public final g J;
    public FansTopNoticeBubbleView p;
    public b q;
    public i r;
    public b s;
    public d0 t;
    public c u;
    public LiveFansTopRealTimeInfo v;
    public boolean w;
    public boolean x;
    public x y;
    public boolean z;
    public static final l0 K;

    static {
       g.K = l0.d("live.HashShowFansTopButtonRedDot");
    }
    public void g(){
       super();
       this.A = new MutableLiveData();
       this.B = new LiveNormalBottomBarItem();
       this.C = new MutableLiveData();
       this.D = new LiveNormalBottomBarItem();
       this.E = new w0();
       this.F = f.a("enableShowFansTopRedPoint");
       this.G = new g$a(this);
       this.H = new v(this);
       this.I = new u(this);
       this.J = new t(this);
    }
    public void E8(){
       c uoc = c.class;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "9")) {
          long l = d.a(-2004767397).ee();
          if (l - null <= 0) {
             l = 3000;
          }
          this.y = new x(this, l);
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "8")) {
          this.s.L().u0(521, LiveStreamMessages$SCLiveFansTopOpened.class, this.I);
          this.s.L().u0(522, LiveStreamMessages$SCLiveFansTopClosed.class, this.J);
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "6")) {
          this.p.setOnClickListener(new q(this));
          this.p.setNoticeIconRes(R.drawable.arg_RES_7f081451);
          this.p.setShrinkModeText(a1.p(R.string.arg_RES_7f10219b));
       }
       int i = 1;
       a[] uoaArray = new a[i];
       uoaArray[0] = AnchorBizRelation.VOICE_PARTY;
       this.s.b().A0().u5(this.H, uoaArray);
       this.X7(a.g().b.subscribe(new w(this)));
       if (!PatchProxy.applyVoid(objArray, this, og, "4")) {
          this.B.mFeatureId = LiveAnchorBottomBarId.FUNCTION_ITEM_ID_LIVE_PROMOTION.getFeatureType();
          g tB = this.B;
          tB.mClickCallback = new r(this);
          tB.mTextRes = 0x7f103186;
          tB.mIconRes = 0x7f08138a;
          tB.mSelectedIconRes = 0x7f081382;
          boolean b1 = (a.g().d() == UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_SELECTED)? true: false;
          tB.mIsSelected = b1;
          tB = this.B;
          b1 = (a.g().d() != UpdateFansTopStatusListener$FansTopStatus.CLOSE && SerializableHook.getSerializable(this.r.a(a.class).z0(), "coupon_info") != null)? true: false;
          tB.mIsVisible = Boolean.valueOf(b1);
          this.A.setValue(this.B);
          this.r.a(uoc).v1(this.A);
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "5")) {
          this.D.mFeatureId = LiveAnchorBottomBarId.FUNCTION_ITEM_ID_MORE_LIVE_PROMOTION.getFeatureType();
          og = this.D;
          boolean b = (a.g().d() != UpdateFansTopStatusListener$FansTopStatus.CLOSE)? true: false;
          og.mIsVisible = Boolean.valueOf(b);
          og = this.D;
          b = (a.g().d() == UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_SELECTED)? true: false;
          og.mIsSelected = b;
          og = this.D;
          og.mClickCallback = new s(this);
          og.mIconRes = 0x7f08138a;
          og.mSelectedIconRes = 0x7f081382;
          og.mTextRes = 0x7f103186;
          if (this.F == null || g.K.b(Boolean.FALSE).booleanValue()) {
             i = 0;
          }
          og = this.D;
          if (i) {
             objArray = new LiveBottomBarItemBadge();
          }
          og.mBadge = objArray;
          this.C.setValue(this.D);
          this.r.a(uoc).v1(this.C);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "12")) {
          return;
       }
       this.z = false;
       this.s.L().o(521, this.I);
       this.s.L().o(522, this.J);
       this.y.stop();
       this.x = false;
       g tE = this.E;
       tE.a = -1;
       tE.b = -1;
       a[] uoaArray = new a[]{AnchorBizRelation.VOICE_PARTY};
       this.s.b().A0().G5(this.H, uoaArray);
       return;
    }
    public void P8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "16")) {
          return;
       }
       this.z = false;
       if (!PatchProxy.applyVoid(objArray, this, og, "18")) {
          og = this.q;
          if (og != null) {
             this.u.c(og);
          }
       }
       this.s.b().A0().yj(AnchorBizRelation.FANS_TOP);
       return;
    }
    public void R8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "15")) {
          return;
       }
       AnchorBizRelation fANS_TOP = AnchorBizRelation.FANS_TOP;
       if (this.s.b().A0().ck(fANS_TOP) && this.w != null) {
          if (this.z == null) {
             if (!PatchProxy.applyVoid(objArray, this, og, "17")) {
                if (this.q == null) {
                   this.q = new y(this);
                }
                this.u.b(this.q);
             }
             this.s.b().A0().Pj(fANS_TOP);
          }
          this.z = true;
          if (this.t.d()) {
             og = this.E;
             g tv = this.v;
             Objects.requireNonNull(og);
             if (!PatchProxy.applyVoidOneRefs(tv, og, w0.class, "1") && tv != null) {
                LiveFansTopRealTimeInfo mStatus = tv.mStatus;
                LiveFansTopRealTimeInfo mStrategy = tv.mStrategy;
                if (og.b != mStatus || og.a != mStrategy) {
                   og.b = mStatus;
                   og.a = mStrategy;
                   c.e(d.a(tv), d.b(tv));
                }
             }
          }
       }
    label_0089 :
       return;
    }
    public void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "10")) {
          return;
       }
       boolean b = ("esp_mobile").equals(this.s.G().getString("promotion_source_type"));
       boolean b1 = (("fanstop_setting_push").equals(p0) && (this.s.D() != null && this.s.D().d()))? true: false;
       this.V8(s0.b(b.a(-1765983867).h(b, b1), "liveStreamId", this.s.b().getLiveStreamId()), p0);
       return;
    }
    public final void V8(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "11")) {
          return;
       }
       d.e(this.getActivity(), this.r.a(a.class).b(), p0, p1, "", a.g().e()).k0(f.b);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = new FansTopNoticeBubbleView(this.getContext());
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new b0());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.s = this.r8("LIVE_PUSH_CALLER_CONTEXT");
       this.t = this.q8(d0.class);
       this.r = this.r8("LIVE_SERVICE_MANAGER");
       this.u = this.q8(c.class);
       return;
    }
}
