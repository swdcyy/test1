package com.kuaishou.live.common.core.component.gift.domain.slot.manager.b;
import java.util.Comparator;
import java.lang.Object;
import xj1.a;
import java.lang.Long;

public final class b implements Comparator	// class@001270
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       long l = p0.h();
       long l1 = p1.h();
       if (p0.i()) {
          l = 0x7ffffffe;
       }
       if (p1.i()) {
          l1 = 0x7ffffffe;
       }
       int i = Long.compare(l1, l);
       if (!i) {
          i = Long.compare(p0.g(), p1.g());
       }
       return i;
    }
}
