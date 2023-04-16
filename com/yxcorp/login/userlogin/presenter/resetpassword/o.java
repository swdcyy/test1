package com.yxcorp.login.userlogin.presenter.resetpassword.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r2d.u;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import android.widget.EditText;

public class o extends PresenterV2	// class@001be7
{
    public View p;
    public EditText q;

    public void o(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       this.p.setOnClickListener(new u(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0744);
       this.q = m1.f(p0, 0x7f0a2987);
       return;
    }
}
