package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.SegmentDragStartAction;
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
import maa.a;
import haa.a;
import kba.a;
import java.util.ArrayList;
import yoc.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.TimeRange$b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.AssetTransitionActionData$b;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import com.kuaishou.edit.draft.AssetTransition;
import com.kuaishou.edit.draft.UndoAction$b;
import com.kuaishou.edit.draft.AssetRangeAction$b;
import com.kuaishou.edit.draft.AssetRangeAction;
import java.lang.Iterable;
import java.lang.Double;

public final class SegmentDragStartAction extends EditDraftAction	// class@000db9
{
    public final l dragStart;
    public final int index;
    public final boolean isLeft;
    public final double totalDuration;

    public void SegmentDragStartAction(int p0,boolean p1,double p2,l p3){
       a.p(p3, "dragStart");
       super(false, 1, null);
       this.index = p0;
       this.isLeft = p1;
       this.totalDuration = p2;
       this.dragStart = p3;
    }
    public final int getIndex(){
       return this.index;
    }
    public final boolean isLeft(){
       return this.isLeft;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SegmentDragStartAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = a.c(p0);
       a uoa1 = a.a.u(p0);
       ArrayList uArrayList = new ArrayList();
       SegmentDragStartAction tindex = this.index;
       f.a.k(tindex);
       GeneratedMessageLite$Builder uBuilder = uoa.n(tindex);
       a.o(uBuilder, "assetDraft.getBuilder\(assetDraftIndex\)");
       GeneratedMessageLite$Builder uBuilder1 = uBuilder.getSelectedRange().toBuilder();
       a.o(uBuilder1, "currAssetBuilder.selectedRange.toBuilder\(\)");
       Object[] objArray = new Object[0];
       a.D().w("SegmentDragStartAction", "performAction assetDraftIndex:"+tindex+", index:"+this.index+", isLeft:"+this.isLeft+", totalDuration:"+this.totalDuration, objArray);
       AssetTransitionActionData$b uob = AssetTransitionActionData.newBuilder();
       uob.b(tindex);
       uob.a(uBuilder.getTransition());
       uArrayList.add(uob.build());
       int i = tindex - 1;
       if (i >= 0) {
          GeneratedMessageLite$Builder uBuilder2 = uoa.n(i);
          a.o(uBuilder2, "assetDraft.getBuilder\(assetDraftIndex - 1\)");
          uob = AssetTransitionActionData.newBuilder();
          uob.b(i);
          uob.a(uBuilder2.getTransition());
          uArrayList.add(uob.build());
       }
       GeneratedMessageLite$Builder uBuilder3 = uoa1.b();
       a.o(uBuilder3, "undoDraft.append\(\)");
       AssetRangeAction$b uob1 = AssetRangeAction.newBuilder();
       uob1.a(tindex);
       uob1.copyOnWrite();
       uob1.instance.setOriginalRange(uBuilder1);
       uob1.copyOnWrite();
       uob1.instance.addAllOriginalAssetTransitions(uArrayList);
       uBuilder3.a(uob1.build());
       this.dragStart.invoke(Double.valueOf(this.totalDuration));
       return;
    }
}
