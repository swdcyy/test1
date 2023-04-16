package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.SegmentDraggingAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yoc.f;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import kotlin.Pair;
import java.lang.Number;
import xvc.b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import cpc.b;
import java.lang.Float;

public final class SegmentDraggingAction extends EditDraftAction	// class@000dba
{
    public final int currentIndex;
    public final double deltaTime;
    public final double downDuration;
    public final l dragResult;
    public final boolean isLeft;
    public double realDragTime;

    public void SegmentDraggingAction(int p0,boolean p1,double p2,double p3,l p4){
       a.p(p4, "dragResult");
       super(false, 1, null);
       this.currentIndex = p0;
       this.isLeft = p1;
       this.deltaTime = p2;
       this.downDuration = p3;
       this.dragResult = p4;
    }
    public final int getCurrentIndex(){
       return this.currentIndex;
    }
    public final double getDeltaTime(){
       return this.deltaTime;
    }
    public final double getRealDragTime(){
       return this.realDragTime;
    }
    public final boolean isLeft(){
       return this.isLeft;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SegmentDraggingAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       SegmentDraggingAction tcurrentInde = this.currentIndex;
       f.a.k(tcurrentInde);
       Pair pair = ClipUtils.c.e(p0, tcurrentInde, this.isLeft, this.deltaTime, this.downDuration);
       this.realDragTime = pair.getFirst().doubleValue();
       this.setActionCode(pair.getSecond().intValue());
       Object[] objArray = new Object[0];
       a.D().w("SegmentDraggingAction", "performAction currentIndex:"+this.currentIndex+", isLeft:"+this.isLeft+", "+"deltaTime:"+this.deltaTime+", downDuration:"+this.downDuration+", realDragTime:"+this.realDragTime+", actionCode:"+this.getActionCode(), objArray);
       this.dragResult.invoke(Float.valueOf(b.h(this.realDragTime)));
       return;
    }
    public final void setRealDragTime(double p0){
       this.realDragTime = p0;
    }
}
