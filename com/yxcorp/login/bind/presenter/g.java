package com.yxcorp.login.bind.presenter.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.bind.presenter.f;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import com.yxcorp.login.bind.fragment.BindPhoneDialog;

public class g extends PresenterV2	// class@001a72
{
    public TextView p;
    public BindPhoneParams q;
    public BindPhoneDialog r;

    public void g(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.p.setOnClickListener(new f(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a043a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.q = this.r8("BIND_PHONE_PARAMS");
       this.r = this.r8("FRAGMENT");
       return;
    }
}
