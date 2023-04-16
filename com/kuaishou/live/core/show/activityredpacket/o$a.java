package com.kuaishou.live.core.show.activityredpacket.o$a;
import com.kuaishou.live.core.show.activityredpacket.o$b;
import com.kuaishou.live.core.show.activityredpacket.o;
import java.lang.Object;
import msd.a;
import o22.b;
import p22.a;
import com.kwai.robust.PatchProxyResult;
import y22.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import java.util.Objects;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketCoupleUserView;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import r22.a;
import androidx.lifecycle.ViewModel;
import q22.a;
import kotlin.jvm.internal.a;
import xh3.l;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabBottomTipView;
import xh3.g;
import com.kuaishou.live.core.show.activityredpacket.mvvm.viewbinding.LiveActivityRedPacketFragmentPrepareOpenViewBinding$bindViewModel$1;
import msd.l;
import com.kuaishou.live.core.show.activityredpacket.view.LiveNineImageView;
import android.graphics.drawable.Drawable;
import z22.e;
import android.widget.ImageView;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinTheme;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import h22.s;
import y22.d$c;
import y22.d;
import h22.t;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import ekd.j;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import w22.a$b;
import android.widget.RelativeLayout;
import o22.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import z12.x;
import h22.r;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketCoupleUserView$a;
import o22.i;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.core.show.activityredpacket.user.f$c;
import o22.f;
import java.util.ArrayList;
import o22.e;
import qk.m;
import y22.o;
import ok.h;
import java.util.Collection;
import java.util.List;
import u22.b0$b;
import com.kuaishou.live.common.core.component.follow.cache.c;
import brd.t;
import h22.q;
import com.kuaishou.live.core.show.activityredpacket.n;
import erd.g;
import crd.b;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo$ConditionButtonState;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinButtonInfo;
import ta1.a;
import p91.m;
import java.util.Map;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$d;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import nt5.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketPopupPageType;
import java.lang.StringBuilder;
import java.lang.Enum;
import h62.d;

public class o$a implements o$b	// class@000966
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void a(a p0,b p1,a p2){
       o$a a1;
       o y;
       o$a uoa1;
       String str4;
       LiveRedPackSkinMessage$RedPackSkinTheme reserveButto;
       long l;
       o str5;
       ViewGroup$LayoutParams str5;
       ArrayList obj3;
       e uoe;
       LiveTreasureBoxMessage$LiveTreasureBoxShow str51;
       UserInfo obj4;
       UserInfo userInfo1;
       LiveActivityRedPacketBaseUserInfoView d;
       o q;
       o$a uoa = this;
       Object obj = p0;
       b uob = p1;
       LiveTreasureBoxMessage$LiveTreasureBoxShow obj1 = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       o oo = o.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o$a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "showPrepareOpenView");
       int i = 0;
       uob.b.setValue(Integer.valueOf(i));
       o$a a = uoa.a;
       a.U0 = uob;
       uob.d.observe(a, a.V0);
       uoa.a.Y = uob.c.getValue();
       a = uoa.a;
       Objects.requireNonNull(a);
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, a, oo, str) || (a.w != null && a.v != null)) {
          if (a.x == null) {
             a.c(a.getContext(), R.layout.arg_RES_7f0d09af, a.v);
             a.x = a.v.findViewById(0x7f0a1850);
             a.G = a.v.findViewById(0x7f0a1832);
             a.C = a.v.findViewById(0x7f0a1852);
             a.D = a.v.findViewById(0x7f0a1851);
             a.E = a.v.findViewById(0x7f0a184f);
          }
          if (a.A == null) {
             a.c(a.getContext(), R.layout.arg_RES_7f0d09ac, a.w);
             a.A = a.w.findViewById(0x7f0a1843);
             a.H = a.w.findViewById(0x7f0a182f);
             a.B = a.v.findViewById(0x7f0a184e);
             a.I = a.w.findViewById(0x7f0a1845);
          }
       }
    label_00f4 :
       a = uoa.a;
       Objects.requireNonNull(a);
       String str1 = "5";
       RedPacketType redPacketTyp = 1;
       if (!PatchProxy.applyVoidOneRefs(obj1, a, oo, str1) && a.Q == null) {
          a.Q = new ViewModelProvider(a, obj1).get(a.class);
          a uoa3 = new a(a.m8());
          q = a.Q;
          if (!PatchProxy.applyVoidTwoRefs(a, q, uoa3, a.class, "1")) {
             a.p(a, "lifecycleOwner");
             a.p(q, "viewModel");
             l.d(uoa3.a, a, q.a, redPacketTyp);
             g.a(uoa3.a.getContentTextView(), a, q.b);
             g.c(uoa3.a.getContentTextView(), a, q.c, LiveActivityRedPacketFragmentPrepareOpenViewBinding$bindViewModel$1.INSTANCE);
             e.a(uoa3.a.getBackGroundView(), a, q.d, uoa3.a.getDefaultBackgroundDrawable());
          }
       }
       a = uoa.a;
       Objects.requireNonNull(a);
       obj1 = 8;
       if (!PatchProxy.applyVoid(objArray, a, oo, "19")) {
          a.x.setVisibility(i);
          a.A.setVisibility(i);
          a.F.setVisibility(obj1);
          y = a.Y;
          if (y != null) {
             LiveTreasureBoxMessage$LiveTreasureBoxShow skinTheme = y.skinTheme;
             if (skinTheme != null) {
                LiveRedPackSkinMessage$RedPackSkinTheme bgHolidayPic = skinTheme.bgHolidayPict;
                if (bgHolidayPic != null && bgHolidayPic.length > 0) {
                   d.b(a.y, e0.i(bgHolidayPic), new s(a));
                }
                bgHolidayPic = a.Y.skinTheme.bgHolidayBottomPict;
                if (bgHolidayPic != null && bgHolidayPic.length > 0) {
                   d.b(a.z, e0.i(bgHolidayPic), new t(a));
                }
             }
          }
          a.y.setVisibility(obj1);
          a.z.setVisibility(obj1);
       }
    label_01c6 :
       a = uoa.a;
       Objects.requireNonNull(a);
       i3 oi3 = -1;
       if (!PatchProxy.applyVoid(objArray, a, oo, "7")) {
          y = a.v;
          if (y != null) {
             y.bringToFront();
          }
          a.G.setVisibility(i);
          a.H.setVisibility(i);
          ViewGroup$LayoutParams layoutParams1 = a.G.getLayoutParams();
          layoutParams1.height = a1.d(0x7f07093e);
          a.G.setLayoutParams(layoutParams1);
          CDNUrl[] uCDNUrlArray = (j.h(a.Y.skinTheme.coverTopPict))? e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_PREPARE_BOTTOM_BACKGROUND.getResourcePath())): e0.i(a.Y.skinTheme.coverTopPict);
          a.X.a(a.G, uCDNUrlArray, oi3);
          uCDNUrlArray = (j.h(a.Y.skinTheme.coverBottomPict))? e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_PREPARE_BOTTOM_BACKGROUND.getResourcePath())): e0.i(a.Y.skinTheme.coverBottomPict);
          a.X.a(a.H, uCDNUrlArray, oi3);
       }
       a = uoa.a;
       Objects.requireNonNull(a);
       String str2 = "6";
       if (!PatchProxy.applyVoid(objArray, a, oo, "8")) {
          if (a.W8()) {
             if (!PatchProxy.applyVoid(objArray, a, oo, "9")) {
                a.D.setVisibility(i);
                a.C.setVisibility(obj1);
                y = a.Y;
                a str6 = PatchProxy.applyOneRefs(y, objArray, oq, str);
                if (str6 != patchProxyRe) {
                }else {
                   str51 = y.userInfo;
                   if (str51 == null || y.contributorInfo == null) {
                      str6 = objArray;
                   }else {
                      a uoa2 = new a(UserInfo.convertFromProto(str51), UserInfo.convertFromProto(y.contributorInfo));
                      str51 = y.skinTheme;
                      if (str51 != null) {
                         uoa2.a = x.z(str51.bgThemeColor);
                      }
                      uoa2.e = e0.i(y.shadowUrl);
                      uoa2.d = e0.i(y.contributorHeadIcon);
                      str6 = uoa2;
                   }
                }
                if (str6 == null) {
                   b.Z(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "illegal user info or contributor info");
                }else {
                   y = a.D;
                   if (!PatchProxy.applyVoidTwoRefs(y, str6, objArray, oq, "22")) {
                      UserInfo userInfo = str6.b();
                      UserInfo mHeadUrls = userInfo.mHeadUrls;
                      userInfo = userInfo.mHeadUrl;
                      int i1 = str6.a();
                      Objects.requireNonNull(y);
                      if (PatchProxy.isSupport(LiveActivityRedPacketCoupleUserView.class)) {
                         userInfo1 = mHeadUrls;
                         if (PatchProxy.applyVoidThreeRefs(mHeadUrls, userInfo, Integer.valueOf(i1), y, LiveActivityRedPacketCoupleUserView.class, "1")) {
                         label_0312 :
                            obj4 = str6.c();
                            userInfo = obj4.mHeadUrls;
                            obj4 = obj4.mHeadUrl;
                            i1 = str6.a();
                            if (!PatchProxy.isSupport(LiveActivityRedPacketCoupleUserView.class) || !PatchProxy.applyVoidThreeRefs(userInfo, obj4, Integer.valueOf(i1), y, LiveActivityRedPacketCoupleUserView.class, "2")) {
                               y.L(y.C, userInfo, obj4, i1);
                            }
                            y.setRightUserIcon(str6.d);
                            y.setRightUserShadow(str6.e);
                         }
                      }else {
                         userInfo1 = mHeadUrls;
                      }
                      y.L(y.B, userInfo1, userInfo, i1);
                      goto label_0312 ;
                   }
                   a.D.setListener(new r(a, str6));
                }
             }
          }else if(PatchProxy.applyVoid(objArray, a, oo, "10")){
             i oi = q.b(a.Y, redPacketTyp);
             a.D.setVisibility(obj1);
             a.C.setVisibility(0);
             if (TextUtils.n(oi.c().mId, QCurrentUser.me().getId())) {
                a.C.setFollowViewVisibility(obj1);
                str5 = a.C;
                int i2 = a1.e(57.00f);
                Objects.requireNonNull(str5);
                if (!PatchProxy.isSupport(LiveActivityRedPacketBaseUserInfoView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), str5, LiveActivityRedPacketBaseUserInfoView.class, str2)) {
                   d = str5.d;
                   if (d != null && d.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                      ViewGroup$MarginLayoutParams layoutParams = str5.d.getLayoutParams();
                      layoutParams.topMargin = i2;
                      str5.d.setLayoutParams(layoutParams);
                   }
                }
             }
             a.U.a(a.C, oi, redPacketTyp);
          }
       }
       a = uoa.a;
       Objects.requireNonNull(a);
       String str3 = "13";
       if (!PatchProxy.applyVoid(objArray, a, oo, str3)) {
          str5 = a.Y;
          LiveRedPackSkinMessage$RedPackSkinTheme obj2 = PatchProxy.applyOneRefs(str5, objArray, oq, str1);
          y = 2;
          if (obj2 != patchProxyRe) {
          }else {
             obj2 = str5.skinTheme.skinType;
             if (obj2 != redPacketTyp) {
                if (obj2 != y) {
                   if (obj2 == 3) {
                      obj3 = PatchProxy.applyOneRefs(str5, objArray, oq, str3);
                      if (obj3 != patchProxyRe) {
                         obj2 = obj3;
                      }else if(str5.item == null){
                         obj2 = new f();
                         obj2.b = -1;
                         obj3 = new ArrayList();
                         uoe = new e();
                         uoe.e = str5.unShowMessage;
                         str51 = str5.skinTheme;
                         if (str51 != null) {
                            uoe.j(x.z(str51.bgThemeColor));
                         }
                         obj3.add(uoe);
                         obj2.g = obj3;
                      }
                   }
                }else {
                   obj4 = PatchProxy.applyOneRefs(str5, objArray, oq, "12");
                   if (obj4 != patchProxyRe) {
                      obj2 = obj4;
                   }else {
                      obj2 = new f();
                      obj2.b = redPacketTyp;
                      obj3 = new ArrayList();
                      uoe = new e();
                      uoe.h(str5.totalKsCoin);
                      uoe.k(a1.p(R.string.arg_RES_7f101c07));
                      str51 = str5.skinTheme;
                      if (str51 != null) {
                         uoe.j(x.z(str51.bgThemeColor));
                      }
                      obj3.add(uoe);
                      obj2.g = obj3;
                   }
                }
             }else {
                obj4 = PatchProxy.applyOneRefs(str5, objArray, oq, "11");
                if (obj4 != patchProxyRe) {
                   obj2 = obj4;
                }else if(str5.item == null){
                   obj2 = new f();
                   obj2.b = 2;
                   obj3 = new ArrayList();
                   m.t(str5.item).F(new o(str5)).n(obj3);
                   obj2.g = obj3;
                }
             }
             obj2 = objArray;
          }
          if (!PatchProxy.applyVoidOneRefs(obj2, a, oo, "14")) {
             if (a.W8()) {
                i = o.Z0;
             }else if(obj2 != null && obj2.b == -1){
                i = o.Y0;
             }else {
                i = o.X0;
             }
             if (!PatchProxy.isSupport(oo) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), a, oo, "15")) {
                str5 = a.E.getLayoutParams();
                if (str5 instanceof ViewGroup$MarginLayoutParams) {
                   str5.topMargin = i;
                }
                a.E.setLayoutParams(str5);
             }
          }
          if (obj2 != null) {
             a.E.getLayoutParams().width = (obj2.b == 2 && obj2.g.size() > redPacketTyp)? o.a1: -1;
             a.W.a(a.E, obj2, 0);
          }
       }
       a1 = this.a;
       Objects.requireNonNull(a1);
       if (!PatchProxy.applyVoidOneRefs(obj, a1, oo, "16")) {
          str = String.valueOf(a1.Y.userInfo.userId);
          a1.X7(c.b().d(str).take(1).subscribe(new q(a1, str), n.b));
          if (!PatchProxy.applyVoidTwoRefs(str, obj, a1, oo, "17")) {
             o z = a1.Z;
             y = a1.Y;
             LiveActivityRedPacketGrabButtonInfo liveActivity = PatchProxy.applyTwoRefs(z, y, objArray, oq, str2);
             if (liveActivity != patchProxyRe) {
                uoa1 = a1;
                str4 = str;
             }else {
                liveActivity = new LiveActivityRedPacketGrabButtonInfo();
                obj1 = y.skinTheme;
                if (obj1 != null) {
                   LiveRedPackSkinMessage$RedPackSkinTheme needFollow = obj1.needFollow;
                   liveActivity.a = needFollow;
                   LiveRedPackSkinMessage$RedPackSkinTheme needBookRese = obj1.needBookReservation;
                   liveActivity.b = needBookRese;
                   if (needBookRese != null && needFollow != null) {
                      liveActivity.y = obj1.reservationId;
                      liveActivity.A = y.reserveRequestMaxDelayMs;
                      liveActivity.z = y.queryReserveMaxDelayMs;
                      reserveButto = obj1.reserveButton;
                      if (reserveButto != null) {
                         liveActivity.g(LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.FOLLOWED_UNRESERVED, reserveButto);
                      }
                      reserveButto = y.skinTheme.reserveFollowButton;
                      if (reserveButto != null) {
                         liveActivity.g(LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.UNFOLLOWED_UNRESERVED, reserveButto);
                      }
                      reserveButto = y.skinTheme.defaultButton;
                      if (reserveButto != null) {
                         liveActivity.g(LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.RESERVE_UNKNOWN, reserveButto);
                      }
                      reserveButto = y.skinTheme.followButton;
                      if (reserveButto != null) {
                         liveActivity.g(LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.UNFOLLOWED_RESERVED, reserveButto);
                      }
                   }else if(needFollow != null){
                      reserveButto = obj1.followButton;
                      if (reserveButto != null) {
                         liveActivity.g(LiveActivityRedPacketGrabButtonInfo$ConditionButtonState.UNFOLLOWED, reserveButto);
                      }
                   }
                }
                liveActivity.s = y.treasureBoxId;
                liveActivity.t = y.boxType;
                obj1 = y.skinTheme;
                if (obj1 != null) {
                   reserveButto = obj1.openButton;
                   if (reserveButto != null) {
                      LiveTreasureBoxMessage$LiveTreasureBoxShow grabTime = y.grabTime;
                      str4 = str;
                      l = grabTime - y.startShowTime;
                      uoa1 = a1;
                      liveActivity.e = x.z(reserveButto.textColor);
                      liveActivity.f = x.y(y.skinTheme.openButton.buttonColor);
                      liveActivity.g = 0;
                      liveActivity.h = x.z(y.skinTheme.bgThemeColor);
                      liveActivity.o = x.z(y.skinTheme.openButton.buttonBorderColor);
                      liveActivity.l = l;
                      liveActivity.m = grabTime - z.o().s();
                      liveActivity.n = y.grabTime;
                      liveActivity.p = e0.i(y.skinTheme.openButton.buttonPict);
                      liveActivity.r = e0.i(y.skinTheme.openDynamicPic);
                      liveActivity.q = e0.i(y.skinTheme.disableDirectFollowPict);
                   label_0639 :
                      liveActivity.u = y.disableDirectFollow;
                      LiveTreasureBoxMessage$LiveTreasureBoxShow extraMessage = y.extraMessage;
                      String extraMessage1 = (extraMessage == null)? null: extraMessage.get("liveActivityName");
                      liveActivity.w = extraMessage1;
                      extraMessage = y.extraMessage;
                      extraMessage1 = (extraMessage == null)? null: extraMessage.get("position");
                      liveActivity.x = extraMessage1;
                      extraMessage = y.extraMessage;
                      extraMessage1 = (extraMessage == null)? null: extraMessage.get("deliveryOrderId");
                      liveActivity.v = extraMessage1;
                   }
                }
                uoa1 = a1;
                str4 = str;
                goto label_0639 ;
             }
             if (TextUtils.n(str4, QCurrentUser.me().getId())) {
                liveActivity.h(redPacketTyp);
             }
             liveActivity.d = obj;
             uoa1.S.a(uoa1.B, liveActivity, UserInfo.convertFromProto(uoa1.Y.userInfo));
          }
       }
       a1 = this.a;
       Objects.requireNonNull(a1);
       if (!PatchProxy.applyVoid(null, a1, oo, "23")) {
          LiveTreasureBoxMessage$LiveTreasureBoxShow value = a1.U0.c.getValue();
          if (value != null) {
             oi3 = i3.f();
             oi3.c("countdown", Long.valueOf((value.grabTime - a1.Z.o().s())));
             LiveRedPacketStage rED_PACKET_C = LiveRedPacketStage.RED_PACKET_COUNTDOWN;
             LiveRedPacketPopupPageType pREPARE_PANE = LiveRedPacketPopupPageType.PREPARE_PANEL;
             d.c(a1.U0.a.a(), value.treasureBoxId, RedPacketType.RED_PACKET_TYPE_ACTIVITY, value.boxType, rED_PACKET_C, pREPARE_PANE, a1.U0.a.b(rED_PACKET_C.name()+pREPARE_PANE.getValue()), oi3);
          }
       }
       return;
    }
}
