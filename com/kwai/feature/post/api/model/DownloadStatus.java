package com.kwai.feature.post.api.model.DownloadStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DownloadStatus extends Enum	// class@001408
{
    public static final DownloadStatus[] $VALUES;
    public static final DownloadStatus DOWNLOADING;
    public static final DownloadStatus DOWNLOAD_FAILED;
    public static final DownloadStatus DOWNLOAD_NETWORK_UNCONNECTED;
    public static final DownloadStatus DOWNLOAD_SUCCESS;
    public static final DownloadStatus DOWNLOAD_USE_MOBILE_NET_PROMPT;

    static {
       DownloadStatus uDownloadSta = new DownloadStatus("DOWNLOADING", 0);
       DownloadStatus.DOWNLOADING = uDownloadSta;
       DownloadStatus uDownloadSta1 = new DownloadStatus("DOWNLOAD_SUCCESS", 1);
       DownloadStatus.DOWNLOAD_SUCCESS = uDownloadSta1;
       DownloadStatus uDownloadSta2 = new DownloadStatus("DOWNLOAD_FAILED", 2);
       DownloadStatus.DOWNLOAD_FAILED = uDownloadSta2;
       DownloadStatus uDownloadSta3 = new DownloadStatus("DOWNLOAD_NETWORK_UNCONNECTED", 3);
       DownloadStatus.DOWNLOAD_NETWORK_UNCONNECTED = uDownloadSta3;
       DownloadStatus uDownloadSta4 = new DownloadStatus("DOWNLOAD_USE_MOBILE_NET_PROMPT", 4);
       DownloadStatus.DOWNLOAD_USE_MOBILE_NET_PROMPT = uDownloadSta4;
       DownloadStatus[] uDownloadSta5 = new DownloadStatus[]{uDownloadSta,uDownloadSta1,uDownloadSta2,uDownloadSta3,uDownloadSta4};
       DownloadStatus.$VALUES = uDownloadSta5;
    }
    public void DownloadStatus(String p0,int p1){
       super(p0, p1);
    }
    public static DownloadStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DownloadStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DownloadStatus.class, p0);
    }
    public static DownloadStatus[] values(){
       Object obj = PatchProxy.apply(null, null, DownloadStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DownloadStatus.$VALUES.clone();
    }
}
