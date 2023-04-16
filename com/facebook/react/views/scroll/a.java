package com.facebook.react.views.scroll.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import vd.d;
import com.facebook.react.views.scroll.a$a;
import com.facebook.react.bridge.ReadableArray;
import od.a;
import java.lang.IllegalArgumentException;
import java.util.Objects;
import ze.p;
import java.lang.Math;
import com.facebook.react.views.scroll.a$b;
import com.facebook.react.views.scroll.a$c;

public class a	// class@0013f0
{

    public void a(){
       super();
    }
    public static Map a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.f("scrollTo", Integer.valueOf(1), "scrollToEnd", Integer.valueOf(2), "flashScrollIndicators", Integer.valueOf(3));
    }
    public static void b(a$a p0,Object p1,int p2,ReadableArray p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, a.class, "2")) {
          return;
       }
       a.c(p0);
       a.c(p1);
       a.c(p3);
       if (p2 != 1) {
          int i = 2;
          if (p2 != i) {
             if (p2 == 3) {
                p0.flashScrollIndicators(p1);
                return;
             }else {
                Object[] objArray = new Object[i];
                objArray[0] = Integer.valueOf(p2);
                objArray[1] = p0.getClass().getSimpleName();
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", objArray));
             }
          }else {
             a.e(p0, p1, p3);
             return;
          }
       }else {
          a.d(p0, p1, p3);
          return;
       }
    }
    public static void c(a$a p0,Object p1,String p2,ReadableArray p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "3")) {
          return;
       }
       a.c(p0);
       a.c(p1);
       a.c(p3);
       Objects.requireNonNull(p2);
       int i = -1;
       switch (p2.hashCode()){
           case 0xe8077228:
             if (p2.equals("scrollTo")) {
                i = 0;
             }
             break;
           case 0x1b1bf01:
             if (p2.equals("flashScrollIndicators")) {
                i = 1;
             }
             break;
           case 0x7a7e8d93:
             if (p2.equals("scrollToEnd")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             a.d(p0, p1, p3);
             return;
           case 1:
             p0.flashScrollIndicators(p1);
             return;
           case 2:
             a.e(p0, p1, p3);
             return;
           default:
             Object[] objArray = new Object[]{p2,p0.getClass().getSimpleName()};
             throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", objArray));
       }
    }
    public static void d(a$a p0,Object p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "4")) {
          return;
       }
       p0.scrollTo(p1, new a$b(Math.round(p.b(p2.getDouble(0))), Math.round(p.b(p2.getDouble(1))), p2.getBoolean(2)));
       return;
    }
    public static void e(a$a p0,Object p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "5")) {
          return;
       }
       p0.scrollToEnd(p1, new a$c(p2.getBoolean(0)));
       return;
    }
}
