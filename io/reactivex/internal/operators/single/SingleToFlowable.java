package io.reactivex.internal.operators.single.SingleToFlowable;
import brd.h;
import brd.e0;
import cxd.c;
import io.reactivex.internal.operators.single.SingleToFlowable$SingleToFlowableObserver;
import brd.d0;

public final class SingleToFlowable extends h	// class@00147b
{
    public final e0 c;

    public void SingleToFlowable(e0 p0){
       super();
       this.c = p0;
    }
    public void D(c p0){
       this.c.b(new SingleToFlowable$SingleToFlowableObserver(p0));
    }
}
