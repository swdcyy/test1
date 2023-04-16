package com.yxcorp.gifshow.v3.editor.music_v2.action.MusicDetachAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import urc.e;
import osc.b$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yaa.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import lsc.b0;

public final class MusicDetachAction extends EditDraftAction	// class@001078
{
    public final b$a audioRecordInfo;
    public final e rootState;

    public void MusicDetachAction(e p0,b$a p1){
       a.p(p0, "rootState");
       super(false, 1, null);
       this.rootState = p0;
       this.audioRecordInfo = p1;
    }
    public void MusicDetachAction(e p0,b$a p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final b$a getAudioRecordInfo(){
       return this.audioRecordInfo;
    }
    public final e getRootState(){
       return this.rootState;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicDetachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       p1 = p0.J0();
       if (p1 != null && p1.D() == true) {
          p1 = p0.J0();
          if (p1 != null) {
             p1.f();
          }
       }
       b0.b(p0, this.rootState, this.audioRecordInfo);
       return;
    }
}
