package io.reactivex.internal.operators.single.SingleCreate;
import brd.a0;
import io.reactivex.i;
import brd.d0;
import io.reactivex.internal.operators.single.SingleCreate$Emitter;
import crd.b;
import brd.c0;
import java.lang.Throwable;
import drd.a;

public final class SingleCreate extends a0	// class@00145c
{
    public final i b;

    public void SingleCreate(i p0){
       super();
       this.b = p0;
    }
    public void S(d0 p0){
       SingleCreate$Emitter uEmitter = new SingleCreate$Emitter(p0);
       p0.onSubscribe(uEmitter);
       this.b.a(uEmitter);
       return;
    }
}
