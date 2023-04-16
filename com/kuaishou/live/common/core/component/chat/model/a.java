package com.kuaishou.live.common.core.component.chat.model.a;
import java.util.Comparator;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.Comparable;

public final class a implements Comparator	// class@001044
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i = p0.getValue().compareTo(p1.getValue());
       if (i) {
       }else {
          i = 1;
       }
       return i;
    }
}
