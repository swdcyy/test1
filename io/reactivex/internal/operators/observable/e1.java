package io.reactivex.internal.operators.observable.e1;
import brd.m;
import brd.w;
import erd.c;
import brd.p;
import io.reactivex.internal.operators.observable.e1$a;
import brd.y;

public final class e1 extends m	// class@0013b5
{
    public final w b;
    public final c c;

    public void e1(w p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void A(p p0){
       this.b.subscribe(new e1$a(p0, this.c));
    }
}
