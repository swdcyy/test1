package com.yxcorp.gifshow.record.album.q1;
import java.util.Comparator;
import java.lang.Object;
import java.io.File;
import java.lang.Long;

public final class q1 implements Comparator	// class@00174a
{
    public static final q1 b;

    static {
       q1.b = new q1();
    }
    public void q1(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(p1.lastModified(), p0.lastModified());
    }
}
