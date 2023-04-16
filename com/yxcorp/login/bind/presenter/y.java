package com.yxcorp.login.bind.presenter.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.bind.presenter.x;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import com.kwai.feature.api.social.login.model.BindPhoneParams;

public class y extends PresenterV2	// class@001aa3
{
    public View p;
    public BindPhoneParams q;

    public void y(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y.class, "3")) {
          return;
       }
       this.p.setOnClickListener(new x(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2ea3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       this.q = this.r8("BIND_PHONE_PARAMS");
       return;
    }
}
