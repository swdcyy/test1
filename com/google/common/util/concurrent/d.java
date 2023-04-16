package com.google.common.util.concurrent.d;
import xk.c;
import java.util.concurrent.Future;
import java.lang.Object;
import java.lang.String;
import ok.n;
import com.google.common.util.concurrent.h;
import xk.d;
import com.google.common.util.concurrent.e$b;

public final class d extends c	// class@001936
{

    public static Object a(Future p0){
       n.r(p0.isDone(), "Future was expected to be done: %s", p0);
       return h.a(p0);
    }
    public static d b(Object p0){
       if (p0 == null) {
          return e$b.d;
       }
       return new e$b(p0);
    }
}
