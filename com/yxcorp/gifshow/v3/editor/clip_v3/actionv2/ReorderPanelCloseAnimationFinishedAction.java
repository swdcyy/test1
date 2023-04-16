package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.ReorderPanelCloseAnimationFinishedAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import maa.a;
import haa.a;
import kba.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.UndoAction;
import com.kuaishou.edit.draft.UndoAction$ActionCase;
import com.kuaishou.edit.draft.AssetArrangeAction;
import java.util.List;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;

public final class ReorderPanelCloseAnimationFinishedAction extends EditSdkAction	// class@000db6
{
    public final boolean isPlaying;
    public final boolean isSave;
    public final double saveToSeekTime;

    public void ReorderPanelCloseAnimationFinishedAction(boolean p0,double p1,boolean p2){
       super();
       this.isSave = p0;
       this.saveToSeekTime = p1;
       this.isPlaying = p2;
    }
    public final double getSaveToSeekTime(){
       return this.saveToSeekTime;
    }
    public final boolean isPlaying(){
       return this.isPlaying;
    }
    public final boolean isSave(){
       return this.isSave;
    }
    public void performAction(c p0,c p1){
       Object[] objArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReorderPanelCloseAnimationFinishedAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = a.c(p0);
       a uoa1 = a.a.u(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "ReorderPanelCloseAnimationFinishedAction";
       a.D().w(str, "performAction isSave:"+this.isSave+", saveToSeekTime:"+this.saveToSeekTime+", isPlaying:"+this.isPlaying, objArray);
       if (!uoa1.p()) {
          objArray1 = new Object[i];
          a.D().w(str, "performAction undo is empty", objArray1);
          return;
       }else {
          UndoAction undoAction = uoa1.y((uoa1.p() - 1));
          a.o(undoAction, "undoMessage");
          if (undoAction.getActionCase() != UndoAction$ActionCase.ASSET_ARRANGE_ACTION) {
             objArray1 = new Object[i];
             a.D().w(str, "performAction undo message is empty", objArray1);
             return;
          }else if(this.isSave != null){
             AssetArrangeAction assetArrange = undoAction.getAssetArrangeAction();
             a.o(assetArrange, "assetArrangeAction");
             if (assetArrange.getOriginalAssetsCount() != uoa.z().size()) {
                return;
             }else {
                int i1 = assetArrange.getOriginalAssetsList().size();
                while (true) {
                   if (i < i1) {
                      Asset originalAsse = assetArrange.getOriginalAssets(i);
                      Asset uAsset = uoa.z().get(i);
                      a.o(uAsset, "nowAsset");
                      a.o(originalAsse, "undoAsset");
                      int i2 = a.g(uAsset.getFile(), originalAsse.getFile()) ^ 0x01;
                      if (!i2) {
                         TimeRange selectedRang = uAsset.getSelectedRange();
                         String str1 = "nowAsset.selectedRange";
                         a.o(selectedRang, str1);
                         double start = selectedRang.getStart();
                         selectedRang = originalAsse.getSelectedRange();
                         a.o(selectedRang, "undoAsset.selectedRange");
                         if (!start - selectedRang.getStart()) {
                            TimeRange selectedRang1 = uAsset.getSelectedRange();
                            a.o(selectedRang1, str1);
                            TimeRange selectedRang2 = originalAsse.getSelectedRange();
                            a.o(selectedRang2, "undoAsset.selectedRange");
                            if (!selectedRang1.getDuration() - selectedRang2.getDuration()) {
                               i = i + 1;
                            }
                         }
                      }
                      break ;
                   }else {
                      uoa1.V((uoa1.p() - 1));
                   }
                }
                return;
             }
          }else {
             ClipUtils.c.h(p0);
             uoa1.V((uoa1.p() - 1));
          }
          return;
       }
    }
}
