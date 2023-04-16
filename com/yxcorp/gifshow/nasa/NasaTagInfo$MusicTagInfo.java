package com.yxcorp.gifshow.nasa.NasaTagInfo$MusicTagInfo;
import java.io.Serializable;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class NasaTagInfo$MusicTagInfo implements Serializable	// class@0020d1
{
    public final Music music;
    public final long tagMusicStartTime;

    public void NasaTagInfo$MusicTagInfo(Music p0,long p1){
       a.p(p0, "music");
       super();
       this.music = p0;
       this.tagMusicStartTime = p1;
    }
    public void NasaTagInfo$MusicTagInfo(Music p0,long p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public final Music getMusic(){
       return this.music;
    }
    public final long getTagMusicStartTime(){
       return this.tagMusicStartTime;
    }
}
