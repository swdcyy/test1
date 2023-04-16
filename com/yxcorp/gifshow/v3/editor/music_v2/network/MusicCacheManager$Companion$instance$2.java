package com.yxcorp.gifshow.v3.editor.music_v2.network.MusicCacheManager$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.network.MusicCacheManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class MusicCacheManager$Companion$instance$2 extends Lambda implements a	// class@0010ad
{
    public static final MusicCacheManager$Companion$instance$2 INSTANCE;

    static {
       MusicCacheManager$Companion$instance$2.INSTANCE = new MusicCacheManager$Companion$instance$2();
    }
    public void MusicCacheManager$Companion$instance$2(){
       super(0);
    }
    public final MusicCacheManager invoke(){
       Object obj = PatchProxy.apply(null, this, MusicCacheManager$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MusicCacheManager(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
