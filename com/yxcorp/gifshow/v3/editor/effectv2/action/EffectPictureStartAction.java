package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPictureStartAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPictureStartAction$a;
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
import dqc.a;
import ooc.g1;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import raa.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.AEEffect$b;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.v3.editor.effect.model.AEEffectConfig;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.AEEffect;
import raa.i;
import com.kuaishou.edit.draft.VisualEffect$b;
import com.google.protobuf.GeneratedMessageLite;

public final class EffectPictureStartAction extends EditSdkAction	// class@000f31
{
    public final e advEffect;
    public double currentTime;
    public final int draftIndex;
    public final int effectIndex;
    public final boolean hasReverseEffect;
    public final boolean isPlaying;
    public boolean success;
    public final double totalDuration;
    public static final EffectPictureStartAction$a Companion;

    static {
       EffectPictureStartAction.Companion = new EffectPictureStartAction$a(null);
    }
    public void EffectPictureStartAction(e p0,boolean p1,double p2,boolean p3,double p4,int p5,boolean p6,int p7){
       a.p(p0, "advEffect");
       super();
       this.advEffect = p0;
       this.isPlaying = p1;
       this.currentTime = p2;
       this.hasReverseEffect = p3;
       this.totalDuration = p4;
       this.effectIndex = p5;
       this.success = p6;
       this.draftIndex = p7;
    }
    public void EffectPictureStartAction(e p0,boolean p1,double p2,boolean p3,double p4,int p5,boolean p6,int p7,int p8,u p9){
       boolean b = (p8 & 0x40)? false: p6;
       super(p0, p1, p2, p3, p4, p5, b, p7);
       return;
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectPictureStartAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       boolean b = d.a.f(this.advEffect);
       Object[] objArray = new Object[0];
       a.D().w("EffectPictureStartAction", "isEffectResourceExist:"+b+", advEffect:"+this.advEffect+", "+"currentTime:"+this.currentTime+", hasReverseEffect:"+this.hasReverseEffect+", success:"+this.success, objArray);
       if (!b) {
          return;
       }
       if (this.startAddFaceMagicOrVisualEffect(this.currentTime, this.advEffect, p0)) {
          Object[] objArray1 = new Object[0];
          a.D().w("EffectPictureStartAction", "effectLongClick playerView play", objArray1);
       }
       g1.v(4, "visual_effects", this.advEffect.k());
       return;
    }
    public final void setCurrentTime(double p0){
       this.currentTime = p0;
    }
    public final void setSuccess(boolean p0){
       this.success = p0;
    }
    public final boolean startAddFaceMagicOrVisualEffect(double p0,e p1,c p2){
       double d1;
       if (PatchProxy.isSupport(EffectPictureStartAction.class)) {
          Object obj = PatchProxy.applyThreeRefs(Double.valueOf(p0), p1, p2, this, EffectPictureStartAction.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       double d = this.totalDuration - p0;
       if (this.hasReverseEffect != null) {
          d1 = 0;
          d = p0;
       }else {
          d1 = p0;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EffectPictureStartAction", "startAddFaceMagicOrVisualEffect currentTime:"+p0+", advEffect:"+p1+", addTime:"+p0+"duration:"+d+", hasReverseEffect:"+this.hasReverseEffect, objArray);
       if (p1.q() == -2) {
          a uoa = p2.m0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.aeEffectDraft ?: return false");
             GeneratedMessageLite$Builder uBuilder = uoa.b();
             a.o(uBuilder, "baseDraft.append\(\)");
             uBuilder.a(uoa.Q(p1.p()));
             TimeRange$b uob = TimeRange.newBuilder();
             a.o(uob, "timeRangeBuilder");
             uob.b(d1);
             uob.a(d);
             uBuilder.d(p1.n().mFillingMode);
             uBuilder.e(uob);
             FeatureId$b uob1 = FeatureId.newBuilder();
             uob1.a(String.valueOf(p1.a));
             uBuilder.c(uob1);
             uBuilder.copyOnWrite();
             uBuilder.instance.setZIndex(this.draftIndex);
             this.success = true;
          }else {
             return i;
          }
       }else {
          i oi = p2.f1();
          if (oi != null) {
             a.o(oi, "workspaceDraft.visualEffectDraft ?: return false");
             GeneratedMessageLite$Builder uBuilder1 = oi.b();
             a.o(uBuilder1, "baseDraft.append\(\)");
             TimeRange$b uob2 = TimeRange.newBuilder();
             a.o(uob2, "timeRangeBuilder");
             uob2.b(d1);
             uob2.a(d);
             uBuilder1.d(uob2.build());
             FeatureId$b uob3 = FeatureId.newBuilder();
             uob3.a(String.valueOf(p1.a));
             uBuilder1.b(uob3);
             uBuilder1.e(p1.q());
             uBuilder1.f(this.draftIndex);
             this.success = true;
          }else {
             return i;
          }
       }
       return true;
    }
}
