package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderUpdateVideoWorkspaceDraftAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import maa.a;
import gpc.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import com.kuaishou.edit.draft.AssetTransition;

public final class ReorderUpdateVideoWorkspaceDraftAction extends EditSdkAction	// class@000e07
{
    public final boolean isApplyAll;
    public final TransitionEffect transitionEffect;

    public void ReorderUpdateVideoWorkspaceDraftAction(boolean p0,TransitionEffect p1){
       a.p(p1, "transitionEffect");
       super();
       this.isApplyAll = p0;
       this.transitionEffect = p1;
    }
    public final TransitionEffect getTransitionEffect(){
       return this.transitionEffect;
    }
    public final boolean isApplyAll(){
       return this.isApplyAll;
    }
    public void performAction(c p0,c p1){
       Asset$b uob1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReorderUpdateVideoWorkspaceDraftAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.o0();
       if (uoa != null) {
          ReorderUpdateVideoWorkspaceDraftAction tisApplyAll = this.isApplyAll;
          ReorderUpdateVideoWorkspaceDraftAction ttransitionE = this.transitionEffect;
          a.o(uoa, "it");
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(tisApplyAll), ttransitionE, uoa, null, a.class, "1")) {
             a.p(uoa, "assetDraft");
             int i = uoa.p();
             int i1 = 0;
             while (i1 < i) {
                GeneratedMessageLite$Builder uBuilder = uoa.n(i1);
                a.o(uBuilder, "assetDraft.getBuilder\(i\)");
                Asset$b uob = null;
                if (i1 > 0) {
                   int i2 = i1 - 1;
                   uob1 = uoa.n(i2);
                }else {
                   uob1 = uob;
                }
                i1 = i1 + 1;
                if (i1 < i) {
                   uob = uoa.n(i1);
                }
                int i3 = 1;
                a uoa1 = (uob1 == null && uob == null)? 1: null;
                int i4 = (uob == null)? 1: 0;
                a uoa2 = (uob != null && !a.a.a(uBuilder, uob))? 1: null;
                if (uoa2 || (!uoa1 && !i4)) {
                   i3 = 0;
                }
             label_0093 :
                boolean b = a.a.a(uBuilder, uob);
                if (i3) {
                   uBuilder.v(TransitionEffect.Companion.b().toAssetTransition());
                }else if(b && (tisApplyAll != null && ttransitionE != null)){
                   uBuilder.v(ttransitionE.toAssetTransition());
                }
             }
             if (!uoa.D()) {
                uoa.c0();
             }
          }
       }
       return;
    }
}
