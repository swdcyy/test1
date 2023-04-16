package com.yxcorp.gifshow.fragment.user.b;
import java.util.Comparator;
import java.lang.Object;
import m8c.e;
import java.lang.Long;

public final class b implements Comparator	// class@001280
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(p1.i(), p0.i());
    }
}
