package com.kuaishou.gifshow.kuaishan.logic.t;
import erd.o;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.i0$b;
import java.util.Objects;
import x80.m0;
import java.util.concurrent.Callable;
import brd.t;

public final class t implements o	// class@001a73
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final Object apply(Object p0){
       Objects.requireNonNull(p0);
       return t.fromCallable(new m0(p0));
    }
}
