package com.kwai.video.wayne.player.KSVodNativeCache;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import com.kwai.video.cache.AwesomeCache;
import com.kwai.video.wayne.player.main.KSVodPlayHistoryManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.wayne.player.util.VodPlayerUtils;
import com.kwai.video.hodor.Hodor;
import java.lang.Boolean;

public class KSVodNativeCache	// class@000ca5
{

    public void KSVodNativeCache(){
       super();
    }
    public static void clearCacheDir(){
       if (PatchProxy.applyVoid(null, null, KSVodNativeCache.class, "1")) {
          return;
       }
       if (!WaynePlayerInitor.isSoLoadCompleted()) {
          return;
       }
       AwesomeCache.clearCacheDir();
       KSVodPlayHistoryManager.getInstance().clearCacheStatus();
       return;
    }
    public static long getCachedSize(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KSVodNativeCache.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!WaynePlayerInitor.isSoLoadCompleted()) {
          return 0;
       }
       if (TextUtils.isEmpty(p1)) {
          p1 = VodPlayerUtils.getCacheKey(p0);
       }
       return AwesomeCache.getCachedBytesForKey(p1);
    }
    public static long getCachedSizeWithUrl(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSVodNativeCache.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return KSVodNativeCache.getCachedSize(p0, null);
    }
    public static long getTotalCachedSize(){
       Object obj = PatchProxy.apply(null, null, KSVodNativeCache.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!WaynePlayerInitor.isSoLoadCompleted()) {
          return 0;
       }
       return Hodor.instance().getCachedBytesOfDirectory(0);
    }
    public static boolean isFullyCached(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSVodNativeCache.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KSVodNativeCache.isFullyCached(p0, null);
    }
    public static boolean isFullyCached(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KSVodNativeCache.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!WaynePlayerInitor.isSoLoadCompleted()) {
          return false;
       }
       if (TextUtils.isEmpty(p1)) {
          p1 = VodPlayerUtils.getCacheKey(p0);
       }
       return AwesomeCache.isFullyCached(p1);
    }
}
