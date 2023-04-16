package com.yxcorp.gifshow.v3.editor.music_v2.action.MuteVoiceAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;

public final class MuteVoiceAction extends EditSdkAction	// class@001084
{
    public final int lastProgress;
    public final boolean mute;

    public void MuteVoiceAction(boolean p0,int p1){
       super();
       this.mute = p0;
       this.lastProgress = p1;
    }
    public final int getLastProgress(){
       return this.lastProgress;
    }
    public final boolean getMute(){
       return this.mute;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MuteVoiceAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       int i = (this.mute != null)? 0: this.lastProgress;
       MusicDraftUtilsKt.c(p0, i, MusicDraftUtilsKt.n(p0), true);
       return;
    }
}
