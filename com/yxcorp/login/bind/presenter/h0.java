package com.yxcorp.login.bind.presenter.h0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.bind.presenter.g0;
import crd.b;
import ok.h;
import lnc.b9;
import io.reactivex.subjects.PublishSubject;

public class h0 extends PresenterV2	// class@001a73
{
    public PublishSubject p;
    public b q;

    public void h0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "2")) {
          return;
       }
       this.q = b9.c(this.q, new g0(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "4")) {
          return;
       }
       b9.a(this.q);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.p = this.r8("VERIFY_SUCCESS_EVENT");
       return;
    }
}
