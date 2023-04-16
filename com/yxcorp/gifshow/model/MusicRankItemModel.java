package com.yxcorp.gifshow.model.MusicRankItemModel;
import java.io.Serializable;
import java.lang.Object;

public class MusicRankItemModel implements Serializable	// class@001e61
{
    public List demoPhotos;
    public boolean isPlayed;
    public Music music;
    public long photoCount;
    public int position;
    public boolean showed;

    public void MusicRankItemModel(){
       super();
       this.position = 0;
       this.showed = false;
       this.isPlayed = false;
    }
}
