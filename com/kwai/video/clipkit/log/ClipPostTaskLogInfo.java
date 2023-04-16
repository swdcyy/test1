package com.kwai.video.clipkit.log.ClipPostTaskLogInfo;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import java.lang.Integer;
import com.kwai.video.clipkit.post.ClipPostInfo;

public class ClipPostTaskLogInfo	// class@001a92
{
    public JSONObject capeStats;
    public long encodeEndTime;
    public double encodeProgress;
    public long encodeStartTime;
    public int postMode;
    public int skipTransCode;
    public int softReason;
    public int transcodeReason;
    public long uploadCoverWithoutPreUploadEndTime;
    public long uploadCoverWithoutPreUploadStartTime;
    public long uploadEndTime;
    public double uploadProgress;
    public long uploadStartTime;
    public boolean useHardwareEncode;
    public long userWaitEndTime;
    public long userWaitStartTime;
    public double watermarkProgress;

    public void ClipPostTaskLogInfo(){
       super();
       this.encodeProgress = 0;
       this.uploadProgress = 0;
       this.watermarkProgress = 0;
       this.userWaitStartTime = 0;
       this.userWaitEndTime = 0;
       this.encodeStartTime = 0;
       this.encodeEndTime = 0;
       this.uploadStartTime = 0;
       this.uploadEndTime = 0;
       this.uploadCoverWithoutPreUploadStartTime = 0;
       this.uploadCoverWithoutPreUploadEndTime = 0;
       this.useHardwareEncode = false;
    }
    public void setCapeStats(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPostTaskLogInfo.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.capeStats = new JSONObject(p0);
       }
       return;
    }
    public void setUserWaitEndTime(int p0){
       ClipPostTaskLogInfo uClipPostTas = ClipPostTaskLogInfo.class;
       if (PatchProxy.isSupport(uClipPostTas) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uClipPostTas, "1")) {
          return;
       }
       if (ClipPostInfo.isNeedUploadCoverAfterPublish(p0)) {
          this.userWaitEndTime = this.uploadCoverWithoutPreUploadEndTime;
       }else if(ClipPostInfo.isNeedUpload(p0)){
          this.userWaitEndTime = this.uploadEndTime;
       }else if(ClipPostInfo.isNeedEncode(p0)){
          this.userWaitEndTime = this.encodeEndTime;
       }
       return;
    }
}
