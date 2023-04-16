package com.kwai.feature.api.feed.home.model.NasaSlideCommonMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.feed.VideoFeed;
import fa6.e;
import fa6.b;

public class NasaSlideCommonMeta implements Serializable	// class@000f16
{
    public boolean isDynamicPrefetch;
    public boolean mShouldInsertBeforePrecacheFeed;
    public static final String PART_FIELD = "nasaSlideCommonMeta";
    public static final long serialVersionUID = 0xf258403c62f2b231;

    public void NasaSlideCommonMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, NasaSlideCommonMeta.class, "1")) {
          return;
       }
       e uoe = new e(NasaSlideCommonMeta.class, "", "nasaSlideCommonMeta");
       uoe.a(null);
       c.a.e(VideoFeed.class, uoe);
       return;
    }
}
