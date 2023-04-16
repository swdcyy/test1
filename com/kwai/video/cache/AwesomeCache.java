package com.kwai.video.cache.AwesomeCache;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.hodor.util.HodorCacheUtil;
import java.lang.Number;
import java.lang.Long;
import com.kwai.video.hodor.util.Timber;
import java.lang.Boolean;

public class AwesomeCache	// class@0019ef
{

    public void AwesomeCache(){
       super();
    }
    public static native void _clearCacheDir();
    public static native String _exportMediaFileIfFullyCached(String p0);
    public static native long _getCachedBytesForKey(String p0);
    public static native long _getTotalBytesForKey(String p0);
    public static native boolean _importToCache(String p0,String p1);
    public static native boolean _isFullyCached(String p0);
    public static void clearCacheDir(){
       if (PatchProxy.applyVoid(null, null, AwesomeCache.class, "1")) {
          return;
       }
       AwesomeCache._clearCacheDir();
       return;
    }
    public static String exportMediaFileIfFullyCached(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AwesomeCache.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AwesomeCache._exportMediaFileIfFullyCached(HodorCacheUtil.getCacheKey(p0, false));
    }
    public static long getCachedBytesForKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AwesomeCache.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return AwesomeCache._getCachedBytesForKey(p0);
    }
    public static int getCachedPercentForKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AwesomeCache.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long cachedBytesF = AwesomeCache.getCachedBytesForKey(p0);
       long totalBytesFo = AwesomeCache.getTotalBytesForKey(p0);
       Object[] objArray = new Object[]{p0,Long.valueOf(cachedBytesF),Long.valueOf(totalBytesFo)};
       Timber.i("[AwesomeCache] getCachedPercentForKey. key:%s cached:%d total:%d", objArray);
       if (totalBytesFo > 0) {
          return (int)((cachedBytesF * 100) / totalBytesFo);
       }
       return 0;
    }
    public static long getTotalBytesForKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AwesomeCache.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return AwesomeCache._getTotalBytesForKey(p0);
    }
    public static boolean importToCache(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, AwesomeCache.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return AwesomeCache._importToCache(p0, p1);
    }
    public static boolean isFullyCached(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AwesomeCache.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return AwesomeCache._isFullyCached(p0);
    }
    public static boolean isMediaFileFullyCached(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AwesomeCache.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return AwesomeCache.isFullyCached(HodorCacheUtil.getCacheKey(p0, false));
    }
}
