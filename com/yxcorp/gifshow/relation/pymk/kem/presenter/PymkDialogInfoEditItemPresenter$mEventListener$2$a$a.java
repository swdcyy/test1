package com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogInfoEditItemPresenter$mEventListener$2$a$a;
import java.lang.Runnable;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.q;

public final class PymkDialogInfoEditItemPresenter$mEventListener$2$a$a implements Runnable	// class@001946
{
    public final Map b;

    public void PymkDialogInfoEditItemPresenter$mEventListener$2$a$a(Map p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PymkDialogInfoEditItemPresenter$mEventListener$2$a$a.class, "1")) {
          return;
       }
       PymkDialogInfoEditItemPresenter$mEventListener$2$a$a tb = this.b;
       if (tb != null) {
          RxBus.f.b(new q(tb));
       }
       return;
    }
}
