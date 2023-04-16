package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPictureSelectAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import dqc.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.TimeRange;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import raa.a;
import haa.a;
import raa.i;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.AEEffect;
import lqc.b;
import com.kuaishou.edit.draft.TimeRange$b;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.VisualEffect;
import java.lang.Number;
import usd.q;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import dqc.a;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Double;
import com.kuaishou.edit.draft.AEEffect$b;
import com.yxcorp.gifshow.v3.editor.effect.model.AEEffectConfig;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.VisualEffect$b;
import eqc.a;

public final class EffectPictureSelectAction extends EditSdkAction	// class@000f2f
{
    public final e advEffect;
    public final double currentTime;
    public final int draftIndex;
    public final boolean hasTimeReverse;
    public final e lastEffect;
    public final double totalDuration;

    public void EffectPictureSelectAction(e p0,e p1,double p2,double p3,int p4,boolean p5){
       a.p(p0, "advEffect");
       a.p(p1, "lastEffect");
       super();
       this.advEffect = p0;
       this.lastEffect = p1;
       this.currentTime = p2;
       this.totalDuration = p3;
       this.draftIndex = p4;
       this.hasTimeReverse = p5;
    }
    public void EffectPictureSelectAction(e p0,e p1,double p2,double p3,int p4,boolean p5,int p6,u p7){
       boolean b = (p6 & 0x20)? false: p5;
       super(p0, p1, p2, p3, p4, b);
       return;
    }
    public final TimeRange clearCurrentEffectIfNeeded(c p0){
       TimeRange obj3;
       double start;
       double d1;
       double d2;
       TimeRange$b uob;
       Iterator iterator2;
       TimeRange timeRange;
       double d4;
       Object obj = this;
       i obj1 = p0;
       a obj2 = PatchProxy.applyOneRefs(obj1, obj, EffectPictureSelectAction.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "workspaceDraft");
       obj2 = a.b(p0);
       obj1 = a.v(p0);
       List list = obj2.z();
       a.o(list, "aeEffectDraft.messages");
       Iterator iterator = list.iterator();
       int i = 0;
       int i1 = 0;
       while (true) {
          if (iterator.hasNext()) {
             obj3 = iterator.next();
             int i2 = i1 + 1;
             if (i1 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             a.o(obj3, "aeEffect");
             obj3 = obj3.getTimeRange();
             if (obj3 != null) {
                start = obj3.getStart();
                double d = obj3.getStart() + obj3.getDuration();
                d1 = start;
                d2 = start;
                start = d;
                if (b.a.a(obj.hasTimeReverse, obj.currentTime, d1, start, obj.totalDuration)) {
                   break ;
                }
             }
             i1 = i2;
          }else {
             List list1 = obj1.z();
             a.o(list1, "visualEffectDraft.messages");
             Iterator iterator1 = list1.iterator();
             while (true) {
                if (!iterator1.hasNext()) {
                   return null;
                }
                TimeRange obj4 = iterator1.next();
                i1 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                a.o(obj4, "visualEffect");
                obj4 = obj4.getRange();
                if (obj4 != null) {
                   start = obj4.getStart();
                   d1 = obj4.getStart() + obj4.getDuration();
                   double d3 = start;
                   iterator2 = iterator1;
                   timeRange = obj4;
                   d4 = start;
                   if (b.a.a(obj.hasTimeReverse, obj.currentTime, d3, d1, obj.totalDuration)) {
                   }
                }else {
                   iterator2 = iterator1;
                }
                iterator1 = iterator2;
                i = i1;
             }
             obj1.V(i);
             uob = TimeRange.newBuilder();
             uob.b(d4);
             uob.a(timeRange.getDuration());
             return uob.build();
          }
       }
       obj2.V(i1);
       uob = TimeRange.newBuilder();
       uob.b(d2);
       uob.a(obj3.getDuration());
       return uob.build();
    }
    public final double findCurrentEffectEnd(c p0){
       double d;
       EffectPictureSelectAction obj = PatchProxy.applyOneRefs(p0, this, EffectPictureSelectAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       a.p(p0, "workspaceDraft");
       obj = this.totalDuration;
       a uoa = p0.m0();
       i oi = p0.f1();
       if (uoa != null) {
          List list = uoa.z();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                AEEffect uAEEffect = iterator.next();
                a.o(uAEEffect, "aeEffect");
                TimeRange timeRange = uAEEffect.getTimeRange();
                if (timeRange != null && timeRange.getStart() - this.currentTime > 0) {
                   d = q.s(obj, timeRange.getStart());
                }
             }
          }
       }
       if (oi != null) {
          List list1 = oi.z();
          if (list1 != null) {
             Iterator iterator1 = list1.iterator();
             while (iterator1.hasNext()) {
                VisualEffect visualEffect = iterator1.next();
                a.o(visualEffect, "visualEffect");
                TimeRange range = visualEffect.getRange();
                if (range != null && range.getStart() - this.currentTime > 0) {
                   d = q.s(obj, range.getStart());
                }
             }
          }
       }
       Object[] objArray = new Object[0];
       f.D().w("EffectPictureSelectAction", "findCurrentEffectEnd: result = "+obj, objArray);
       return obj;
    }
    public final double findCurrentEffectStart(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EffectPictureSelectAction.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       a.p(p0, "workspaceDraft");
       double d = 0;
       a uoa = p0.m0();
       i oi = p0.f1();
       if (uoa != null) {
          List list = uoa.z();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                AEEffect uAEEffect = iterator.next();
                a.o(uAEEffect, "aeEffect");
                TimeRange timeRange = uAEEffect.getTimeRange();
                if (timeRange != null) {
                   double d1 = timeRange.getStart() + timeRange.getDuration();
                   if (d1 - this.currentTime < 0) {
                      d1 = timeRange.getStart() + timeRange.getDuration();
                      d = q.l(d, d1);
                   }
                }
             }
          }
       }
       if (oi != null) {
          List list1 = oi.z();
          if (list1 != null) {
             Iterator iterator1 = list1.iterator();
             while (iterator1.hasNext()) {
                VisualEffect visualEffect = iterator1.next();
                a.o(visualEffect, "visualEffect");
                TimeRange range = visualEffect.getRange();
                if (range != null) {
                   double d2 = range.getStart() + range.getDuration();
                   if (d2 - this.currentTime < 0) {
                      d2 = range.getStart() + range.getDuration();
                      d = q.l(d, d2);
                   }
                }
             }
          }
       }
       Object[] objArray = new Object[0];
       f.D().w("EffectPictureSelectAction", "findCurrentEffectEnd: result = "+d, objArray);
       return d;
    }
    public final e getAdvEffect(){
       return this.advEffect;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final int getDraftIndex(){
       return this.draftIndex;
    }
    public final boolean getHasTimeReverse(){
       return this.hasTimeReverse;
    }
    public final e getLastEffect(){
       return this.lastEffect;
    }
    public final double getTotalDuration(){
       return this.totalDuration;
    }
    public void performAction(c p0,c p1){
       Object obj = this;
       a obj1 = p0;
       TimeRange obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, EffectPictureSelectAction.class, "1")) {
          return;
       }
       a.p(obj1, "workspaceDraft");
       a.p(obj2, "store");
       super.performAction(p0, p1);
       obj2 = this.clearCurrentEffectIfNeeded(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EffectPictureSelectAction", "performActionX advEffect:"+obj.advEffect+", lastEffect:"+obj.lastEffect+','+"currentTime:"+obj.currentTime+", totalDuration:"+obj.totalDuration+", draftIndex:"+obj.draftIndex+", hasTimeReverse:"+obj.hasTimeReverse, objArray);
       if (obj.advEffect.a == null) {
          Object[] objArray1 = new Object[i];
          a.D().w("EffectPictureSelectAction", "performAction return", objArray1);
          return;
       }else {
          double d = 0x3fb999999999999a;
          double d1 = (obj.hasTimeReverse != null)? this.findCurrentEffectStart(p0): Math.min(obj.currentTime, (obj.totalDuration - d));
          if (obj2 != null && (d1 - obj2.getStart() > 0 && d1 - (obj2.getStart() + obj2.getDuration()) < 0)) {
             d1 = obj2.getStart();
          }
       label_00bc :
          d = (obj.hasTimeReverse != null)? Math.max((obj.currentTime - d1), d): this.findCurrentEffectEnd(p0) - d1;
          Integer integer = (obj.advEffect.c() > 0)? Integer.valueOf(obj.advEffect.c()): Double.valueOf(d);
          double d2 = q.s(d, integer.doubleValue());
          if (obj.hasTimeReverse != null) {
             d1 = Math.max((obj.currentTime - d2), 0);
          }
          if (obj2 != null) {
             d1 = obj2.getStart();
             d2 = obj2.getDuration();
          }
          double d3 = d1;
          Object[] objArray2 = new Object[i];
          a.D().w("EffectPictureSelectAction", "performAction maxDuration:"+d+", defaultDuration:"+integer+", duration:"+d2+", start:"+d3, objArray2);
          if (obj.advEffect.q() == -2) {
             obj1 = p0.m0();
             if (obj1 != null) {
                a.o(obj1, "workspaceDraft.aeEffectDraft ?: return");
                GeneratedMessageLite$Builder uBuilder = obj1.b();
                a.o(uBuilder, "baseDraft.append\(\)");
                uBuilder.a(obj1.Q(obj.advEffect.p()));
                TimeRange$b uob = TimeRange.newBuilder();
                a.o(uob, "timeRangeBuilder");
                uob.b(d3);
                uob.a(d2);
                uBuilder.d(obj.advEffect.n().mFillingMode);
                uBuilder.e(uob);
                FeatureId$b uob1 = FeatureId.newBuilder();
                uob1.a(String.valueOf(obj.advEffect.a));
                uBuilder.c(uob1);
             }else {
                return;
             }
          }else {
             i oi = p0.f1();
             if (oi != null) {
                a.o(oi, "workspaceDraft.visualEffectDraft ?: return");
                GeneratedMessageLite$Builder uBuilder1 = oi.b();
                a.o(uBuilder1, "baseDraft.append\(\)");
                TimeRange$b uob2 = TimeRange.newBuilder();
                a.o(uob2, "timeRangeBuilder");
                uob2.b(d3);
                uob2.a(d2);
                uBuilder1.d(uob2.build());
                FeatureId$b uob3 = FeatureId.newBuilder();
                uob3.a(String.valueOf(obj.advEffect.a));
                uBuilder1.b(uob3);
                uBuilder1.e(obj.advEffect.q());
                uBuilder1.f(obj.draftIndex);
             }else {
             label_01ef :
                return;
             }
          }
          String str = obj.advEffect.e();
          a.o(str, "advEffect.displayName");
          a.a.h(str, d3, d2);
          goto label_01ef ;
       }
    }
}
