package io.reactivex.internal.operators.mixed.ObservableConcatMapSingle;
import brd.t;
import erd.o;
import io.reactivex.internal.util.ErrorMode;
import brd.y;
import java.lang.Object;
import io.reactivex.internal.operators.mixed.a;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle$ConcatMapSingleMainObserver;

public final class ObservableConcatMapSingle extends t	// class@0012d4
{
    public final t b;
    public final o c;
    public final ErrorMode d;
    public final int e;

    public void ObservableConcatMapSingle(t p0,o p1,ErrorMode p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void subscribeActual(y p0){
       if (!a.c(this.b, this.c, p0)) {
          this.b.subscribe(new ObservableConcatMapSingle$ConcatMapSingleMainObserver(p0, this.c, this.e, this.d));
       }
       return;
    }
}