package com.kwai.component.list.exposed.behavior.ItemExposedBehavior$Event;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ItemExposedBehavior$Event extends Enum	// class@0009a8
{
    public static final ItemExposedBehavior$Event[] $VALUES;
    public static final ItemExposedBehavior$Event COLLECT;
    public static final ItemExposedBehavior$Event COLLECT_RESET_INDEX_RECORD;
    public static final ItemExposedBehavior$Event FIRST_SHOWN;
    public static final ItemExposedBehavior$Event REPORT;
    public static final ItemExposedBehavior$Event SCROLLED_REPORT;

    static {
       ItemExposedBehavior$Event uEvent = new ItemExposedBehavior$Event("COLLECT", 0);
       ItemExposedBehavior$Event.COLLECT = uEvent;
       ItemExposedBehavior$Event uEvent1 = new ItemExposedBehavior$Event("COLLECT_RESET_INDEX_RECORD", 1);
       ItemExposedBehavior$Event.COLLECT_RESET_INDEX_RECORD = uEvent1;
       ItemExposedBehavior$Event uEvent2 = new ItemExposedBehavior$Event("REPORT", 2);
       ItemExposedBehavior$Event.REPORT = uEvent2;
       ItemExposedBehavior$Event uEvent3 = new ItemExposedBehavior$Event("SCROLLED_REPORT", 3);
       ItemExposedBehavior$Event.SCROLLED_REPORT = uEvent3;
       ItemExposedBehavior$Event uEvent4 = new ItemExposedBehavior$Event("FIRST_SHOWN", 4);
       ItemExposedBehavior$Event.FIRST_SHOWN = uEvent4;
       ItemExposedBehavior$Event[] uEventArray = new ItemExposedBehavior$Event[]{uEvent,uEvent1,uEvent2,uEvent3,uEvent4};
       ItemExposedBehavior$Event.$VALUES = uEventArray;
    }
    public void ItemExposedBehavior$Event(String p0,int p1){
       super(p0, p1);
    }
    public static ItemExposedBehavior$Event valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ItemExposedBehavior$Event.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ItemExposedBehavior$Event.class, p0);
    }
    public static ItemExposedBehavior$Event[] values(){
       Object obj = PatchProxy.apply(null, null, ItemExposedBehavior$Event.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ItemExposedBehavior$Event.$VALUES.clone();
    }
}
