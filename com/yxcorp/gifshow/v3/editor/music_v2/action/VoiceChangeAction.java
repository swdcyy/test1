package com.yxcorp.gifshow.v3.editor.music_v2.action.VoiceChangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import csc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;

public final class VoiceChangeAction extends EditSdkAction	// class@001090
{
    public final b info;

    public void VoiceChangeAction(b p0){
       a.p(p0, "info");
       super();
       this.info = p0;
    }
    public final b getInfo(){
       return this.info;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoiceChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       MusicDraftUtilsKt.b(p0, this.info);
       return;
    }
}
