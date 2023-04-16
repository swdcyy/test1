package com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationUpdateIdentifyAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.h;
import java.lang.Integer;
import wba.l0;
import faa.a;
import w46.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import java.lang.Iterable;

public final class DecorationUpdateIdentifyAction extends EditSdkAction	// class@000b77
{
    public final List identifier;
    public final int layerIndex;

    public void DecorationUpdateIdentifyAction(int p0,List p1){
       a.p(p1, "identifier");
       super();
       this.layerIndex = p0;
       this.identifier = p1;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationUpdateIdentifyAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          DecorationUpdateIdentifyAction tlayerIndex = this.layerIndex;
          DecorationUpdateIdentifyAction tidentifier = this.identifier;
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(tlayerIndex), uoa, tidentifier, null, h.class, "31")) {
             a.p(uoa, "textDraft");
             a.p(tidentifier, "identifier");
             if (uoa.z().size()) {
                int i = l0.a.a(tlayerIndex, uoa);
                if (i < 0) {
                   Object[] objArray = new Object[0];
                   a.D().t("TextDraftUtil", "updateTextFont textDraftPosition is invalid", objArray);
                }else {
                   GeneratedMessageLite$Builder uBuilder = uoa.n(i);
                   a.o(uBuilder, "textDraft.getBuilder\(index\)");
                   StickerResult$b uob = uBuilder.getResult().toBuilder();
                   uob.c();
                   uob.a(tidentifier);
                   uob.build();
                   uBuilder.j(uob);
                   uBuilder.build();
                }
             }
          }
          uoa.f();
       }
       return;
    }
}
