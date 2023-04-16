package com.yxcorp.login.userlogin.presenter.resetpassword.p;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r2d.v;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import r2d.y;
import java.util.Map;
import java.util.HashMap;

public abstract class p extends PresenterV2 implements g	// class@001be8
{
    public TextView p;

    public void p(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       this.p.setOnClickListener(new v(this));
       return;
    }
    public abstract void P8();
    public abstract boolean R8();
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a08fb);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new y();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, p.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(p.class, new y());
       }else {
          obj.put(p.class, null);
       }
       return obj;
    }
}
