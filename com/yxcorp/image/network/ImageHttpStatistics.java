package com.yxcorp.image.network.ImageHttpStatistics;
import zk.d;
import com.google.gson.Gson;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.common.internal.ImmutableMap;

public class ImageHttpStatistics	// class@001a1a
{
    public int mByteSize;
    public String mCdnCache;
    public long mMillisFetched;
    public long mMillisResponse;
    public long mMillisSubmit;
    public NetworkRequestInfo mRequestInfo;
    public static final Gson GSON;
    public static final String IMAGE_CDN_CACHE;
    public static final String IMAGE_SIZE;
    public static final String MILLIS_FETCHED;
    public static final String MILLIS_RESPONSE;
    public static final String MILLIS_SUBMIT;
    public static final String SERIALIZE_KEY;

    static {
       d uod = new d();
       uod.c();
       ImageHttpStatistics.GSON = uod.b();
    }
    public void ImageHttpStatistics(){
       super();
    }
    public static ImageHttpStatistics restoreFromMap(Map p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, ImageHttpStatistics.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null || !p0.containsKey("internal_serialize_key")) {
          return obj;
       }
       return ImageHttpStatistics.GSON.h(p0.get("internal_serialize_key"), ImageHttpStatistics.class);
    }
    public long getFetchTime(){
       return (this.mMillisFetched - this.mMillisSubmit);
    }
    public Map saveToMap(){
       Object obj = PatchProxy.apply(null, this, ImageHttpStatistics.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImmutableMap.of("internal_serialize_key", ImageHttpStatistics.GSON.q(this));
    }
}
