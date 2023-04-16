package com.yxcorp.gifshow.v3.editor.music_v2.action.ClipMusicAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import android.content.Intent;
import src.b;
import urc.b;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.music.Music;
import trc.t0;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;
import com.kuaishou.edit.draft.Workspace$Type;
import iba.a;
import com.yxcorp.gifshow.v3.editor.music_v2.action.ClipMusicAction$a;
import laa.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Theme$b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import ekd.j0;
import com.kuaishou.android.model.music.MusicType;
import com.kwai.feature.post.api.music.data.MusicSource;
import lsc.b0;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;

public final class ClipMusicAction extends EditSdkAction	// class@001065
{
    public final Intent data;
    public final int lastMusicProgress;
    public final b lyricInfo;
    public final b musicItem;
    public final int requestDuration;
    public final double sdkPlayerDuration;
    public final SelectSource selectSource;

    public void ClipMusicAction(Intent p0,b p1,int p2,int p3,double p4,b p5,SelectSource p6){
       a.p(p0, "data");
       a.p(p1, "musicItem");
       a.p(p6, "selectSource");
       super();
       this.data = p0;
       this.musicItem = p1;
       this.lastMusicProgress = p2;
       this.requestDuration = p3;
       this.sdkPlayerDuration = p4;
       this.lyricInfo = p5;
       this.selectSource = p6;
    }
    public final void doClipMusic(c p0,b p1,MusicClipInfo p2){
       ClipMusicAction uClipMusicAc = this;
       MusicClipInfo musicClipInf = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ClipMusicAction.class, "2")) {
          return;
       }
       musicClipInf.mLoudness = p1.b().mLoudness;
       musicClipInf.a = p1.b().mMusicBeatsString;
       p1.b().mClipStartMills = musicClipInf.mClipStartMills;
       MusicClipInfo musicClipInf1 = musicClipInf;
       MusicDraftUtilsKt.u(p1, p0, uClipMusicAc.lastMusicProgress, uClipMusicAc.requestDuration, false, false, p2, uClipMusicAc.sdkPlayerDuration, uClipMusicAc.lyricInfo, null, false, uClipMusicAc.selectSource, 1536, null);
       boolean b = false;
       if (p0.a1() == Workspace$Type.PHOTO_MOVIE) {
          a uoa = p0.X0();
          if (uoa != null) {
             GeneratedMessageLite$Builder uBuilder = uoa.l(ClipMusicAction$a.a);
             a.o(uBuilder, "it.ensureFirstBuilder { ¡­gFilters = true\n        }");
             uBuilder.c(b);
          }
       }
       Object[] objArray = new Object[b];
       a.D().w("AddOrClipMusicAction", "doClipMusic music: "+p1.b()+", musicClipInfo:"+musicClipInf1, objArray);
       return;
    }
    public final MusicClipInfo getClipInfo(Music p0){
       String obj = PatchProxy.applyOneRefs(p0, this, ClipMusicAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j0.f(this.data, "music_meta");
       MusicClipInfo musicClipInf = (p0.mType == MusicType.LOCAL)? b0.e(this.data, MusicSource.LOCAL, MusicDraftUtilsKt.g(), obj, true): b0.e(this.data, MusicSource.CLOUD_MUSIC, "online_music", obj, true);
       return musicClipInf;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipMusicAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       ClipMusicAction tmusicItem = this.musicItem;
       this.doClipMusic(p0, tmusicItem, this.getClipInfo(tmusicItem.b()));
       return;
    }
}
