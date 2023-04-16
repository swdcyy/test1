package io.netty.util.Recycler$b;
import io.netty.util.concurrent.e;
import io.netty.util.Recycler;
import java.lang.Object;
import io.netty.util.Recycler$f;
import java.lang.Thread;

public class Recycler$b extends e	// class@0010e3
{
    public final Recycler c;

    public void Recycler$b(Recycler p0){
       this.c = p0;
       super();
    }
    public Object d(){
       return new Recycler$f(this.c, Thread.currentThread(), this.c.a);
    }
}
