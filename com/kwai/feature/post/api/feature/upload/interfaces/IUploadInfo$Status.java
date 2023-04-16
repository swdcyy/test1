package com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IUploadInfo$Status extends Enum	// class@0013d9
{
    public static final IUploadInfo$Status[] $VALUES;
    public static final IUploadInfo$Status CANCELED;
    public static final IUploadInfo$Status COMPLETE;
    public static final IUploadInfo$Status FAILED;
    public static final IUploadInfo$Status PENDING;
    public static final IUploadInfo$Status SUCCEED;
    public static final IUploadInfo$Status UPLOADING;

    static {
       IUploadInfo$Status status = new IUploadInfo$Status("PENDING", 0);
       IUploadInfo$Status.PENDING = status;
       IUploadInfo$Status status1 = new IUploadInfo$Status("UPLOADING", 1);
       IUploadInfo$Status.UPLOADING = status1;
       IUploadInfo$Status status2 = new IUploadInfo$Status("SUCCEED", 2);
       IUploadInfo$Status.SUCCEED = status2;
       IUploadInfo$Status status3 = new IUploadInfo$Status("COMPLETE", 3);
       IUploadInfo$Status.COMPLETE = status3;
       IUploadInfo$Status status4 = new IUploadInfo$Status("FAILED", 4);
       IUploadInfo$Status.FAILED = status4;
       IUploadInfo$Status status5 = new IUploadInfo$Status("CANCELED", 5);
       IUploadInfo$Status.CANCELED = status5;
       IUploadInfo$Status[] statusArray = new IUploadInfo$Status[]{status,status1,status2,status3,status4,status5};
       IUploadInfo$Status.$VALUES = statusArray;
    }
    public void IUploadInfo$Status(String p0,int p1){
       super(p0, p1);
    }
    public static IUploadInfo$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IUploadInfo$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IUploadInfo$Status.class, p0);
    }
    public static IUploadInfo$Status[] values(){
       Object obj = PatchProxy.apply(null, null, IUploadInfo$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IUploadInfo$Status.$VALUES.clone();
    }
}
