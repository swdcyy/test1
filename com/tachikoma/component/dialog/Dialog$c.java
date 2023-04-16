package com.tachikoma.component.dialog.Dialog$c;
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

public class Dialog$c implements DialogInterface$OnDismissListener	// class@000cf1
{
    public final JsValueRef b;
    public final JsValueRef c;
    public final Dialog d;

    public void Dialog$c(Dialog p0,JsValueRef p1,JsValueRef p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Dialog$c.class, "1")) {
          return;
       }
       Dialog mOnDismissRe = this.d.mOnDismissRef;
       if (mOnDismissRe != null && y.a(mOnDismissRe.get())) {
          Object[] objArray = new Object[0];
          this.d.mOnDismissRef.get().call(null, objArray);
       }
       y.c(this.b);
       y.c(this.c);
       return;
    }
}
