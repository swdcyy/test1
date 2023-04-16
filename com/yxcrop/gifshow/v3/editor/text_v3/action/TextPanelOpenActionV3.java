package com.yxcrop.gifshow.v3.editor.text_v3.action.TextPanelOpenActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import hba.a;
import haa.a;
import wba.l0;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;

public final class TextPanelOpenActionV3 extends EditSdkAction	// class@000c05
{
    public final int layerIndex;

    public void TextPanelOpenActionV3(int p0){
       super();
       this.layerIndex = p0;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelOpenActionV3.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = a.r(p0);
       int i = l0.a.a(this.layerIndex, uoa);
       String str = "TextPanelOpenActionV3";
       if (i < 0) {
          PostUtils.D(str, "performAction", new RuntimeException("draft is empty"));
          return;
       }else {
          Object[] objArray = new Object[0];
          a.D().w(str, "performAction layerIndex:"+this.layerIndex+", draftPosition:"+i, objArray);
          GeneratedMessageLite$Builder uBuilder = uoa.n(i);
          a.o(uBuilder, "textDraft.getBuilder\(draftPosition\)");
          StickerResult$b uob = uBuilder.getResult().toBuilder();
          uob.j(true);
          uoa.n(i).j(uob);
          return;
       }
    }
}
