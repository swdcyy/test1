package com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel$a;
import java.lang.Object;
import nsd.u;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import boc.e;

public final class BodySlimmingViewModel$a	// class@001132
{

    public void BodySlimmingViewModel$a(){
       super();
    }
    public void BodySlimmingViewModel$a(u p0){
       super();
    }
    public final ArrayList a(){
       ArrayList obj = PatchProxy.apply(null, this, BodySlimmingViewModel$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (!p.h(uob)) {
             obj.add(uob);
          }
       }
       return obj;
    }
    public final ArrayList b(){
       ArrayList obj = PatchProxy.apply(null, this, BodySlimmingViewModel$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(e.c);
       obj.add(e.v);
       obj.add(e.B);
       obj.add(e.D);
       return obj;
    }
}
