package com.yxcorp.gifshow.v3.editor.music_v2.action.LoadLibraryMusicAction;
import xvc.b;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class LoadLibraryMusicAction extends b	// class@00106c
{
    public final long clipStartMills;
    public final Music music;

    public void LoadLibraryMusicAction(Music p0,long p1){
       a.p(p0, "music");
       super();
       this.music = p0;
       this.clipStartMills = p1;
    }
    public final long getClipStartMills(){
       return this.clipStartMills;
    }
    public final Music getMusic(){
       return this.music;
    }
}
