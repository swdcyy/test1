package com.google.common.util.concurrent.AbstractFuture$c;
import com.google.common.util.concurrent.AbstractFuture;
import java.lang.Throwable;
import java.lang.Object;

public final class AbstractFuture$c	// class@001925
{
    public final boolean a;
    public final Throwable b;
    public static final AbstractFuture$c c;
    public static final AbstractFuture$c d;

    static {
       if (AbstractFuture.e) {
          AbstractFuture$c.d = null;
          AbstractFuture$c.c = null;
       }else {
          AbstractFuture$c.d = new AbstractFuture$c(false, null);
          AbstractFuture$c.c = new AbstractFuture$c(true, null);
       }
    }
    public void AbstractFuture$c(boolean p0,Throwable p1){
       super();
       this.a = p0;
       this.b = p1;
    }
}