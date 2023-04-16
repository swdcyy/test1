package com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;

public final class PlcDynamicLogger$a implements Runnable	// class@000fe3
{
    public final Object b;
    public final String c;
    public final String d;

    public void PlcDynamicLogger$a(Object p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       String str;
       if (PatchProxy.applyVoid(null, this, PlcDynamicLogger$a.class, "1")) {
          return;
       }
       PlcDynamicLogger$a tb = this.b;
       if (tb != null) {
          try{
             str = a.a.q(tb);
          }catch(java.lang.Exception e0){
             str = "{crash:"+e0+'}';
          }
          if (str != null) {
          label_0033 :
             PlcDynamicLogger.c("logThread ¡þ"+this.c+"¡þ, extra info ¡þ"+str+"¡þ, ¡þ"+this.d+0x3013);
             return;
          }
       }
       str = "{null}";
       goto label_0033 ;
    }
}
