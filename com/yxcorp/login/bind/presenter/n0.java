package com.yxcorp.login.bind.presenter.n0;
import sfc.a;
import com.yxcorp.login.bind.presenter.l0;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class n0 extends a	// class@001a8b
{
    public final ProgressFragment c;
    public final l0 d;

    public void n0(l0 p0,ProgressFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.dismiss();
       return;
    }
}
