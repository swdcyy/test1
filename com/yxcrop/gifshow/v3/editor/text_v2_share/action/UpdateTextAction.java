package com.yxcrop.gifshow.v3.editor.text_v2_share.action.UpdateTextAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.h;
import java.lang.Integer;
import wba.l0;
import faa.a;
import w46.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import com.google.protobuf.GeneratedMessageLite;

public final class UpdateTextAction extends EditDraftAction	// class@000b81
{
    public final float additionalScale;
    public final boolean commit;
    public final int layerIndex;
    public final float scale;
    public final String text;

    public void UpdateTextAction(int p0,String p1,float p2,float p3,boolean p4){
       a.p(p1, "text");
       super(false, 1, null);
       this.layerIndex = p0;
       this.text = p1;
       this.scale = p2;
       this.additionalScale = p3;
       this.commit = p4;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UpdateTextAction.class, "1")) {
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
          UpdateTextAction tlayerIndex = this.layerIndex;
          UpdateTextAction ttext = this.text;
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(tlayerIndex), uoa, ttext, null, h.class, "29")) {
             a.p(uoa, "textDraft");
             a.p(ttext, "text");
             int i = l0.a.a(tlayerIndex, uoa);
             if (i < 0) {
                Object[] objArray = new Object[false];
                a.D().t("TextDraftUtil", "updateDraftTextByIndex textDraftPosition is invalid", objArray);
             }else {
                GeneratedMessageLite$Builder uBuilder = uoa.n(i);
                a.o(uBuilder, "textDraft.getBuilder\(index\)");
                uBuilder.m(ttext);
                uBuilder.build();
             }
          }
          h.t(this.layerIndex, false, uoa, this.scale, this.additionalScale);
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
