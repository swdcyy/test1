package com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleAttachAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.lang.String;
import java.lang.Integer;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;

public final class SubtitleAttachAction extends EditDraftAction	// class@000ad7
{
    public final Integer lastAlignType;
    public final Integer lastColor;
    public final String lastFontFileName;
    public final String lastMaterialId;

    public void SubtitleAttachAction(){
       super(null, null, null, null, 15, null);
    }
    public void SubtitleAttachAction(String p0,String p1,Integer p2,Integer p3){
       super(false, 1, null);
       this.lastMaterialId = p0;
       this.lastFontFileName = p1;
       this.lastColor = p2;
       this.lastAlignType = p3;
    }
    public void SubtitleAttachAction(String p0,String p1,Integer p2,Integer p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = null;
       }
       if (p4 & 0x02) {
          p1 = null;
       }
       if (p4 & 0x04) {
          p2 = null;
       }
       if (p4 & 0x08) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final Integer getLastAlignType(){
       return this.lastAlignType;
    }
    public final Integer getLastColor(){
       return this.lastColor;
    }
    public final String getLastFontFileName(){
       return this.lastFontFileName;
    }
    public final String getLastMaterialId(){
       return this.lastMaterialId;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubtitleAttachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
       }
       return;
    }
}
