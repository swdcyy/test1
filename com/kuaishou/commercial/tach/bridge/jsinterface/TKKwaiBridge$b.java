package com.kuaishou.commercial.tach.bridge.jsinterface.TKKwaiBridge$b;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.bridge.jsinterface.TKKwaiBridge;
import com.tkruntime.v8.JsValueRef;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class TKKwaiBridge$b implements Runnable	// class@001643
{
    public final JsValueRef b;
    public final String c;
    public final TKKwaiBridge d;

    public void TKKwaiBridge$b(TKKwaiBridge p0,JsValueRef p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKKwaiBridge$b.class, "1")) {
          return;
       }
       this.d.functionCall(this.b, this.c);
       return;
    }
}
