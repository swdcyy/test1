package com.yxcorp.gifshow.v3.editor.music_v2.network.MusicCacheManager;
import com.yxcorp.gifshow.v3.editor.music_v2.network.MusicCacheManager$a;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.music_v2.network.MusicCacheManager$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.util.LruCache;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.io.File;
import qkd.b;
import j80.g;

public final class MusicCacheManager	// class@0010af
{
    public final LruCache a;
    public static final p b;
    public static final MusicCacheManager$a c;

    static {
       MusicCacheManager.c = new MusicCacheManager$a(null);
       MusicCacheManager.b = s.c(MusicCacheManager$Companion$instance$2.INSTANCE);
    }
    public void MusicCacheManager(){
       super();
       this.a = new LruCache(5);
    }
    public void MusicCacheManager(u p0){
       super();
       this.a = new LruCache(5);
    }
    public final String a(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, MusicCacheManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "filePath");
       obj = this.a.get(p0);
       if (obj != null) {
          return obj;
       }
       File uFile = new File(p0);
       if (!b.S(uFile)) {
          return null;
       }
       obj = g.d(uFile);
       this.a.put(p0, obj);
       return obj;
    }
}
