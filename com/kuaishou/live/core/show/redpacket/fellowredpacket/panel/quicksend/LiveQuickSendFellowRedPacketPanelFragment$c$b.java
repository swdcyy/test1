package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment$c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import z12.x;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.LiveQuickSendFellowRedPacketPanelFragment;
import yg2.d;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveQuickSendFollowRedPacketPanelItemInfo;
import com.kwai.framework.model.user.UserInfo;
import y8c.d;
import com.kuaishou.live.core.show.redpacket.LiveFellowRedPacketLogger;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.b;
import ok.h;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.quicksend.a;
import qvb.q;
import zg2.g;

public class LiveQuickSendFellowRedPacketPanelFragment$c$b extends m	// class@000eb5
{
    public final LiveQuickSendFellowRedPacketPanelFragment$c c;

    public void LiveQuickSendFellowRedPacketPanelFragment$c$b(LiveQuickSendFellowRedPacketPanelFragment$c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       ArrayList uArrayList1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuickSendFellowRedPacketPanelFragment$c$b.class, "1")) {
          return;
       }
       LiveQuickSendFellowRedPacketPanelFragment$c$b tc = this.c;
       Objects.requireNonNull(tc);
       LiveQuickSendFellowRedPacketPanelFragment$c uoc = LiveQuickSendFellowRedPacketPanelFragment$c.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, uoc, "5")) {
          tc.x.J = x.G(tc.getActivity());
          tc.x.J.k0(new d(tc));
          BaseFragment uBaseFragmen = tc.x.G.b();
          ClientContent$LiveStreamPackage liveStreamPa = tc.x.G.a();
          LiveQuickSendFellowRedPacketPanelFragment$c p = tc.p;
          UserInfo mId = p.mUserInfo.mId;
          LiveQuickSendFollowRedPacketPanelItemInfo mLiveStreamI = p.mLiveStreamId;
          int i = tc.q.get();
          LiveFellowRedPacketLogger liveFellowRe = LiveFellowRedPacketLogger.class;
          if (PatchProxy.isSupport(liveFellowRe)) {
             Object[] objArray1 = new Object[]{uBaseFragmen,liveStreamPa,mId,mLiveStreamI,Integer.valueOf(i)};
             if (PatchProxy.applyVoid(objArray1, objArray, liveFellowRe, "13")) {
             label_00a4 :
                LiveQuickSendFellowRedPacketPanelFragment h = tc.x.H;
                ArrayList uArrayList = PatchProxy.apply(objArray, tc, uoc, "6");
                if (uArrayList != PatchProxyResult.class) {
                }else {
                   List items = tc.x.q().getItems();
                   if (q.f(items)) {
                      uArrayList = new ArrayList();
                   }else {
                      ArrayList uArrayList2 = new ArrayList();
                      m.s(items).F(new b(tc)).n(uArrayList2);
                      uArrayList1 = uArrayList2;
                   label_00e2 :
                      h.o(uArrayList1, 173, tc.q.get(), 0, new a(tc));
                   }
                }
                uArrayList1 = uArrayList;
                goto label_00e2 ;
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SEND_RED_PACKET_HEAD_BUTTON";
          uElementPack.params = LiveFellowRedPacketLogger.a(liveStreamPa, -1);
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.kwaiId = mId;
          userPackage.identity = mLiveStreamI;
          userPackage.index = i + 1;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.userPackage = userPackage;
          u1.L("", uBaseFragmen, 1, uElementPack, uContentPack);
          goto label_00a4 ;
       }
       return;
    }
}
