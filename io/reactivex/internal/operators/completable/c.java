package io.reactivex.internal.operators.completable.c;
import brd.a;
import java.lang.Throwable;
import brd.d;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class c extends a	// class@001202
{
    public final Throwable b;

    public void c(Throwable p0){
       super();
       this.b = p0;
    }
    public void v(d p0){
       EmptyDisposable.error(this.b, p0);
    }
}
