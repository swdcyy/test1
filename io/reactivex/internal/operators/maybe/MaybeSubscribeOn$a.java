package io.reactivex.internal.operators.maybe.MaybeSubscribeOn$a;
import java.lang.Runnable;
import brd.p;
import brd.q;
import java.lang.Object;

public final class MaybeSubscribeOn$a implements Runnable	// class@0012a9
{
    public final p b;
    public final q c;

    public void MaybeSubscribeOn$a(p p0,q p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       this.c.b(this.b);
    }
}
