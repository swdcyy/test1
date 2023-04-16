package com.yxcorp.gifshow.record.album.v1;
import java.util.Comparator;
import java.lang.Object;
import m8c.e;
import java.lang.Long;

public final class v1 implements Comparator	// class@00177f
{
    public static final v1 b;

    static {
       v1.b = new v1();
    }
    public void v1(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(p1.d(), p0.d());
    }
}
