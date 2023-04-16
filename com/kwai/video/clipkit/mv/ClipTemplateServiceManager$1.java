package com.kwai.video.clipkit.mv.ClipTemplateServiceManager$1;
import com.kwai.video.ksspark.NewSparkDownloadService;
import com.kwai.video.clipkit.mv.ClipTemplateServiceManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.KSClipLog;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadService;
import com.kwai.video.ksspark.NewSparkDownloadConfig;
import com.kwai.video.ksspark.NewSparkDownloadListener;
import java.util.List;
import android.util.Pair;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadConfig;
import com.kwai.video.clipkit.mv.ClipSparkTemplateDownloadListenerWrapper;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadListener;

public class ClipTemplateServiceManager$1 implements NewSparkDownloadService	// class@001ab8
{
    public final ClipTemplateServiceManager this$0;

    public void ClipTemplateServiceManager$1(ClipTemplateServiceManager p0){
       this.this$0 = p0;
       super();
    }
    public void cancel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipTemplateServiceManager$1.class, "2")) {
          return;
       }
       if (this.this$0.mDownloadService == null) {
          KSClipLog.e("ClipSparkRecovery", "cancel download res error, service is null");
          return;
       }else {
          KSClipLog.i("ClipSparkRecovery", "cancel download for "+p0);
          this.this$0.mDownloadService.cancel(p0);
          return;
       }
    }
    public void download(NewSparkDownloadConfig p0,NewSparkDownloadListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipTemplateServiceManager$1.class, "1")) {
          return;
       }
       String str = "ClipSparkRecovery";
       if (this.this$0.mDownloadService == null) {
          KSClipLog.e(str, "download res error, service is null");
          return;
       }else if(p0 != null){
          NewSparkDownloadConfig resourceCdnU = p0.resourceCdnUrls;
          if (resourceCdnU != null && resourceCdnU.size()) {
             if (p1 == null) {
                KSClipLog.e(str, "download res error, lisentner is null");
                return;
             }else {
                KSClipLog.i(str, "download for "+p0.resourceCdnUrls.get(0).second+" start");
                this.this$0.mDownloadService.download(new ClipTemplateDownloadConfig(p0), new ClipSparkTemplateDownloadListenerWrapper(p1));
                return;
             }
          }
       }
       KSClipLog.e(str, "download res error, config invalid "+p0);
       return;
    }
}
