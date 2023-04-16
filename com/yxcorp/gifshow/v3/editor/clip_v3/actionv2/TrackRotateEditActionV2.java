package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.TrackRotateEditActionV2;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import xvc.b;
import maa.a;
import haa.a;
import kba.a;
import yoc.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset$b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.UndoAction$b;
import com.kuaishou.edit.draft.AssetRotateAction$b;
import com.kuaishou.edit.draft.AssetRotateAction;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.v3.editor.k;

public final class TrackRotateEditActionV2 extends EditSdkAction	// class@000dbf
{
    public final int mTargetIndex;
    public final boolean rotateButtonEnable;

    public void TrackRotateEditActionV2(boolean p0,int p1){
       super();
       this.rotateButtonEnable = p0;
       this.mTargetIndex = p1;
    }
    public final int getMTargetIndex(){
       return this.mTargetIndex;
    }
    public final boolean getRotateButtonEnable(){
       return this.rotateButtonEnable;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TrackRotateEditActionV2.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       if (this.rotateButtonEnable == null) {
          this.setActionCode(11);
          return;
       }else {
          TrackRotateEditActionV2 tmTargetInde = this.mTargetIndex;
          f.a.k(tmTargetInde);
          GeneratedMessageLite$Builder uBuilder = a.c(p0).n(tmTargetInde);
          a.o(uBuilder, "assetDraft.getBuilder\(assetDraftIndex\)");
          int rotate = uBuilder.getRotate();
          Object[] objArray = new Object[0];
          a.D().w("TrackRotateEditActionV2", "performAction assetDraftIndex:"+tmTargetInde+", originRotate:"+rotate, objArray);
          uBuilder.r((((uBuilder.getRotate() - 90) + 360) % 360));
          GeneratedMessageLite$Builder uBuilder1 = a.a.u(p0).b();
          a.o(uBuilder1, "undoDraft.append\(\)");
          AssetRotateAction$b uob = AssetRotateAction.newBuilder();
          uob.a(tmTargetInde);
          uob.copyOnWrite();
          uob.instance.setRotationDeg(rotate);
          uBuilder1.b(uob.build());
          k.f().a(true);
          return;
       }
    }
}
