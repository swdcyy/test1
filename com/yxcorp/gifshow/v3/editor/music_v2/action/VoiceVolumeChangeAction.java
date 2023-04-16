package com.yxcorp.gifshow.v3.editor.music_v2.action.VoiceVolumeChangeAction;
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

public final class VoiceVolumeChangeAction extends EditSdkAction	// class@001091
{
    public final boolean isTrackingEnd;
    public final int progress;

    public void VoiceVolumeChangeAction(int p0,boolean p1){
       super();
       this.progress = p0;
       this.isTrackingEnd = p1;
    }
    public final int getProgress(){
       return this.progress;
    }
    public final boolean isTrackingEnd(){
       return this.isTrackingEnd;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoiceVolumeChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       MusicDraftUtilsKt.c(p0, this.progress, MusicDraftUtilsKt.n(p0), true);
       return;
    }
}
