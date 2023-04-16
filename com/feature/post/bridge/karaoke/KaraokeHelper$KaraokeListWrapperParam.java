package com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeListWrapperParam;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeListBridgeParams;

public final class KaraokeHelper$KaraokeListWrapperParam implements Serializable	// class@00149c
{
    public String callback;
    public KaraokeHelper$KaraokeListBridgeParams params;

    public void KaraokeHelper$KaraokeListWrapperParam(){
       super();
    }
    public final String getCallback(){
       return this.callback;
    }
    public final KaraokeHelper$KaraokeListBridgeParams getParams(){
       return this.params;
    }
    public final void setCallback(String p0){
       this.callback = p0;
    }
    public final void setParams(KaraokeHelper$KaraokeListBridgeParams p0){
       this.params = p0;
    }
    public String toString(){
       return String.valueOf(this.params);
    }
}
