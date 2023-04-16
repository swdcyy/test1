package com.yxcorp.gifshow.v3.editor.music_v2.action.CollectMusicAction;
import xvc.b;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class CollectMusicAction extends b	// class@001066
{
    public final Music music;
    public final boolean willCollect;

    public void CollectMusicAction(Music p0,boolean p1){
       a.p(p0, "music");
       super();
       this.music = p0;
       this.willCollect = p1;
    }
    public final Music getMusic(){
       return this.music;
    }
    public final boolean getWillCollect(){
       return this.willCollect;
    }
}
