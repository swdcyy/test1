package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderMoveAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import q87.c;
import yoc.f;
import haa.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import com.kuaishou.edit.draft.AssetTransition;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;

public final class ReorderMoveAction extends EditSdkAction	// class@000e00
{
    public final int newAssetIndex;
    public final int originAssetIndex;

    public void ReorderMoveAction(int p0,int p1){
       super();
       this.originAssetIndex = p0;
       this.newAssetIndex = p1;
    }
    public final int getNewAssetIndex(){
       return this.newAssetIndex;
    }
    public final int getOriginAssetIndex(){
       return this.originAssetIndex;
    }
    public final void moveVideo(int p0,int p1,c p2){
       Object[] this;
       f a;
       Asset$b uob;
       double duration1;
       if (PatchProxy.isSupport(ReorderMoveAction.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ReorderMoveAction.class, "2")) {
          return;
       }
       a uoa = a.D();
       StringBuilder str = "moveVideo fromIndex = "+p0+" toIndex = "+p1+' '+"workspaceDraftAssetList.size = ";
       a uoa1 = p2.o0();
       Integer integer = (uoa1 != null)? Integer.valueOf(uoa1.p()): null;
       int i = 0;
       this = new Object[i];
       uoa.w("ReorderAddAction", str+integer, this);
       a = f.a;
       a.k(p0);
       a.k(p1);
       a uoa2 = a.c(p2);
       uoa2.H(p0, p1);
       p0 = uoa2.p();
       while (i < p0) {
          GeneratedMessageLite$Builder uBuilder = uoa2.n(i);
          a.o(uBuilder, "assetDraft.getBuilder\(index\)");
          int i1 = uoa2.p() - 1;
          if (i == i1) {
             uob = null;
          }else {
             i1 = i + 1;
             uob = uoa2.n(i1);
          }
          TimeRange selectedRang = uBuilder.getSelectedRange();
          a.o(selectedRang, "currentAssetBuilder.selectedRange");
          double duration = selectedRang.getDuration();
          double d = (double)0x3f800000;
          if (duration - d > 0) {
             if (uob != null) {
                TimeRange selectedRang1 = uob.getSelectedRange();
                if (selectedRang1 != null) {
                   duration1 = selectedRang1.getDuration();
                label_00b5 :
                   if (duration1 - d > 0) {
                   label_00c6 :
                      i = i + 1;
                   }
                }
             }
             duration1 = null;
             goto label_00b5 ;
          }
          uBuilder.v(TransitionEffect.Companion.b().toAssetTransition());
          goto label_00c6 ;
       }
       return;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReorderMoveAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("ReorderAddAction", "onMove originAssetIndex = "+this.originAssetIndex+" newAssetIndex = "+this.newAssetIndex, objArray);
       this.moveVideo(this.originAssetIndex, this.newAssetIndex, p0);
       return;
    }
}
