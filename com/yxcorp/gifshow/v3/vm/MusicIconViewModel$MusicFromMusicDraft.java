package com.yxcorp.gifshow.v3.vm.MusicIconViewModel$MusicFromMusicDraft;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.edit.draft.Music;
import yaa.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wba.u;
import com.kuaishou.edit.draft.Song;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import com.kuaishou.webkit.URLUtil;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Number;
import com.google.protobuf.GeneratedMessageLite;

public final class MusicIconViewModel$MusicFromMusicDraft extends Music	// class@001625
{
    public Music draftMusic;
    public final c musicDraft;

    public void MusicIconViewModel$MusicFromMusicDraft(Music p0,c p1){
       a.p(p0, "draftMusic");
       a.p(p1, "musicDraft");
       super();
       this.draftMusic = p0;
       this.musicDraft = p1;
       Song song = u.a.r(p0);
       this.mName = song.getTitle();
       String coverFile = song.getCoverFile();
       File uFile = DraftFileManager.E().B(coverFile, p1);
       if (uFile != null) {
          this.mCoverPath = uFile.getAbsolutePath();
       }else if(URLUtil.isNetworkUrl(coverFile)){
          this.mAvatarUrl = coverFile;
       }else if(URLUtil.isNetworkUrl(song.getAvatarUrl())){
          this.mAvatarUrl = song.getAvatarUrl();
       }else {
          Object[] objArray = new Object[0];
          a.D().A("MusicIconViewModel", "draft music cannot find cover file: "+coverFile, objArray);
       }
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicIconViewModel$MusicFromMusicDraft.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       MusicIconViewModel$MusicFromMusicDraft musicFromMus = MusicIconViewModel$MusicFromMusicDraft.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (a.g(musicFromMus, class) ^ true) {
          return false;
       }else if(!super.equals(p0)){
          return false;
       }else {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.vm.MusicIconViewModel.MusicFromMusicDraft");
          if (a.g(this.draftMusic, p0.draftMusic) ^ true) {
             return false;
          }else {
             return true;
          }
       }
    }
    public final Music getDraftMusic(){
       return this.draftMusic;
    }
    public final c getMusicDraft(){
       return this.musicDraft;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, MusicIconViewModel$MusicFromMusicDraft.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((super.hashCode() * 31) + this.draftMusic.hashCode());
    }
    public final void setDraftMusic(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicIconViewModel$MusicFromMusicDraft.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.draftMusic = p0;
       return;
    }
}
