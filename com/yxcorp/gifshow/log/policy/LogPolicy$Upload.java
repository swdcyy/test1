package com.yxcorp.gifshow.log.policy.LogPolicy$Upload;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LogPolicy$Upload extends Enum	// class@001b26
{
    public static final LogPolicy$Upload[] $VALUES;
    public static final LogPolicy$Upload ALL;
    public static final LogPolicy$Upload NONE;
    public static final LogPolicy$Upload NORMAL;

    static {
       LogPolicy$Upload upload = new LogPolicy$Upload("NORMAL", 0);
       LogPolicy$Upload.NORMAL = upload;
       LogPolicy$Upload upload1 = new LogPolicy$Upload("ALL", 1);
       LogPolicy$Upload.ALL = upload1;
       LogPolicy$Upload upload2 = new LogPolicy$Upload("NONE", 2);
       LogPolicy$Upload.NONE = upload2;
       LogPolicy$Upload[] uploadArray = new LogPolicy$Upload[]{upload,upload1,upload2};
       LogPolicy$Upload.$VALUES = uploadArray;
    }
    public void LogPolicy$Upload(String p0,int p1){
       super(p0, p1);
    }
    public static LogPolicy$Upload valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LogPolicy$Upload.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LogPolicy$Upload.class, p0);
    }
    public static LogPolicy$Upload[] values(){
       Object obj = PatchProxy.apply(null, null, LogPolicy$Upload.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LogPolicy$Upload.$VALUES.clone();
    }
}
