package com.kuaishou.android.live.log.c;
import com.kuaishou.android.live.log.c$a;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ThreadLocal;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.live.log.c$b;
import pp.f;
import pp.g;
import pp.h;
import pp.i;

public class c	// class@0007db
{
    public static ThreadLocal a;

    static {
       c.a = new c$a();
    }
    public void c(){
       super();
    }
    public static void a(Object p0,Object p1,Object p2,Object p3,StringBuilder p4){
       c.g(p0, p1, p2, p3, p4);
    }
    public static void b(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,StringBuilder p6){
       c.h(p0, p1, p2, p3, p4, p5, p6);
    }
    public static void c(Object p0,Object p1,StringBuilder p2){
       c.f(p0, p1, p2);
    }
    public static void d(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,StringBuilder p8){
       c.i(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public static StringBuilder e(){
       StringBuilder obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.a.get();
       if (obj.capacity() > 5120) {
          obj = new StringBuilder(512);
          c.a.set(obj);
       }
       c.n();
       return obj;
    }
    public static void f(Object p0,Object p1,StringBuilder p2){
       b.k(p2, p0, p1);
    }
    public static void g(Object p0,Object p1,Object p2,Object p3,StringBuilder p4){
       b.l(p4, p0, p1, p2, p3);
    }
    public static void h(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,StringBuilder p6){
       b.m(p6, p0, p1, p2, p3, p4, p5);
    }
    public static void i(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,StringBuilder p8){
       b.n(p8, p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public static c$b j(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(p0, p1);
    }
    public static c$b k(Object p0,Object p1,Object p2,Object p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g(p0, p1, p2, p3);
    }
    public static c$b l(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5){
       Object obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, null, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       h oh = new h(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public static c$b m(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7){
       Object obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          obj = PatchProxy.apply(objArray, null, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       i oi = new i(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public static void n(){
       if (PatchProxy.applyVoid(null, null, c.class, "2")) {
          return;
       }
       (c.a.get()).setLength(0);
       return;
    }
}
