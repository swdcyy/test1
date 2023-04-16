package hy0.o;
import erd.g;
import hy0.p;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveSendBulletCommentResponse;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.core.basic.model.LivePayBulletResponse;
import t02.a0;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import ry1.b;
import com.kuaishou.live.core.basic.model.LiveSendBulletCommentResultResponse;
import java.lang.StringBuilder;
import lnc.a1;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import com.kuaishou.livestream.message.nano.WealthHighGradeBulletComment;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.kwai.framework.model.user.UserInfo;
import java.util.List;
import hx1.a;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import ekd.q;
import com.kwai.framework.model.user.UserExtraInfo$RoleInfo;
import java.util.Arrays;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import lnc.e0;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.protobuf.livestream.nano.LivePrivilegeState;
import ekd.j;
import hy0.e;
import z1.a;
import n81.e;
import com.kuaishou.live.core.show.fansgroup.LiveAudienceKwaiCoinsChangeReason;
import mrd.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.google.gson.JsonElement;
import hy0.v;
import com.kuaishou.live.core.basic.model.LiveSendBulletPopUpInfo;
import fq5.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import u07.t$a;
import java.lang.CharSequence;
import u07.f;
import hy0.j;
import u07.u;
import hy0.k;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class o implements g	// class@0027af
{
    public final p b;
    public final String c;
    public final int d;

    public void o(p p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       o oo = this;
       o b = oo.b;
       o c = oo.c;
       o d = oo.d;
       LiveSendBulletCommentResponse liveSendBull = p0;
       Objects.requireNonNull(b);
       p op = p.class;
       if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidThreeRefs(c, Integer.valueOf(d), liveSendBull, b, p.class, "6")) {
          b.w = liveSendBull.getBulletInfo();
          b.p.b3.d0().mLivePayBulletResponse = b.w;
          if (liveSendBull.getLiveSendBulletCommentResultResponse() != null) {
             LiveSendBulletCommentResultResponse liveSendBull1 = liveSendBull.getLiveSendBulletCommentResultResponse();
             int i = 1;
             if (liveSendBull1.getShotCode() == i) {
                if (b.t != null) {
                   c = c+"["+a1.p(0x7f1037e5)+"]";
                }
                if (!PatchProxy.applyVoidOneRefs(c, b, op, "3")) {
                   LiveUserStatusResponse liveUserStat = b.p.b3.D1();
                   WealthHighGradeBulletComment wealthHighGr = new WealthHighGradeBulletComment();
                   WealthHighGradeBulletComment[] wealthHighGr1 = new WealthHighGradeBulletComment[i];
                   wealthHighGr1[0] = wealthHighGr;
                   new SCActionSignal().highGradeBulletComment = wealthHighGr1;
                   UserInfo userInfo = UserInfo.convertFromQUser(b.a(QCurrentUser.me()));
                   List list = b.p.r2.Bi();
                   UserExtraInfo userExtraInf = new UserExtraInfo();
                   userInfo.mExtraInfo = userExtraInf;
                   userExtraInf.mRoleInfos = list;
                   UserInfos$UserInfo userInfo1 = UserInfo.convertToProto(userInfo);
                   wealthHighGr.user = userInfo1;
                   UserExtraInfo$RoleInfo roleInfo = q.e(list, 0);
                   if (roleInfo != null) {
                      if (roleInfo.mRoleType == null) {
                         i = 0;
                      }
                      if (i) {
                         userInfo1.userName = roleInfo.mRoleName;
                         userInfo1.headUrls = e0.j(Arrays.asList(roleInfo.mHeadUrls));
                      }
                   }
                   wealthHighGr.comment = c;
                   wealthHighGr.senderState = new LiveAudienceState();
                   LivePrivilegeState livePrivileg = new LivePrivilegeState();
                   wealthHighGr.senderState.livePrivilegeState = livePrivileg;
                   livePrivileg.bulletCommentBackgroundKey = liveUserStat.mBulletCommentBackgroundKey;
                   if (!j.h(liveUserStat.mCurrentUserHeadWidget)) {
                      livePrivileg.avatarFrame = liveUserStat.mCurrentUserHeadWidget;
                      livePrivileg.avatarFrameAnimation = liveUserStat.mCurrentUserHeadWidgetAnimation;
                   }
                   livePrivileg.bulletCommentColor = liveUserStat.mBulletCommentColor;
                   wealthHighGr.senderState.assistantType = liveUserStat.mAssistantType;
                   b.r.m7(new e(b, wealthHighGr));
                }
                b.p.t2.onNext(LiveAudienceKwaiCoinsChangeReason.LIVE_BULLET_COMMENT);
                v.b(b.p.Z2.a(), 7, d, 0, e.r(b.getActivity()), b.u, b.p.c0());
             }else if(PatchProxy.applyVoidTwoRefs(c, liveSendBull1, b, op, "8")){
                LiveSendBulletPopUpInfo popUp = liveSendBull1.getPopUp();
                if (popUp != null && b.w != null) {
                   ClientContent$LiveStreamPackage liveStreamPa = b.p.b().a();
                   int shotCode = liveSendBull1.getShotCode();
                   int price = b.w.getPrice();
                   if (!PatchProxy.isSupport(v.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, Integer.valueOf(shotCode), Integer.valueOf(price), null, v.class, "6")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "SEND_BARRAGE_PROMPT_POPUP";
                      i3 oi3 = i3.f();
                      oi3.d("popup_type", v.e(shotCode));
                      if (shotCode == -4) {
                         oi3.d("barrage_price", String.valueOf(price));
                      }
                      uElementPack.params = oi3.e();
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = liveStreamPa;
                      u1.u0(9, uElementPack, uContentPack);
                   }
                   t$a uoa = new t$a(b.getActivity());
                   uoa.X0(popUp.getPopTitle());
                   uoa.z0(popUp.getPopContent());
                   uoa.T0(popUp.getConfirmButton());
                   uoa.R0(a1.p(R.string.cancel));
                   uoa = f.e(uoa);
                   uoa.t0(new j(b, liveSendBull1));
                   uoa.u0(new k(b, liveSendBull1, c, popUp));
                   uoa.v(i);
                   uoa.z(i);
                   uoa.Y(PopupInterface.a);
                }
             }
             v.b(b.p.Z2.a(), 8, d, liveSendBull1.getShotCode(), e.r(b.getActivity()), b.u, b.p.c0());
             b.Z(LiveLogTag.LIVE_BULLET_COMMENT, "send bullet comment error"+liveSendBull1.getShotCode());
          }
       }
       return;
    }
}
