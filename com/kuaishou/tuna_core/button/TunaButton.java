package com.kuaishou.tuna_core.button.TunaButton;
import com.kuaishou.tuna_core.button.TunaButton$Companion;
import nsd.u;
import java.lang.Object;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class TunaButton	// class@001093
{
    public static final TunaButton$Companion a;

    static {
       TunaButton.a = new TunaButton$Companion(null);
    }
    public void TunaButton(){
       super();
    }
    public static final void a(TunaButtonModel p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, TunaButton.class, "1")) {
          return;
       }
       TunaButton.a.a(p0, p1);
       return;
    }
    public static final int b(Activity p0,TunaButtonModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TunaButton.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TunaButton.a.c(p0, p1);
    }
    public static final void c(TunaButtonModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, TunaButton.class, "4")) {
          return;
       }
       TunaButton.a.e(p0);
       return;
    }
}
