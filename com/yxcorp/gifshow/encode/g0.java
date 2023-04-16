package com.yxcorp.gifshow.encode.g0;
import erd.o;
import java.lang.Object;
import android.util.Pair;
import brd.t;
import java.io.File;
import com.yxcorp.gifshow.encode.s0;
import com.yxcorp.gifshow.encode.i0;

public final class g0 implements o	// class@000d1d
{
    public static final g0 b;

    static {
       g0.b = new g0();
    }
    public void g0(){
       super();
    }
    public final Object apply(Object p0){
       Pair first = p0.first;
       p0 = (first == null)? t.just(p0): s0.A(first).map(i0.b);
       return p0;
    }
}
