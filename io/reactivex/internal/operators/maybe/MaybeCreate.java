package io.reactivex.internal.operators.maybe.MaybeCreate;
import brd.m;
import io.reactivex.e;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeCreate$Emitter;
import crd.b;
import brd.o;
import java.lang.Throwable;
import drd.a;

public final class MaybeCreate extends m	// class@001292
{
    public final e b;

    public void MaybeCreate(e p0){
       super();
       this.b = p0;
    }
    public void A(p p0){
       MaybeCreate$Emitter uEmitter = new MaybeCreate$Emitter(p0);
       p0.onSubscribe(uEmitter);
       this.b.a(uEmitter);
       return;
    }
}
