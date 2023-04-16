package io.reactivex.internal.operators.observable.e;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.r;
import brd.y;
import io.reactivex.internal.operators.observable.e$a;

public final class e extends a	// class@0013b6
{
    public final r c;

    public void e(w p0,r p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new e$a(p0, this.c));
    }
}
