package com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineDetachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import hba.a;
import jba.a;

public final class DecorationTimelineDetachAction extends EditSdkAction	// class@000b84
{
    public final boolean isSave;
    public final boolean isSticker;
    public final boolean isSubtitle;

    public void DecorationTimelineDetachAction(boolean p0,boolean p1,boolean p2){
       super();
       this.isSave = p0;
       this.isSubtitle = p1;
       this.isSticker = p2;
    }
    public void DecorationTimelineDetachAction(boolean p0,boolean p1,boolean p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = true;
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public final boolean isSave(){
       return this.isSave;
    }
    public final boolean isSticker(){
       return this.isSticker;
    }
    public final boolean isSubtitle(){
       return this.isSubtitle;
    }
    public void performAction(c p0,c p1){
       a uoa;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationTimelineDetachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       if (this.isSubtitle != null) {
          return;
       }
       if (this.isSticker != null) {
          uoa = p0.U0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.stickerDraft ?: return");
             if (this.isSave != null) {
                uoa.f();
             }else {
                uoa.j();
             }
          }else {
             return;
          }
       }else {
          a uoa1 = p0.W0();
          if (uoa1 != null) {
             a.o(uoa1, "workspaceDraft.textDraft?: return");
             uoa = p0.Z0();
             if (this.isSave != null) {
                uoa1.f();
                if (uoa != null && uoa.D() == true) {
                   uoa.f();
                }
             }else {
                uoa1.j();
                if (uoa != null && uoa.D() == true) {
                   uoa.j();
                }
             }
          }
       }
       return;
    }
}
