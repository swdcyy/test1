package com.yxcorp.gifshow.v3.editor.enhancefilter.f;
import erd.o;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import sqc.y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.v3.editor.enhancefilter.e;
import io.reactivex.g;
import t45.d;
import brd.z;

public final class f implements o	// class@000f8a
{
    public final boolean b;
    public final String c;
    public final List d;
    public final String e;

    public void f(boolean p0,String p1,List p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f te = this.e;
       object oobject = p0;
       p0 = y.class;
       if (PatchProxy.isSupport(p0)) {
          Object[] objArray = new Object[]{Boolean.valueOf(tb),tc,oobject,td,te};
          p0 = PatchProxy.apply(objArray, null, p0, "2");
          if (p0 != PatchProxyResult.class) {
          label_0047 :
             return p0;
          }
       }
       e uoe = new e(tc, tb, td, te, oobject);
       p0 = t.create(p0).subscribeOn(d.c);
       goto label_0047 ;
    }
}
