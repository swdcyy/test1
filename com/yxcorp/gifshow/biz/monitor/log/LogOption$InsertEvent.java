package com.yxcorp.gifshow.biz.monitor.log.LogOption$InsertEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LogOption$InsertEvent extends Enum	// class@001c5a
{
    public static final LogOption$InsertEvent[] $VALUES;
    public static final LogOption$InsertEvent HEAD;
    public static final LogOption$InsertEvent TAIL;

    static {
       LogOption$InsertEvent insertEvent;
       LogOption$InsertEvent[] insertEventA = new LogOption$InsertEvent[]{insertEvent,insertEvent};
       insertEvent = new LogOption$InsertEvent("HEAD", 0);
       LogOption$InsertEvent.HEAD = insertEvent;
       insertEvent = new LogOption$InsertEvent("TAIL", 1);
       LogOption$InsertEvent.TAIL = insertEvent;
       LogOption$InsertEvent.$VALUES = insertEventA;
    }
    public void LogOption$InsertEvent(String p0,int p1){
       super(p0, p1);
    }
    public static LogOption$InsertEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LogOption$InsertEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LogOption$InsertEvent.class, p0);
    }
    public static LogOption$InsertEvent[] values(){
       Object obj = PatchProxy.apply(null, null, LogOption$InsertEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LogOption$InsertEvent.$VALUES.clone();
    }
}
