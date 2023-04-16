package com.kwai.video.cache.CacheSessionListener$Util;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.cache.AcCallBackInfo;

public class CacheSessionListener$Util	// class@0019f5
{

    public void CacheSessionListener$Util(){
       super();
    }
    public static boolean needRetryOnThisStopReasonCode(int p0){
       if (p0 != 1 && p0 != 2) {
          return 1;
       }
       return false;
    }
    public static String stopReasonToString(int p0){
       CacheSessionListener$Util util = CacheSessionListener$Util.class;
       if (PatchProxy.isSupport(util)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, util, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return AcCallBackInfo.stopReasonToString(p0);
    }
}
