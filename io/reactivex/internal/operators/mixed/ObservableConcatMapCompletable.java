package io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import brd.a;
import brd.t;
import erd.o;
import io.reactivex.internal.util.ErrorMode;
import brd.d;
import java.lang.Object;
import io.reactivex.internal.operators.mixed.a;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver;
import brd.y;

public final class ObservableConcatMapCompletable extends a	// class@0012ce
{
    public final t b;
    public final o c;
    public final ErrorMode d;
    public final int e;

    public void ObservableConcatMapCompletable(t p0,o p1,ErrorMode p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void v(d p0){
       if (!a.a(this.b, this.c, p0)) {
          this.b.subscribe(new ObservableConcatMapCompletable$ConcatMapCompletableObserver(p0, this.c, this.d, this.e));
       }
       return;
    }
}
