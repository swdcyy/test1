package com.yxcorp.gifshow.photo.download.task.k0;
import erd.o;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.photo.download.task.n0;
import java.lang.String;
import brd.t;

public final class k0 implements o	// class@000f04
{
    public static final k0 b;

    static {
       k0.b = new k0();
    }
    public void k0(){
       super();
    }
    public final Object apply(Object p0){
       return t.just(p0.getAbsolutePath());
    }
}
