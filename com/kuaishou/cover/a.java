package com.kuaishou.cover.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import ev.b;
import java.util.Objects;
import java.util.Map;
import java.lang.StringBuilder;
import d30.c;
import java.lang.reflect.Type;
import yz7.e;
import a30.b;
import android.view.Window;
import a30.e;
import java.lang.Long;
import com.kuaishou.cover.c$a;
import com.kuaishou.cover.c;
import com.kuaishou.cover.Link;
import nv.c;
import g30.c;

public class a	// class@0016d2
{

    public void a(){
       super();
    }
    public static void a(String p0,int p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, a.class, "7")) {
          return;
       }
       b uob = b.b();
       Objects.requireNonNull(uob);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, uob, b.class, "2")) {
          uob.a(p0, p1, p2);
       }
       return;
    }
    public static void b(String p0,int p1,Map p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, a.class, "6")) {
          return;
       }
       StringBuilder str = "LinkApi-onPageChanged, page: ";
       String str1 = "";
       String str2 = (p0 == null)? str1: p0;
       try{
          c.d(str+str2+" action: "+p1);
          if (p2 != null) {
             str1 = e.e(p2, String.class, Object.class);
          }
          a.a(p0, p1, str1);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void c(long p0,String p1,Map p2,b p3,Window p4,int p5,e p6){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,p3,p4,Integer.valueOf(p5),null};
          if (PatchProxy.applyVoid(objArray, null, uoa, "5")) {
             return;
          }
       }
       c$a uoa1 = new c$a();
       uoa1.e(p0);
       uoa1.f(p1);
       uoa1.b(p2);
       uoa1.c(p3);
       uoa1.g = p4;
       uoa1.e = p5;
       uoa1.h = null;
       c uoc = uoa1.a();
       if (p5 == 1) {
          Link.h().s(uoc);
       }else if(p5 == 2){
          Link.h().u(uoc, b.b().c(), 1);
       }else {
          c.b("not support link type: "+p5);
       }
       return;
    }
    public static void d(String p0,Map p1,b p2,Window p3,int p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
             return;
          }
       }
       a.c(c.a(), p0, p1, p2, p3, p4, null);
       return;
    }
}
