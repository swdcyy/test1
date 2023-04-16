package com.yxcorp.login.bind.presenter.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.bind.presenter.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import e1d.d;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.login.bind.fragment.ChangePhoneVerifyMethodFragment;

public class a extends PresenterV2 implements g	// class@001a64
{
    public a$b p;
    public b q;
    public b r;
    public ChangePhoneVerifyMethodFragment s;

    public void a(){
       super();
       this.p = new a$a(this);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       b9.a(this.q);
       b9.a(this.r);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.s = this.r8("FRAGMENT");
       return;
    }
}
