package com.kwai.tuna_preloader.DataPreLoader$notifyAllWaiters$1$4;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mrd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Throwable;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import brd.y;

public final class DataPreLoader$notifyAllWaiters$1$4 extends FunctionReferenceImpl implements l	// class@00196a
{

    public void DataPreLoader$notifyAllWaiters$1$4(c p0){
       super(1, p0, c.class, "onError", "onError\(Ljava/lang/Throwable;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$notifyAllWaiters$1$4.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onError(p0);
       return;
    }
}
