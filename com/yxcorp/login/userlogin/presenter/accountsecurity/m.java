package com.yxcorp.login.userlogin.presenter.accountsecurity.m;
import sfc.a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.BindThirdPlatformPresenter;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o1d.d;

public class m extends a	// class@001bb1
{
    public final ProgressFragment c;
    public final String d;
    public final BindThirdPlatformPresenter e;

    public void m(BindThirdPlatformPresenter p0,ProgressFragment p1,String p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.c.dismiss();
       super.b(p0);
       String str = ((this.d).equals("qq2.0"))? "qq": "wechat";
       d.a(str, -1, 8);
       return;
    }
}
