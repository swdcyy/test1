package com.kuaishou.tuna_core.button.TunaButton$Companion$a;
import agc.c;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import ma6.a;
import java.lang.Integer;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.button.TunaButtonMonitor;

public final class TunaButton$Companion$a implements c	// class@00108c
{
    public final int a;
    public final JumpUrlModel b;
    public final a c;
    public final Integer d;

    public void TunaButton$Companion$a(int p0,JumpUrlModel p1,a p2,Integer p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TunaButton$Companion$a.class, "2")) {
          return;
       }
       TunaButton$Companion$a tc = this.c;
       tc.mFailureReason = "JumpFailed";
       TunaButtonMonitor.b.b(tc, Integer.valueOf(this.a));
       PatchProxy.onMethodExit(TunaButton$Companion$a.class, "2");
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoidWithListener(null, this, TunaButton$Companion$a.class, "1")) {
          return;
       }
       TunaButtonMonitor.b.b(this.c, Integer.valueOf(this.a));
       PatchProxy.onMethodExit(TunaButton$Companion$a.class, "1");
       return;
    }
}
