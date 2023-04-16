package com.google.common.util.concurrent.AbstractFuture$f;
import java.lang.Runnable;
import com.google.common.util.concurrent.AbstractFuture;
import xk.d;
import java.lang.Object;
import com.google.common.util.concurrent.AbstractFuture$b;

public final class AbstractFuture$f implements Runnable	// class@001928
{
    public final AbstractFuture b;
    public final d c;

    public void run(){
       if (this.b.b != this) {
          return;
       }
       if (AbstractFuture.g.b(this.b, this, AbstractFuture.B(this.c))) {
          AbstractFuture.t(this.b);
       }
       return;
    }
}
