package com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;

public final class PlcDynamicLogger$b implements Runnable	// class@000fe4
{
    public final Object b;
    public final String c;
    public final String d;

    public void PlcDynamicLogger$b(Object p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       String str;
       if (PatchProxy.applyVoid(null, this, PlcDynamicLogger$b.class, "1")) {
          return;
       }
       PlcDynamicLogger$b tb = this.b;
       if (tb != null) {
          str = a.a.q(tb);
          if (str != null) {
          label_001b :
             PlcDynamicLogger.g("logThread ¡þ"+this.c+"¡þ, extra info ¡þ"+str+"¡þ, ¡þ"+this.d+0x3013);
             return;
          }
       }
       str = "{null}";
       goto label_001b ;
    }
}
