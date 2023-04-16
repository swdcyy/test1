package com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$d;
import erd.g;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl;
import x06.c;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna.plc.plc2.a;
import java.lang.Runnable;
import ekd.k1;

public final class PlcLifecycleOwnerImpl$d implements g	// class@001048
{
    public final PlcLifecycleOwnerImpl b;
    public final c c;
    public final g d;

    public void PlcLifecycleOwnerImpl$d(PlcLifecycleOwnerImpl p0,c p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl$d.class, "1")) {
       }else {
          a uoa = 22;
          if (p0 != null && p0.intValue() == uoa) {
             i = 1;
          }else {
             uoa = 23;
             if (p0 != null && p0.intValue() == uoa) {
                i = 2;
             }else {
                uoa = 24;
                i = (p0 != null && p0.intValue() == uoa)? 3: 0;
             }
          }
          k1.o(new a(this, i));
       }
       return;
    }
}
