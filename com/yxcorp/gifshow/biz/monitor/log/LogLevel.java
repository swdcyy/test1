package com.yxcorp.gifshow.biz.monitor.log.LogLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LogLevel extends Enum	// class@001c59
{
    public final String level;
    public static final LogLevel[] $VALUES;
    public static final LogLevel DEBUG;
    public static final LogLevel ERROR;
    public static final LogLevel INFO;
    public static final LogLevel WARNING;

    static {
       LogLevel logLevel;
       LogLevel[] logLevelArra = new LogLevel[]{logLevel,logLevel,logLevel,logLevel};
       logLevel = new LogLevel("DEBUG", 0, "DEBUG");
       LogLevel.DEBUG = logLevel;
       logLevel = new LogLevel("INFO", 1, "INFO");
       LogLevel.INFO = logLevel;
       logLevel = new LogLevel("ERROR", 2, "ERROR");
       LogLevel.ERROR = logLevel;
       logLevel = new LogLevel("WARNING", 3, "WARNING");
       LogLevel.WARNING = logLevel;
       LogLevel.$VALUES = logLevelArra;
    }
    public void LogLevel(String p0,int p1,String p2){
       super(p0, p1);
       this.level = p2;
    }
    public static LogLevel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LogLevel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LogLevel.class, p0);
    }
    public static LogLevel[] values(){
       Object obj = PatchProxy.apply(null, null, LogLevel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LogLevel.$VALUES.clone();
    }
    public final String getLevel(){
       return this.level;
    }
}
