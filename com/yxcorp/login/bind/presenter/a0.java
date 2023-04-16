package com.yxcorp.login.bind.presenter.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.bind.presenter.z;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import com.yxcorp.login.userlogin.fragment.PhoneOneKeyBindDialog;

public class a0 extends PresenterV2	// class@001a63
{
    public TextView p;
    public BindPhoneParams q;
    public PhoneOneKeyBindDialog r;

    public void a0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "3")) {
          return;
       }
       this.p.setOnClickListener(new z(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2f44);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.q = this.r8("BIND_PHONE_PARAMS");
       this.r = this.r8("FRAGMENT");
       return;
    }
}
