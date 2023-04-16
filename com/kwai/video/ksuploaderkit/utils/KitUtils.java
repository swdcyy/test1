package com.kwai.video.ksuploaderkit.utils.KitUtils;
import java.lang.Object;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;

public class KitUtils	// class@0009e0
{

    public void KitUtils(){
       super();
    }
    public static KSUploaderKitCommon$Status closeReason2KitStatus(boolean p0,KSUploaderCloseReason p1){
       if (p0) {
          return KSUploaderKitCommon$Status.Start;
       }
       if (p1 == KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded) {
          return KSUploaderKitCommon$Status.Success;
       }
       if (p1 == KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser) {
          return KSUploaderKitCommon$Status.Cancel;
       }
       return KSUploaderKitCommon$Status.Fail;
    }
    public static boolean isValidConfig(KSUploaderKitConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KitUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          if (p0.getServiceType() == KSUploaderKitCommon$ServiceType.MediaCloud) {
             if (p0.getFilePath() == null || p0.getServerSignature() == null) {
             label_004a :
                return b;
             }
          }else if(p0.getUploadChannelType() == KSUploaderKitCommon$UploadChannelType.Single){
             if (p0.getFilePath() == null || p0.getFileToken() == null) {
             }
          }else if(p0.getTaskCount() >= 0){
          }
          b = true;
          goto label_004a ;
       }else {
          goto label_004a ;
       }
    }
}
