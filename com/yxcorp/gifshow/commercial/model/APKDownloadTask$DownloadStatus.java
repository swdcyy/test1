package com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class APKDownloadTask$DownloadStatus extends Enum	// class@00113b
{
    public static final APKDownloadTask$DownloadStatus[] $VALUES;
    public static final APKDownloadTask$DownloadStatus COMPLETED;
    public static final APKDownloadTask$DownloadStatus DELETED;
    public static final APKDownloadTask$DownloadStatus ERROR;
    public static final APKDownloadTask$DownloadStatus INITIALIZED;
    public static final APKDownloadTask$DownloadStatus INSTALLED;
    public static final APKDownloadTask$DownloadStatus PAUSED;
    public static final APKDownloadTask$DownloadStatus STARTED;

    static {
       APKDownloadTask$DownloadStatus uDownloadSta = new APKDownloadTask$DownloadStatus("INITIALIZED", 0);
       APKDownloadTask$DownloadStatus.INITIALIZED = uDownloadSta;
       APKDownloadTask$DownloadStatus uDownloadSta1 = new APKDownloadTask$DownloadStatus("STARTED", 1);
       APKDownloadTask$DownloadStatus.STARTED = uDownloadSta1;
       APKDownloadTask$DownloadStatus uDownloadSta2 = new APKDownloadTask$DownloadStatus("PAUSED", 2);
       APKDownloadTask$DownloadStatus.PAUSED = uDownloadSta2;
       APKDownloadTask$DownloadStatus uDownloadSta3 = new APKDownloadTask$DownloadStatus("COMPLETED", 3);
       APKDownloadTask$DownloadStatus.COMPLETED = uDownloadSta3;
       APKDownloadTask$DownloadStatus uDownloadSta4 = new APKDownloadTask$DownloadStatus("INSTALLED", 4);
       APKDownloadTask$DownloadStatus.INSTALLED = uDownloadSta4;
       APKDownloadTask$DownloadStatus uDownloadSta5 = new APKDownloadTask$DownloadStatus("DELETED", 5);
       APKDownloadTask$DownloadStatus.DELETED = uDownloadSta5;
       APKDownloadTask$DownloadStatus uDownloadSta6 = new APKDownloadTask$DownloadStatus("ERROR", 6);
       APKDownloadTask$DownloadStatus.ERROR = uDownloadSta6;
       APKDownloadTask$DownloadStatus[] uDownloadSta7 = new APKDownloadTask$DownloadStatus[]{uDownloadSta,uDownloadSta1,uDownloadSta2,uDownloadSta3,uDownloadSta4,uDownloadSta5,uDownloadSta6};
       APKDownloadTask$DownloadStatus.$VALUES = uDownloadSta7;
    }
    public void APKDownloadTask$DownloadStatus(String p0,int p1){
       super(p0, p1);
    }
    public static APKDownloadTask$DownloadStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, APKDownloadTask$DownloadStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(APKDownloadTask$DownloadStatus.class, p0);
    }
    public static APKDownloadTask$DownloadStatus[] values(){
       Object obj = PatchProxy.apply(null, null, APKDownloadTask$DownloadStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return APKDownloadTask$DownloadStatus.$VALUES.clone();
    }
}
