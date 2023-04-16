package h22.o0;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView$b;
import com.kuaishou.live.core.show.activityredpacket.a0;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfo;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOpenActionView;
import o22.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketTopLuckyResponse;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfoExtraInfo;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h22.a;
import java.lang.String;
import t02.r1;
import t02.a0;
import z12.x;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import h22.h;
import y22.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uj2.a;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import com.kwai.framework.model.user.User;
import pj2.c0;
import java.util.Map;
import com.kuaishou.live.core.show.share.f$b;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public final class o0 implements LiveActivityRedPacketGrabButtonTipView$b	// class@002c05
{
    public final a0 a;
    public final LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfo b;

    public void o0(a0 p0,LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfo p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfo mExtraInfo;
       a b;
       o0 ta = this.a;
       o0 tb = this.b;
       ta.M.e();
       LiveActivityRedPacketTopLuckyResponse value = ta.S.e.getValue();
       if (value != null) {
          value = value.mActionButton;
          if (value != null) {
             value.mIsAnimationEnable = false;
          }
       }
       LiveActivityRedPacketTopLuckyResponse$LiveActivityRedPacketTopLuckyActionButtonInfo mActionType = tb.mActionType;
       if (mActionType != 1) {
          int i = 2;
          if (mActionType != i) {
             if (mActionType == 3) {
                mExtraInfo = tb.mExtraInfo;
                if (mExtraInfo != null) {
                   a0 s = ta.s;
                   x.K(mExtraInfo.mUrl, ta.getContext(), s.a, s.b);
                }else {
                   b.Z(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "lucky list button jump failed");
                }
                h.c(ta.r.a(), ta.s.a(), ta.s.d(), ta.s.b(), "JUMP_ACTION_BUTTON_LUCKY_LIST", ta.s.c());
             }
          }else {
             b = ta.s.b;
             a0 t = ta.t;
             mExtraInfo = tb.mExtraInfo;
             if (!PatchProxy.applyVoidThreeRefs(b, t, mExtraInfo, null, q.class, "20") && b != null) {
                c0 uoc0 = new c0();
                uoc0.r(mExtraInfo.mSubBiz);
                uoc0.m(i);
                uoc0.l(ImmutableMap.builder().c("liveName", b.Z2.I().getName()).a());
                uoc0.q(new a(t.treasureBoxId, t.boxType, b.Z2.getLiveStreamId()));
                uoc0.o(mExtraInfo.mShareIdentifier);
                b.o1.w1(uoc0);
             }
             h.c(ta.r.a(), ta.s.a(), ta.s.d(), ta.s.b(), "SHARE_ACTION_BUTTON_LUCKY_LIST", ta.s.c());
          }
       }else {
          a0 s1 = ta.s;
          q.k(tb.mExtraInfo.mUrl, ta.getActivity(), ta.r.b().getChildFragmentManager(), s1.b, s1.a);
       }
       return;
    }
}
