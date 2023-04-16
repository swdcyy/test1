package com.kwai.component.list.exposed.behavior.a;
import erd.r;
import java.lang.Object;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior$Event;

public final class a implements r	// class@0009aa
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == ItemExposedBehavior$Event.COLLECT || p0 == ItemExposedBehavior$Event.COLLECT_RESET_INDEX_RECORD)? true: false;
       return b;
    }
}
