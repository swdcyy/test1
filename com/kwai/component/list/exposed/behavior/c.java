package com.kwai.component.list.exposed.behavior.c;
import erd.r;
import java.lang.Object;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior$Event;

public final class c implements r	// class@0009ac
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == ItemExposedBehavior$Event.SCROLLED_REPORT)? true: false;
       return b;
    }
}
