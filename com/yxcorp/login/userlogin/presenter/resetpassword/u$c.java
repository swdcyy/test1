package com.yxcorp.login.userlogin.presenter.resetpassword.u$c;
import sfc.a;
import com.yxcorp.login.userlogin.presenter.resetpassword.u;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.login.userlogin.fragment.ResetSelectedAccountPasswordFragment;
import o1d.p;

public class u$c extends a	// class@001bf4
{
    public final ProgressFragment c;
    public final u d;

    public void u$c(u p0,ProgressFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$c.class, "1")) {
          return;
       }
       p.a(this.d.w.Q3(), 8);
       this.c.dismiss();
       super.b(p0);
       return;
    }
}
