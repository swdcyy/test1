package com.kwai.kxb.update.log.KxbExceptionCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KxbExceptionCode extends Enum	// class@000809
{
    public static final KxbExceptionCode[] $VALUES;
    public static final KxbExceptionCode DOWNLOAD_ERROR;
    public static final KxbExceptionCode DUMMY_FALLBACK_LOCAL_BUNDLE_ERROR;
    public static final KxbExceptionCode FORBIDDEN_ENTER_PAGE_REQUEST_ERROR;
    public static final KxbExceptionCode MIN_BUNDLE_VERSION_CHECK_ERROR;
    public static final KxbExceptionCode PATCH_ERROR;
    public static final KxbExceptionCode PRESET_DOWNLOAD_ERROR;
    public static final KxbExceptionCode RESPONSE_ERROR;
    public static final KxbExceptionCode UNKNOWN;
    public static final KxbExceptionCode UNZIP_ERROR;
    public static final KxbExceptionCode UPDATE_API_ERROR;

    static {
       KxbExceptionCode[] kxbException = new KxbExceptionCode[10];
       KxbExceptionCode kxbException1 = new KxbExceptionCode("UNKNOWN", 0);
       KxbExceptionCode.UNKNOWN = kxbException1;
       kxbException[0] = kxbException1;
       kxbException1 = new KxbExceptionCode("UPDATE_API_ERROR", 1);
       KxbExceptionCode.UPDATE_API_ERROR = kxbException1;
       kxbException[1] = kxbException1;
       kxbException1 = new KxbExceptionCode("RESPONSE_ERROR", 2);
       KxbExceptionCode.RESPONSE_ERROR = kxbException1;
       kxbException[2] = kxbException1;
       kxbException1 = new KxbExceptionCode("DOWNLOAD_ERROR", 3);
       KxbExceptionCode.DOWNLOAD_ERROR = kxbException1;
       kxbException[3] = kxbException1;
       kxbException1 = new KxbExceptionCode("PATCH_ERROR", 4);
       KxbExceptionCode.PATCH_ERROR = kxbException1;
       kxbException[4] = kxbException1;
       kxbException1 = new KxbExceptionCode("UNZIP_ERROR", 5);
       KxbExceptionCode.UNZIP_ERROR = kxbException1;
       kxbException[5] = kxbException1;
       kxbException1 = new KxbExceptionCode("PRESET_DOWNLOAD_ERROR", 6);
       KxbExceptionCode.PRESET_DOWNLOAD_ERROR = kxbException1;
       kxbException[6] = kxbException1;
       kxbException1 = new KxbExceptionCode("FORBIDDEN_ENTER_PAGE_REQUEST_ERROR", 7);
       KxbExceptionCode.FORBIDDEN_ENTER_PAGE_REQUEST_ERROR = kxbException1;
       kxbException[7] = kxbException1;
       kxbException1 = new KxbExceptionCode("MIN_BUNDLE_VERSION_CHECK_ERROR", 8);
       KxbExceptionCode.MIN_BUNDLE_VERSION_CHECK_ERROR = kxbException1;
       kxbException[8] = kxbException1;
       kxbException1 = new KxbExceptionCode("DUMMY_FALLBACK_LOCAL_BUNDLE_ERROR", 9);
       KxbExceptionCode.DUMMY_FALLBACK_LOCAL_BUNDLE_ERROR = kxbException1;
       kxbException[9] = kxbException1;
       KxbExceptionCode.$VALUES = kxbException;
    }
    public void KxbExceptionCode(String p0,int p1){
       super(p0, p1);
    }
    public static KxbExceptionCode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KxbExceptionCode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KxbExceptionCode.class, p0);
    }
    public static KxbExceptionCode[] values(){
       Object obj = PatchProxy.apply(null, null, KxbExceptionCode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KxbExceptionCode.$VALUES.clone();
    }
}
