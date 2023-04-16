package com.yxcorp.gifshow.v3.editor.music_v2.action.RequestMusicDetailAction;
import xvc.b;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class RequestMusicDetailAction extends b	// class@00108a
{
    public final Music music;

    public void RequestMusicDetailAction(Music p0){
       a.p(p0, "music");
       super();
       this.music = p0;
    }
    public final Music getMusic(){
       return this.music;
    }
}
