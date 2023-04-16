package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectTimeSelectAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import dqc.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lqc.d;
import raa.g;
import com.kuaishou.edit.draft.TimeEffect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.TimeRange;
import java.lang.Number;
import usd.q;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import haa.a;
import dqc.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.TimeEffect$b;
import com.kuaishou.edit.draft.TimeRange$b;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Math;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;

public final class EffectTimeSelectAction extends EditSdkAction	// class@000f3f
{
    public final i advEffect;
    public final double currentPosition;
    public final boolean enableHighLight;
    public final double totalDuration;

    public void EffectTimeSelectAction(i p0,double p1,double p2){
       a.p(p0, "advEffect");
       super();
       this.advEffect = p0;
       this.currentPosition = p1;
       this.totalDuration = p2;
       this.enableHighLight = d.a();
    }
    public final TimeEffect clearCurrentTimeEffectIfNeeded(g p0){
       Iterator obj1;
       Object obj2;
       List obj = PatchProxy.applyOneRefs(p0, this, EffectTimeSelectAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "draft");
       obj = p0.z();
       String str = "draft.messages";
       a.o(obj, str);
       int i = 3;
       int i1 = 0;
       if (obj.size() == 1) {
          obj1 = p0.z().get(i1);
          a.o(obj1, "draft.messages[0]");
          if (obj1.getSdkType() == i) {
             p0.d();
             return p0.z().get(i1);
          }
       }
       if (this.advEffect.n() == i) {
          p0.d();
          return null;
       }else {
          obj = p0.z();
          a.o(obj, str);
          obj1 = obj.iterator();
          while (true) {
             if (!obj1.hasNext()) {
                return null;
             }
             obj2 = obj1.next();
             i = i1 + 1;
             if (i1 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (obj2 != null) {
                TimeRange range = obj2.getRange();
                if (range != null) {
                   double d = range.getStart() + range.getDuration();
                   EffectTimeSelectAction tcurrentPosi = this.currentPosition;
                   if (tcurrentPosi - range.getStart() < 0 || (tcurrentPosi - d < 0 || (!tcurrentPosi - d && !d - this.totalDuration))) {
                      break ;
                   }
                }
             }
             i1 = i;
          }
          p0.V(i1);
          return obj2;
       }
    }
    public final double findCurrentEffectEnd(g p0){
       EffectTimeSelectAction obj = PatchProxy.applyOneRefs(p0, this, EffectTimeSelectAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       a.p(p0, "draft");
       obj = this.totalDuration;
       List list = p0.z();
       a.o(list, "draft.messages");
       int i = 0;
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          TimeRange range = (obj1 != null)? obj1.getRange(): null;
          if (range != null && range.getStart() - this.currentPosition > 0) {
             double d = q.s(obj, range.getStart());
          }
          i = i1;
       }
       return obj;
    }
    public final i getAdvEffect(){
       return this.advEffect;
    }
    public final double getCurrentPosition(){
       return this.currentPosition;
    }
    public final boolean getEnableHighLight(){
       return this.enableHighLight;
    }
    public final double getTotalDuration(){
       return this.totalDuration;
    }
    public void performAction(c p0,c p1){
       double duration;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectTimeSelectAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EffectTimeSelectAction", "performAction advEffect:"+this.advEffect+", currentPosition:"+this.currentPosition+", totalDuration:"+this.totalDuration, objArray);
       g og = a.s(p0);
       TimeEffect timeEffect = null;
       if (this.enableHighLight != null) {
          timeEffect = this.clearCurrentTimeEffectIfNeeded(og);
       }else {
          List list = og.z();
          a.o(list, "baseDraft.messages");
          if (list.isEmpty() ^ 0x01) {
             timeEffect = og.z().get(i);
          }
          og.d();
       }
       if (this.advEffect.a == null) {
          return;
       }else {
          GeneratedMessageLite$Builder uBuilder = og.b();
          a.o(uBuilder, "baseDraft.append\(\)");
          TimeRange$b uob = TimeRange.newBuilder();
          if (this.advEffect.n() == 3) {
             uob.b(0);
             a.o(uob, "timeRangeBuilder.setStart\(0.0\)");
             uob.a(this.totalDuration);
          }else {
             double d = 0x3ff8000000000000;
             if (timeEffect != null) {
                TimeRange range = timeEffect.getRange();
                if (range != null) {
                   duration = range.getDuration();
                }else if(this.enableHighLight != null){
                   duration = this.findCurrentEffectEnd(og) - this.currentPosition;
                   Integer integer = (this.advEffect.c() > 0)? Integer.valueOf(this.advEffect.c()): Double.valueOf(duration);
                   duration = q.s(duration, integer.doubleValue());
                }else {
                   duration = d;
                }
             }else {
                goto label_00b6 ;
             }
             if (timeEffect == null || timeEffect.getSdkType() != 3) {
                d = duration;
             }
             double d1 = Math.min(this.currentPosition, (this.totalDuration - 0x3fb999999999999a));
             if (timeEffect != null) {
                TimeRange range1 = timeEffect.getRange();
                if (range1 != null && (d1 - range1.getStart() > 0 && d1 - (range1.getStart() + range1.getDuration()) < 0)) {
                   d1 = range1.getStart();
                }
             }
             Object[] objArray1 = new Object[i];
             a.D().w("EffectTimeSelectAction", "performAction start:"+d1+", duration:"+d, objArray1);
             uob.b(d1);
             a.o(uob, "timeRangeBuilder.setStart\(start\)");
             uob.a(d);
          }
          FeatureId$b uob1 = FeatureId.newBuilder();
          a.o(uob1, "featureIdBuilder");
          uob1.a(String.valueOf(this.advEffect.a));
          uBuilder.b(uob);
          uBuilder.copyOnWrite();
          uBuilder.instance.setFeatureId(uob1);
          uBuilder.copyOnWrite();
          uBuilder.instance.setSdkType(this.advEffect.n());
          return;
       }
    }
}
