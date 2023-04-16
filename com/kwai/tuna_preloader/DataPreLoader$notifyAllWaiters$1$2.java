package com.kwai.tuna_preloader.DataPreLoader$notifyAllWaiters$1$2;
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

public final class DataPreLoader$notifyAllWaiters$1$2 extends FunctionReferenceImpl implements l	// class@001968
{

    public void DataPreLoader$notifyAllWaiters$1$2(c p0){
       super(1, p0, c.class, "onError", "onError\(Ljava/lang/Throwable;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$notifyAllWaiters$1$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onError(p0);
       return;
    }
}
