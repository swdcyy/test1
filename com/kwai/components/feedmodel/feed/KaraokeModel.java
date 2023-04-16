package com.kwai.components.feedmodel.feed.KaraokeModel;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo;

public class KaraokeModel implements Serializable	// class@000c4e
{
    public KaraokeModel$KaraokeInfo mKaraokeInfo;

    public void KaraokeModel(){
       super();
    }
    public KaraokeModel$KaraokeInfo getKaraokeInfo(){
       return this.mKaraokeInfo;
    }
}
