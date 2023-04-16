package com.yxcorp.gifshow.record.album.t1;
import java.util.Comparator;
import java.lang.Object;
import m8c.e;
import java.lang.Long;

public final class t1 implements Comparator	// class@001753
{
    public static final t1 b;

    static {
       t1.b = new t1();
    }
    public void t1(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(p1.d(), p0.d());
    }
}
