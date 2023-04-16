package com.yxcorp.login.userlogin.presenter.phoneverify.c$b;
import erd.g;
import com.yxcorp.login.userlogin.presenter.phoneverify.c;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class c$b implements g	// class@001bd0
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
       }else {
          p0 = this.b.q;
          if (p0 != null) {
             p0.setEnabled(false);
          }
       }
       return;
    }
}
