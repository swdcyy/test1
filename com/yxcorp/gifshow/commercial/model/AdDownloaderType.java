package com.yxcorp.gifshow.commercial.model.AdDownloaderType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AdDownloaderType extends Enum	// class@00113e
{
    public static final AdDownloaderType[] $VALUES;
    public static final AdDownloaderType DOWNLOAD_FULL_SPEED;
    public static final AdDownloaderType DOWNLOAD_LIMIT_SPEED;

    static {
       AdDownloaderType uAdDownloade = new AdDownloaderType("DOWNLOAD_FULL_SPEED", 0);
       AdDownloaderType.DOWNLOAD_FULL_SPEED = uAdDownloade;
       AdDownloaderType uAdDownloade1 = new AdDownloaderType("DOWNLOAD_LIMIT_SPEED", 1);
       AdDownloaderType.DOWNLOAD_LIMIT_SPEED = uAdDownloade1;
       AdDownloaderType[] uAdDownloade2 = new AdDownloaderType[]{uAdDownloade,uAdDownloade1};
       AdDownloaderType.$VALUES = uAdDownloade2;
    }
    public void AdDownloaderType(String p0,int p1){
       super(p0, p1);
    }
    public static AdDownloaderType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdDownloaderType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AdDownloaderType.class, p0);
    }
    public static AdDownloaderType[] values(){
       Object obj = PatchProxy.apply(null, null, AdDownloaderType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdDownloaderType.$VALUES.clone();
    }
}
