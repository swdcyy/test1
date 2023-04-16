package com.kuaishou.tuna_core.button.TunaPhoneAction$f;
import java.lang.Runnable;
import com.kuaishou.tuna_core.button.TunaPhoneAction;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import android.app.Activity;
import android.content.Context;
import jz6.a;
import r05.b;
import android.app.Dialog;

public final class TunaPhoneAction$f implements Runnable	// class@0010a6
{
    public final TunaPhoneAction b;
    public final boolean c;

    public void TunaPhoneAction$f(TunaPhoneAction p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       TunaPhoneAction f;
       if (PatchProxy.applyVoid(null, this, TunaPhoneAction$f.class, "1")) {
          return;
       }
       TunaPhoneAction$f tb = this.b;
       if (tb.a == null) {
          f = tb.f;
          if (f != null) {
             Activity uActivity = f.get();
             if (uActivity != null) {
                this.b.a = b.a(uActivity);
             }
          }
       }
       f = this.b.a;
       if (f != null) {
          if (this.c != null && !f.isShowing()) {
             f.show();
          }else if(this.c == null && f.isShowing()){
             f.dismiss();
          }
       }
       return;
    }
}
