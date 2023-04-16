package io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe;
import brd.t;
import erd.o;
import io.reactivex.internal.util.ErrorMode;
import brd.y;
import java.lang.Object;
import io.reactivex.internal.operators.mixed.a;
import io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver;

public final class ObservableConcatMapMaybe extends t	// class@0012d1
{
    public final t b;
    public final o c;
    public final ErrorMode d;
    public final int e;

    public void ObservableConcatMapMaybe(t p0,o p1,ErrorMode p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void subscribeActual(y p0){
       if (!a.b(this.b, this.c, p0)) {
          this.b.subscribe(new ObservableConcatMapMaybe$ConcatMapMaybeMainObserver(p0, this.c, this.e, this.d));
       }
       return;
    }
}
