package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectScreenStartAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectScreenStartAction$a;
import nsd.u;
import dqc.g;
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
import eqc.a;
import dqc.a;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import raa.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.FaceMagicEffect$b;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;

public final class EffectScreenStartAction extends EditSdkAction	// class@000f3a
{
    public final g advEffect;
    public double currentTime;
    public final int effectIndex;
    public final boolean hasReverseEffect;
    public boolean success;
    public final double totalDuration;
    public static final EffectScreenStartAction$a Companion;

    static {
       EffectScreenStartAction.Companion = new EffectScreenStartAction$a(null);
    }
    public void EffectScreenStartAction(g p0,double p1,boolean p2,double p3,int p4,boolean p5){
       a.p(p0, "advEffect");
       super();
       this.advEffect = p0;
       this.currentTime = p1;
       this.hasReverseEffect = p2;
       this.totalDuration = p3;
       this.effectIndex = p4;
       this.success = p5;
    }
    public void EffectScreenStartAction(g p0,double p1,boolean p2,double p3,int p4,boolean p5,int p6,u p7){
       boolean b = (p6 & 0x20)? false: p5;
       super(p0, p1, p2, p3, p4, b);
       return;
    }
    public final g getAdvEffect(){
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
    public void performAction(c p0,c p1){
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectScreenStartAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       boolean b = d.a.g(this.advEffect);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EffectScreenStartAction", "isEffectResourceExist:"+b+", advEffect:"+this.advEffect+", "+"currentTime:"+this.currentTime+", hasReverseEffect:"+this.hasReverseEffect+", success:"+this.success, objArray);
       if (!b) {
          return;
       }
       if (this.startAddFaceMagicOrVisualEffect(this.currentTime, this.advEffect, p0)) {
          Object[] objArray1 = new Object[i];
          a.D().w("EffectScreenStartAction", "effectLongClick playerView play", objArray1);
       }
       a = a.a;
       String str = this.advEffect.k();
       int i1 = this.effectIndex + 1;
       Objects.requireNonNull(a);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(str, Integer.valueOf(i1), a, uoa, "15")) {
          a.m(str);
          a.f("CLICK_SPLIT_SCREEN_EFFECT", str, i1);
       }
       return;
    }
    public final void setCurrentTime(double p0){
       this.currentTime = p0;
    }
    public final void setSuccess(boolean p0){
       this.success = p0;
    }
    public final boolean startAddFaceMagicOrVisualEffect(double p0,g p1,c p2){
       EffectScreenStartAction obj;
       if (PatchProxy.isSupport(EffectScreenStartAction.class)) {
          obj = PatchProxy.applyThreeRefs(Double.valueOf(p0), p1, p2, this, EffectScreenStartAction.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.hasReverseEffect;
       float f = (obj != null)? 0.05f: -0.05f;
       p0 = p0 + (double)f;
       double d = this.totalDuration - p0;
       if (obj != null) {
          p0 = null;
          d = p0;
       }
       p2 = p2.z0();
       if (p2 != null) {
          a.o(p2, "workspaceDraft.faceMagic\x20\x02fectDraft ?: return false\x00");
          GeneratedMessageLite$Builder uBuilder = p2.b();
          a.o(uBuilder, "baseDraft.append\(\)");
          uBuilder.a(p2.Q(p1.o()));
          TimeRange$b uob = TimeRange.newBuilder();
          a.o(uob, "timeRangeBuilder");
          uob.b(p0);
          uob.a(d);
          uBuilder.d(uob);
          FeatureId$b uob1 = FeatureId.newBuilder();
          uob1.a(String.valueOf(p1.a));
          uBuilder.c(uob1);
          uBuilder.e(FaceMagicEffect$Type.FACE_MAGIC);
          this.success = true;
          return true;
       }else {
          return false;
       }
    }
}
