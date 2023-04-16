package com.yxcorp.gifshow.music.cloudmusic.local.response.LocalMusicResponse;
import la6.b;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;

public class LocalMusicResponse implements b, Serializable	// class@00202d
{
    public final List mLocalMusics;
    public static final long serialVersionUID = 0x533957034298426b;

    public void LocalMusicResponse(List p0){
       super();
       this.mLocalMusics = p0;
    }
    public List getItems(){
       return this.mLocalMusics;
    }
    public boolean hasMore(){
       return false;
    }
}
