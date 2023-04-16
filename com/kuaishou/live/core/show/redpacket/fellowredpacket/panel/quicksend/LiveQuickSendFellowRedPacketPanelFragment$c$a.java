package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveQuickSendFollowRedPacketPanelItemInfo;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import com.kuaishou.live.core.show.redpacket.LiveFellowRedPacketLogger;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pm8.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import u07.t$a;
import lnc.a1;
import java.lang.CharSequence;
import u07.f;
import yg2.e;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class LiveQuickSendFellowRedPacketPanelFragment$c$a extends m	// class@000eb4
{
    public final LiveQuickSendFellowRedPacketPanelFragment$c c;

    public void LiveQuickSendFellowRedPacketPanelFragment$c$a(LiveQuickSendFellowRedPacketPanelFragment$c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuickSendFellowRedPacketPanelFragment$c$a.class, "1")) {
          return;
       }
       LiveQuickSendFellowRedPacketPanelFragment$c$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, LiveQuickSendFellowRedPacketPanelFragment$c.class, "7")) {
          ClientContent$LiveStreamPackage liveStreamPa = tc.x.G.a();
          LiveGiftPackage mTotalKsCoin = tc.p.mLiveGiftPackage.mTotalKsCoin;
          LiveFellowRedPacketLogger liveFellowRe = LiveFellowRedPacketLogger.class;
          if (!PatchProxy.isSupport(liveFellowRe) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Integer.valueOf(mTotalKsCoin), objArray, liveFellowRe, "15")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SEND_RED_PACKET_BUTTON";
             uElementPack.params = LiveFellowRedPacketLogger.a(liveStreamPa, mTotalKsCoin);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(true, uElementPack, uContentPack);
          }
          Activity activity = tc.getActivity();
          SharedPreferences a = a.a;
          if (a.getBoolean("isFirstClickQuickSendFollowRedPacketButton", true) && activity != null) {
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean("isFirstClickQuickSendFollowRedPacketButton", false);
             g.a(uEditor);
             t$a uoa = new t$a(activity);
             uoa.z0(a1.p(R.string.arg_RES_7f1021f2));
             uoa.T0(a1.p(R.string.arg_RES_7f103a83));
             uoa.R0(a1.p(R.string.cancel));
             t$a uoa1 = f.e(uoa);
             uoa1.u0(new e(tc));
             uoa1.v(true);
             uoa1.z(false);
             uoa1.Y(PopupInterface.a);
          }else {
             tc.P8();
          }
       }
       return;
    }
}
