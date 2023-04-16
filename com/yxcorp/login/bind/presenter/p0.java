package com.yxcorp.login.bind.presenter.p0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import im8.f;
import java.lang.Boolean;
import android.widget.TextView;
import e1d.l1;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;

public class p0 extends PresenterV2	// class@001a96
{
    public TextView p;
    public f q;

    public void p0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "3")) {
          return;
       }
       if (QCurrentUser.ME.isLogined() && this.q.get().booleanValue()) {
          this.p.setVisibility(0);
       }
       this.p.setOnClickListener(new l1(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a17a7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "1")) {
          return;
       }
       this.q = this.x8("VERIFY_MOBILE_SHOW_RESET_MOBILE_LINK");
       return;
    }
}
