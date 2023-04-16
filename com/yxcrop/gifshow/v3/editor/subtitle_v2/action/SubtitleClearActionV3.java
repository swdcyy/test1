package com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearActionV3;
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
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.h;

public final class SubtitleClearActionV3 extends EditSdkAction	// class@000adc
{
    public final boolean changeTimelinePanelState;
    public final boolean commit;
    public final boolean enablePlaying;

    public void SubtitleClearActionV3(){
       super(false, false, false, 7, null);
    }
    public void SubtitleClearActionV3(boolean p0,boolean p1,boolean p2){
       super();
       this.commit = p0;
       this.changeTimelinePanelState = p1;
       this.enablePlaying = p2;
    }
    public void SubtitleClearActionV3(boolean p0,boolean p1,boolean p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = true;
       }
       if (p3 & 0x02) {
          p1 = false;
       }
       if (p3 & 0x04) {
          p2 = true;
       }
       super(p0, p1, p2);
       return;
    }
    public final boolean getChangeTimelinePanelState(){
       return this.changeTimelinePanelState;
    }
    public final boolean getCommit(){
       return this.commit;
    }
    public final boolean getEnablePlaying(){
       return this.enablePlaying;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubtitleClearActionV3.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("SubtitleClearActionV3", "performAction commit:"+this.commit+", changeTimelinePanelState:"+this.changeTimelinePanelState+", enablePlaying:"+this.enablePlaying, objArray);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          h.c(uoa);
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
