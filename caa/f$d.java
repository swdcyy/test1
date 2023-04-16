package caa.f$d;
import erd.o;
import android.content.Context;
import java.lang.Object;
import daa.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import baa.o;
import com.yxcorp.gifshow.easteregg.model.PokeGroup;
import java.util.Objects;
import brd.t;
import daa.j;
import java.util.List;
import java.lang.Iterable;
import t45.d;
import brd.z;
import baa.k;
import baa.l;
import daa.k;
import baa.m;
import baa.n;
import qrd.l1;

public final class f$d implements o	// class@000591
{
    public final Context b;

    public void f$d(Context p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       o a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       t ot = PatchProxy.applyOneRefs(p0, this, f$d.class, str);
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "it");
          a = o.a;
          f$d tb = this.b;
          p0 = p0.a();
          Objects.requireNonNull(a);
          ot = PatchProxy.applyTwoRefs(tb, p0, a, o.class, str);
          if (ot != patchProxyRe) {
          }else {
             a.p(tb, "app");
             a.p(p0, "pokeGroup");
             String str1 = "Observable\n        .from¡­\(1\)\n        .map { Unit }";
             if (p0 instanceof j) {
                p0 = t.fromIterable(p0.b()).observeOn(d.c).flatMap(new k(tb)).takeLast(1).map(l.b);
                a.o(p0, str1);
             }else if(p0 instanceof k){
                p0 = t.fromIterable(p0.images).observeOn(d.c).flatMap(m.b).takeLast(1).map(n.b);
                a.o(p0, str1);
             }else {
                p0 = t.just(l1.a);
                a.o(p0, "Observable.just\(Unit\)");
             }
             ot = p0;
          }
          ot = ot.onErrorReturnItem(l1.a);
       }
       return ot;
    }
}
