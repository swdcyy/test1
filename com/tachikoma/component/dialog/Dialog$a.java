package com.tachikoma.component.dialog.Dialog$a;
import android.content.DialogInterface$OnDismissListener;
import com.tachikoma.component.dialog.Dialog;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;

public class Dialog$a implements DialogInterface$OnDismissListener	// class@000cef
{
    public final JsValueRef b;
    public final Dialog c;

    public void Dialog$a(Dialog p0,JsValueRef p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Dialog$a.class, "1")) {
          return;
       }
       Dialog mOnDismissRe = this.c.mOnDismissRef;
       if (mOnDismissRe != null && y.a(mOnDismissRe.get())) {
          Object[] objArray = new Object[0];
          this.c.mOnDismissRef.get().call(null, objArray);
       }
       y.c(this.b);
       return;
    }
}
