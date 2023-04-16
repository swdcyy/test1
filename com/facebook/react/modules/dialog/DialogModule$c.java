package com.facebook.react.modules.dialog.DialogModule$c;
import com.facebook.react.modules.dialog.DialogModule;
import androidx.fragment.app.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.facebook.react.modules.dialog.AlertFragment;
import androidx.fragment.app.DialogFragment;

public class DialogModule$c	// class@0012ac
{
    public final c a;
    public Object b;
    public final DialogModule c;

    public void DialogModule$c(DialogModule p0,c p1){
       this.c = p0;
       super();
       this.a = p1;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, DialogModule$c.class, "2")) {
          return;
       }
       if (this.c.mIsInForeground == null) {
          return;
       }
       AlertFragment uAlertFragme = this.a.findFragmentByTag("com.facebook.catalyst.react.dialog.DialogModule");
       if (uAlertFragme != null && uAlertFragme.isResumed()) {
          uAlertFragme.dismiss();
       }
       return;
    }
}
