package com.kwai.component.logging.controller.KsLogConfig$InsertEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsLogConfig$InsertEvent extends Enum	// class@0009b0
{
    public static final KsLogConfig$InsertEvent[] $VALUES;
    public static final KsLogConfig$InsertEvent HEAD;
    public static final KsLogConfig$InsertEvent TAIL;

    static {
       KsLogConfig$InsertEvent insertEvent = new KsLogConfig$InsertEvent("HEAD", 0);
       KsLogConfig$InsertEvent.HEAD = insertEvent;
       KsLogConfig$InsertEvent insertEvent1 = new KsLogConfig$InsertEvent("TAIL", 1);
       KsLogConfig$InsertEvent.TAIL = insertEvent1;
       KsLogConfig$InsertEvent[] insertEventA = new KsLogConfig$InsertEvent[]{insertEvent,insertEvent1};
       KsLogConfig$InsertEvent.$VALUES = insertEventA;
    }
    public void KsLogConfig$InsertEvent(String p0,int p1){
       super(p0, p1);
    }
    public static KsLogConfig$InsertEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogConfig$InsertEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogConfig$InsertEvent.class, p0);
    }
    public static KsLogConfig$InsertEvent[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogConfig$InsertEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogConfig$InsertEvent.$VALUES.clone();
    }
}
