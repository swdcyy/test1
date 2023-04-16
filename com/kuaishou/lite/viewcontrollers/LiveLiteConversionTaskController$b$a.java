package com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$b$a;
import z1.a;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$b;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController;

public final class LiveLiteConversionTaskController$b$a implements a	// class@000945
{
    public final LiveLiteConversionTaskController$b a;

    public void LiveLiteConversionTaskController$b$a(LiveLiteConversionTaskController$b p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveLiteConversionTaskController$b$a.class, "1")) {
       }else {
          int i = 3;
          if (p0 != null && p0.intValue() == i) {
             this.a.b.X2(false);
          }
          PatchProxy.onMethodExit(LiveLiteConversionTaskController$b$a.class, "1");
       }
       return;
    }
}
