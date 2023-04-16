package com.tachikoma.component.dialog.Dialog$f;
import android.content.DialogInterface$OnDismissListener;
import com.tachikoma.component.dialog.Dialog;
import com.tachikoma.core.component.view.TKView;
import com.tkruntime.v8.V8ObjectProxy;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import java.util.List;
import com.tkruntime.v8.V8Value;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;

public class Dialog$f implements DialogInterface$OnDismissListener	// class@000cf4
{
    public final TKView b;
    public final V8ObjectProxy c;
    public final Dialog d;

    public void Dialog$f(Dialog p0,TKView p1,V8ObjectProxy p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Dialog$f.class, "1")) {
          return;
       }
       Dialog mOnDismissRe = this.d.mOnDismissRef;
       if (mOnDismissRe != null && y.a(mOnDismissRe.get())) {
          Object[] objArray = new Object[0];
          this.d.mOnDismissRef.get().call(null, objArray);
       }
       this.b.removeAll();
       if (this.d.mV8ValueList.remove(this.c)) {
          this.c.setWeak();
       }
       return;
    }
}
