package com.yxcorp.gifshow.v3.editor.music_v2.network.RapConfigExtra;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class RapConfigExtra implements Serializable	// class@0010b0
{
    public final long fullOnlineTime;
    public final String lyricStyleId;
    public final int musicStyleId;
    public final int resourceVersion;

    public void RapConfigExtra(){
       super();
       this.lyricStyleId = "";
    }
    public final long getFullOnlineTime(){
       return this.fullOnlineTime;
    }
    public final String getLyricStyleId(){
       return this.lyricStyleId;
    }
    public final int getMusicStyleId(){
       return this.musicStyleId;
    }
    public final int getResourceVersion(){
       return this.resourceVersion;
    }
}
