package com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeWrapperParam;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeBridgeParams;

public final class KaraokeHelper$KaraokeWrapperParam implements Serializable	// class@00149d
{
    public String callback;
    public KaraokeHelper$KaraokeBridgeParams params;

    public void KaraokeHelper$KaraokeWrapperParam(){
       super();
    }
    public final String getCallback(){
       return this.callback;
    }
    public final KaraokeHelper$KaraokeBridgeParams getParams(){
       return this.params;
    }
    public final void setCallback(String p0){
       this.callback = p0;
    }
    public final void setParams(KaraokeHelper$KaraokeBridgeParams p0){
       this.params = p0;
    }
    public String toString(){
       return String.valueOf(this.params);
    }
}
