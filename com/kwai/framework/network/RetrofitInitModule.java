package com.kwai.framework.network.RetrofitInitModule;
import com.kwai.framework.init.a;
import com.kwai.framework.network.l;
import ok.x;
import com.google.common.base.Suppliers;
import com.kwai.framework.network.m;
import com.kwai.framework.network.n;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import b76.a;
import com.kwai.framework.network.p;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kwai.framework.network.o;
import mjd.b;
import com.yxcorp.retrofit.e;
import com.yxcorp.retrofit.d;
import ta6.n;
import ta6.o;
import yid.k;

public class RetrofitInitModule extends a	// class@000bea
{
    public boolean q;
    public final Gson r;
    public static final x s;
    public static final x t;
    public static final x u;

    static {
       RetrofitInitModule.s = Suppliers.a(l.b);
       RetrofitInitModule.t = Suppliers.a(m.b);
       RetrofitInitModule.u = Suppliers.a(n.b);
    }
    public void RetrofitInitModule(){
       super();
       this.q = false;
       this.r = new Gson();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, RetrofitInitModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 21;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RetrofitInitModule.class, "2")) {
          return;
       }
       e.g(p.b, "RetrofitPreferenceManager_register");
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RetrofitInitModule.class, "1")) {
          return;
       }
       _monitor_enter(this);
       if (PatchProxy.applyVoid(objArray, this, RetrofitInitModule.class, "3")) {
          _monitor_exit(this);
       }else if(this.q != null){
          _monitor_exit(this);
       }else {
          this.q = true;
          if (!PatchProxy.applyVoid(objArray, this, RetrofitInitModule.class, "4")) {
             b.a = o.a;
          }
          e uoe = e.h();
          o oo = PatchProxy.apply(objArray, this, RetrofitInitModule.class, "5");
          if (oo != PatchProxyResult.class) {
          }else {
             oo = new o(this, new n(this));
          }
          uoe.i(oo);
          _monitor_exit(this);
       }
       return;
    }
}
