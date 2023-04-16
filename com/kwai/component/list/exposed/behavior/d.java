package com.kwai.component.list.exposed.behavior.d;
import erd.r;
import java.lang.Object;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior$Event;

public final class d implements r	// class@0009ad
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == ItemExposedBehavior$Event.FIRST_SHOWN)? true: false;
       return b;
    }
}
