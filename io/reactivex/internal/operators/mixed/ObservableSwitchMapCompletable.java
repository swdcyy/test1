package io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import brd.a;
import brd.t;
import erd.o;
import brd.d;
import java.lang.Object;
import io.reactivex.internal.operators.mixed.a;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable$SwitchMapCompletableObserver;
import brd.y;

public final class ObservableSwitchMapCompletable extends a	// class@0012d7
{
    public final t b;
    public final o c;
    public final boolean d;

    public void ObservableSwitchMapCompletable(t p0,o p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void v(d p0){
       if (!a.a(this.b, this.c, p0)) {
          this.b.subscribe(new ObservableSwitchMapCompletable$SwitchMapCompletableObserver(p0, this.c, this.d));
       }
       return;
    }
}
