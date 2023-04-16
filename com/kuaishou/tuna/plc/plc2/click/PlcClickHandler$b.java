package com.kuaishou.tuna.plc.plc2.click.PlcClickHandler$b;
import z1.a;
import msd.l;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PlcClickHandler$b implements a	// class@00104e
{
    public final l a;

    public void PlcClickHandler$b(l p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcClickHandler$b.class, "1")) {
       }else {
          a.o(p0, "action");
          this.a.invoke(p0);
       }
       return;
    }
}
