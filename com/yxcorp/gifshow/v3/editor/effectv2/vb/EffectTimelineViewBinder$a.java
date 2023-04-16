package com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder$a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$e;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$RangeHandler;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import qqc.d;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectHandlerAdjustAction;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import wyc.b;
import e17.i;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectTimeAdjustAction;
import tvc.e;
import kqc.c;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import lqc.d;
import java.util.Objects;
import kqc.e;
import java.util.List;
import java.util.Collection;
import hqc.a;
import com.yxcorp.gifshow.widget.adv.c;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerTimeAndStatusUpdateAction;
import kqc.f;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectEnableAutoPlayToVideoEndAction;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerStateAction;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectRangeClickAction;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import com.yxcorp.gifshow.widget.adv.ITimelineView;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerTimeUpdateAction;

public final class EffectTimelineViewBinder$a implements ITimelineView$e	// class@000f5b
{
    public final EffectTimelineViewBinder a;

    public void EffectTimelineViewBinder$a(EffectTimelineViewBinder p0){
       this.a = p0;
       super();
    }
    public boolean a(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView$a p1,double p2){
       EffectTimelineViewBinder$a obj1;
       EffectTimelineViewBinder$a uoa = this;
       Object obj = p1;
       if (PatchProxy.isSupport(EffectTimelineViewBinder$a.class)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Double.valueOf(p2), this, EffectTimelineViewBinder$a.class, "3");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       a.p(obj, "rangeViewData");
       obj1 = (p0 == ITimelineView$IRangeView$RangeHandler.LEFT)? 1: null;
       EffectHandlerAdjustAction uEffectHandl = null;
       double d = (obj1)? p2: uEffectHandl;
       double d1 = (obj1)? uEffectHandl: p2;
       if (obj1) {
          p1.h();
       }else {
          p1.g();
       }
       EffectHandlerAdjustAction uEffectHandl1 = new EffectHandlerAdjustAction(d, d1, p1, uoa.a.D(obj), uoa.a.G().getVideoLength(), UpdateTo.PLAYER);
       uoa.a.E().t0(uEffectHandl);
       return true;
    }
    public boolean b(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView$a p1,double p2){
       if (PatchProxy.isSupport(EffectTimelineViewBinder$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Double.valueOf(p2), this, EffectTimelineViewBinder$a.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       this.a.G().pause();
       return true;
    }
    public void c(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView$a p1,double p2){
       if (PatchProxy.isSupport(EffectTimelineViewBinder$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Double.valueOf(p2), this, EffectTimelineViewBinder$a.class, "6")) {
          return;
       }
       b.b(this, p0, p1, p2);
       i.a(R.style.arg_RES_7f110668, 0x7f103dc3);
       return;
    }
    public boolean d(){
       return false;
    }
    public boolean e(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView$a p1,double p2,boolean p3){
       d a;
       if (PatchProxy.isSupport(EffectTimelineViewBinder$a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Double.valueOf(p2), Boolean.valueOf(p3), this, EffectTimelineViewBinder$a.class, "4");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       a.p(p1, "rangeViewData");
       EffectTimeAdjustAction uEffectTimeA = new EffectTimeAdjustAction(this.a.E().o0().c(), p1.h(), p1.g(), this.a.D(p1));
       this.a.E().t0(p2);
       if (this.a.E().o0().c() == EffectGroupType.TimeEffect) {
          a = d.a;
          c uoc = this.a.E().o0();
          Objects.requireNonNull(a);
          a = PatchProxy.applyOneRefs(uoc, a, d.class, "8");
          if (a != PatchProxyResult.class) {
             a.booleanValue();
          }else {
             a.p(uoc, "lastState");
             if (uoc.h().b().isEmpty() ^ true) {
                uoc.h().b().get(0).F().b();
             }
          }
       }
       return true;
    }
    public boolean f(double p0){
       d obj;
       EffectTimelineViewBinder$a uoa = EffectTimelineViewBinder$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a.E();
       if (p0 - this.a.G().getVideoLength() > 0) {
          p0 = this.a.G().getVideoLength();
       }
       obj.t0(new EffectPlayerTimeAndStatusUpdateAction(p0, UpdateTo.PLAYER, false));
       if (this.a.E().o0().i().d() >= 0) {
          this.a.E().t0(new EffectEnableAutoPlayToVideoEndAction());
       }
       return true;
    }
    public void g(ITimelineView$IRangeView$a p0,int p1,boolean p2){
       b.a(this, p0, p1, p2);
    }
    public boolean h(ITimelineView$IRangeView$a p0){
       double d1;
       d obj = PatchProxy.applyOneRefs(p0, this, EffectTimelineViewBinder$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       this.a.E().t0(new EffectPlayerStateAction(b, this.a.G().getVideoLength()));
       this.a.E().t0(new EffectRangeClickAction());
       a.m(p0);
       boolean b1 = p0.s();
       boolean b2 = p0.p();
       if (!p0.s()) {
          this.a.F().g(null);
          this.a.F().d(p0);
       }
       double d = 0x3f847ae147ae147b;
       if (p0.r() && !b1) {
          obj = this.a.E();
          d1 = (p0.m())? p0.h() + d: p0.g() - d;
          obj.t0(new EffectPlayerTimeUpdateAction(d1, UpdateTo.BOTH, this.a.D(p0)));
          return true;
       }else if(p0.o()){
          this.a.F().g(null);
          this.a.F().c(p0);
          if (!b2) {
             obj = this.a.E();
             d1 = (p0.m())? p0.h() + d: p0.g() - d;
             obj.t0(new EffectPlayerTimeUpdateAction(d1, UpdateTo.BOTH, this.a.D(p0)));
          }
          return true;
       }else {
          return b;
       }
    }
}
