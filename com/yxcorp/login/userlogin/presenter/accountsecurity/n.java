package com.yxcorp.login.userlogin.presenter.accountsecurity.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import f2d.w;
import android.view.View$OnClickListener;
import ekd.m1;

public class n extends PresenterV2	// class@001bb2
{
    public View p;

    public void n(){
       super();
    }
    public void E8(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, on, "3")) {
          this.p.setVisibility(0);
          this.p.setOnClickListener(new w(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a043f);
       return;
    }
}
