package com.yxcorp.login.userlogin.presenter.resetpassword.t;
import sfc.a;
import com.yxcorp.login.userlogin.presenter.resetpassword.r;
import android.content.Context;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class t extends a	// class@001bf1
{
    public final r c;

    public void t(r p0,Context p1){
       this.c = p0;
       super(p1);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.q.setEnabled(true);
       return;
    }
}
