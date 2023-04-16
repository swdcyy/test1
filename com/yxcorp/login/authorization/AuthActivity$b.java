package com.yxcorp.login.authorization.AuthActivity$b;
import fw8.b;
import com.yxcorp.login.authorization.AuthActivity;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z0d.b;

public class AuthActivity$b extends b	// class@001a2e
{
    public final AuthActivity b;

    public void AuthActivity$b(AuthActivity p0){
       this.b = p0;
       super();
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthActivity$b.class, "1")) {
          return;
       }
       if (p0 instanceof AuthActivity) {
          AuthActivity$b tb = this.b;
          AuthActivity c = tb.C;
          if (c.x != null && c.y == null) {
             tb.finish();
          }
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       if (p0 instanceof AuthActivity) {
          p0.x = true;
       }
       return;
    }
}
