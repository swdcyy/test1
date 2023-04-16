package com.kuaishou.live.core.show.activityredpacket.a0;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.activityredpacket.a0$a;
import w22.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import y22.q;
import android.view.ViewGroup;
import o22.h;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinTheme;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinInnerInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import o22.b;
import androidx.lifecycle.LiveData;
import qg2.c;
import qg2.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import p91.m;
import brd.t;
import cjd.e;
import erd.o;
import h22.q0;
import erd.g;
import crd.b;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketTopLuckyResponse;
import android.view.View;
import lnc.a1;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.ObjectAnimator;
import th0.d;
import android.animation.TimeInterpolator;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import bi2.e;
import h22.a;
import msd.a;
import java.lang.Boolean;
import o22.g;
import z12.x;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinButtonInfo;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfo;
import fg6.a;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfoExtraInfo;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView;
import h22.r0;
import com.yxcorp.gifshow.image.KwaiImageView;
import y22.d$c;
import y22.d;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOpenActionView;
import h22.o0;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView$b;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.show.activityredpacket.z;
import ok.o;
import com.google.common.collect.ImmutableList;
import v22.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import h22.p0;
import h62.e;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketPopupPageType;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import java.lang.Enum;
import nt5.a;
import h62.d;
import com.kuaishou.live.core.show.activityredpacket.c0;
import java.util.Map;
import java.util.HashMap;
import w22.a$b;

public class a0 extends c implements g	// class@00093c
{
    public View A;
    public View B;
    public View C;
    public KwaiImageView D;
    public KwaiImageView E;
    public PathLoadingView F;
    public RecyclerView G;
    public ImageView H;
    public KwaiImageView I;
    public ViewGroup J;
    public KwaiImageView K;
    public TextView L;
    public LiveActivityRedPacketOpenActionView M;
    public c N;
    public h O;
    public g P;
    public boolean Q;
    public ObjectAnimator R;
    public b S;
    public a0$b T;
    public a$b p;
    public a q;
    public m r;
    public a s;
    public LiveTreasureBoxMessage$LiveTreasureBoxShow t;
    public ViewGroup u;
    public ViewGroup v;
    public KwaiImageView w;
    public KwaiImageView x;
    public View y;
    public TextView z;
    public static String sLivePresenterClassName = "LiveActivityRedPacketTopLuckyListPresenter";

    public void a0(){
       super();
       this.T = new a0$a(this);
       this.U7(new a());
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "2")) {
          return;
       }
       q.q(this.R);
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0.class, "12")) {
          return;
       }
       this.J.setVisibility(0);
       this.G.setVisibility(8);
       a0 tO = this.O;
       if (tO != null) {
          this.L.setTextColor(tO.e);
       }
       tO = this.t;
       Object obj = PatchProxy.applyOneRefs(tO, objArray, q.class, "9");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(tO != null){
          LiveTreasureBoxMessage$LiveTreasureBoxShow skinTheme = tO.skinTheme;
          if (skinTheme != null) {
             LiveRedPackSkinMessage$RedPackSkinTheme innerInfo = skinTheme.innerInfo;
             if (innerInfo != null) {
                LiveRedPackSkinMessage$RedPackSkinInnerInfo topLuckyEmpt = innerInfo.topLuckyEmptyPict;
                if (topLuckyEmpt != null) {
                   objArray = e0.i(topLuckyEmpt);
                }
             }
          }
       }
       if (objArray == null) {
          return;
       }else {
          this.K.U(objArray);
          return;
       }
    }
    public void R8(){
       a0 uoa0 = a0.class;
       if (PatchProxy.applyVoid(null, this, uoa0, "5")) {
          return;
       }
       if (this.S.e.getValue() == null) {
          c uoc = b.b();
          a0 tt = this.t;
          LiveTreasureBoxMessage$LiveTreasureBoxShow liveTreasure = PatchProxy.applyOneRefs(tt, this, uoa0, "6");
          if (liveTreasure != PatchProxyResult.class) {
          }else if(tt == null || TextUtils.x(tt.topLuckyUrl)){
             b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "getTopLuckyRequestPath, return default top lucky path");
             liveTreasure = "n/live/treasureBox/topLucky";
          }else {
             liveTreasure = tt.topLuckyUrl;
          }
          tt = this.t;
          uoc.a(liveTreasure, tt.treasureBoxId, tt.boxType, this.r.getLiveStreamId()).map(new e()).subscribe(new q0(this));
       }else {
          this.S8(this.S.e.getValue());
       }
       if (this.Q != null) {
          q.q(this.R);
          float[] uofloatArray = new float[]{(float)(- a1.e(0x41f00000)),0};
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray),j.b(new float[2]{0,0x3f800000})};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.y, propertyValu);
          this.R = objectAnimat;
          objectAnimat.setDuration(300);
          this.R.setInterpolator(new d());
          this.R.start();
       }
       return;
    }
    public final void S8(LiveActivityRedPacketTopLuckyResponse p0){
       g og;
       a0 uoa0 = a0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa0, "7")) {
          return;
       }
       int i = 0;
       this.y.setVisibility(i);
       LiveActivityRedPacketTopLuckyResponse mActionButto = p0.mActionButton;
       a0 tt = this.t;
       if (!PatchProxy.applyVoidTwoRefs(mActionButto, tt, this, uoa0, "8")) {
          LiveRichCardStateManager h = LiveRichCardStateManager.h;
          boolean b = (h.e().f() || (h.e().g() && this.s.e.invoke().booleanValue()))? true: false;
          b.c0(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "[showBottomMoreInfoButton]", "cannotShow", Boolean.valueOf(b));
          if (mActionButto == null || (tt != null && !b)) {
             boolean b1 = this.r.e();
             if (PatchProxy.isSupport(q.class)) {
                og = PatchProxy.applyThreeRefs(Boolean.valueOf(b1), tt, mActionButto, null, q.class, "10");
                if (og != PatchProxyResult.class) {
                label_00c9 :
                   this.P = og;
                   LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfoExtraInfo liveActivity = a.a.h(mActionButto.mExtraInfoString, LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfoExtraInfo.class);
                   mActionButto.mExtraInfo = liveActivity;
                   a0 tP = this.P;
                   if (tP.a == null && liveActivity != null) {
                      if (tP.d == null) {
                         this.M.c(true, tP.a(), mActionButto.mButtonText);
                      }else {
                         d.b(this.M.c, tP.b, new r0(this, mActionButto));
                      }
                      this.M.setVisibility(i);
                      this.M.f(this.P.e);
                      if (this.P.f != null) {
                         this.M.d();
                      }
                      this.C.setTranslationY((float)(- a1.e(32.00f)));
                      this.M.setTipListener(new o0(this, mActionButto));
                   }
                }
             }
             og = new g();
             LiveTreasureBoxMessage$LiveTreasureBoxShow skinTheme = tt.skinTheme;
             if (skinTheme != null) {
                og.b(x.z(skinTheme.bgThemeColor));
             }
             skinTheme = tt.skinTheme;
             if (skinTheme != null) {
                LiveRedPackSkinMessage$RedPackSkinTheme receiveButto = skinTheme.receiveButton;
                if (receiveButto != null) {
                   og.b = e0.i(receiveButto.buttonPict);
                   og.b(x.z(tt.skinTheme.receiveButton.textColor));
                   og.d = true;
                }
             }
             LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfo mActionType = mActionButto.mActionType;
             if (mActionType == null || (b1 && mActionType == 2)) {
                og.a = true;
             }
             og.f = mActionButto.mIsAnimationEnable;
             og.e = mActionButto.mLeftIconUrl;
             goto label_00c9 ;
          }
       }
    label_0130 :
       mActionButto = p0.mLayoutType;
       p0 = p0.mTopLuckyInfo;
       if (!PatchProxy.isSupport(uoa0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(mActionButto), p0, this, uoa0, "11")) {
          if (q.f(p0)) {
             this.P8();
          }else {
             ImmutableList immutableLis = m.s(p0).p(z.b).B();
             if (q.f(immutableLis)) {
                this.P8();
             }else {
                this.G.setVisibility(i);
                this.J.setVisibility(8);
                uoa0 = this.N;
                uoa0.h = mActionButto;
                uoa0.e = immutableLis;
                uoa0.k0();
                immutableLis.g = new p0(this);
             }
          }
       }
       LiveRedPacketPopupPageType lUCKY_USER_L = LiveRedPacketPopupPageType.LUCKY_USER_LIST;
       d.b(e.d(this.s), this.s.d(), RedPacketType.RED_PACKET_TYPE_ACTIVITY, this.s.b(), LiveRedPacketStage.RED_PACKET_RESULT, lUCKY_USER_L, this.s.c.a.b(LiveRedPacketAction.RED_PACK_POPUP.name()+lUCKY_USER_L.getValue()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "3")) {
          return;
       }
       this.u = p0.findViewById(0x7f0a1833);
       this.v = p0.findViewById(0x7f0a1830);
       this.w = p0.findViewById(0x7f0a1836);
       this.x = p0.findViewById(0x7f0a1835);
       this.I = p0.findViewById(0x7f0a182e);
       this.M = p0.findViewById(0x7f0a1855);
       this.C = p0;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a0.class, new c0());
       }else {
          obj.put(a0.class, null);
       }
       return obj;
    }
    public void j8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.p = this.r8("LiveActivityRedPacketBackgroundService");
       this.q = this.q8(uoa);
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.q8(uoa);
       return;
    }
}
