package com.yxcorp.gifshow.record.album.n1;
import erd.r;
import java.lang.Object;
import m8c.e;
import java.io.File;

public final class n1 implements r	// class@001741
{
    public static final n1 b;

    static {
       n1.b = new n1();
    }
    public void n1(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0.getCoverFile() != null && p0.getCoverFile().exists())? true: false;
       return b;
    }
}
