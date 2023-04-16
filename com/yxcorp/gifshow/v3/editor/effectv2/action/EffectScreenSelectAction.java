package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectScreenSelectAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import dqc.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import raa.c;
import com.kuaishou.edit.draft.FaceMagicEffect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;
import com.kuaishou.edit.draft.TimeRange;
import lqc.b;
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
import java.lang.Math;
import java.lang.Integer;
import java.lang.Double;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FaceMagicEffect$b;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import eqc.a;

public final class EffectScreenSelectAction extends EditSdkAction	// class@000f38
{
    public final g advEffect;
    public final double currentTime;
    public final int draftIndex;
    public double finalStart;
    public final boolean hasTimeReverse;
    public final g lastEffect;
    public final double totalDuration;

    public void EffectScreenSelectAction(g p0,g p1,double p2,double p3,int p4,boolean p5){
       a.p(p0, "advEffect");
       a.p(p1, "lastEffect");
       super();
       this.advEffect = p0;
       this.lastEffect = p1;
       this.currentTime = p2;
       this.totalDuration = p3;
       this.draftIndex = p4;
       this.hasTimeReverse = p5;
       this.finalStart = p2;
    }
    public void EffectScreenSelectAction(g p0,g p1,double p2,double p3,int p4,boolean p5,int p6,u p7){
       boolean b = (p6 & 0x20)? false: p5;
       super(p0, p1, p2, p3, p4, b);
       return;
    }
    public final FaceMagicEffect clearCurrentEffectIfNeeded(c p0){
       Object obj3;
       int i2;
       Object obj = this;
       Object obj1 = p0;
       List obj2 = PatchProxy.applyOneRefs(obj1, obj, EffectScreenSelectAction.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "draft");
       obj2 = p0.z();
       a.o(obj2, "draft.messages");
       int i = 0;
       Iterator iterator = obj2.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj3 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          a.o(obj3, "faceMagicEffect");
          if (obj3.getType() == FaceMagicEffect$Type.FACE_MAGIC) {
             TimeRange range = obj3.getRange();
             if (range != null) {
                double d = range.getStart() + range.getDuration();
                i2 = i1;
                if (b.a.a(obj.hasTimeReverse, obj.currentTime, range.getStart(), d, obj.totalDuration)) {
                   break ;
                }else {
                label_0071 :
                   i = i2;
                }
             }
          }
          i2 = i1;
          goto label_0071 ;
       }
       obj1.V(i);
       return obj3;
    }
    public final double findCurrentEffectEnd(c p0){
       EffectScreenSelectAction obj = PatchProxy.applyOneRefs(p0, this, EffectScreenSelectAction.class, "3");
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
          a.o(obj1, "faceMagicEffect");
          if (obj1.getType() == FaceMagicEffect$Type.FACE_MAGIC) {
             TimeRange range = obj1.getRange();
             if (range != null && range.getStart() - this.currentTime > 0) {
                double d = q.s(obj, range.getStart());
             }
          }
          i = i1;
       }
       return obj;
    }
    public final double findCurrentEffectStart(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EffectScreenSelectAction.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       a.p(p0, "draft");
       double d = 0;
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
          a.o(obj1, "faceMagicEffect");
          if (obj1.getType() == FaceMagicEffect$Type.FACE_MAGIC) {
             TimeRange range = obj1.getRange();
             if (range != null) {
                double d1 = range.getStart() + range.getDuration();
                if (d1 - this.currentTime < 0) {
                   d1 = range.getStart() + range.getDuration();
                   d = q.l(d, d1);
                }
             }
          }
          i = i1;
       }
       return d;
    }
    public final g getAdvEffect(){
       return this.advEffect;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final int getDraftIndex(){
       return this.draftIndex;
    }
    public final double getFinalStart(){
       return this.finalStart;
    }
    public final boolean getHasTimeReverse(){
       return this.hasTimeReverse;
    }
    public final g getLastEffect(){
       return this.lastEffect;
    }
    public final double getTotalDuration(){
       return this.totalDuration;
    }
    public void performAction(c p0,c p1){
       double d = this;
       c obj = p0;
       FaceMagicEffect obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, d, EffectScreenSelectAction.class, "1")) {
          return;
       }
       a.p(obj, "workspaceDraft");
       a.p(obj1, "store");
       super.performAction(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EffectPictureSelectAction", "performActionX advEffect:"+d.advEffect+", lastEffect:"+d.lastEffect+','+"currentTime:"+d.currentTime+", totalDuration:"+d.totalDuration+", draftIndex:"+d.draftIndex+", hasTimeReverse:"+d.hasTimeReverse, objArray);
       obj = a.k(p0);
       obj1 = d.clearCurrentEffectIfNeeded(obj);
       if (d.advEffect.a == null) {
          return;
       }
       double d1 = 0x3fb999999999999a;
       double d2 = (d.hasTimeReverse != null)? d.findCurrentEffectStart(obj): Math.min(d.currentTime, (d.totalDuration - d1));
       if (obj1 != null) {
          TimeRange range = obj1.getRange();
          if (range != null && (d2 - range.getStart() > 0 && d2 - (range.getStart() + range.getDuration()) < 0)) {
             d2 = range.getStart();
          }
       }
       d1 = (d.hasTimeReverse != null)? Math.max((d.currentTime - d2), d1): d.findCurrentEffectEnd(obj) - d2;
       Integer integer = (d.advEffect.c() > 0)? Integer.valueOf(d.advEffect.c()): Double.valueOf(d1);
       double d3 = q.s(d1, integer.doubleValue());
       if (d.hasTimeReverse != null) {
          d2 = Math.max((d.currentTime - d3), 0);
       }
       if (obj1 != null) {
          TimeRange range1 = obj1.getRange();
          if (range1 != null) {
             d2 = range1.getStart();
             d3 = range1.getDuration();
          }
       }
       d.finalStart = d2;
       Object[] objArray1 = new Object[i];
       a.D().w("EffectPictureSelectAction", "performAction maxDuration:"+d1+", defaultDuration:"+integer+", duration:"+d3+", start:"+d2, objArray1);
       FaceMagicEffect$b uob = obj.b();
       uob.a(obj.Q(d.advEffect.o()));
       TimeRange$b uob1 = TimeRange.newBuilder();
       uob1.b(d2);
       uob1.a(d3);
       uob.d(uob1);
       FeatureId$b uob2 = FeatureId.newBuilder();
       uob2.a(String.valueOf(d.advEffect.a));
       uob.c(uob2);
       a.o(uob, "faceMagicDraft.append\(\)\n¡­dvEffect.mId.toString\(\)\)\)");
       uob.e(FaceMagicEffect$Type.FACE_MAGIC);
       String str = d.advEffect.e();
       a.o(str, "advEffect.displayName");
       a.a.h(str, d2, d3);
       return;
    }
    public final void setFinalStart(double p0){
       this.finalStart = p0;
    }
}
