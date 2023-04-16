package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectScreenEndAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectScreenEndAction$a;
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
import raa.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FaceMagicEffect$b;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.Loader;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class EffectScreenEndAction extends EditSdkAction	// class@000f37
{
    public final g advEffect;
    public final double currentTime;
    public final boolean hasReverseEffect;
    public boolean success;
    public static final EffectScreenEndAction$a Companion;

    static {
       EffectScreenEndAction.Companion = new EffectScreenEndAction$a(null);
    }
    public void EffectScreenEndAction(g p0,double p1,boolean p2,boolean p3){
       a.p(p0, "advEffect");
       super();
       this.advEffect = p0;
       this.currentTime = p1;
       this.hasReverseEffect = p2;
       this.success = p3;
    }
    public void EffectScreenEndAction(g p0,double p1,boolean p2,boolean p3,int p4,u p5){
       boolean b = (p4 & 0x08)? false: p3;
       super(p0, p1, p2, b);
       return;
    }
    public final g getAdvEffect(){
       return this.advEffect;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final boolean getSuccess(){
       return this.success;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectScreenEndAction.class, "2")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       boolean b = d.a.g(this.advEffect);
       Object[] objArray = new Object[0];
       a.D().w("EffectScreenEndAction", "isEffectResourceExist:"+b+", advEffect:"+this.advEffect+", "+"currentTime:"+this.currentTime+", hasReverseEffect:"+this.hasReverseEffect+", success:"+this.success, objArray);
       if (!b) {
          return;
       }
       this.stopAddFilterEffect(p0);
       return;
    }
    public final void setSuccess(boolean p0){
       this.success = p0;
    }
    public final void stopAddFilterEffect(c p0){
       TimeRange range;
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectScreenEndAction.class, "3")) {
          return;
       }
       p0 = p0.z0();
       if (p0 != null) {
          a.o(p0, "workspaceDraft.faceMagicEffectDraft ?: return");
          int i = 0;
          if (!p0.p()) {
             Object[] objArray = new Object[i];
             a.D().w("EffectScreenEndAction", "stopAddFilterEffect return", objArray);
             return;
          }else {
             int i1 = 1;
             GeneratedMessageLite$Builder uBuilder = p0.n((p0.p() - i1));
             a.o(uBuilder, "baseDraft.getBuilder\(baseDraft.count - 1\)");
             TimeRange$b uob = TimeRange.newBuilder();
             String str = "newTimeRangeBuilder";
             if (this.hasReverseEffect != null) {
                a.o(uob, str);
                uob.b(this.currentTime);
                range = uBuilder.getRange();
                a.o(range, "oldEffectBuilder.range");
                uob.a((range.getDuration() - this.currentTime));
             }else {
                a.o(uob, str);
                range = uBuilder.getRange();
                a.o(range, "oldEffectBuilder.range");
                uob.b(range.getStart());
                uob.a((this.currentTime - uob.getStart()));
             }
             if (uob.getDuration() - (double)0.10f < 0) {
                TimeRange range1 = uBuilder.getRange();
                a.o(range1, "oldEffectBuilder.range");
                Object[] objArray1 = new Object[i];
                a.D().w("EffectPictureStartAction", "startAddFaceMagicOrVisualEffect duration small than TIME_LENGTH_THRESHOLD startTime:"+range1.getStart()+",duration:"+uob.getDuration()+","+"advEffect:"+this.advEffect, objArray1);
                p0.Y();
                return;
             }else {
                uBuilder.d(uob);
                this.success = i1;
             }
          }
       }
       return;
    }
    public List targetLoader(){
       Loader[] obj = PatchProxy.apply(null, this, EffectScreenEndAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Loader[]{Loader.FaceMagic};
       return CollectionsKt__CollectionsKt.r(obj);
    }
}
