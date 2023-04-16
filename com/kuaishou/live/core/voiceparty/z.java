package com.kuaishou.live.core.voiceparty.z;
import ok.h;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.TheaterEpisodePhotoCdnProto;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;

public final class z implements h	// class@001ae6
{
    public static final z b;

    static {
       z.b = new z();
    }
    public void z(){
       super();
    }
    public final Object apply(Object p0){
       return new CDNUrl(p0.cdn, p0.url, p0.isFreeTrafficCdn);
    }
}
