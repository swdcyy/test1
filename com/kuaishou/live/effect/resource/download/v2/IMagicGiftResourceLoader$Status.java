package com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IMagicGiftResourceLoader$Status extends Enum	// class@001b53
{
    public static final IMagicGiftResourceLoader$Status[] $VALUES;
    public static final IMagicGiftResourceLoader$Status DOWNLOADING;
    public static final IMagicGiftResourceLoader$Status DOWNLOAD_FAIL;
    public static final IMagicGiftResourceLoader$Status DOWNLOAD_SUCCESS;
    public static final IMagicGiftResourceLoader$Status IDLE;
    public static final IMagicGiftResourceLoader$Status NO_NEED_DOWNLOAD;

    static {
       IMagicGiftResourceLoader$Status status = new IMagicGiftResourceLoader$Status("IDLE", 0);
       IMagicGiftResourceLoader$Status.IDLE = status;
       IMagicGiftResourceLoader$Status status1 = new IMagicGiftResourceLoader$Status("NO_NEED_DOWNLOAD", 1);
       IMagicGiftResourceLoader$Status.NO_NEED_DOWNLOAD = status1;
       IMagicGiftResourceLoader$Status status2 = new IMagicGiftResourceLoader$Status("DOWNLOADING", 2);
       IMagicGiftResourceLoader$Status.DOWNLOADING = status2;
       IMagicGiftResourceLoader$Status status3 = new IMagicGiftResourceLoader$Status("DOWNLOAD_SUCCESS", 3);
       IMagicGiftResourceLoader$Status.DOWNLOAD_SUCCESS = status3;
       IMagicGiftResourceLoader$Status status4 = new IMagicGiftResourceLoader$Status("DOWNLOAD_FAIL", 4);
       IMagicGiftResourceLoader$Status.DOWNLOAD_FAIL = status4;
       IMagicGiftResourceLoader$Status[] statusArray = new IMagicGiftResourceLoader$Status[]{status,status1,status2,status3,status4};
       IMagicGiftResourceLoader$Status.$VALUES = statusArray;
    }
    public void IMagicGiftResourceLoader$Status(String p0,int p1){
       super(p0, p1);
    }
    public static boolean isDownloadComplete(IMagicGiftResourceLoader$Status p0){
       boolean b = (p0 != IMagicGiftResourceLoader$Status.NO_NEED_DOWNLOAD && (p0 == IMagicGiftResourceLoader$Status.DOWNLOAD_SUCCESS || p0 == IMagicGiftResourceLoader$Status.DOWNLOAD_FAIL))? true: false;
       return b;
    }
    public static boolean isDownloadSuccess(IMagicGiftResourceLoader$Status p0){
       boolean b = (p0 == IMagicGiftResourceLoader$Status.NO_NEED_DOWNLOAD || p0 == IMagicGiftResourceLoader$Status.DOWNLOAD_SUCCESS)? true: false;
       return b;
    }
    public static IMagicGiftResourceLoader$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IMagicGiftResourceLoader$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IMagicGiftResourceLoader$Status.class, p0);
    }
    public static IMagicGiftResourceLoader$Status[] values(){
       Object obj = PatchProxy.apply(null, null, IMagicGiftResourceLoader$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IMagicGiftResourceLoader$Status.$VALUES.clone();
    }
}
