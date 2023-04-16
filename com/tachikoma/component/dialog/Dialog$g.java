package com.tachikoma.component.dialog.Dialog$g;
import android.view.View$OnClickListener;
import com.tachikoma.component.dialog.Dialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;
import android.app.AlertDialog;

public class Dialog$g implements View$OnClickListener	// class@000cf5
{
    public final Dialog b;

    public void Dialog$g(Dialog p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Dialog$g.class, "1")) {
          return;
       }
       Dialog mOnMaskClick = this.b.mOnMaskClickRef;
       if (mOnMaskClick != null && y.a(mOnMaskClick.get())) {
          Object[] objArray = new Object[0];
          this.b.mOnMaskClickRef.get().call(null, objArray);
       }
    label_0039 :
       Dialog$g tb = this.b;
       if (tb.cancelable != null) {
          tb.mDialog.dismiss();
       }
       return;
    }
}
