package com.yxcorp.gifshow.record.album.t0;
import erd.o;
import java.lang.Object;
import m8c.e;
import java.io.File;
import java.lang.String;

public final class t0 implements o	// class@001752
{
    public static final t0 b;

    static {
       t0.b = new t0();
    }
    public void t0(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (p0 != null && p0.getCoverFile() != null)? p0.getCoverFile().getAbsolutePath(): "";
       return p0;
    }
}
