package com.yxcorp.login.bind.presenter.i0$c;
import erd.g;
import com.yxcorp.login.bind.presenter.i0;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class i0$c implements g	// class@001a79
{
    public final i0 b;

    public void i0$c(i0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$c.class, "1")) {
       }else {
          p0 = this.b.q;
          if (p0 != null) {
             p0.setEnabled(false);
          }
       }
       return;
    }
}
