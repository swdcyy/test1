package com.yxcrop.gifshow.v3.editor.sticker_v2.action.CenterTagStickerAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import eba.a;
import haa.a;
import wba.l0;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;

public final class CenterTagStickerAction extends EditSdkAction	// class@000a4e
{
    public final float draftScale;
    public final int elementLayerIndex;

    public void CenterTagStickerAction(int p0,float p1){
       super();
       this.elementLayerIndex = p0;
       this.draftScale = p1;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CenterTagStickerAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = a.q(p0);
       int i = l0.a.a(this.elementLayerIndex, uoa);
       if (i >= 0) {
          boolean b = uoa.D();
          if (!uoa.D()) {
             uoa.c0();
          }
          GeneratedMessageLite$Builder uBuilder = uoa.n(i);
          a.o(uBuilder, "stickerDraft.getBuilder\(index\)");
          StickerResult$b uob = uBuilder.getResult().toBuilder();
          a.o(uob, "resultBuilder");
          uob.f(0x3f000000);
          uob.g(0x3f000000);
          uob.s(0);
          uob.t(this.draftScale);
          uBuilder.i(uob.build());
          if (!b) {
             uoa.f();
          }
       }
       return;
    }
}
