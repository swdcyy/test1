package com.kuaishou.render.engine.tk.MerchantTkContainer$a;
import android.app.Activity;
import android.view.ViewGroup;
import java.lang.String;
import bx4.h;
import java.lang.Object;
import com.kuaishou.render.engine.tk.MerchantTkContainer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.lang.Boolean;

public class MerchantTkContainer$a	// class@000ef0
{
    public final MerchantTkContainer a;

    public void MerchantTkContainer$a(Activity p0,ViewGroup p1,String p2,String p3,h p4){
       super();
       MerchantTkContainer merchantTkCo = new MerchantTkContainer(p0, null, p2, p3, p4);
       this.a = p1;
    }
    public MerchantTkContainer a(){
       return this.a;
    }
    public MerchantTkContainer$a b(int p0){
       MerchantTkContainer$a uoa = MerchantTkContainer$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a.g(p0);
       return this;
    }
    public MerchantTkContainer$a c(boolean p0){
       MerchantTkContainer$a uoa = MerchantTkContainer$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a.u(p0);
       return this;
    }
}
