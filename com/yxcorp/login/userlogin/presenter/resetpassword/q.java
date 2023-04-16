package com.yxcorp.login.userlogin.presenter.resetpassword.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import r2d.a0;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import r2d.b0;
import r2d.z;
import brd.w;
import erd.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.textview.SizeAdjustableTextView;

public class q extends PresenterV2	// class@001be9
{
    public SizeAdjustableTextView p;
    public boolean q;

    public void q(boolean p0){
       super();
       this.q = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       this.p.setVisibility(0);
       z c = d.c;
       z a = d.a;
       t ot = t.fromCallable(new a0(this)).subscribeOn(c).observeOn(a);
       t ot1 = t.fromCallable(new b0(this)).subscribeOn(c).observeOn(a);
       ot = t.zip(ot, ot1, new z(this));
       this.X7(ot.subscribe(Functions.d(), Functions.d()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a17a7);
       return;
    }
}
