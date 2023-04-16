package com.yxcorp.gifshow.upload.PipelineUploadTask$UploadStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PipelineUploadTask$UploadStatus extends Enum	// class@001e47
{
    public static final PipelineUploadTask$UploadStatus[] $VALUES;
    public static final PipelineUploadTask$UploadStatus CANCEL;
    public static final PipelineUploadTask$UploadStatus FAIL;
    public static final PipelineUploadTask$UploadStatus NOT_START;
    public static final PipelineUploadTask$UploadStatus SUCCESS;
    public static final PipelineUploadTask$UploadStatus UPLOADING;

    static {
       PipelineUploadTask$UploadStatus uploadStatus = new PipelineUploadTask$UploadStatus("NOT_START", 0);
       PipelineUploadTask$UploadStatus.NOT_START = uploadStatus;
       PipelineUploadTask$UploadStatus uploadStatus1 = new PipelineUploadTask$UploadStatus("UPLOADING", 1);
       PipelineUploadTask$UploadStatus.UPLOADING = uploadStatus1;
       PipelineUploadTask$UploadStatus uploadStatus2 = new PipelineUploadTask$UploadStatus("SUCCESS", 2);
       PipelineUploadTask$UploadStatus.SUCCESS = uploadStatus2;
       PipelineUploadTask$UploadStatus uploadStatus3 = new PipelineUploadTask$UploadStatus("FAIL", 3);
       PipelineUploadTask$UploadStatus.FAIL = uploadStatus3;
       PipelineUploadTask$UploadStatus uploadStatus4 = new PipelineUploadTask$UploadStatus("CANCEL", 4);
       PipelineUploadTask$UploadStatus.CANCEL = uploadStatus4;
       PipelineUploadTask$UploadStatus[] uploadStatus5 = new PipelineUploadTask$UploadStatus[]{uploadStatus,uploadStatus1,uploadStatus2,uploadStatus3,uploadStatus4};
       PipelineUploadTask$UploadStatus.$VALUES = uploadStatus5;
    }
    public void PipelineUploadTask$UploadStatus(String p0,int p1){
       super(p0, p1);
    }
    public static PipelineUploadTask$UploadStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PipelineUploadTask$UploadStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PipelineUploadTask$UploadStatus.class, p0);
    }
    public static PipelineUploadTask$UploadStatus[] values(){
       Object obj = PatchProxy.apply(null, null, PipelineUploadTask$UploadStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PipelineUploadTask$UploadStatus.$VALUES.clone();
    }
}
