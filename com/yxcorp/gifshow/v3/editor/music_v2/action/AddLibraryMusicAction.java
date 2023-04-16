package com.yxcorp.gifshow.v3.editor.music_v2.action.AddLibraryMusicAction;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicSelectedAction;
import com.kuaishou.android.model.music.Music;
import urc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import src.o;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import src.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import trc.t0;

public final class AddLibraryMusicAction extends MusicSelectedAction	// class@00105e
{
    public final long clipStartMills;
    public final b draftLyricInfo;
    public final int lastMusicProgress;
    public final int requestDuration;
    public final double sdkPlayerDuration;
    public final boolean shouldMuteVoice;

    public void AddLibraryMusicAction(Music p0,int p1,long p2,int p3,double p4,b p5,boolean p6){
       int i = this;
       a.p(p0, "music");
       super(new o(p0), p1, p3, SelectSource.MUSIC_LIBRARY, p4, p5, p6);
       i.lastMusicProgress = p1;
       i.clipStartMills = p2;
       i.requestDuration = p3;
       i.sdkPlayerDuration = p4;
       i.draftLyricInfo = p5;
       i.shouldMuteVoice = p6;
    }
    public void performAction(c p0,c p1){
       Object obj = this;
       Object obj1 = p0;
       b obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, AddLibraryMusicAction.class, "1")) {
          return;
       }
       String str = "workspaceDraft";
       a.p(obj1, str);
       a.p(obj2, "store");
       obj2 = this.getMusicItem();
       AddLibraryMusicAction lastMusicPro = obj.lastMusicProgress;
       AddLibraryMusicAction clipStartMil = obj.clipStartMills;
       AddLibraryMusicAction requestDurat = obj.requestDuration;
       AddLibraryMusicAction sdkPlayerDur = obj.sdkPlayerDuration;
       AddLibraryMusicAction draftLyricIn = obj.draftLyricInfo;
       MusicDraftUtilsKt musicDraftUt = MusicDraftUtilsKt.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(musicDraftUt)) {
          Object[] objArray = new Object[]{obj1,obj2,Integer.valueOf(lastMusicPro),Long.valueOf(clipStartMil),Integer.valueOf(requestDurat),Double.valueOf(sdkPlayerDur),draftLyricIn};
          if (PatchProxy.applyVoid(objArray, null, musicDraftUt, "7")) {
          label_00be :
             if (this.getMuteOriginVoice()) {
                this.muteThemeVolume(p0);
             }
             return;
          }
       }
       a.p(obj1, str);
       a.p(obj2, "musicItem");
       Music music = obj2.b();
       if (clipStartMil) {
          music.mClipStartMills = clipStartMil;
       }
       if (TextUtils.x(music.mId) && !TextUtils.x(music.mPath)) {
          music.mId = music.mPath;
       }
       VideoContext videoContext = p0.d1();
       a.o(videoContext, "workspaceDraft.videoContext");
       if (music.isFavorited()) {
          videoContext.z0(i);
       }else {
          videoContext.z0(0);
       }
       MusicDraftUtilsKt.u(obj2, p0, lastMusicPro, requestDurat, false, 0, 0, sdkPlayerDur, draftLyricIn, 0, 0, SelectSource.MUSIC_LIBRARY, 1600, 0);
       goto label_00be ;
    }
}
