package io.netty.util.internal.chmv8.ForkJoinTask$b;
import java.lang.ref.WeakReference;
import io.netty.util.internal.chmv8.ForkJoinTask;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.ref.ReferenceQueue;
import java.lang.Thread;

public final class ForkJoinTask$b extends WeakReference	// class@001179
{
    public final Throwable a;
    public ForkJoinTask$b b;
    public final long c;

    public void ForkJoinTask$b(ForkJoinTask p0,Throwable p1,ForkJoinTask$b p2){
       super(p0, ForkJoinTask.exceptionTableRefQueue);
       this.a = p1;
       this.b = p2;
       this.c = Thread.currentThread().getId();
    }
}
