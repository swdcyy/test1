package com.yxcorp.gifshow.v3.editor.music_v2.action.MusicUnSelectedAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicUnSelectedAction$a;
import nsd.u;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import yaa.c;
import iba.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Theme;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Music$Type;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicUnSelectedAction$b;
import laa.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Theme$b;
import com.kuaishou.edit.draft.Workspace$Source;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import vaa.a;

public final class MusicUnSelectedAction extends EditSdkAction	// class@001082
{
    public final SelectSource lastMusicSource;
    public final int lastVoiceProgress;
    public static final MusicUnSelectedAction$a Companion;

    static {
       MusicUnSelectedAction.Companion = new MusicUnSelectedAction$a(null);
    }
    public void MusicUnSelectedAction(int p0,SelectSource p1){
       a.p(p1, "lastMusicSource");
       super();
       this.lastVoiceProgress = p0;
       this.lastMusicSource = p1;
    }
    public final SelectSource getLastMusicSource(){
       return this.lastMusicSource;
    }
    public final int getLastVoiceProgress(){
       return this.lastVoiceProgress;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicUnSelectedAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       p1 = p0.J0();
       if (p1 != null) {
          a.o(p1, "workspaceDraft.musicDraft ?: return");
          a uoa = p0.X0();
          a.o(uoa, "themeDraft");
          Theme theme = uoa.v();
          boolean b = true;
          boolean b1 = (theme != null && (theme.getUsingMusics() && (theme.getMusicsCount() > 0 && (theme.getMusics(0) != null && p0.a1() == Workspace$Type.PHOTO_MOVIE))))? true: false;
          if (b1) {
             p1 = uoa.f0();
             if (p1 != null && !p1.E()) {
                p1.c0();
                p1.d();
                p1.f();
             }
          }else {
             MusicDraftUtilsKt musicDraftUt = MusicDraftUtilsKt.class;
             if (!PatchProxy.isSupport(musicDraftUt) || !PatchProxy.applyVoidTwoRefs(Boolean.FALSE, p1, null, musicDraftUt, "2")) {
                a.p(p1, "musicDraft");
                if (!p1.E()) {
                   int i = p1.p();
                   i = i - 1;
                   while (i >= 0) {
                      GeneratedMessageLite generatedMes = p1.y(i);
                      a.o(generatedMes, "musicDraft.getMessage\(i\)");
                      Music$Type type = generatedMes.getType();
                      if (type != Music$Type.MEDIA_SCENE_IMPORT && type != Music$Type.RECORD) {
                         p1.V(i);
                      }
                   }
                }
             }
          }
          if (p0.a1() == Workspace$Type.PHOTO_MOVIE) {
             p1 = uoa.f0();
             if (p1 != null && !p1.E()) {
                p1.c0();
                GeneratedMessageLite$Builder uBuilder = uoa.l(MusicUnSelectedAction$b.a);
                a.o(uBuilder, "themeDraft.ensureFirstBu¡­gFilters = true\n        }");
                uBuilder.c(b);
                p1.f();
             }
          }
          if (p0.T0() == Workspace$Source.REEDIT) {
             MusicDraftUtilsKt.d(p0, 100, false, false, 8, null);
          }
          this.resumeThemeVolume(p0);
          Object[] objArray = new Object[0];
          a.D().w("MusicUnSelectedAction", "saveNoneMusic isNowMusicFromPhotoMovie:"+b1+",workspaceType:"+p0.a1(), objArray);
       }
       return;
    }
    public final void resumeThemeVolume(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicUnSelectedAction.class, "2")) {
          return;
       }
       boolean b = DraftUtils.G(p0.F0());
       if (DraftUtils.H(p0.X0()) || b) {
          MusicDraftUtilsKt.d(p0, this.lastVoiceProgress, MusicDraftUtilsKt.n(p0), false, 8, null);
       }
       return;
    }
}
