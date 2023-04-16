package com.yxcorp.gifshow.record.album.s1;
import java.util.Comparator;
import java.lang.Object;
import m8c.e;
import java.lang.Long;

public final class s1 implements Comparator	// class@001750
{
    public static final s1 b;

    static {
       s1.b = new s1();
    }
    public void s1(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(p1.i(), p0.i());
    }
}
