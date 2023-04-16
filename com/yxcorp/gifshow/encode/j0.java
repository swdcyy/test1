package com.yxcorp.gifshow.encode.j0;
import erd.o;
import java.lang.Object;
import android.util.Pair;
import java.lang.Float;
import brd.t;

public final class j0 implements o	// class@000d28
{
    public static final j0 b;

    static {
       j0.b = new j0();
    }
    public void j0(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (p0.first == null)? t.just(new Pair(null, Float.valueOf(((p0.second.floatValue() * 0x3f000000) + 0x3f000000)))): t.just(p0);
       return p0;
    }
}
