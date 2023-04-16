package com.kuaishou.live.core.voiceparty.theater.model.a;
import ok.h;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.livestream.message.nano.TheaterEpisodePhotoCdnProto;
import java.lang.String;

public final class a implements h	// class@001987
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       TheaterEpisodePhotoCdnProto theaterEpiso = new TheaterEpisodePhotoCdnProto();
       theaterEpiso.cdn = p0.getCdn();
       theaterEpiso.url = p0.getUrl();
       theaterEpiso.isFreeTrafficCdn = p0.isFreeTrafficCdn();
       return theaterEpiso;
    }
}
