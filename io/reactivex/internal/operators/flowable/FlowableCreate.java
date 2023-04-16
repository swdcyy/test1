package io.reactivex.internal.operators.flowable.FlowableCreate;
import brd.h;
import cxd.c;
import io.reactivex.internal.operators.flowable.FlowableCreate$a;
import java.lang.Enum;
import io.reactivex.internal.operators.flowable.FlowableCreate$BufferAsyncEmitter;
import io.reactivex.internal.operators.flowable.FlowableCreate$LatestAsyncEmitter;
import io.reactivex.internal.operators.flowable.FlowableCreate$DropAsyncEmitter;
import io.reactivex.internal.operators.flowable.FlowableCreate$ErrorAsyncEmitter;
import io.reactivex.internal.operators.flowable.FlowableCreate$MissingEmitter;
import cxd.d;
import brd.j;
import io.reactivex.c;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter;

public final class FlowableCreate extends h	// class@00122a
{
    public final c c;
    public final BackpressureStrategy d;

    public void D(c p0){
       FlowableCreate$BufferAsyncEmitter uBufferAsync;
       int i = FlowableCreate$a.a[this.d.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                uBufferAsync = (i != 4)? new FlowableCreate$BufferAsyncEmitter(p0, h.b()): new FlowableCreate$LatestAsyncEmitter(p0);
             }else {
                uBufferAsync = new FlowableCreate$DropAsyncEmitter(p0);
             }
          }else {
             uBufferAsync = new FlowableCreate$ErrorAsyncEmitter(p0);
          }
       }else {
          uBufferAsync = new FlowableCreate$MissingEmitter(p0);
       }
       p0.onSubscribe(uBufferAsync);
       this.c.a(uBufferAsync);
       return;
    }
}
