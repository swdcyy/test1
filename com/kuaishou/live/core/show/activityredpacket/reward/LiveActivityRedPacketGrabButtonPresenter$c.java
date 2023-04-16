package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$c;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView$c;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h22.a;
import h62.e;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketGrabButtonType;
import h62.d;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo;
import e17.i;
import java.util.Objects;
import java.lang.Integer;
import cx1.a;
import p91.m;
import brd.t;
import o22.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import tw1.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import java.lang.Throwable;
import u22.n;
import u22.o;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.StringBuilder;
import nt5.a;
import k2b.e0;
import tw1.d;
import h22.h;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketPopupPageType;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import java.lang.Enum;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonView;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView;
import android.widget.ImageView;

public class LiveActivityRedPacketGrabButtonPresenter$c implements LiveRedPackSnatchView$c	// class@000981
{
    public final LiveActivityRedPacketGrabButtonPresenter a;

    public void LiveActivityRedPacketGrabButtonPresenter$c(LiveActivityRedPacketGrabButtonPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveActivityRedPacketGrabButtonPresenter$c.class, "1")) {
          return;
       }
       RedPacketType rED_PACKET_T = RedPacketType.RED_PACKET_TYPE_ACTIVITY;
       d.g(e.d(this.a.q), this.a.q.d(), rED_PACKET_T, this.a.q.b(), LiveRedPacketGrabButtonType.GRAB_BUTTON);
       LiveActivityRedPacketGrabButtonPresenter v = this.a.v;
       if (v != null && !v.e()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f101d08);
          return;
       }else {
          LiveActivityRedPacketGrabButtonPresenter$c ta = this.a;
          i = ta.q.b();
          String str = this.a.q.d();
          int i1 = this.a.q.a();
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport(LiveActivityRedPacketGrabButtonPresenter.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), str, Integer.valueOf(i1), ta, LiveActivityRedPacketGrabButtonPresenter.class, "13")) {
             a uoa = ta.p.n();
             LiveActivityRedPacketGrabButtonPresenter v1 = ta.v;
             boolean b = (v1 != null && v1.a())? true: false;
             t ot = uoa.c(i1, str, i, b);
             if (ot != null) {
                a.f(a.c(ta.q.c.c.getValue()));
                ta.R8(ActionStatus.START, objArray);
                ta.X7(ot.subscribe(new n(ta, str, i1), new o(ta, str, i1)));
             }
          }
          ta = this.a;
          ta.s.a(ta.q.d());
          d.j(this.a.p.b(), this.a.p.a(), this.a.p.y(), this.a.q.d(), 14, this.a.q.c.a().a()+"", this.a.q.d);
          h.c(this.a.p.a(), this.a.q.a(), this.a.q.d(), this.a.q.b(), "OPEN", this.a.q.c());
          LiveRedPacketPopupPageType rOLLING_USER = LiveRedPacketPopupPageType.ROLLING_USER_PANEL;
          d.b(this.a.q.c.a().a(), this.a.q.d(), rED_PACKET_T, this.a.q.b(), LiveRedPacketStage.RED_PACKET_GRABING, rOLLING_USER, this.a.q.c.a().b(LiveRedPacketAction.RED_PACK_POPUP.name()+rOLLING_USER));
          return;
       }
    }
    public void b(){
       LiveActivityRedPacketGrabButtonView b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveActivityRedPacketGrabButtonPresenter$c.class, "2")) {
          return;
       }
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       c uoc = h.f();
       LiveActivityRedPacketGrabButtonPresenter v = this.a.v;
       Object[] objArray1 = (v == null)? objArray: Boolean.valueOf(v.a());
       b.d0(uoc, "[onSnatchViewShow]", "canAutoGrab", objArray1, "mGrabButtonView", this.a.u);
       LiveActivityRedPacketGrabButtonPresenter v1 = this.a.v;
       if (v1 != null && (v1.a() && this.a.u != null)) {
          b.Z(h.f(), "mockClickGrabButtonIfNecessary");
          v1 = this.a.u;
          Objects.requireNonNull(v1);
          if (!PatchProxy.applyVoid(objArray, v1, LiveActivityRedPacketGrabButtonView.class, "5")) {
             b = v1.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(objArray, b, LiveRedPackSnatchView.class, "3")) {
                b.Z(h.f(), "模拟点击自动抢");
                b.d.performClick();
             }
          }
       }
       return;
    }
    public void c(long p0){
    }
    public void d(){
    }
}
