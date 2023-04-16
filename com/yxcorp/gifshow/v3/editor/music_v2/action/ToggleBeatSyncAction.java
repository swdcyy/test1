package com.yxcorp.gifshow.v3.editor.music_v2.action.ToggleBeatSyncAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.kuaishou.android.model.music.Music;
import yaa.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kuaishou.edit.draft.Music$b;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;
import xvc.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcorp.gifshow.edit.draft.model.c;

public final class ToggleBeatSyncAction extends EditSdkAction	// class@00108c
{
    public final boolean isSwitchOn;
    public final Music music;

    public void ToggleBeatSyncAction(boolean p0,Music p1){
       super();
       this.isSwitchOn = p0;
       this.music = p1;
    }
    public final void doSave(Music p0,c p1,c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ToggleBeatSyncAction.class, "2")) {
          return;
       }
       int i = (this.isSwitchOn != null)? 1: 2;
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("music_beat_sync_state", i);
       g.a(uEditor);
       Music$b uob = MusicDraftUtilsKt.f(p1);
       if (uob != null) {
          MusicDraftUtilsKt.v(p0, uob, p2);
       }
       return;
    }
    public final Music getMusic(){
       return this.music;
    }
    public final boolean isSwitchOn(){
       return this.isSwitchOn;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ToggleBeatSyncAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       if (this.music == null) {
          return;
       }
       p1 = p0.J0();
       if (p1 != null) {
          a.o(p1, "workspaceDraft.musicDraft ?: return");
          if (!p1.D()) {
             p1.c0();
             this.doSave(this.music, p1, p0);
             p1.f();
          }else {
             this.doSave(this.music, p1, p0);
          }
       }
       return;
    }
}
