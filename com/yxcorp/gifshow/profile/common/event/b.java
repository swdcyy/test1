package com.yxcorp.gifshow.profile.common.event.b;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Integer;

public final class b implements Comparator	// class@0012d5
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p1.intValue() - p0.intValue());
    }
}
