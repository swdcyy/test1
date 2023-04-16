package com.kuaishou.merchant.basic.util.b;
import java.lang.Object;
import java.util.List;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import mrd.a;
import java.lang.Iterable;
import com.kuaishou.merchant.basic.util.a;
import erd.o;
import t45.d;
import brd.z;
import ot3.e;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import ot3.h;
import crd.b;
import java.util.Objects;
import ot3.d;

public class b	// class@0015d4
{

    public void b(){
       super();
    }
    public static t a(List p0,long p1){
       a obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.g();
       z c = d.c;
       b uob1 = t.fromIterable(p0).concatMap(new a(p1)).observeOn(c).subscribeOn(c).doFinally(new e(obj)).subscribe(Functions.d(), new h(p0));
       Objects.requireNonNull(uob1);
       return obj.doOnDispose(new d(uob1)).hide().subscribeOn(c).observeOn(d.a);
    }
}
