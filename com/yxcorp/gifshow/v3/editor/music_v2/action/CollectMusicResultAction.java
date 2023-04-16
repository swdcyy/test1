package com.yxcorp.gifshow.v3.editor.music_v2.action.CollectMusicResultAction;
import xvc.b;
import com.kuaishou.android.model.music.Music;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class CollectMusicResultAction extends b	// class@001067
{
    public final Throwable error;
    public final boolean isCollected;
    public final Music music;

    public void CollectMusicResultAction(Music p0,boolean p1,Throwable p2){
       a.p(p0, "music");
       super();
       this.music = p0;
       this.isCollected = p1;
       this.error = p2;
    }
    public void CollectMusicResultAction(Music p0,boolean p1,Throwable p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public final Throwable getError(){
       return this.error;
    }
    public final Music getMusic(){
       return this.music;
    }
    public final boolean isCollected(){
       return this.isCollected;
    }
}
