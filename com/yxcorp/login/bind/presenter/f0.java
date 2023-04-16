package com.yxcorp.login.bind.presenter.f0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import e1d.v0;
import android.view.View$OnClickListener;

public class f0 extends PresenterV2	// class@001a6f
{
    public View p;

    public void f0(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1716);
       m1.a(p0, new v0(this), R.id.left_btn);
       return;
    }
}
