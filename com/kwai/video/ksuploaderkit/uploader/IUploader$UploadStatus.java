package com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.uploader.IUploader$1;

public final class IUploader$UploadStatus extends Enum	// class@0009d1
{
    public static final IUploader$UploadStatus[] $VALUES;
    public static final IUploader$UploadStatus Cancel;
    public static final IUploader$UploadStatus Finish;
    public static final IUploader$UploadStatus Init;
    public static final IUploader$UploadStatus Pause;
    public static final IUploader$UploadStatus Resume;
    public static final IUploader$UploadStatus Uploading;

    static {
       IUploader$UploadStatus uploadStatus = new IUploader$UploadStatus("Init", 0);
       IUploader$UploadStatus.Init = uploadStatus;
       IUploader$UploadStatus uploadStatus1 = new IUploader$UploadStatus("Uploading", 1);
       IUploader$UploadStatus.Uploading = uploadStatus1;
       IUploader$UploadStatus uploadStatus2 = new IUploader$UploadStatus("Resume", 2);
       IUploader$UploadStatus.Resume = uploadStatus2;
       IUploader$UploadStatus uploadStatus3 = new IUploader$UploadStatus("Pause", 3);
       IUploader$UploadStatus.Pause = uploadStatus3;
       IUploader$UploadStatus uploadStatus4 = new IUploader$UploadStatus("Cancel", 4);
       IUploader$UploadStatus.Cancel = uploadStatus4;
       IUploader$UploadStatus uploadStatus5 = new IUploader$UploadStatus("Finish", 5);
       IUploader$UploadStatus.Finish = uploadStatus5;
       IUploader$UploadStatus[] uploadStatus6 = new IUploader$UploadStatus[]{uploadStatus,uploadStatus1,uploadStatus2,uploadStatus3,uploadStatus4,uploadStatus5};
       IUploader$UploadStatus.$VALUES = uploadStatus6;
    }
    public void IUploader$UploadStatus(String p0,int p1){
       super(p0, p1);
    }
    public static IUploader$UploadStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IUploader$UploadStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IUploader$UploadStatus.class, p0);
    }
    public static IUploader$UploadStatus[] values(){
       Object obj = PatchProxy.apply(null, null, IUploader$UploadStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IUploader$UploadStatus.$VALUES.clone();
    }
    public KSUploaderKitCommon$Status parseKitStatus(){
       Object[] objArray = null;
       KSUploaderKitCommon$Status obj = PatchProxy.apply(objArray, this, IUploader$UploadStatus.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = IUploader$1.$SwitchMap$com$kwai$video$ksuploaderkit$uploader$IUploader$UploadStatus[this.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      objArray = KSUploaderKitCommon$Status.Success;
                   }
                }else {
                   objArray = KSUploaderKitCommon$Status.Start;
                }
             }else {
                objArray = KSUploaderKitCommon$Status.Cancel;
             }
          }else {
          label_0033 :
             objArray = KSUploaderKitCommon$Status.Pause;
          }
       }else {
          obj = KSUploaderKitCommon$Status.Resume;
          goto label_0033 ;
       }
       return objArray;
    }
}
