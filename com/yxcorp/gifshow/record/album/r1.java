package com.yxcorp.gifshow.record.album.r1;
import java.util.Comparator;
import java.lang.Object;
import java.io.File;
import java.lang.Long;

public final class r1 implements Comparator	// class@00174d
{
    public static final r1 b;

    static {
       r1.b = new r1();
    }
    public void r1(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(p1.lastModified(), p0.lastModified());
    }
}
