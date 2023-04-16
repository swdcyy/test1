package com.kuaishou.android.model.music.Music$MusicBeats;
import java.io.Serializable;
import java.lang.Object;

public class Music$MusicBeats implements Serializable	// class@000e56
{
    public String mAlgorithm;
    public CDNUrl[] mBeatsUrls;
    public static final long serialVersionUID = 0x3f5ff2b10f99da8a;

    public void Music$MusicBeats(){
       super();
       this.mBeatsUrls = null;
       this.mAlgorithm = null;
    }
}
