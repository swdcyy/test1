package com.kwai.feature.api.platform.bridge.beans.JsDownloadParams$DownloadFileType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsDownloadParams$DownloadFileType extends Enum	// class@00105a
{
    public static final JsDownloadParams$DownloadFileType[] $VALUES;
    public static final JsDownloadParams$DownloadFileType APK;
    public static final JsDownloadParams$DownloadFileType IMAGE;
    public static final JsDownloadParams$DownloadFileType VIDEO;

    static {
       JsDownloadParams$DownloadFileType uDownloadFil = new JsDownloadParams$DownloadFileType("IMAGE", 0);
       JsDownloadParams$DownloadFileType.IMAGE = uDownloadFil;
       JsDownloadParams$DownloadFileType uDownloadFil1 = new JsDownloadParams$DownloadFileType("VIDEO", 1);
       JsDownloadParams$DownloadFileType.VIDEO = uDownloadFil1;
       JsDownloadParams$DownloadFileType uDownloadFil2 = new JsDownloadParams$DownloadFileType("APK", 2);
       JsDownloadParams$DownloadFileType.APK = uDownloadFil2;
       JsDownloadParams$DownloadFileType[] uDownloadFil3 = new JsDownloadParams$DownloadFileType[]{uDownloadFil,uDownloadFil1,uDownloadFil2};
       JsDownloadParams$DownloadFileType.$VALUES = uDownloadFil3;
    }
    public void JsDownloadParams$DownloadFileType(String p0,int p1){
       super(p0, p1);
    }
    public static JsDownloadParams$DownloadFileType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsDownloadParams$DownloadFileType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsDownloadParams$DownloadFileType.class, p0);
    }
    public static JsDownloadParams$DownloadFileType[] values(){
       Object obj = PatchProxy.apply(null, null, JsDownloadParams$DownloadFileType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsDownloadParams$DownloadFileType.$VALUES.clone();
    }
}
