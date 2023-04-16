package io.netty.util.concurrent.e;
import zqd.d;
import java.lang.Object;
import java.util.Set;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Collections;
import java.lang.Throwable;
import io.netty.util.internal.PlatformDependent;
import zqd.z;

public class e	// class@001105
{
    public final int a;
    public static final int b;

    static {
       e.b = d.e();
    }
    public void e(){
       super();
       this.a = d.e();
    }
    public static void a(d p0,e p1){
       int b = e.b;
       Set set = p0.d(b);
       if (set == d.w || set == null) {
          set = Collections.newSetFromMap(new IdentityHashMap());
          p0.h(b, set);
       }else {
       }
       set.add(p1);
       return;
    }
    public static void g(){
       d uod = d.c();
       if (uod == null) {
          return;
       }
       e[] obj = uod.d(e.b);
       if (obj != null && obj != d.w) {
          e[] uoeArray = new e[obj.size()];
          obj = obj.toArray(uoeArray);
          int len = obj.length;
          for (int i = 0; i < len; i = i + 1) {
             obj[i].f(uod);
          }
       }
       d.f();
       return;
    }
    public final Object b(){
       return this.c(d.b());
    }
    public final Object c(d p0){
       Object obj = p0.d(this.a);
       if (obj != d.w) {
          return obj;
       }
       try{
          obj = this.d();
       }catch(java.lang.Exception e0){
          PlatformDependent.H(e0);
          obj = null;
       }
       p0.h(this.a, obj);
       e.a(p0, this);
       return obj;
    }
    public Object d(){
       return null;
    }
    public void e(Object p0){
    }
    public final void f(d p0){
       object oobject;
       if (p0 == null) {
          return;
       }
       e ta = this.a;
       z a = p0.a;
       if (ta < a.length) {
          oobject = a[ta];
          a[ta] = d.w;
       }else {
          oobject = d.w;
       }
       p0 = p0.d(e.b);
       Object w = d.w;
       if (p0 != w && p0 != null) {
          p0.remove(this);
       }
       if (oobject != w) {
          try{
             this.e(oobject);
          }catch(java.lang.Exception e5){
             PlatformDependent.H(e5);
          }
       }
    }
    public final void h(d p0,Object p1){
       if (p1 != d.w) {
          if (p0.h(this.a, p1)) {
             e.a(p0, this);
          }
       }else {
          this.f(p0);
       }
       return;
    }
}
