package com.kuaishou.tuna.plc.plc2.a;
import java.lang.Runnable;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import erd.g;
import x06.a;
import u06.h;
import u06.a;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl;

public final class a implements Runnable	// class@00104c
{
    public final PlcLifecycleOwnerImpl$d b;
    public final int c;

    public void a(PlcLifecycleOwnerImpl$d p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       try{
          this.b.c.a().accept(new h(this.b.b.B(), this.c));
       }catch(java.lang.Exception e0){
          this.b.d.accept(e0);
       }
       return;
    }
}
