package com.kuaishou.live.core.show.activityredpacket.k$a;
import com.kuaishou.live.core.show.activityredpacket.k$b;
import com.kuaishou.live.core.show.activityredpacket.k;
import java.lang.Object;
import o22.b;
import com.kwai.robust.PatchProxyResult;
import y22.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.redpacket.model.LiveActivityRedPacketGrabResponse;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import java.util.Objects;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinTheme;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import w22.a$b;
import ekd.j;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinInnerInfo;
import yb7.a;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import z12.x;
import lnc.a1;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.animation.Animator;
import android.animation.ValueAnimator;
import h22.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import h22.m;
import android.animation.Animator$AnimatorListener;
import th0.d;
import android.animation.TimeInterpolator;
import o22.i;
import com.kuaishou.live.core.show.activityredpacket.user.f$c;
import o22.f;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.redpacket.model.LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabItem;
import java.lang.Iterable;
import qk.m;
import y22.n;
import ok.h;
import u22.b0$b;
import android.widget.TextView;
import java.lang.CharSequence;
import p91.m;
import o22.c;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinButtonInfo;
import com.kuaishou.live.common.core.component.redpacket.model.LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabActionButtonInfo;
import com.kuaishou.live.common.core.component.redpacket.model.LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabActionExtraInfo;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOpenActionView;
import t22.c$a;
import h22.i;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView$b;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView;
import h22.n;
import android.view.View$OnClickListener;
import h22.a;
import h22.h;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.StringBuilder;
import nt5.a;
import k2b.e0;
import tw1.d;

public class k$a implements k$b	// class@000956
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void a(b p0,boolean p1){
       k$a a;
       boolean b;
       k b1;
       c uoc;
       String obj4;
       GradientDrawable gradientDraw;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       k$a uoa = k$a.class;
       k ok = k.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(obj1, Boolean.valueOf(p1), obj, uoa, str)) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "showOpenedView");
       obj.a.D = p1;
       int i = 1;
       obj1.b.setValue(Integer.valueOf(i));
       uoa = obj.a;
       uoa.C = obj1;
       uoa.B = obj1.d.getValue();
       obj.a.G = obj1.c.getValue();
       uoa = obj.a;
       Objects.requireNonNull(uoa);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uoa, ok, "5") || (uoa.q != null && uoa.p != null)) {
          if (uoa.r == null) {
             a.c(uoa.getContext(), R.layout.arg_RES_7f0d09b9, uoa.p);
             uoa.r = uoa.p.findViewById(0x7f0a1861);
             uoa.t = uoa.p.findViewById(0x7f0a185d);
             uoa.u = uoa.p.findViewById(0x7f0a185f);
             uoa.v = uoa.p.findViewById(0x7f0a1863);
             uoa.w = uoa.p.findViewById(0x7f0a1862);
             uoa.y = uoa.p.findViewById(0x7f0a185e);
             uoa.z = uoa.p.findViewById(0x7f0a1860);
          }
          if (uoa.s == null) {
             a.c(uoa.getContext(), R.layout.arg_RES_7f0d09b7, uoa.q);
             uoa.s = uoa.q.findViewById(0x7f0a185c);
             uoa.x = uoa.q.findViewById(0x7f0a182f);
          }
       }
    label_00fb :
       uoa = obj.a;
       Objects.requireNonNull(uoa);
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = null;
       if (!PatchProxy.applyVoid(objArray, uoa, ok, "8")) {
          uoa.x.setVisibility(liveVoicePar);
          uoa.A.setVisibility(liveVoicePar);
          uoa.J.a(uoa.A, e0.i(uoa.G.skinTheme.bgResultPict), R.drawable.arg_RES_7f0810a0);
          CDNUrl[] uCDNUrlArray = (j.h(uoa.G.skinTheme.coverBottomPict))? e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_PREPARE_BOTTOM_BACKGROUND.getResourcePath())): e0.i(uoa.G.skinTheme.coverBottomPict);
          uoa.J.a(uoa.x, uCDNUrlArray, -1);
       }
       uoa = obj.a;
       Objects.requireNonNull(uoa);
       String str1 = 2;
       if (!PatchProxy.applyVoid(objArray, uoa, ok, "11")) {
          LiveTreasureBoxMessage$LiveTreasureBoxShow skinTheme2 = uoa.G.skinTheme;
          if (skinTheme2 != null) {
             LiveRedPackSkinMessage$RedPackSkinTheme innerInfo = skinTheme2.innerInfo;
             if (innerInfo != null) {
                if (a.c(innerInfo.gbInnerColor)) {
                   int[] ointArray1 = new int[str1];
                   ointArray1[liveVoicePar] = x.z(k.T);
                   ointArray1[i] = x.z(k.U);
                   gradientDraw = new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, ointArray1);
                }else {
                   gradientDraw = new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, x.y(uoa.G.skinTheme.innerInfo.gbInnerColor));
                }
                gradientDraw.setCornerRadius((float)a1.e(28.00f));
                gradientDraw.setStroke(a1.e(0x3f800000), q.e(x.y(uoa.G.skinTheme.innerInfo.borderColor)));
                uoa.y.setBackground(gradientDraw);
             }
          }
       }
       uoa = obj.a;
       LiveActivityRedPacketGrabResponse mBackgroundU = uoa.B.mBackgroundUrls;
       Objects.requireNonNull(uoa);
       Boolean uBoolean = 8;
       if (!PatchProxy.applyVoidOneRefs(mBackgroundU, uoa, ok, "12")) {
          if (q.f(mBackgroundU)) {
             uoa.z.setVisibility(uBoolean);
          }else {
             uoa.z.setVisibility(liveVoicePar);
             uoa.z.P(mBackgroundU);
          }
       }
       uoa = obj.a;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(objArray, uoa, ok, "6")) {
          if (uoa.D == null) {
             uoa.r.setVisibility(liveVoicePar);
             uoa.R8(liveVoicePar);
             uoa.q.bringToFront();
          }else {
             q.q(uoa.E);
             uoa.R8(uBoolean);
             int[] ointArray = new int[str1];
             ointArray[liveVoicePar] = k.Q;
             ointArray[i] = k.P;
             ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
             uoa.E = valueAnimato;
             valueAnimato.addUpdateListener(new l(uoa));
             uoa.r.setVisibility(uBoolean);
             uoa.E.setDuration(500);
             uoa.E.addListener(new m(uoa));
             uoa.E.setInterpolator(new d());
             uoa.E.setStartDelay(250);
             uoa.E.start();
          }
       }
       uoa = obj.a;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(objArray, uoa, ok, "9")) {
          uoa.K.a(uoa.w, q.b(uoa.G, liveVoicePar), liveVoicePar);
       }
       uoa = obj.a;
       Objects.requireNonNull(uoa);
       String str2 = "14";
       if (!PatchProxy.applyVoid(objArray, uoa, ok, "10")) {
          k b2 = uoa.B;
          if (b2 == null || b2.mIsGrabbed == null) {
             LiveTreasureBoxMessage$LiveTreasureBoxShow skinTheme1 = uoa.G.skinTheme;
             if (skinTheme1 != null && skinTheme1.innerInfo != null) {
                uoa.t.removeAllViews();
                uoa.u.removeAllViews();
                uoa.v.removeAllViews();
                b1 = uoa.v;
                obj4 = a1.p(R.string.arg_RES_7f104210);
                String str3 = a1.p(R.string.arg_RES_7f101d06);
                int i1 = x.z(uoa.G.skinTheme.innerInfo.resultFontColor);
                if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidFourRefs(b1, obj4, str3, Integer.valueOf(i1), uoa, k.class, "13")) {
                   a.c(uoa.getContext(), R.layout.arg_RES_7f0d09ba, b1);
                   TextView textView1 = b1.findViewById(R.id.live_activity_red_packet_unlucky_title_text);
                   TextView textView2 = b1.findViewById(R.id.live_activity_red_packet_unlucky_sub_title_text);
                   textView1.setTextColor(i1);
                   textView2.setTextColor(i1);
                   textView2.setAlpha(0x3f000000);
                   textView1.setText(obj4);
                   textView2.setText(str3);
                }
             }
          }else if(PatchProxy.applyVoid(objArray, uoa, ok, str2)){
             b2 = uoa.B;
             k g1 = uoa.G;
             f uof = PatchProxy.applyTwoRefs(b2, g1, objArray, oq, str);
             if (uof != patchProxyRe) {
             }else if(b2.mIsGrabbed == null || q.f(b2.mGrabbedItemList)){
                uof = null;
             }else {
                uof = new f();
                ArrayList uArrayList = new ArrayList();
                LiveActivityRedPacketGrabResponse mGrabbedItem = b2.mGrabbedItemList;
                LiveActivityRedPacketGrabResponse mLayoutType = b2.mLayoutType;
                uof.b = mLayoutType;
                if (mLayoutType == null) {
                   uof.a = (mGrabbedItem.size() == i && q.f(mGrabbedItem.get(liveVoicePar).mDisplayPictureCDNUrls))? str1: i;
                }
                m.s(b2.mGrabbedItemList).F(new n(b2, g1)).n(uArrayList);
                uof.g = uArrayList;
                uof.d = b2.mResultTipsLink;
                uof.c = b2.mResultTips;
                uof.e = b2.mResultTipsIconUrl;
                uof.f = b2.mResultTipsIconColor;
             }
             if (uof != null) {
                uoa.t.removeAllViews();
                uoa.u.removeAllViews();
                uoa.v.removeAllViews();
                f b3 = uof.b;
                if (b3 == null) {
                   b3 = uof.a;
                   if (b3 != i) {
                      if (b3 == str1) {
                         uoa.L.a(uoa.u, uof, i);
                      }
                   }else {
                      uoa.L.a(uoa.t, uof, i);
                   }
                }else if(b3 != i){
                   if (b3 == str1) {
                      uoa.L.a(uoa.t, uof, i);
                   }
                }else {
                   uoa.L.a(uoa.u, uof, i);
                }
             }
          }
       }
    label_03d1 :
       uoa = obj.a;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(null, uoa, ok, "15")) {
          b = uoa.F.e();
          b1 = uoa.B;
          k g = uoa.G;
          if (PatchProxy.isSupport(oq)) {
             uoc = PatchProxy.applyThreeRefs(Boolean.valueOf(b), b1, g, null, q.class, "2");
             if (uoc != patchProxyRe) {
             }else {
             label_0409 :
                uoc = new c();
                uoc.c = a1.p(0x7f1045f5);
                LiveTreasureBoxMessage$LiveTreasureBoxShow skinTheme = g.skinTheme;
                if (skinTheme != null) {
                   uoc.b = x.z(skinTheme.bgThemeColor);
                }
                skinTheme = g.skinTheme;
                if (skinTheme != null) {
                   LiveRedPackSkinMessage$RedPackSkinTheme receiveButto = skinTheme.receiveButton;
                   if (receiveButto != null) {
                      uoc.d = e0.i(receiveButto.buttonPict);
                      uoc.e = x.z(g.skinTheme.receiveButton.textColor);
                   }
                }
                if (!b && b1 != null) {
                   LiveActivityRedPacketGrabResponse mActionButto = b1.mActionButtonInfo;
                   if (mActionButto != null && mActionButto.mActionType != null) {
                      uoc.a = i;
                      uoc.f = mActionButto.mButtonText;
                      LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabActionButtonInfo mExtraInfoSt = mActionButto.mExtraInfoString;
                      Object obj2 = null;
                      Object obj3 = PatchProxy.applyOneRefs(mExtraInfoSt, obj2, oq, str2);
                      if (obj3 != patchProxyRe) {
                         obj4 = obj3;
                      }else if(TextUtils.x(mExtraInfoSt)){
                         obj4 = obj2;
                      }else {
                         obj4 = a.a.h(mExtraInfoSt, LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabActionExtraInfo.class);
                      }
                      LiveActivityRedPacketGrabResponse mActionButto1 = b1.mActionButtonInfo;
                      mActionButto1.mExtraInfo = obj4;
                      uoc.h = mActionButto1.mIsMoreActionButtonAnimationEnable;
                      uoc.g = mActionButto1.mLeftIconUrl;
                   }
                }
                uoc.a = liveVoicePar;
             }
          }else {
             goto label_0409 ;
          }
          LiveActivityRedPacketOpenActionView liveActivity = uoa.s.findViewById(R.id.live_activity_red_packet_opened_action_button_view);
          TextView textView = uoa.s.findViewById(R.id.live_activity_red_packet_opened_reward_list_button);
          uoa.I.a(uoc, liveActivity, textView);
          liveActivity.setTipListener(new i(uoa, liveActivity, uoc));
          textView.setOnClickListener(new n(uoa));
       }
       a = obj.a;
       k f = a.F;
       BaseFragment uBaseFragmen = f.b();
       ClientContent$LiveStreamPackage liveStreamPa = f.a();
       liveVoicePar = f.y();
       d.l(h.b(a.M.a(), obj.a.M.b(), obj.a.M.c(), obj.a.M.d), uBaseFragmen, liveStreamPa, liveVoicePar, obj.a.M.d(), 14, 0, 0, 2, p0.a().a()+"");
       return;
    }
}
