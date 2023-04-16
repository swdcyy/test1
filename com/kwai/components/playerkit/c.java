package com.kwai.components.playerkit.c;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.VideoMeta;
import com.kwai.components.playerkit.b;
import tl8.d;
import java.lang.Class;
import ok.h;
import tl8.e;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;

public final class c implements o	// class@000cdb
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       return e.h(p0.mEntity, VideoMeta.class, b.b);
    }
}
