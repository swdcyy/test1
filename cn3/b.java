package cn3.b;
import eo3.n;
import xw1.b;
import uw1.m;
import om3.a;
import eo3.s;
import nm3.c;
import java.lang.Object;
import eo3.g;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eo3.w;
import android.view.View;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import java.lang.Integer;
import eo3.a;
import om3.d;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketConditionPopupView;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketConditionBasePopupView;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import eo3.b0;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import gn3.a;
import u52.u;
import java.util.List;
import crd.b;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import rm3.a;
import h62.c;
import java.util.Map;
import com.kuaishou.live.redpacket.core.condition.view.pendant.RedPacketNewStylePendantViewWrapper;
import java.util.Objects;
import android.widget.FrameLayout;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import eo3.v;
import android.content.Context;
import cn3.a;
import xw1.a;
import com.kuaishou.live.redpacket.core.condition.view.pendant.RedPacketOldStylePendantViewWrapper;
import android.animation.AnimatorSet;
import in3.a;
import android.animation.Animator$AnimatorListener;
import eo3.m;
import nm3.b;
import java.lang.StringBuilder;

public class b implements n	// class@0005a1
{
    public final a a;
    public final b b;
    public final c c;
    public final m d;
    public final s e;

    public void b(b p0,m p1,a p2,s p3,c p4){
       super();
       this.b = p0;
       this.d = p1;
       this.a = p2;
       this.e = p3;
       this.c = p4;
    }
    public void a(g p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
       }else {
          this.n(p0, "onAutoGrabSuccess");
       }
       return;
    }
    public void b(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       this.n(p0, "onRedPacketOutDated");
       Object obj = p0.getContext().e("live_red_packet_pendant_wrapper_key");
       if (obj instanceof View) {
          this.b.o2(obj);
       }
       this.o(p0, LiveRedPacketAction.RED_PACK_CREATE_FAIL);
       return;
    }
    public void c(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       this.n(p0, "onUpdate");
       return;
    }
    public void d(g p0,View p1,int p2){
       int i1;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "16")) {
          return;
       }
       int i = 1;
       if (p2 != i) {
          return;
       }
       w context = p0.getContext();
       a uoa = p0.getContext().f().e().a();
       ClientContent$LiveStreamPackage liveStreamPa = null;
       if (p1 instanceof RedPacketConditionPopupView) {
          if (p1.l != null) {
             liveStreamPa = 1;
          }
          if (liveStreamPa) {
             i = 2;
          }
          i1 = i;
       }else {
          i1 = 0;
       }
       u.g(uoa.i(), uoa.a(), uoa.B(), context.h().a(), context.h().b(), a.c(context.c()), a.b(context.c()), i1);
       return;
    }
    public void e(g p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "11")) {
          return;
       }
       this.o(p0, LiveRedPacketAction.RED_PACK_PENDANT_SHOW);
       u.l(this.a.i(), this.a.a(), this.a.B(), p0.getContext().h().a(), p0.getContext().h().b());
       return;
    }
    public void f(g p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "12")) {
          return;
       }
       this.o(p0, LiveRedPacketAction.RED_PACK_CREATE);
       return;
    }
    public void g(g p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "13")) {
          return;
       }
       this.n(p0, "onPendantViewClick");
       u.k(this.a.i(), this.a.a(), this.a.B(), p0.getContext().h().a(), p0.getContext().h().b());
       this.o(p0, LiveRedPacketAction.RED_PACK_PENDANT_CLICK);
       b td = this.d;
       if (td != null) {
          td.j(p0.getContext().h().a(), null);
       }
       return;
    }
    public void h(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       this.n(p0, "onDestroy");
       RedPacketConditionRedPackInfoWrapper redPacketCon = p0.getContext().c();
       if (redPacketCon != null && !PatchProxy.applyVoid(null, redPacketCon, RedPacketConditionRedPackInfoWrapper.class, "13")) {
          redPacketCon.o(redPacketCon.c);
          redPacketCon.o(redPacketCon.e);
          redPacketCon.o(redPacketCon.f);
          RedPacketConditionRedPackInfoWrapper j = redPacketCon.j;
          if (j != null) {
             j.dispose();
          }
          redPacketCon = redPacketCon.k;
          if (redPacketCon != null) {
             redPacketCon.dispose();
          }
       }
    label_0045 :
       return;
    }
    public void i(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.n(p0, "onRepeat");
       RedPacketConditionRedPackInfoWrapper redPacketCon = p0.getContext().c();
       if (redPacketCon == null) {
          return;
       }
       SCLiveConditionRedPackInfo sCLiveCondit = redPacketCon.k();
       long l = a.d(sCLiveCondit);
       c uoc = a.a(l, sCLiveCondit.redPackId, sCLiveCondit.redPackType, LiveRedPacketAction.RED_PACK_PENDANT_SHOW_FAIL);
       uoc.b(-1002).c("");
       this.c.a(uoc.f());
       return;
    }
    public void j(g p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "6")) {
          return;
       }
       this.n(p0, "onOpenTimeArrived, removePendant");
       if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "14")) {
          Object obj = p0.getContext().e("live_red_packet_pendant_wrapper_key");
          if (obj instanceof View) {
             this.b.o2(obj);
          }
          if (obj instanceof RedPacketNewStylePendantViewWrapper) {
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoid(null, obj, RedPacketNewStylePendantViewWrapper.class, "8")) {
                obj.removeAllViews();
                obj.onMeasure(obj.c, obj.d);
                obj.e = null;
             }
          }
          uob = this.d;
          if (uob != null) {
             uob.k4(p0.getContext().h().a());
          }
       }
       return;
    }
    public void k(g p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "8")) {
          return;
       }
       this.n(p0, "onAutoGrabFail");
       return;
    }
    public void l(g p0){
       boolean b;
       Object obj = this;
       Object obj1 = p0;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uob, "1")) {
          return;
       }
       obj.n(obj1, "onStart");
       String str = "2";
       View obj2 = PatchProxy.applyOneRefs(obj1, obj, uob, str);
       int i = 0;
       if (obj2 != PatchProxyResult.class) {
          b = obj2.booleanValue();
       }else if(obj.e.a() - p0.getContext().f().c() > 0){
          b = false;
       }else {
          b = true;
       }
       if (!b) {
          obj.n(obj1, "canAddPendant == false");
          return;
       }else {
          obj2 = p0.L();
          Context uContext = p0.getContext().b();
          if (obj.a.P0()) {
             RedPacketNewStylePendantViewWrapper redPacketNew = new RedPacketNewStylePendantViewWrapper(uContext);
             if (!PatchProxy.applyVoidTwoRefs(obj2, obj1, redPacketNew, RedPacketNewStylePendantViewWrapper.class, str)) {
                if (obj2 != null) {
                   redPacketNew.addView(obj2, i);
                }
                redPacketNew.e = obj1;
             }
             p0.getContext().l("live_red_packet_pendant_wrapper_key", redPacketNew);
             obj.b.T5(redPacketNew, p0.getContext().i(), 1, new a(obj1), p0.getContext().h().toString());
          }else {
             RedPacketOldStylePendantViewWrapper redPacketOld = new RedPacketOldStylePendantViewWrapper(uContext);
             redPacketOld.addView(obj2);
             p0.getContext().l("live_red_packet_pendant_wrapper_key", redPacketOld);
             obj.b.T5(redPacketOld, p0.getContext().i(), 1, new a(obj1), p0.getContext().h().toString());
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, redPacketOld, RedPacketOldStylePendantViewWrapper.class, "3")) {
                redPacketOld.b();
                if (!PatchProxy.applyVoid(objArray, redPacketOld, RedPacketOldStylePendantViewWrapper.class, "5")) {
                   redPacketOld.b = redPacketOld.getContentViewAnim();
                   redPacketOld.setVisibility(4);
                   redPacketOld.b.addListener(new a(redPacketOld));
                   redPacketOld.b.start();
                }
             }
          }
          obj.a.S0(p0.getContext().h().b());
          return;
       }
    }
    public void m(g p0,long p1,long p2){
       m.c(this, p0, p1, p2);
    }
    public void n(g p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "15")) {
          return;
       }
       p0.getContext().f().b().i("LiveRedPacketConditionListener", p1+" redPacketKey = "+p0.getContext().h());
       return;
    }
    public final void o(g p0,LiveRedPacketAction p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "10")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = p0.getContext().c();
       if (redPacketCon == null) {
          return;
       }
       SCLiveConditionRedPackInfo sCLiveCondit = redPacketCon.k();
       long l = a.d(sCLiveCondit);
       this.c.a(a.a(l, sCLiveCondit.redPackId, sCLiveCondit.redPackType, p1).f());
       return;
    }
}
