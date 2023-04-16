package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.SplitTrackEditAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import yoc.m;
import k2b.s;
import xvc.b;
import maa.a;
import haa.a;
import kba.a;
import java.util.ArrayList;
import yoc.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.AssetTransitionActionData$b;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import com.kuaishou.edit.draft.AssetTransition;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import wba.n0;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.TimeRange$b;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import com.kuaishou.edit.draft.UndoAction$b;
import com.kuaishou.edit.draft.SplitAssetAction$b;
import com.kuaishou.edit.draft.SplitAssetAction;
import java.lang.Iterable;

public final class SplitTrackEditAction extends EditSdkAction	// class@000dbe
{
    public final boolean enableUndo;
    public final TransitionEffect mLastApply2AllTransitionEffect;
    public final double mSplitTimeInTrack;
    public final int mTargetIndex;
    public final boolean splitEnable;

    public void SplitTrackEditAction(boolean p0,int p1,double p2,TransitionEffect p3,boolean p4){
       a.p(p3, "mLastApply2AllTransitionEffect");
       super();
       this.splitEnable = p0;
       this.mTargetIndex = p1;
       this.mSplitTimeInTrack = p2;
       this.mLastApply2AllTransitionEffect = p3;
       this.enableUndo = p4;
    }
    public void SplitTrackEditAction(boolean p0,int p1,double p2,TransitionEffect p3,boolean p4,int p5,u p6){
       boolean b = (p5 & 0x01)? true: p0;
       boolean b1 = (p5 & 0x10)? true: p4;
       super(b, p1, p2, p3, b1);
       return;
    }
    public final boolean getEnableUndo(){
       return this.enableUndo;
    }
    public final TransitionEffect getMLastApply2AllTransitionEffect(){
       return this.mLastApply2AllTransitionEffect;
    }
    public final double getMSplitTimeInTrack(){
       return this.mSplitTimeInTrack;
    }
    public final int getMTargetIndex(){
       return this.mTargetIndex;
    }
    public final boolean getSplitEnable(){
       return this.splitEnable;
    }
    public void performAction(c p0,c p1){
       SplitTrackEditAction mTargetIndex;
       GeneratedMessageLite$Builder uBuilder;
       AssetTransitionActionData$b uob;
       Object obj = this;
       a obj1 = p0;
       a obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, SplitTrackEditAction.class, "1")) {
          return;
       }
       a.p(obj1, "workspaceDraft");
       a.p(obj2, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("SplitTrackEditActionV2", "split action splitEnable:"+obj.splitEnable+", mTargetIndex:"+obj.mTargetIndex+", "+"mSplitTimeInTrack:"+obj.mSplitTimeInTrack+", mLastApply2AllTransitionEffect:"+obj.mLastApply2AllTransitionEffect+", enableUndo:"+obj.enableUndo, objArray);
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, objArray1, m.class, "3")) {
          s.i("SPLIT_ICON", objArray1);
       }
       if (obj.splitEnable == null) {
          obj.setActionCode(4);
          return;
       }else {
          obj2 = a.c(p0);
          obj1 = a.a.u(obj1);
          ArrayList uArrayList = new ArrayList();
          mTargetIndex = obj.mTargetIndex;
          f.a.k(mTargetIndex);
          boolean b = true;
          if (mTargetIndex >= b) {
             int i = mTargetIndex - 1;
             uBuilder = obj2.n(i);
             a.o(uBuilder, "assetDraft.getBuilder\(assetDraftIndex - 1\)");
             uob = AssetTransitionActionData.newBuilder();
             uob.b(i);
             uob.a(uBuilder.getTransition());
             uArrayList.add(uob.build());
          }else {
             uBuilder = objArray1;
          }
          GeneratedMessageLite$Builder uBuilder1 = obj2.n(mTargetIndex);
          a.o(uBuilder1, "assetDraft.getBuilder\(assetDraftIndex\)");
          uob = AssetTransitionActionData.newBuilder();
          uob.b(mTargetIndex);
          uob.a(uBuilder1.getTransition());
          uArrayList.add(uob.build());
          int i1 = mTargetIndex + 1;
          Asset uAsset = uBuilder1.build();
          if (obj.enableUndo != null) {
             objArray1 = obj1;
          }
          Asset$b uob1 = obj2.C(i1, n0.d(uAsset, obj2, 0, objArray1, b));
          TimeRange selectedRang = uBuilder1.getSelectedRange();
          a.o(selectedRang, "currentAssetBuilder.selectedRange");
          double duration = selectedRang.getDuration();
          TimeRange$b uob2 = uBuilder1.getSelectedRange().toBuilder();
          uob2.a(obj.mSplitTimeInTrack);
          selectedRang = uob2.build();
          uBuilder1.s(selectedRang);
          uBuilder1.v(obj.mLastApply2AllTransitionEffect.toAssetTransition());
          a.o(uob1, "nextAssetBuilder");
          TimeRange$b uob3 = TimeRange.newBuilder();
          a.o(selectedRang, "currentAssetNewTimeRange");
          uob3.b((selectedRang.getStart() + selectedRang.getDuration()));
          uob3.a((duration - selectedRang.getDuration()));
          uob1.s(uob3.build());
          uob1.m(n0.e(uob1.instance.getAlbumId()));
          duration = selectedRang.getDuration();
          double d = (double)0x3f800000;
          if (duration - d <= 0) {
             if (uBuilder != null) {
                uBuilder.v(TransitionEffect.Companion.b().toAssetTransition());
             }
             uBuilder1.v(TransitionEffect.Companion.b().toAssetTransition());
          }
          selectedRang = uob1.getSelectedRange();
          a.o(selectedRang, "nextAssetBuilder.selectedRange");
          if (selectedRang.getDuration() - d <= 0) {
             TransitionEffect$a companion = TransitionEffect.Companion;
             uBuilder1.v(companion.b().toAssetTransition());
             uob1.v(companion.b().toAssetTransition());
          }
          if (obj.enableUndo != null) {
             GeneratedMessageLite$Builder uBuilder2 = obj1.b();
             a.o(uBuilder2, "undoDraft.append\(\)");
             SplitAssetAction$b uob4 = SplitAssetAction.newBuilder();
             uob4.a(mTargetIndex);
             uob4.copyOnWrite();
             uob4.instance.setSplitTimeInTrack(obj.mSplitTimeInTrack);
             uob4.copyOnWrite();
             uob4.instance.addAllOriginalAssetTransitions(uArrayList);
             uBuilder2.f(uob4.build());
          }
          Object[] objArray2 = new Object[0];
          a.D().w("SplitTrackEditActionV2", "\n split finish\n", objArray2);
          return;
       }
    }
}
