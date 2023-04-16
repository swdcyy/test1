package com.kwai.statechart.b;
import com.kwai.statechart.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ut7.m;
import ut7.k;
import java.util.Objects;
import ut7.e;
import com.kwai.statechart.StateChart;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class b extends a	// class@0018f8
{

    public void b(String p0){
       a.p(p0, "name");
       super(p0);
    }
    public final Object h(){
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.apply(null, this, uob, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = "1";
          m om = PatchProxy.apply(null, this, uob, obj);
          if (om != patchProxyRe) {
          }else {
             om = this.c();
          }
          Objects.requireNonNull(om);
          Object obj1 = PatchProxy.apply(null, om, m.class, obj);
          if (obj1 == patchProxyRe) {
             k.b(om, null, 1, null);
             obj1 = om.e.g();
          }
          return obj1;
       }catch(java.lang.ClassCastException e0){
          throw new IllegalStateException("state "+this.c().e()+" is not configured as subState, ie. should using `subStateChart`, but used `state` instead.");
       }
    }
}
