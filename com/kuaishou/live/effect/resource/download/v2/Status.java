package com.kuaishou.live.effect.resource.download.v2.Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Status extends Enum	// class@001b57
{
    public static final Status[] $VALUES;
    public static final Status DOWNLOADING;
    public static final Status DOWNLOAD_FAIL;
    public static final Status DOWNLOAD_SUCCESS;
    public static final Status IDLE;
    public static final Status NO_NEED_DOWNLOAD;

    static {
       Status status = new Status("IDLE", 0);
       Status.IDLE = status;
       Status status1 = new Status("NO_NEED_DOWNLOAD", 1);
       Status.NO_NEED_DOWNLOAD = status1;
       Status status2 = new Status("DOWNLOADING", 2);
       Status.DOWNLOADING = status2;
       Status status3 = new Status("DOWNLOAD_SUCCESS", 3);
       Status.DOWNLOAD_SUCCESS = status3;
       Status status4 = new Status("DOWNLOAD_FAIL", 4);
       Status.DOWNLOAD_FAIL = status4;
       Status[] statusArray = new Status[]{status,status1,status2,status3,status4};
       Status.$VALUES = statusArray;
    }
    public void Status(String p0,int p1){
       super(p0, p1);
    }
    public static boolean isDownloadComplete(Status p0){
       boolean b = (p0 != Status.NO_NEED_DOWNLOAD && (p0 == Status.DOWNLOAD_SUCCESS || p0 == Status.DOWNLOAD_FAIL))? true: false;
       return b;
    }
    public static boolean isDownloadSuccess(Status p0){
       boolean b = (p0 == Status.NO_NEED_DOWNLOAD || p0 == Status.DOWNLOAD_SUCCESS)? true: false;
       return b;
    }
    public static Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Status.class, p0);
    }
    public static Status[] values(){
       Object obj = PatchProxy.apply(null, null, Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Status.$VALUES.clone();
    }
}
