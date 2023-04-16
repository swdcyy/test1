package com.kwai.video.waynelive.wayneplayer.logger.KSLivePlayerLogUploader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.wayneplayer.logger.LogReport;
import com.kwai.video.waynelive.wayneplayer.logger.IKSLogReport;
import java.lang.Boolean;

public class KSLivePlayerLogUploader	// class@000e54
{

    public void KSLivePlayerLogUploader(){
       super();
    }
    public static void logEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSLivePlayerLogUploader.class, "1")) {
          return;
       }
       LogReport.get().getLogger().logEvent(p0, p1, false);
       return;
    }
    public static void logEvent(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(KSLivePlayerLogUploader.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, KSLivePlayerLogUploader.class, "2")) {
          return;
       }
       LogReport.get().getLogger().logEvent(p0, p1, p2);
       return;
    }
}
