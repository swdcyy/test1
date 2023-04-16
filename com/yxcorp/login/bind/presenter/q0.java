package com.yxcorp.login.bind.presenter.q0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e1d.n1;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import com.yxcorp.login.bind.fragment.WebViewChangeVerifyFragment;

public class q0 extends PresenterV2	// class@001a98
{
    public View p;
    public WebViewChangeVerifyFragment q;

    public void q0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "3")) {
          return;
       }
       this.p.setOnClickListener(new n1(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1716);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
