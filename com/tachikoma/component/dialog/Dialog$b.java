package com.tachikoma.component.dialog.Dialog$b;
import android.content.DialogInterface$OnClickListener;
import com.tachikoma.component.dialog.Dialog;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;
import tx4.y;

public class Dialog$b implements DialogInterface$OnClickListener	// class@000cf0
{
    public final JsValueRef b;
    public final Dialog c;

    public void Dialog$b(Dialog p0,JsValueRef p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(Dialog$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, Dialog$b.class, "1")) {
          return;
       }
       Dialog$b tb = this.b;
       if (tb != null && tb.get() != null) {
          Object[] objArray = new Object[0];
          this.b.get().call(null, objArray);
          y.c(this.b);
       }
       return;
    }
}
