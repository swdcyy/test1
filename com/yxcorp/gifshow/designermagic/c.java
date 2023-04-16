package com.yxcorp.gifshow.designermagic.c;
import qvb.f;
import java.lang.String;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rw9.b;
import rw9.a;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import qvb.n0;
import com.yxcorp.gifshow.designermagic.DesignerMagicResponse;
import cjd.e;
import erd.o;
import qw9.e;
import erd.g;
import com.yxcorp.gifshow.designermagic.b;

public class c extends f	// class@001329
{
    public final String p;
    public static final int q;

    public void c(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.class;
       _monitor_enter(obj);
       a uoa = PatchProxy.apply(objArray, objArray, obj, "1");
       if (uoa != patchProxyRe) {
          _monitor_exit(obj);
       }else if(b.a == null){
          b.a = e.b(b.a(-1961311520).a(RouteType.API, d.b), a.class);
       }
       uoa = b.a;
       _monitor_exit(obj);
       c tp = this.p;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return uoa.a(tp, objArray, 20, 1).map(new e()).doOnNext(new e(this)).doOnError(b.b);
    }
}
