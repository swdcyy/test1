package io.reactivex.internal.operators.single.a$a$b;
import java.lang.Runnable;
import io.reactivex.internal.operators.single.a$a;
import java.lang.Object;
import brd.d0;

public final class a$a$b implements Runnable	// class@001483
{
    public final Object b;
    public final a$a c;

    public void a$a$b(a$a p0,Object p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       this.c.c.onSuccess(this.b);
    }
}
