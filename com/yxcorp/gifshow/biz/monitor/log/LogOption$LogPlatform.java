package com.yxcorp.gifshow.biz.monitor.log.LogOption$LogPlatform;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LogOption$LogPlatform extends Enum	// class@001c5b
{
    public static final LogOption$LogPlatform[] $VALUES;
    public static final LogOption$LogPlatform CLIENT;
    public static final LogOption$LogPlatform H5;
    public static final LogOption$LogPlatform SDK;

    static {
       LogOption$LogPlatform logPlatform;
       LogOption$LogPlatform[] logPlatformA = new LogOption$LogPlatform[]{logPlatform,logPlatform,logPlatform};
       logPlatform = new LogOption$LogPlatform("CLIENT", 0, "client");
       LogOption$LogPlatform.CLIENT = logPlatform;
       logPlatform = new LogOption$LogPlatform("SDK", 1, "sdk");
       LogOption$LogPlatform.SDK = logPlatform;
       logPlatform = new LogOption$LogPlatform("H5", 2, "h5");
       LogOption$LogPlatform.H5 = logPlatform;
       LogOption$LogPlatform.$VALUES = logPlatformA;
    }
    public void LogOption$LogPlatform(String p0,int p1,String p2){
       super(p0, p1);
    }
    public static LogOption$LogPlatform valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LogOption$LogPlatform.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LogOption$LogPlatform.class, p0);
    }
    public static LogOption$LogPlatform[] values(){
       Object obj = PatchProxy.apply(null, null, LogOption$LogPlatform.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LogOption$LogPlatform.$VALUES.clone();
    }
    public final String getName(){
       Object obj = PatchProxy.apply(null, this, LogOption$LogPlatform.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.name();
    }
}
