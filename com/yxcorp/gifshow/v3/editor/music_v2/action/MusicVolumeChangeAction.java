package com.yxcorp.gifshow.v3.editor.music_v2.action.MusicVolumeChangeAction;
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
import yaa.c;
import com.kuaishou.edit.draft.Music$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.Float;
import iba.a;

public final class MusicVolumeChangeAction extends EditSdkAction	// class@001083
{
    public final String TAG;
    public final int progress;

    public void MusicVolumeChangeAction(int p0){
       super();
       this.progress = p0;
       this.TAG = "MusicVolumeChangeAction";
    }
    public final int getProgress(){
       return this.progress;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicVolumeChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       float f = (float)this.progress / (float)200;
       if (MusicDraftUtilsKt.q(p0)) {
          this.saveThemeMusicVolume(p0, f);
       }else {
          p0 = p0.J0();
          if (p0 != null) {
             a.o(p0, "it");
             Music$b uob = MusicDraftUtilsKt.f(p0);
             if (uob == null) {
                uob = p0.b();
             }
             uob.p(f);
          }
       }
       return;
    }
    public final void saveThemeMusicVolume(c p0,float p1){
       MusicVolumeChangeAction musicVolumeC = MusicVolumeChangeAction.class;
       if (PatchProxy.isSupport(musicVolumeC) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, musicVolumeC, "2")) {
          return;
       }
       a uoa = p0.X0();
       a.o(uoa, "workspaceDraft.themeDraft");
       uoa = uoa.f0();
       if (uoa != null) {
          if (uoa.E()) {
             return;
          }else {
             uoa.c0();
             GeneratedMessageLite$Builder uBuilder = uoa.k();
             a.o(uBuilder, "themeMusicDraft.ensureFirstBuilder\(\)");
             uBuilder.p(p1);
             uoa.f();
          }
       }
       return;
    }
}
