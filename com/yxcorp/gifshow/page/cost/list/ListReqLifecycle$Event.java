package com.yxcorp.gifshow.page.cost.list.ListReqLifecycle$Event;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ListReqLifecycle$Event extends Enum	// class@000e24
{
    public static final ListReqLifecycle$Event[] $VALUES;
    public static final ListReqLifecycle$Event DATA_INITED;
    public static final ListReqLifecycle$Event END_REQ;
    public static final ListReqLifecycle$Event START_REQ;

    static {
       ListReqLifecycle$Event uEvent = new ListReqLifecycle$Event("START_REQ", 0);
       ListReqLifecycle$Event.START_REQ = uEvent;
       ListReqLifecycle$Event uEvent1 = new ListReqLifecycle$Event("END_REQ", 1);
       ListReqLifecycle$Event.END_REQ = uEvent1;
       ListReqLifecycle$Event uEvent2 = new ListReqLifecycle$Event("DATA_INITED", 2);
       ListReqLifecycle$Event.DATA_INITED = uEvent2;
       ListReqLifecycle$Event[] uEventArray = new ListReqLifecycle$Event[]{uEvent,uEvent1,uEvent2};
       ListReqLifecycle$Event.$VALUES = uEventArray;
    }
    public void ListReqLifecycle$Event(String p0,int p1){
       super(p0, p1);
    }
    public static ListReqLifecycle$Event valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ListReqLifecycle$Event.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ListReqLifecycle$Event.class, p0);
    }
    public static ListReqLifecycle$Event[] values(){
       Object obj = PatchProxy.apply(null, null, ListReqLifecycle$Event.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ListReqLifecycle$Event.$VALUES.clone();
    }
}
