package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderPanelOpenUndoAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import maa.a;
import haa.a;
import kba.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.UndoAction$b;
import com.kuaishou.edit.draft.UndoAction;
import com.kuaishou.edit.draft.AssetArrangeAction;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetArrangeAction$b;
import com.kuaishou.edit.draft.Asset;
import wba.n0;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.AssetTransition;
import com.kuaishou.edit.draft.AssetTransitionActionData$b;
import com.kuaishou.edit.draft.AssetTransitionActionData;

public final class ReorderPanelOpenUndoAction extends EditDraftAction	// class@000e04
{

    public void ReorderPanelOpenUndoAction(){
       super(false, 1, null);
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReorderPanelOpenUndoAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = a.c(p0);
       a uoa1 = a.a.u(p0);
       GeneratedMessageLite$Builder uBuilder = uoa1.b();
       a.o(uBuilder, "undoDraft.append\(\)");
       AssetArrangeAction$b uob = uBuilder.instance.getAssetArrangeAction().toBuilder();
       int i = uoa.p();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          Asset uAsset = n0.d(uoa.y(i1), uoa, false, uoa1, false);
          a.o(uAsset, "cloneAssetForNewClip\(cur¡­ false, undoDraft, false\)");
          uob.copyOnWrite();
          uob.instance.addOriginalAssets(uAsset);
          n0.b(uAsset, uoa1, uoa);
          GeneratedMessageLite$Builder uBuilder1 = uoa.n(i1);
          a.o(uBuilder1, "assetDraft.getBuilder\(i\)");
          AssetTransitionActionData$b uob1 = AssetTransitionActionData.newBuilder();
          uob1.b(i1);
          uob1.a(uBuilder1.getTransition());
          uob.copyOnWrite();
          uob.instance.addOriginalAssetTransitions(uob1);
       }
       uBuilder.copyOnWrite();
       uBuilder.instance.setAssetArrangeAction(uob);
       return;
    }
}
