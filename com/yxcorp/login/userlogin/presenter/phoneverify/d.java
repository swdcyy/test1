package com.yxcorp.login.userlogin.presenter.phoneverify.d;
import sfc.a;
import com.yxcorp.login.userlogin.presenter.phoneverify.c;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.edittext.VerificationCodeView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.widget.LinearLayout;
import android.content.Context;
import com.yxcorp.utility.n;

public class d extends a	// class@001bd3
{
    public final ProgressFragment c;
    public final c d;

    public void d(c p0,ProgressFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.b(p0);
       this.d.p.b();
       n.a0(this.d.getActivity(), this.d.p.getChildAt(0), 50);
       this.c.dismiss();
       return;
    }
}
