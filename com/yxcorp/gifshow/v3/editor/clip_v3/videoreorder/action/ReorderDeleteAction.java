package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderDeleteAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import haa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import kba.a;
import wba.n0;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import yoc.f;
import java.lang.CharSequence;
import e17.i;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import com.kuaishou.edit.draft.AssetTransition;
import com.kuaishou.edit.draft.TimeRange;
import lnc.a1;
import xvc.b;

public final class ReorderDeleteAction extends EditSdkAction	// class@000dfd
{
    public final int mTargetIndex;
    public final String reason;
    public final boolean selected;
    public final int totalAssetSize;

    public void ReorderDeleteAction(int p0,boolean p1,int p2,String p3){
       a.p(p3, "reason");
       super();
       this.mTargetIndex = p0;
       this.selected = p1;
       this.totalAssetSize = p2;
       this.reason = p3;
    }
    public final void deleteVideo(String p0,c p1){
       StringBuilder identifier;
       Asset uAsset;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReorderDeleteAction.class, "2")) {
          return;
       }
       a uoa = p1.o0();
       int i = 0;
       int i1 = (uoa != null)? uoa.p(): 0;
       int i2 = 0;
       while (true) {
          int i3 = -1;
          if (i2 < i1) {
             a uoa1 = p1.o0();
             if (uoa1 != null) {
                Asset$b uob = uoa1.n(i2);
                if (uob != null) {
                   identifier = uob.getIdentifier();
                   if (identifier != null) {
                   label_0033 :
                      if (a.g(identifier, p0)) {
                      label_003e :
                         uoa = a.D();
                         identifier = "deleteVideo identifier = "+p0+" deleteIndex = "+i2+' '+"mVideoReorderAssetList.size = ";
                         a uoa2 = p1.o0();
                         if (uoa2 != null) {
                            i3 = uoa2.p();
                         }
                         Object[] objArray = new Object[i];
                         uoa.w("ReorderDeleteAction", identifier+i3, objArray);
                         uAsset = a.c(p1).y(i2);
                         if (i2 >= 0) {
                            a.c(p1).V(i2);
                            break ;
                         }
                         break ;
                      }else {
                         i2 = i2 + 1;
                      }
                   }
                }
             }
             identifier = "";
             goto label_0033 ;
          }else {
             i2 = -1;
             goto label_003e ;
          }
       }
       n0.b(uAsset, a.a.u(p1), a.c(p1));
       return;
    }
    public final int getMTargetIndex(){
       return this.mTargetIndex;
    }
    public final String getReason(){
       return this.reason;
    }
    public final boolean getSelected(){
       return this.selected;
    }
    public final int getTotalAssetSize(){
       return this.totalAssetSize;
    }
    public void performAction(c p0,c p1){
       f a;
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReorderDeleteAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a = f.a;
       ReorderDeleteAction ttotalAssetS = this.totalAssetSize;
       a.k(ttotalAssetS);
       if (this.selected == null) {
          i = 1;
          if (ttotalAssetS > i) {
             int i1 = 0;
             a uoa = (this.reason.length() > 0)? 1: null;
             if (uoa) {
                i.d(R.style.arg_RES_7f110668, this.reason);
                return;
             }else {
                Object[] objArray = new Object[i1];
                a.D().w("ReorderDeleteAction", "onDelete mTargetIndex = "+this.mTargetIndex, objArray);
                ttotalAssetS = this.mTargetIndex;
                if (ttotalAssetS < null) {
                   i1.b("ReorderDeleteAction", new RuntimeException("onDelete error mTargetIndex small than 0"));
                   return;
                }else {
                   a.k(ttotalAssetS);
                   a uoa1 = a.c(p0);
                   Asset$b uob = null;
                   Asset$b uob1 = (ttotalAssetS > null)? uoa1.n((ttotalAssetS - 1)): uob;
                   Asset$b uob2 = (ttotalAssetS < (uoa1.p() - i))? uoa1.n((ttotalAssetS + 1)): uob;
                   if (uob1 != null || uob2 == null) {
                      if (uob1 != null && uob2 == null) {
                         uob1.v(TransitionEffect.Companion.b().toAssetTransition());
                      }else if(uob1 != null && uob2 != null){
                         TimeRange selectedRang = uob1.getSelectedRange();
                         TimeRange selectedRang1 = uob2.getSelectedRange();
                         a.o(selectedRang, "preAssetRange");
                         double duration = selectedRang.getDuration();
                         double d = (double)0x3f800000;
                         if (duration - d > 0) {
                            a.o(selectedRang1, "nextAssetRange");
                            if (selectedRang1.getDuration() - d > 0) {
                            label_00dd :
                               uoa1 = p0.o0();
                               if (uoa1 != null) {
                                  uob = uoa1.n(ttotalAssetS);
                               }
                               if (uob != null) {
                                  this.deleteVideo(uob.getIdentifier(), p0);
                               }else {
                                  i1.b("ReorderDeleteAction", new RuntimeException("onDelete error deletedReorderData is null"));
                               }
                               return;
                            }
                         }
                         uob1.v(TransitionEffect.Companion.b().toAssetTransition());
                         goto label_00dd ;
                      }else {
                         goto label_00dd ;
                      }
                   }else {
                      goto label_00dd ;
                   }
                }
             }
          }
       }
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100bb8));
       this.setActionCode(6);
       return;
    }
}
