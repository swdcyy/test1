package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c;
import k51.c;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveQuickSendFollowRedPacketPanelItemInfo;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import com.airbnb.lottie.LottieAnimationView;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import java.lang.StringBuilder;
import d61.f0;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import y8c.d;
import com.kuaishou.live.core.show.redpacket.LiveFellowRedPacketLogger;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yg2.f;
import lp3.e;
import w91.a;
import lp3.c;
import java.util.Map;
import u07.u;
import com.kuaishou.live.common.core.component.recharge.d;
import ug2.a;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import yg2.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c$c;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c$b;

public class LiveQuickSendFellowRedPacketPanelFragment$c extends c	// class@000eb7
{
    public LiveQuickSendFollowRedPacketPanelItemInfo p;
    public d q;
    public TextView r;
    public ImageView s;
    public TextView t;
    public LiveUserView u;
    public TextView v;
    public LiveLottieAnimationView w;
    public final LiveQuickSendFellowRedPacketPanelFragment x;
    public static String sLivePresenterClassName = "LiveQuickSendFellowRedPacketPanelFragment$LiveQuickSendFellowRedPacketPanelItemPresenter";

    public void LiveQuickSendFellowRedPacketPanelFragment$c(LiveQuickSendFellowRedPacketPanelFragment p0){
       this.x = p0;
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveQuickSendFellowRedPacketPanelFragment$c.class, "3")) {
          return;
       }
       this.r.setText(this.p.mUserInfo.mName);
       boolean b = false;
       this.u.p0(this.p.mUserInfo, HeadImageSize.SMALL, b);
       if (!this.w.p()) {
          this.w.setRepeatCount(-1);
          this.w.setAnimationFromUrl(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_WHITE_SPECTRUM.getResourcePath()));
          this.w.s();
       }
       this.t.setText(f0.k((long)this.p.mOnlineAudienceCount)+" | "+this.p.mThresholdDisplayText);
       int i = 1;
       this.v.setEnabled((this.p.mIsSent ^ i));
       LiveQuickSendFellowRedPacketPanelFragment$c tv = this.v;
       String str = (this.p.mIsSent != null)? a1.p(R.string.arg_RES_7f102b03): a1.p(R.string.arg_RES_7f102b02);
       tv.setText(str);
       BaseFragment uBaseFragmen = this.x.G.b();
       ClientContent$LiveStreamPackage liveStreamPa = this.x.G.a();
       LiveQuickSendFellowRedPacketPanelFragment$c tp = this.p;
       UserInfo mId = tp.mUserInfo.mId;
       LiveQuickSendFollowRedPacketPanelItemInfo mLiveStreamI = tp.mLiveStreamId;
       int i1 = this.q.get();
       if (PatchProxy.isSupport(LiveFellowRedPacketLogger.class)) {
          Object[] objArray1 = new Object[]{uBaseFragmen,liveStreamPa,mId,mLiveStreamI,Integer.valueOf(i1)};
          if (PatchProxy.applyVoid(objArray1, objArray, LiveFellowRedPacketLogger.class, "14")) {
          label_00fa :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SEND_RED_PACKET_HEAD_BUTTON";
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.kwaiId = mId;
       userPackage.identity = mLiveStreamI;
       userPackage.index = i1 + i;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.userPackage = userPackage;
       uContentPack.liveStreamPackage = liveStreamPa;
       u1.C0("", uBaseFragmen, 9, uElementPack, uContentPack);
       goto label_00fa ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveQuickSendFellowRedPacketPanelFragment$c.class, "4")) {
          return;
       }
       this.w.f();
       return;
    }
    public final void P8(){
       boolean b;
       LiveQuickSendFellowRedPacketPanelFragment$c uoc = LiveQuickSendFellowRedPacketPanelFragment$c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "8")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uoc, "9");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(d.a(0x630bc993).d1().q() - (long)this.p.mLiveGiftPackage.mTotalKsCoin < 0){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "10")) {
             d.d(this.getActivity(), this.x.G.a(), new f(this), true, "LIVE_ROOM_SEND_GIFT", this.x.G.t5().a(a.class).d6());
          }
          return;
       }else {
          LiveQuickSendFellowRedPacketPanelFragment$c tp = this.p;
          this.X7(e.h().h(tp.mLiveStreamId, String.valueOf(tp.mLiveGiftPackage.mGiftPackageId)).map(new e()).subscribe(new g(this), new LiveQuickSendFellowRedPacketPanelFragment$c$c(this)));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuickSendFellowRedPacketPanelFragment$c.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a2405);
       this.s = m1.f(p0, 0x7f0a23ff);
       this.t = m1.f(p0, 0x7f0a23fe);
       this.u = m1.f(p0, 0x7f0a2400);
       this.v = m1.f(p0, 0x7f0a2402);
       this.w = m1.f(p0, 0x7f0a3aac);
       m1.a(p0, new LiveQuickSendFellowRedPacketPanelFragment$c$a(this), R.id.live_quick_send_fellow_red_packet_send_button);
       m1.a(p0, new LiveQuickSendFellowRedPacketPanelFragment$c$b(this), R.id.live_quick_send_fellow_red_packet_avatar);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveQuickSendFellowRedPacketPanelFragment$c.class, "1")) {
          return;
       }
       this.p = this.q8(LiveQuickSendFollowRedPacketPanelItemInfo.class);
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
