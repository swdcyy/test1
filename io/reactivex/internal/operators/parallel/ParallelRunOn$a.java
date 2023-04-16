package io.reactivex.internal.operators.parallel.ParallelRunOn$a;
import io.reactivex.internal.schedulers.h$a;
import io.reactivex.internal.operators.parallel.ParallelRunOn;
import cxd.c;
import java.lang.Object;
import brd.z$c;

public final class ParallelRunOn$a implements h$a	// class@001450
{
    public final c[] a;
    public final c[] b;
    public final ParallelRunOn c;

    public void ParallelRunOn$a(ParallelRunOn p0,c[] p1,c[] p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void a(int p0,z$c p1){
       this.c.g(p0, this.a, this.b, p1);
    }
}
