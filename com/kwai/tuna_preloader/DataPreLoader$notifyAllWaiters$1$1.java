package com.kwai.tuna_preloader.DataPreLoader$notifyAllWaiters$1$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mrd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import brd.y;

public final class DataPreLoader$notifyAllWaiters$1$1 extends FunctionReferenceImpl implements l	// class@001967
{

    public void DataPreLoader$notifyAllWaiters$1$1(c p0){
       super(1, p0, c.class, "onNext", "onNext\(Ljava/lang/Object;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ResultWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader$notifyAllWaiters$1$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onNext(p0);
       return;
    }
}
