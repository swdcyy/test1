package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.DeleteTrackEditAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.Map;
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
import q87.c;
import yoc.m;
import ooc.g1;
import xvc.b;
import maa.a;
import haa.a;
import kba.a;
import yoc.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset$b;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import java.util.ArrayList;
import com.kuaishou.edit.draft.AssetTransitionActionData$b;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import com.kuaishou.edit.draft.AssetTransition;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import wba.n0;
import com.kuaishou.edit.draft.UndoAction$b;
import com.kuaishou.edit.draft.DeleteAssetAction$b;
import com.kuaishou.edit.draft.DeleteAssetAction;
import java.lang.Iterable;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;

public final class DeleteTrackEditAction extends EditSdkAction	// class@000db3
{
    public final boolean beforeActionDeleteEnable;
    public final Map mAddingFileAndDraftFileMap;
    public final int mTargetIndex;

    public void DeleteTrackEditAction(boolean p0,int p1,Map p2){
       a.p(p2, "mAddingFileAndDraftFileMap");
       super();
       this.beforeActionDeleteEnable = p0;
       this.mTargetIndex = p1;
       this.mAddingFileAndDraftFileMap = p2;
    }
    public void DeleteTrackEditAction(boolean p0,int p1,Map p2,int p3,u p4){
       if (p3 & 1) {
          p0 = true;
       }
       super(p0, p1, p2);
       return;
    }
    public final boolean getBeforeActionDeleteEnable(){
       return this.beforeActionDeleteEnable;
    }
    public final Map getMAddingFileAndDraftFileMap(){
       return this.mAddingFileAndDraftFileMap;
    }
    public final int getMTargetIndex(){
       return this.mTargetIndex;
    }
    public void performAction(c p0,c p1){
       Asset$b uob1;
       AssetTransitionActionData$b uob2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DeleteTrackEditAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("DeleteTrackEditActionV2", "doDeleteTrack", objArray);
       objArray = null;
       int i1 = 1;
       if (!PatchProxy.applyVoid(objArray, objArray, m.class, "4")) {
          g1.v(i1, "cut_range", "drop_cut_range");
       }
       if (this.beforeActionDeleteEnable == null) {
          this.setActionCode(10);
          return;
       }else {
          a uoa = a.c(p0);
          a uoa1 = a.a.u(p0);
          DeleteTrackEditAction tmTargetInde = this.mTargetIndex;
          f.a.k(tmTargetInde);
          Asset$b uob = (tmTargetInde > null)? uoa.n((tmTargetInde - 1)): objArray;
          Asset uAsset = uoa.y(tmTargetInde);
          if (tmTargetInde < (uoa.p() - i1)) {
             uob1 = uoa.n((tmTargetInde + 1));
          }
          ArrayList uArrayList = new ArrayList();
          if (uob != null || uob1 == null) {
             if (uob != null && uob1 == null) {
                uob2 = AssetTransitionActionData.newBuilder();
                uob2.b((tmTargetInde - 1));
                uob2.a(uob.getTransition());
                uArrayList.add(uob2.build());
                uob.v(TransitionEffect.Companion.b().toAssetTransition());
             }else if(uob != null && uob1 != null){
                TimeRange selectedRang = uob.getSelectedRange();
                TimeRange selectedRang1 = uob1.getSelectedRange();
                a.o(selectedRang, "preAssetRange");
                double d = (double)0x3f800000;
                if (selectedRang.getDuration() - d > 0) {
                   a.o(selectedRang1, "nextAssetRange");
                   if (selectedRang1.getDuration() - d > 0) {
                   label_00f5 :
                      a.o(uAsset, "currentDeleteAsset");
                      File uFile = DraftFileManager.E().B(uAsset.getFile(), uoa);
                      boolean b = this.mAddingFileAndDraftFileMap.containsKey(uAsset.getFile());
                      String str = "undoDraft.append\(\)";
                      String str1 = "cloneAssetForNewClip\(cur¡­ false, undoDraft, false\)";
                      if (!b) {
                         uAsset = n0.d(uAsset, uoa, i, uoa1, i);
                         a.o(uAsset, str1);
                         GeneratedMessageLite$Builder uBuilder = uoa1.b();
                         a.o(uBuilder, str);
                         DeleteAssetAction$b uob3 = DeleteAssetAction.newBuilder();
                         uob3.c(tmTargetInde);
                         uob3.b(uAsset);
                         uob3.a(uArrayList);
                         uBuilder.e(uob3.build());
                         uoa.V(tmTargetInde);
                         n0.b(uAsset, uoa1, uoa);
                      }else if(uFile != null){
                         uoa.W(tmTargetInde, i);
                         Asset uAsset1 = n0.d(uAsset, uoa, i, uoa1, i);
                         a.o(uAsset1, str1);
                         String absolutePath = uFile.getAbsolutePath();
                         str1 = uAsset1.getFile();
                         Objects.requireNonNull(uoa1);
                         if (PatchProxy.applyTwoRefs(absolutePath, str1, uoa1, c.class, "12") != PatchProxyResult.class) {
                         }else {
                            uoa1.S(absolutePath, i, str1);
                         }
                         GeneratedMessageLite$Builder uBuilder1 = uoa1.b();
                         a.o(uBuilder1, str);
                         DeleteAssetAction$b uob4 = DeleteAssetAction.newBuilder();
                         uob4.c(tmTargetInde);
                         uob4.b(uAsset1);
                         uob4.a(uArrayList);
                         uBuilder1.e(uob4.build());
                         Object[] objArray2 = new Object[i];
                         a.D().w("DeleteTrackEditActionV2", "delete finish clonedAsset.file"+uAsset1.getFile(), objArray2);
                      }else {
                         i1.b("DeleteTrackEditActionV2", new RuntimeException("syncDraft currentAssetFileEffective"));
                      }
                      Object[] objArray1 = new Object[i];
                      a.D().w("DeleteTrackEditActionV2", "\n doDeleteTrack finish currentDeleteFileAddFromArrange:"+b+", "+"currentAssetFileOutDraft:"+uFile, objArray1);
                      return;
                   }
                }
                uob2 = AssetTransitionActionData.newBuilder();
                uob2.b((tmTargetInde - 1));
                uob2.a(uob.getTransition());
                uArrayList.add(uob2.build());
                uob.v(TransitionEffect.Companion.b().toAssetTransition());
                goto label_00f5 ;
             }else {
                goto label_00f5 ;
             }
          }else {
             goto label_00f5 ;
          }
       }
    }
}
