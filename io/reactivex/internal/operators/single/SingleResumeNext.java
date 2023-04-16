package io.reactivex.internal.operators.single.SingleResumeNext;
import brd.a0;
import brd.e0;
import erd.o;
import brd.d0;
import io.reactivex.internal.operators.single.SingleResumeNext$ResumeMainSingleObserver;

public final class SingleResumeNext extends a0	// class@00146f
{
    public final e0 b;
    public final o c;

    public void SingleResumeNext(e0 p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       this.b.b(new SingleResumeNext$ResumeMainSingleObserver(p0, this.c));
    }
}
