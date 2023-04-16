package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPictureEndAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPictureEndAction$a;
import nsd.u;
import dqc.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import lqc.d;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import raa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AEEffect$b;
import w69.u0;
import java.util.Objects;
import raa.i;
import com.kuaishou.edit.draft.VisualEffect$b;
import eqc.a;
import dqc.a;

public final class EffectPictureEndAction extends EditSdkAction	// class@000f2e
{
    public final e advEffect;
    public final double currentTime;
    public final int effectIndex;
    public final boolean hasReverseEffect;
    public final boolean isPlaying;
    public boolean success;
    public final double totalDuration;
    public static final EffectPictureEndAction$a Companion;

    static {
       EffectPictureEndAction.Companion = new EffectPictureEndAction$a(null);
    }
    public void EffectPictureEndAction(e p0,boolean p1,double p2,boolean p3,double p4,int p5,boolean p6){
       a.p(p0, "advEffect");
       super();
       this.advEffect = p0;
       this.isPlaying = p1;
       this.currentTime = p2;
       this.hasReverseEffect = p3;
       this.totalDuration = p4;
       this.effectIndex = p5;
       this.success = p6;
    }
    public void EffectPictureEndAction(e p0,boolean p1,double p2,boolean p3,double p4,int p5,boolean p6,int p7,u p8){
       boolean b = (p7 & 0x40)? false: p6;
       super(p0, p1, p2, p3, p4, p5, b);
       return;
    }
    public final e getAdvEffect(){
       return this.advEffect;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final int getEffectIndex(){
       return this.effectIndex;
    }
    public final boolean getSuccess(){
       return this.success;
    }
    public final double getTotalDuration(){
       return this.totalDuration;
    }
    public final boolean isPlaying(){
       return this.isPlaying;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectPictureEndAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       boolean b = d.a.f(this.advEffect);
       Object[] objArray = new Object[0];
       a.D().w("EffectScreenEndAction", "isEffectResourceExist:"+b+", advEffect:"+this.advEffect+", "+"currentTime:"+this.currentTime+", hasReverseEffect:"+this.hasReverseEffect+", success:"+this.success, objArray);
       if (!b) {
          return;
       }
       this.stopAddFilterEffect(p0);
       Object[] objArray1 = new Object[0];
       a.D().w("EffectScreenEndAction", "stopAddFilterEffect mPendingStopAddEffect:"+this.advEffect+",isPlaying:"+this.isPlaying, objArray1);
       return;
    }
    public final void setSuccess(boolean p0){
       this.success = p0;
    }
    public final void stopAddFilterEffect(c p0){
       GeneratedMessageLite$Builder uBuilder;
       TimeRange timeRange;
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectPictureEndAction.class, "2")) {
          return;
       }
       TimeRange$b uob = TimeRange.newBuilder();
       float f = 0.10f;
       String str = "baseDraft.getBuilder\(baseDraft.count - 1\)";
       if (this.advEffect.q() == -2) {
          a uoa = p0.m0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.aeEffectDraft ?: return");
             if (!uoa.p()) {
                return;
             }else {
                uBuilder = uoa.n((uoa.p() - 1));
                a.o(uBuilder, str);
                timeRange = uBuilder.getTimeRange();
                str = "oldEffectBuilder.timeRange";
                a.o(timeRange, str);
                double d = this.currentTime - timeRange.getStart();
                if (this.hasReverseEffect != null) {
                   a.o(uob, "newTimeRangeBuilder");
                   uob.b(this.currentTime);
                   timeRange = uBuilder.getTimeRange();
                   a.o(timeRange, str);
                   uob.a((timeRange.getDuration() - this.currentTime));
                }else {
                   a.o(uob, "newTimeRangeBuilder");
                   timeRange = uBuilder.getTimeRange();
                   a.o(timeRange, str);
                   uob.b(timeRange.getStart());
                   uob.a((this.currentTime - uob.getStart()));
                }
                if (uob.getDuration() - (double)f < 0) {
                   Objects.requireNonNull(u0.c);
                   Object[] objArray = new Object[0];
                   a.D().w("EffectScreenEndAction", "startAddFaceMagicOrVisualEffect duration small than TIME_LENGTH_THRESHOLD startTime:"+u0.a+",duration:"+d+",advEffect:"+this.advEffect, objArray);
                   uoa.Y();
                   return;
                }else {
                   uBuilder.e(uob);
                   this.success = true;
                }
             }
          }else {
             return;
          }
       }else {
          i oi = p0.f1();
          if (oi != null) {
             a.o(oi, "workspaceDraft.visualEffectDraft ?: return");
             if (!oi.p()) {
                return;
             }else {
                uBuilder = oi.n((oi.p() - 1));
                a.o(uBuilder, str);
                str = "oldEffectBuilder.range";
                if (this.hasReverseEffect != null) {
                   a.o(uob, "newTimeRangeBuilder");
                   uob.b(this.currentTime);
                   timeRange = uBuilder.getRange();
                   a.o(timeRange, str);
                   uob.a((timeRange.getDuration() - this.currentTime));
                }else {
                   a.o(uob, "newTimeRangeBuilder");
                   timeRange = uBuilder.getRange();
                   a.o(timeRange, str);
                   uob.b(timeRange.getStart());
                   uob.a((this.currentTime - uob.getStart()));
                }
                if (uob.getDuration() - (double)f < 0) {
                   oi.Y();
                   return;
                }else {
                   uBuilder.c(uob);
                   this.success = true;
                }
             }
          }else {
          label_0158 :
             return;
          }
       }
       String str1 = this.advEffect.e();
       a.o(str1, "advEffect.displayName");
       a.a.h(str1, uob.getStart(), uob.getDuration());
       goto label_0158 ;
    }
}
