package jn9.c;
import java.lang.Object;
import java.util.List;
import nn9.b;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Collection;
import nn9.d;
import mn9.a;
import java.util.Iterator;
import java.lang.Iterable;
import kn9.j;
import nn9.a;
import java.lang.IllegalStateException;

public final class c	// class@002b19
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final ArrayList a(List p0,b p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "targetList");
       obj = new ArrayList(p0);
       if (p1 != null) {
          obj.remove(p1);
       }
       return obj;
    }
    public final a b(d p0,String p1){
       a uoa;
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "nowState");
       a.p(p1, "id");
       Iterator iterator = p0.j().iterator();
       while (true) {
          uoa = null;
          if (iterator.hasNext()) {
             obj = iterator.next();
             if (!a.g(obj.b(), p1)) {
                continue ;
             }
          }else {
             obj = uoa;
          }
          if (obj != null) {
             uoa = obj.g();
             break ;
          }
          break ;
       }
       return uoa;
    }
    public final d c(d p0,j p1){
       Object obj1;
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "oldState");
       a.p(p1, "action");
       p1 = p1.a;
       obj = p0.j().iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!a.g(obj1.g().getId(), p1.getId())) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          if (obj1 != null) {
             List list = p0.i(obj1);
             if (a.g(list, p0.e())) {
                break ;
             }else if(a.g(list, p0.f())){
                return d.c(p0, null, null, this.a(p0.f(), obj1), null, 11, null);
             }else if(a.g(list, p0.h())){
                return d.c(p0, null, null, null, this.a(p0.h(), obj1), 7, null);
             }else {
                throw new IllegalStateException("cannot find target list!");
             }
          }else {
             return p0;
          }
       }
       return d.c(p0, null, this.a(p0.e(), obj1), null, null, 13, null);
    }
}
