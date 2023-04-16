package com.yxcorp.gifshow.v3.editor.music_v2.action.AutoMusicProgressAction;
import xvc.b;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.v3.editor.music_v2.action.AutoMusicStatus;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class AutoMusicProgressAction extends b	// class@001060
{
    public final Music music;
    public final int progress;
    public final AutoMusicStatus status;

    public void AutoMusicProgressAction(Music p0,int p1,AutoMusicStatus p2){
       a.p(p0, "music");
       a.p(p2, "status");
       super();
       this.music = p0;
       this.progress = p1;
       this.status = p2;
    }
    public final Music getMusic(){
       return this.music;
    }
    public final int getProgress(){
       return this.progress;
    }
    public final AutoMusicStatus getStatus(){
       return this.status;
    }
}
