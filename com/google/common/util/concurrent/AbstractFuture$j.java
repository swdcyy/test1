package com.google.common.util.concurrent.AbstractFuture$j;
import java.lang.Object;
import com.google.common.util.concurrent.AbstractFuture;
import java.lang.Thread;
import com.google.common.util.concurrent.AbstractFuture$b;

public final class AbstractFuture$j	// class@00192c
{
    public Thread a;
    public AbstractFuture$j b;
    public static final AbstractFuture$j c;

    static {
       AbstractFuture$j.c = new AbstractFuture$j(false);
    }
    public void AbstractFuture$j(){
       super();
       AbstractFuture.g.e(this, Thread.currentThread());
    }
    public void AbstractFuture$j(boolean p0){
       super();
    }
    public void a(AbstractFuture$j p0){
       AbstractFuture.g.d(this, p0);
    }
}
