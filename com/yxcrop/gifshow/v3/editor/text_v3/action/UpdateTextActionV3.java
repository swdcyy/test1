package com.yxcrop.gifshow.v3.editor.text_v3.action.UpdateTextActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wba.l0;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import xod.d;

public final class UpdateTextActionV3 extends EditSdkAction	// class@000c08
{
    public final boolean commit;
    public final int layerIndex;
    public final String text;
    public final int textLayerIndex;

    public void UpdateTextActionV3(String p0,int p1,int p2,boolean p3){
       a.p(p0, "text");
       super();
       this.text = p0;
       this.layerIndex = p1;
       this.textLayerIndex = p2;
       this.commit = p3;
    }
    public void UpdateTextActionV3(String p0,int p1,int p2,boolean p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final String getText(){
       return this.text;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UpdateTextActionV3.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("TextTemplateChangeActionV3", "performAction layerIndex:"+this.layerIndex+", textLayerIndex:"+this.textLayerIndex+", commit:"+this.commit, objArray);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          int i = l0.a.a(this.layerIndex, uoa);
          if (i < 0) {
             PostUtils.D("TextTemplateChangeActionV3", "performAction", new RuntimeException("draft is empty"));
             return;
          }else {
             GeneratedMessageLite$Builder uBuilder = uoa.n(i);
             a.o(uBuilder, "textDraft.getBuilder\(draftPosition\)");
             uBuilder.m(this.text);
             d.a.i(this.layerIndex, uoa);
             if (this.commit != null) {
                uoa.f();
             }
          }
       }
       return;
    }
}
