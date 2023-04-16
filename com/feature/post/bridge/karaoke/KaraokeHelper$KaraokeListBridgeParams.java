package com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeListBridgeParams;
import com.feature.post.bridge.karaoke.KaraokeBridgeBaseParams;
import com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeListBridgeParams$a;
import nsd.u;
import java.lang.String;
import java.lang.StringBuilder;

public final class KaraokeHelper$KaraokeListBridgeParams extends KaraokeBridgeBaseParams	// class@00149b
{
    public String channel;
    public static final KaraokeHelper$KaraokeListBridgeParams$a Companion;

    static {
       KaraokeHelper$KaraokeListBridgeParams.Companion = new KaraokeHelper$KaraokeListBridgeParams$a(null);
    }
    public void KaraokeHelper$KaraokeListBridgeParams(){
       super();
    }
    public final String getChannel(){
       return this.channel;
    }
    public final void setChannel(String p0){
       this.channel = p0;
    }
    public String toString(){
       return super.toString()+" channel = "+this.channel;
    }
}
