package com.kwai.framework.fileuploader.UploadUtils$CommonUploadBizType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UploadUtils$CommonUploadBizType extends Enum	// class@001556
{
    public final int mType;
    public static final UploadUtils$CommonUploadBizType[] $VALUES;
    public static final UploadUtils$CommonUploadBizType APP_CRASH_LOG_FILE;
    public static final UploadUtils$CommonUploadBizType APP_DEBUG_LOG_FILE;
    public static final UploadUtils$CommonUploadBizType APP_OOM_LOG_FILE;

    static {
       UploadUtils$CommonUploadBizType uCommonUploa = new UploadUtils$CommonUploadBizType("APP_DEBUG_LOG_FILE", 0, 4);
       UploadUtils$CommonUploadBizType.APP_DEBUG_LOG_FILE = uCommonUploa;
       UploadUtils$CommonUploadBizType uCommonUploa1 = new UploadUtils$CommonUploadBizType("APP_CRASH_LOG_FILE", 1, 5);
       UploadUtils$CommonUploadBizType.APP_CRASH_LOG_FILE = uCommonUploa1;
       UploadUtils$CommonUploadBizType uCommonUploa2 = new UploadUtils$CommonUploadBizType("APP_OOM_LOG_FILE", 2, 7);
       UploadUtils$CommonUploadBizType.APP_OOM_LOG_FILE = uCommonUploa2;
       UploadUtils$CommonUploadBizType[] uCommonUploa3 = new UploadUtils$CommonUploadBizType[]{uCommonUploa,uCommonUploa1,uCommonUploa2};
       UploadUtils$CommonUploadBizType.$VALUES = uCommonUploa3;
    }
    public void UploadUtils$CommonUploadBizType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static UploadUtils$CommonUploadBizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UploadUtils$CommonUploadBizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UploadUtils$CommonUploadBizType.class, p0);
    }
    public static UploadUtils$CommonUploadBizType[] values(){
       Object obj = PatchProxy.apply(null, null, UploadUtils$CommonUploadBizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UploadUtils$CommonUploadBizType.$VALUES.clone();
    }
}
