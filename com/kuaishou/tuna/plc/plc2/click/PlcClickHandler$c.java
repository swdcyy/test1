package com.kuaishou.tuna.plc.plc2.click.PlcClickHandler$c;
import z1.a;
import msd.l;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PlcClickHandler$c implements a	// class@00104f
{
    public final l a;

    public void PlcClickHandler$c(l p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcClickHandler$c.class, "1")) {
       }else {
          a.o(p0, "it");
          this.a.invoke(p0);
       }
       return;
    }
}
