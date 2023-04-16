package com.yxcorp.login.bind.presenter.s0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.bind.presenter.r0;
import crd.b;
import ok.h;
import lnc.b9;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.login.bind.fragment.WebViewChangeVerifyFragment;

public class s0 extends PresenterV2	// class@001a9c
{
    public PublishSubject p;
    public b q;
    public WebViewChangeVerifyFragment r;

    public void s0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s0.class, "2")) {
          return;
       }
       this.q = b9.c(this.q, new r0(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, s0.class, "3")) {
          return;
       }
       b9.a(this.q);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s0.class, "1")) {
          return;
       }
       this.p = this.r8("VERIFY_SUCCESS_EVENT");
       this.r = this.r8("FRAGMENT");
       return;
    }
}
