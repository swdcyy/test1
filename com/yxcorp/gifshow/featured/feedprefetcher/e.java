package com.yxcorp.gifshow.featured.feedprefetcher.e;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import iea.d;
import com.kuaishou.android.model.mix.VideoMeta;
import com.yxcorp.gifshow.featured.feedprefetcher.a;
import tl8.d;
import java.lang.Class;
import ok.h;
import tl8.e;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.yxcorp.gifshow.featured.feedprefetcher.b;
import com.kwai.video.hodor.Hodor;
import java.lang.String;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask;

public final class e implements Comparator	// class@000fb7
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final int compare(Object p0,Object p1){
       p1 = e.h(p0.mEntity, VideoMeta.class, a.b);
       p0 = e.h(p0.mEntity, VideoMeta.class, b.b);
       long l = 0;
       long upmostCached = (p1 != null && Hodor.instance().isMediaCacheInfoReady())? VodAdaptivePreloadPriorityTask.getUpmostCachedDurationMs(p1.getManifestString()): l;
       if (p0 != null && Hodor.instance().isMediaCacheInfoReady()) {
          l = VodAdaptivePreloadPriorityTask.getUpmostCachedDurationMs(p0.getManifestString());
       }
       return (int)(l - upmostCached);
    }
}
