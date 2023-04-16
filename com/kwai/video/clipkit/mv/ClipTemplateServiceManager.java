package com.kwai.video.clipkit.mv.ClipTemplateServiceManager;
import java.lang.Object;
import com.kwai.video.clipkit.mv.ClipTemplateServiceManager$Holder;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadService;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.ksspark.NewSparkDownloadService;
import com.kwai.video.ksspark.NewSparkTemplateManager;
import com.kwai.video.clipkit.mv.ClipTemplateServiceManager$1;
import java.lang.Throwable;
import com.kwai.video.clipkit.mv.ClipSparkAzerothHttpService;
import com.kwai.video.ksspark.NewSparkHttpService;

public class ClipTemplateServiceManager	// class@001aba
{
    public boolean isHttpServiceSetToSpark;
    public ClipTemplateDownloadService mDownloadService;
    public ClipSparkAzerothHttpService mHttpService;
    public String mSpecialHost;

    public void ClipTemplateServiceManager(){
       super();
       this.mDownloadService = null;
       this.mHttpService = null;
       this.isHttpServiceSetToSpark = false;
       this.mSpecialHost = "";
    }
    public static ClipTemplateServiceManager getInstance(){
       return ClipTemplateServiceManager$Holder.sManager;
    }
    public void setDownloadService(ClipTemplateDownloadService p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipTemplateServiceManager.class, "2")) {
          return;
       }
       try{
          KSClipLog.i("ClipSparkRecovery", "setDownloadService "+p0);
          this.mDownloadService = p0;
          if (p0 == null) {
             NewSparkDownloadService newSparkDown = null;
             NewSparkTemplateManager.setDownloadService(newSparkDown);
          }else {
             NewSparkTemplateManager.setDownloadService(new ClipTemplateServiceManager$1(this));
          }
       }catch(java.lang.UnsatisfiedLinkError e4){
          KSClipLog.e("ClipSparkRecovery", "setDownloadService error "+e4, e4);
       }
       return;
    }
    public void setHttpServiceToSpark(){
       if (PatchProxy.applyVoid(null, this, ClipTemplateServiceManager.class, "1")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "setHttpServiceToSpark");
       if (this.isHttpServiceSetToSpark != null) {
          KSClipLog.i("ClipSparkRecovery", "setHttpServiceToSpark already set, return");
          return;
       }else if(this.mHttpService == null){
          this.mHttpService = new ClipSparkAzerothHttpService();
       }
       ClipTemplateServiceManager tmHttpServic = this.mHttpService;
       ClipTemplateServiceManager tmSpecialHos = this.mSpecialHost;
       try{
          tmHttpServic.setSpecialHost(tmSpecialHos);
          NewSparkTemplateManager.setHttpService(this.mHttpService);
          this.isHttpServiceSetToSpark = true;
          KSClipLog.i("ClipSparkRecovery", "setHttpServiceToSpark success");
       }catch(java.lang.UnsatisfiedLinkError e1){
          KSClipLog.e("ClipSparkRecovery", "setHttpServiceToSpark error "+e1, e1);
       }
       return;
    }
    public void setSpecialMaterialZtHost(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipTemplateServiceManager.class, "3")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "setSpecialMaterialZtHost "+p0);
       try{
          this.mSpecialHost = p0;
          NewSparkTemplateManager.setSpecialMaterialZtHost(p0);
       }catch(java.lang.UnsatisfiedLinkError e4){
          KSClipLog.e("ClipSparkRecovery", "setSpecialMaterialZtHost error "+e4, e4);
       }
       return;
    }
}
