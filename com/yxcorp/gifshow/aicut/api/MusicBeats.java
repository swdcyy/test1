package com.yxcorp.gifshow.aicut.api.MusicBeats;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;

public final class MusicBeats implements Serializable	// class@00194d
{
    public String algorithm;
    public CDNUrl[] beatsUrls;

    public void MusicBeats(){
       super();
    }
    public final String getAlgorithm(){
       return this.algorithm;
    }
    public final CDNUrl[] getBeatsUrls(){
       return this.beatsUrls;
    }
    public final void setAlgorithm(String p0){
       this.algorithm = p0;
    }
    public final void setBeatsUrls(CDNUrl[] p0){
       this.beatsUrls = p0;
    }
}
