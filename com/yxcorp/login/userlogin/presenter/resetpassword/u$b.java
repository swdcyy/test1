package com.yxcorp.login.userlogin.presenter.resetpassword.u$b;
import com.yxcorp.login.util.o$a;
import com.yxcorp.login.userlogin.presenter.resetpassword.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class u$b implements o$a	// class@001bf3
{
    public final u a;

    public void u$b(u p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, u$b.class, "1")) {
          return;
       }
       u$b ta = this.a;
       ta.x = true;
       ta.P8();
       return;
    }
    public void onCancel(){
       this.a.x = false;
    }
}
