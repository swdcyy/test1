package io.reactivex.internal.operators.single.a$a;
import brd.d0;
import io.reactivex.internal.operators.single.a;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.operators.single.a$a$a;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import crd.b;
import brd.z;
import io.reactivex.internal.operators.single.a$a$b;

public final class a$a implements d0	// class@001484
{
    public final SequentialDisposable b;
    public final d0 c;
    public final a d;

    public void a$a(a p0,SequentialDisposable p1,d0 p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void onError(Throwable p0){
       a$a tb = this.b;
       a$a td = this.d;
       a e = td.e;
       a$a$a uoa$a = new a$a$a(this, p0);
       a c = (td.f != null)? td.c: 0;
       tb.replace(e.e(uoa$a, c, td.d));
       return;
    }
    public void onSubscribe(b p0){
       this.b.replace(p0);
    }
    public void onSuccess(Object p0){
       a$a td = this.d;
       this.b.replace(td.e.e(new a$a$b(this, p0), td.c, td.d));
    }
}
