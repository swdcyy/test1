package com.yxcorp.gifshow.upload.q0;
import erd.o;
import java.lang.Object;
import java.io.File;
import brd.t;
import com.yxcorp.gifshow.encode.s0;
import dnc.u1;

public final class q0 implements o	// class@001e9a
{
    public static final q0 b;

    static {
       q0.b = new q0();
    }
    public void q0(){
       super();
    }
    public final Object apply(Object p0){
       return s0.A(p0).onErrorReturn(new u1(p0));
    }
}
