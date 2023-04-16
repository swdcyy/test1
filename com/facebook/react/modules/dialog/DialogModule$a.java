package com.facebook.react.modules.dialog.DialogModule$a;
import java.lang.Runnable;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.dialog.DialogModule$c;
import android.os.Bundle;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.dialog.DialogModule$b;
import com.facebook.react.modules.dialog.AlertFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.DialogFragment;

public class DialogModule$a implements Runnable	// class@0012aa
{
    public final DialogModule$c b;
    public final Bundle c;
    public final Callback d;
    public final DialogModule e;

    public void DialogModule$a(DialogModule p0,DialogModule$c p1,Bundle p2,Callback p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DialogModule$a.class, "1")) {
          return;
       }
       DialogModule$a tb = this.b;
       DialogModule$a tc = this.c;
       DialogModule$a td = this.d;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(tc, td, tb, DialogModule$c.class, "3")) {
          UiThreadUtil.assertOnUiThread();
          tb.a();
          if (td != null) {
             objArray = new DialogModule$b(tb.c, td);
          }
          AlertFragment uAlertFragme = new AlertFragment(objArray, tc);
          if (tb.c.mIsInForeground != null && !tb.a.isStateSaved()) {
             String str = "cancelable";
             if (tc.containsKey(str)) {
                uAlertFragme.setCancelable(tc.getBoolean(str));
             }
             uAlertFragme.show(tb.a, "com.facebook.catalyst.react.dialog.DialogModule");
          }else {
             tb.b = uAlertFragme;
          }
       }
       return;
    }
}
