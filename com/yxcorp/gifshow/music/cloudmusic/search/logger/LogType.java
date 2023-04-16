package com.yxcorp.gifshow.music.cloudmusic.search.logger.LogType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LogType extends Enum	// class@002038
{
    public static final LogType[] $VALUES;
    public static final LogType CLICK;
    public static final LogType SHOW;

    static {
       LogType logType;
       LogType[] logTypeArray = new LogType[]{logType,logType};
       logType = new LogType("CLICK", 0);
       LogType.CLICK = logType;
       logType = new LogType("SHOW", 1);
       LogType.SHOW = logType;
       LogType.$VALUES = logTypeArray;
    }
    public void LogType(String p0,int p1){
       super(p0, p1);
    }
    public static LogType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LogType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LogType.class, p0);
    }
    public static LogType[] values(){
       Object obj = PatchProxy.apply(null, null, LogType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LogType.$VALUES.clone();
    }
}
