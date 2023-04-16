package com.yxcorp.gifshow.commercial.model.AdDownloadCenterSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AdDownloadCenterSource extends Enum	// class@00113d
{
    public final int mKey;
    public static final AdDownloadCenterSource[] $VALUES;
    public static final AdDownloadCenterSource FROM_NOTIFICATION;
    public static final AdDownloadCenterSource FROM_SETTING;

    static {
       AdDownloadCenterSource uAdDownloadC = new AdDownloadCenterSource("FROM_SETTING", 0, 0);
       AdDownloadCenterSource.FROM_SETTING = uAdDownloadC;
       AdDownloadCenterSource uAdDownloadC1 = new AdDownloadCenterSource("FROM_NOTIFICATION", 1, 1);
       AdDownloadCenterSource.FROM_NOTIFICATION = uAdDownloadC1;
       AdDownloadCenterSource[] uAdDownloadC2 = new AdDownloadCenterSource[]{uAdDownloadC,uAdDownloadC1};
       AdDownloadCenterSource.$VALUES = uAdDownloadC2;
    }
    public void AdDownloadCenterSource(String p0,int p1,int p2){
       super(p0, p1);
       this.mKey = p2;
    }
    public static AdDownloadCenterSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdDownloadCenterSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AdDownloadCenterSource.class, p0);
    }
    public static AdDownloadCenterSource[] values(){
       Object obj = PatchProxy.apply(null, null, AdDownloadCenterSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdDownloadCenterSource.$VALUES.clone();
    }
}
