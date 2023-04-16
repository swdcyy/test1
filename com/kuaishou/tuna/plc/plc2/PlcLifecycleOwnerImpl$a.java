package com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$a;
import erd.g;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl;
import x06.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e4a.a;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.plc.error.exception.BasePlcException;
import com.yxcorp.gifshow.detail.plc.error.exception.PlcExceptionHandler;

public final class PlcLifecycleOwnerImpl$a implements g	// class@001045
{
    public final PlcLifecycleOwnerImpl b;
    public final a c;

    public void PlcLifecycleOwnerImpl$a(PlcLifecycleOwnerImpl p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl$a.class, "1")) {
       }else {
          a uoa = new a().c("plc consumer error with: "+this.c.b());
          uoa.b(3);
          a.o(p0, "it");
          PlcExceptionHandler.a(uoa.d(p0).a(), "PLC_UNKNOWN");
          this.b.D(p0);
       }
       return;
    }
}
