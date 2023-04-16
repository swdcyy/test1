package com.yxcorp.login.userlogin.presenter.accountsecurity.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mw4.a;
import android.view.View;
import f2d.y;
import android.view.View$OnClickListener;
import ekd.m1;

public class o extends PresenterV2	// class@001bb3
{
    public View p;

    public void o(){
       super();
    }
    public void E8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, "3") && a.j()) {
          this.p.setVisibility(0);
          this.p.setOnClickListener(new y(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a06a5);
       return;
    }
}
