package io.reactivex.internal.operators.single.a$a$a;
import java.lang.Runnable;
import io.reactivex.internal.operators.single.a$a;
import java.lang.Throwable;
import java.lang.Object;
import brd.d0;

public final class a$a$a implements Runnable	// class@001482
{
    public final Throwable b;
    public final a$a c;

    public void a$a$a(a$a p0,Throwable p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       this.c.c.onError(this.b);
    }
}
