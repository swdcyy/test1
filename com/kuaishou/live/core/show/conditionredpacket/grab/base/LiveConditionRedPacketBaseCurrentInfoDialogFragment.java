package com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseCurrentInfoDialogFragment;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import java.lang.String;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u52.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import j62.a;
import java.lang.Number;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.f;
import b62.h;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Long;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import l12.d;
import va1.f0;
import b62.s;
import brd.t;
import h62.e;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import h62.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketPopupPageType;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import java.lang.Enum;
import lnc.i3;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import i62.t$c;
import tw1.f;
import h62.d;

public abstract class LiveConditionRedPacketBaseCurrentInfoDialogFragment extends LiveRedPacketContainerItemBaseFragment	// class@000a79
{
    public t m;
    public a n;
    public PresenterV2 o;
    public View p;
    public KwaiImageView q;
    public KwaiImageView r;
    public KwaiImageView s;
    public static final int t;

    public void LiveConditionRedPacketBaseCurrentInfoDialogFragment(String p0){
       super(p0);
    }
    public e0 dh(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketBaseCurrentInfoDialogFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.a.b();
    }
    public ClientContent$LiveStreamPackage eh(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketBaseCurrentInfoDialogFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.a.a();
    }
    public ClientContent$LiveVoicePartyPackageV2 fh(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketBaseCurrentInfoDialogFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.a.y();
    }
    public String hh(){
       return this.n.b;
    }
    public int jh(){
       return this.n.a;
    }
    public long kh(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketBaseCurrentInfoDialogFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return k0.d(this.m, f.a, new h(this), g.a, h.a).or(Long.valueOf(0)).longValue();
    }
    public abstract PresenterV2 mh();
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveConditionRedPacketBaseCurrentInfoDialogFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0ac3, p1, false);
       this.p = m1.f(view, 0x7f0a1b73);
       this.q = m1.f(view, 0x7f0a1b83);
       this.r = m1.f(view, 0x7f0a1b6e);
       this.s = m1.f(view, 0x7f0a1b75);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketBaseCurrentInfoDialogFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       LiveConditionRedPacketBaseCurrentInfoDialogFragment to = this.o;
       if (to != null) {
          to.unbind();
          this.o.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       a a;
       long l1;
       PresenterV2 presenterV2 = this;
       LiveConditionRedPacketBaseCurrentInfoDialogFragment obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, presenterV2, LiveConditionRedPacketBaseCurrentInfoDialogFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       f0.a(presenterV2.q, LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_TOP_COVER);
       f0.a(presenterV2.r, LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_BOTTOM_COVER);
       f0.a(presenterV2.s, LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_CURRENT_INFO_NETWORK_ERROR);
       PresenterV2 presenterV21 = this.mh();
       presenterV21.f(obj);
       obj = presenterV2.m;
       obj.i = presenterV2.j;
       Object[] objArray = new Object[3];
       objArray[0] = obj;
       objArray[1] = presenterV2.n;
       int i = 2;
       Object[] objArray1 = null;
       s os = PatchProxy.apply(objArray1, presenterV2, LiveConditionRedPacketBaseCurrentInfoDialogFragment.class, "8");
       if (os != patchProxyRe) {
       }else {
          os = new s();
          t ot = PatchProxy.apply(objArray1, presenterV2, LiveRedPacketContainerItemBaseFragment.class, "6");
          if (ot != patchProxyRe) {
          }else {
             ot = presenterV2.k.hide();
          }
          os.b = ot;
       }
       objArray[i] = os;
       presenterV21.i(objArray);
       presenterV2.o = presenterV21;
       LiveConditionRedPacketBaseCurrentInfoDialogFragment n = presenterV2.n;
       long l = e.e(presenterV2.m, n.b, n.a);
       obj = presenterV2.n;
       a b = obj.b;
       RedPacketType rED_PACKET_T = RedPacketType.RED_PACKET_TYPE_CONDITION;
       int i1 = a.a(obj.a);
       LiveRedPacketStage rED_PACKET_C = LiveRedPacketStage.RED_PACKET_COUNTDOWN;
       LiveRedPacketPopupPageType pREPARE_PANE = LiveRedPacketPopupPageType.PREPARE_PANEL;
       n = presenterV2.n;
       int i2 = e.a(presenterV2.m, n.b, n.a, LiveRedPacketAction.RED_PACK_POPUP.name()+pREPARE_PANE);
       i3 oi3 = i3.f();
       obj = presenterV2.m;
       n = presenterV2.n;
       a b1 = n.b;
       a = n.a;
       if (PatchProxy.isSupport(e.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(obj, b1, Integer.valueOf(a), null, e.class, "8");
          if (obj1 != patchProxyRe) {
             l1 = obj1.longValue();
          }else {
          label_00dd :
             a.p(obj, "liveConditionRedPacketContext");
             LiveConditionRedPacketInfo liveConditio = obj.c.l(a, b1);
             l1 = (liveConditio == null)? -1: liveConditio.d - f.a();
          }
       }else {
          goto label_00dd ;
       }
       oi3.c("countdown", Long.valueOf(l1));
       d.c(l, b, rED_PACKET_T, i1, rED_PACKET_C, pREPARE_PANE, i2, oi3);
       return;
    }
}
