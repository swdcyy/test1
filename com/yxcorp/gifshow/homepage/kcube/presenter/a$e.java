package com.yxcorp.gifshow.homepage.kcube.presenter.a$e;
import java.lang.Object;
import com.yxcorp.gifshow.homepage.kcube.presenter.a$a;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.model.user.QCurrentUser;
import tra.b;
import java.lang.StringBuilder;
import q87.c;

public class a$e	// class@001751
{
    public boolean a;
    public b b;
    public b c;
    public Runnable d;

    public void a$e(){
       super();
    }
    public void a$e(a$a p0){
       super();
    }
    public void a(KCubeTabActionBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "3")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       this.a = false;
       b9.a(this.b);
       b9.a(this.c);
       k1.m(this.d);
       p0.setOnReceiveTouchEventListener(null);
       return;
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, a$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (QCurrentUser.me().isLogined())? 300: 1;
       return i;
    }
    public final void c(KCubeTabActionBar p0,Runnable p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$e.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("DelayBindTrigger", "delay bind by reason = "+p2, objArray);
       this.a(p0);
       p1.run();
       return;
    }
}
