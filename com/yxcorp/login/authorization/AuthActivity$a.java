package com.yxcorp.login.authorization.AuthActivity$a;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.login.authorization.AuthActivity;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.lang.StringBuilder;
import z0d.b;

public class AuthActivity$a implements DialogInterface$OnDismissListener	// class@001a2d
{
    public final AuthActivity b;

    public void AuthActivity$a(AuthActivity p0){
       this.b = p0;
       super();
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthActivity$a.class, "1")) {
          return;
       }
       this.b.x3();
       KwaiDialogFragment kwaiDialogFr = this.b.u3();
       kwaiDialogFr.setCancelable(false);
       AuthActivity$a tb = this.b;
       tb.D = tb.D + 1;
       kwaiDialogFr.show(tb.getSupportFragmentManager(), "auth"+this.b.D);
       if (!this.b.C.a()) {
          kwaiDialogFr.k0(this.b.F);
       }
       return;
    }
}
