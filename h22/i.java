package h22.i;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView$b;
import com.kuaishou.live.core.show.activityredpacket.k;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOpenActionView;
import o22.c;
import java.lang.Object;
import java.util.Objects;
import o22.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.redpacket.model.LiveActivityRedPacketGrabResponse;
import com.kuaishou.live.common.core.component.redpacket.model.LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabActionButtonInfo;
import com.kuaishou.live.common.core.component.redpacket.model.LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabActionExtraInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import h22.a;
import java.lang.String;
import t02.a0;
import t02.r1;
import y22.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import z12.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import h22.h;
import uj2.a;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import com.kwai.framework.model.user.User;
import pj2.c0;
import java.util.Map;
import com.kuaishou.live.core.show.share.f$b;

public final class i implements LiveActivityRedPacketGrabButtonTipView$b	// class@002bfa
{
    public final k a;
    public final LiveActivityRedPacketOpenActionView b;
    public final c c;

    public void i(k p0,LiveActivityRedPacketOpenActionView p1,c p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(){
       a b;
       i ta = this.a;
       i tc = this.c;
       Objects.requireNonNull(ta);
       this.b.e();
       if (ta.C.d.getValue() != null && ta.C.d.getValue().mActionButtonInfo != null) {
          ta.C.d.getValue().mActionButtonInfo.mIsMoreActionButtonAnimationEnable = false;
          if (tc != null && tc.a != null) {
             LiveActivityRedPacketGrabResponse mActionButto = ta.B.mActionButtonInfo;
             LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabActionButtonInfo mExtraInfo = mActionButto.mExtraInfo;
             if (mExtraInfo != null) {
                LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabActionButtonInfo mActionType = mActionButto.mActionType;
                if (mActionType == 1) {
                   k m = ta.M;
                   q.k(mExtraInfo.mJumpUrl, ta.getActivity(), ta.F.b().getChildFragmentManager(), m.b, m.a);
                }else if(mActionType == 3){
                   if (TextUtils.x(mExtraInfo.mJumpUrl)) {
                      b.B(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, k.O+" : action button mJumpUrl empty");
                   }else {
                      k m1 = ta.M;
                      x.K(ta.B.mActionButtonInfo.mExtraInfo.mJumpUrl, ta.getContext(), m1.a, m1.b);
                      h.c(ta.F.a(), ta.M.a(), ta.M.d(), ta.M.b(), "MORE_RED_PACK", ta.M.c());
                   }
                }else {
                   int i = 2;
                   if (mActionType == i) {
                      b = ta.M.b;
                      if (b != null) {
                         k g = ta.G;
                         c0 uoc0 = new c0();
                         uoc0.r(ta.B.mActionButtonInfo.mExtraInfo.mSubBiz);
                         uoc0.m(i);
                         uoc0.l(ImmutableMap.builder().c("liveName", ta.M.b.Z2.I().getName()).a());
                         uoc0.q(new a(g.treasureBoxId, g.boxType, b.Z2.getLiveStreamId()));
                         uoc0.o(ta.B.mActionButtonInfo.mExtraInfo.mShareIdentifier);
                         ta.M.b.o1.w1(uoc0);
                      }
                      h.c(ta.F.a(), ta.M.a(), ta.M.d(), ta.M.b(), "SHARE", ta.M.c());
                   }
                }
             }
          }
       }
       return;
    }
}
