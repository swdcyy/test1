package com.yxcorp.login.bind.presenter.VerifyConfirmButtonPresenter$3$b;
import sfc.a;
import com.yxcorp.login.bind.presenter.VerifyConfirmButtonPresenter$3;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class VerifyConfirmButtonPresenter$3$b extends a	// class@001a5f
{
    public final ProgressFragment c;
    public final VerifyConfirmButtonPresenter$3 d;

    public void VerifyConfirmButtonPresenter$3$b(VerifyConfirmButtonPresenter$3 p0,ProgressFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerifyConfirmButtonPresenter$3$b.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.dismiss();
       return;
    }
}
