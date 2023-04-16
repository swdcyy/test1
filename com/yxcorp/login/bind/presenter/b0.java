package com.yxcorp.login.bind.presenter.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e1d.m0;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import android.widget.EditText;

public class b0 extends PresenterV2	// class@001a66
{
    public EditText p;
    public View q;

    public void b0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "2")) {
          return;
       }
       this.q.setOnClickListener(new m0(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3000);
       this.q = m1.f(p0, 0x7f0a0744);
       return;
    }
}
