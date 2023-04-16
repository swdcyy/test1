package com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AICutErrorCode extends Enum	// class@001945
{
    public static final AICutErrorCode[] $VALUES;
    public static final AICutErrorCode APPLY_TEMPLATE_FAILED;
    public static final AICutErrorCode CANCEL_BY_USER;
    public static final AICutErrorCode DOWNLOAD_MUSIC_FAILED;
    public static final AICutErrorCode DOWNLOAD_SO_FAILED;
    public static final AICutErrorCode DOWNLOAD_STYLE_FAILED;
    public static final AICutErrorCode DOWNLOAD_YCNN_FAILED;
    public static final AICutErrorCode ILLEGAL_INFO_DETECTED;
    public static final AICutErrorCode NOT_USE_PRESELECT;
    public static final AICutErrorCode NO_ERROR;
    public static final AICutErrorCode NO_META_DATA;
    public static final AICutErrorCode OTHER;
    public static final AICutErrorCode TIME_OUT;
    public static final AICutErrorCode TRANS_CODE_FAILED;

    static {
       AICutErrorCode[] uAICutErrorC = new AICutErrorCode[13];
       AICutErrorCode uAICutErrorC1 = new AICutErrorCode("NO_ERROR", 0);
       AICutErrorCode.NO_ERROR = uAICutErrorC1;
       uAICutErrorC[0] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("DOWNLOAD_YCNN_FAILED", 1);
       AICutErrorCode.DOWNLOAD_YCNN_FAILED = uAICutErrorC1;
       uAICutErrorC[1] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("TRANS_CODE_FAILED", 2);
       AICutErrorCode.TRANS_CODE_FAILED = uAICutErrorC1;
       uAICutErrorC[2] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("NO_META_DATA", 3);
       AICutErrorCode.NO_META_DATA = uAICutErrorC1;
       uAICutErrorC[3] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("DOWNLOAD_STYLE_FAILED", 4);
       AICutErrorCode.DOWNLOAD_STYLE_FAILED = uAICutErrorC1;
       uAICutErrorC[4] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("DOWNLOAD_MUSIC_FAILED", 5);
       AICutErrorCode.DOWNLOAD_MUSIC_FAILED = uAICutErrorC1;
       uAICutErrorC[5] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("NOT_USE_PRESELECT", 6);
       AICutErrorCode.NOT_USE_PRESELECT = uAICutErrorC1;
       uAICutErrorC[6] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("DOWNLOAD_SO_FAILED", 7);
       AICutErrorCode.DOWNLOAD_SO_FAILED = uAICutErrorC1;
       uAICutErrorC[7] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("TIME_OUT", 8);
       AICutErrorCode.TIME_OUT = uAICutErrorC1;
       uAICutErrorC[8] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("APPLY_TEMPLATE_FAILED", 9);
       AICutErrorCode.APPLY_TEMPLATE_FAILED = uAICutErrorC1;
       uAICutErrorC[9] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("CANCEL_BY_USER", 10);
       AICutErrorCode.CANCEL_BY_USER = uAICutErrorC1;
       uAICutErrorC[10] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("OTHER", 11);
       AICutErrorCode.OTHER = uAICutErrorC1;
       uAICutErrorC[11] = uAICutErrorC1;
       uAICutErrorC1 = new AICutErrorCode("ILLEGAL_INFO_DETECTED", 12);
       AICutErrorCode.ILLEGAL_INFO_DETECTED = uAICutErrorC1;
       uAICutErrorC[12] = uAICutErrorC1;
       AICutErrorCode.$VALUES = uAICutErrorC;
    }
    public void AICutErrorCode(String p0,int p1){
       super(p0, p1);
    }
    public static AICutErrorCode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AICutErrorCode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AICutErrorCode.class, p0);
    }
    public static AICutErrorCode[] values(){
       Object obj = PatchProxy.apply(null, null, AICutErrorCode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AICutErrorCode.$VALUES.clone();
    }
}
