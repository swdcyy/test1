package io.reactivex.internal.operators.completable.CompletableCreate;
import brd.a;
import io.reactivex.a;
import brd.d;
import io.reactivex.internal.operators.completable.CompletableCreate$Emitter;
import crd.b;
import brd.c;
import java.lang.Throwable;
import drd.a;

public final class CompletableCreate extends a	// class@0011f4
{
    public final a b;

    public void CompletableCreate(a p0){
       super();
       this.b = p0;
    }
    public void v(d p0){
       CompletableCreate$Emitter uEmitter = new CompletableCreate$Emitter(p0);
       p0.onSubscribe(uEmitter);
       this.b.a(uEmitter);
       return;
    }
}
