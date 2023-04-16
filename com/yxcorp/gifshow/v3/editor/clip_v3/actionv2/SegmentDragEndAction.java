package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.SegmentDragEndAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import yoc.m;
import k2b.s;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import yoc.f;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import kotlin.Pair;
import java.util.Objects;
import java.lang.Integer;
import maa.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import com.kuaishou.edit.draft.AssetTransition;
import java.lang.Boolean;
import kba.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.UndoAction;
import com.kuaishou.edit.draft.UndoAction$ActionCase;
import com.kuaishou.edit.draft.AssetRangeAction;
import java.util.List;
import com.kuaishou.edit.draft.Asset;
import yoc.j;

public final class SegmentDragEndAction extends EditSdkAction	// class@000db8
{
    public final int currentIndex;
    public final double deltaTime;
    public final double downDuration;
    public final boolean isLeft;

    public void SegmentDragEndAction(int p0,boolean p1,double p2,double p3){
       super();
       this.currentIndex = p0;
       this.isLeft = p1;
       this.deltaTime = p2;
       this.downDuration = p3;
    }
    public final int getCurrentIndex(){
       return this.currentIndex;
    }
    public final boolean isLeft(){
       return this.isLeft;
    }
    public void performAction(c p0,c p1){
       SegmentDragEndAction currentIndex;
       Object obj = this;
       Object obj1 = p0;
       ClipUtils obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, SegmentDragEndAction.class, "1")) {
          return;
       }
       String str = "workspaceDraft";
       a.p(obj1, str);
       a.p(obj2, "store");
       super.performAction(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, m.class, "12")) {
          s.i("SPLIT_DRAG", objArray);
       }
       Object[] objArray1 = new Object[0];
       a.D().w("SegmentDragEndAction", "performAction currentIndex:"+obj.currentIndex+", isLeft:"+obj.isLeft+", deltaTime:"+obj.deltaTime+", downDuration:"+obj.downDuration, objArray1);
       currentIndex = obj.currentIndex;
       f.a.k(currentIndex);
       ClipUtils c = ClipUtils.c;
       c.e(p0, currentIndex, obj.isLeft, obj.deltaTime, obj.downDuration);
       Objects.requireNonNull(c);
       obj2 = ClipUtils.class;
       int i = 1;
       if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(currentIndex), c, obj2, "10")) {
          a.p(obj1, str);
          a uoa = a.c(p0);
          Asset$b uob = (currentIndex >= i)? uoa.n((currentIndex - 1)): objArray;
          GeneratedMessageLite$Builder uBuilder = uoa.n(currentIndex);
          a.o(uBuilder, "assetDraft.getBuilder\(index\)");
          TimeRange selectedRang1 = uBuilder.getSelectedRange();
          a.o(selectedRang1, "currentAsset.selectedRange");
          if (selectedRang1.getDuration() - (double)0x3f800000 <= 0) {
             TransitionEffect$a companion = TransitionEffect.Companion;
             uBuilder.v(companion.b().toAssetTransition());
             if (uob != null) {
                uob.v(companion.b().toAssetTransition());
             }
          }else {
             Pair pair = c.c(obj1);
             if (pair.getFirst().booleanValue() && (a.g(uBuilder.getTransition(), TransitionEffect.Companion.b().toAssetTransition()) || a.g(uBuilder.getTransition(), AssetTransition.getDefaultInstance()))) {
                uBuilder.v(pair.getSecond().toAssetTransition());
             }
             if (pair.getFirst().booleanValue()) {
                AssetTransition transition = (uob != null)? uob.getTransition(): objArray;
                if (!a.g(transition, TransitionEffect.Companion.b().toAssetTransition())) {
                   if (uob != null) {
                      objArray = uob.getTransition();
                   }
                   if (!a.g(objArray, AssetTransition.getDefaultInstance())) {
                   label_016c :
                      uoa = a.a.u(obj1);
                      UndoAction undoAction = uoa.y((uoa.p() - i));
                      a.o(undoAction, "undoMessage");
                      if (undoAction.getActionCase() != UndoAction$ActionCase.ASSET_RANGE_ACTION) {
                         Object[] objArray2 = new Object[0];
                         a.D().w("SegmentDragEndAction", "performAction not asset range", objArray2);
                         return;
                      }else {
                         AssetRangeAction assetRangeAc = undoAction.getAssetRangeAction();
                         a.o(assetRangeAc, "undoMessage.assetRangeAction");
                         TimeRange originalRang = assetRangeAc.getOriginalRange();
                         a.o(originalRang, "originRange");
                         double start = originalRang.getStart();
                         double duration = originalRang.getDuration();
                         Asset uAsset = a.c(p0).z().get(currentIndex);
                         a.o(uAsset, "asset");
                         TimeRange selectedRang = uAsset.getSelectedRange();
                         a.o(selectedRang, "asset.selectedRange");
                         double start1 = selectedRang.getStart();
                         originalRang = uAsset.getSelectedRange();
                         a.o(originalRang, "asset.selectedRange");
                         double duration1 = originalRang.getDuration();
                         if (obj.isLeft == null || (j.b(start, start1) || (obj.isLeft == null && j.b(duration, duration1)))) {
                            uoa.V((uoa.p() - i));
                         }
                         return;
                      }
                   }
                }
                if (uob != null) {
                   uob.v(pair.getSecond().toAssetTransition());
                   goto label_016c ;
                }else {
                   goto label_016c ;
                }
             }else {
                goto label_016c ;
             }
          }
       }
    }
}
