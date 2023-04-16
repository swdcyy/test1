package dsb.d;
import dsb.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import mrb.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import java.util.UUID;
import java.lang.System;
import android.net.Uri;
import java.lang.Boolean;
import com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher;
import on5.p;

public final class d	// class@0014e4
{
    public static e a;
    public static int b;
    public static boolean c;
    public static boolean d;
    public static final d e;

    static {
       d.e = new d();
       d.a = new e();
    }
    public void d(){
       super();
    }
    public static final e a(d p0){
       return d.a;
    }
    public static final void b(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uod, "5")) {
          return;
       }
       if (!d.j(p0)) {
          d e = d.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), e, uod, "6")) {
             int i = 8;
             if (p0 != i) {
                if (p0 != 16) {
                   if (p0 != 32) {
                      if (p0 != 64) {
                         if (p0 != 128) {
                            if (p0 != 256) {
                               if (p0 != 512) {
                                  if (p0 != 1024) {
                                     if (p0 != 4096) {
                                        i = (d.c)? 10: 11;
                                     }else {
                                        i = 12;
                                     }
                                  }else {
                                     i = 9;
                                  }
                               }
                            }else {
                               i = 7;
                            }
                         }else {
                            i = 6;
                         }
                      }else {
                         i = 5;
                      }
                   }else {
                      i = 4;
                   }
                }else {
                   i = 3;
                }
             }else {
                i = 2;
             }
             Object[] objArray = new Object[0];
             a.C().w("NEARBY_VISIT", "add_condition: "+i, objArray);
          }
          d.b = p0 | d.b;
       }
       return;
    }
    public static final void d(){
       if (PatchProxy.applyVoid(null, null, d.class, "11")) {
          return;
       }
       e a = d.a;
       a.a("");
       a.b(0);
       d.b = 1;
       d.d = true;
       return;
    }
    public static final e f(){
       Object obj = PatchProxy.apply(null, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.d) {
          d e = d.e;
          d.a.a(e.e());
          e.c();
          d.d = false;
       }
       return d.a;
    }
    public static final String g(){
       Object obj = PatchProxy.apply(null, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a.a;
    }
    public static final String h(){
       Object obj = PatchProxy.apply(null, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(d.a.b);
    }
    public static final String i(){
       String obj = PatchProxy.apply(null, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.q(d.a);
       a.o(obj, "mVisitSourcePageParam.le¡­ns.KWAI_GSON.toJson\(it\) }");
       return obj;
    }
    public static final boolean j(int p0){
       boolean b = (p0 & d.b)? true: false;
       return b;
    }
    public static final void l(boolean p0){
       d.c = p0;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       int i = 8;
       if (d.j(i)) {
          i = 2;
       }else if(d.j(1024)){
          i = 9;
       }else if(d.j(4096)){
          i = 12;
       }else if(d.j(256)){
          i = 7;
       }else if(d.j(512)){
          if (d.j(128)) {
             i = 6;
          }else if(d.j(64)){
             i = 5;
          }else if(d.j(32)){
             i = 4;
          }else if(d.j(16)){
             i = 3;
          }else if(d.c){
             i = 10;
          }else {
             i = 11;
          }
       }
       d.a.b(i);
       Object[] objArray = new Object[0];
       a.C().w("NEARBY_VISIT", "visited_source: "+i, objArray);
       return;
    }
    public final String e(){
       Object obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UUID.randomUUID().toString()+System.currentTimeMillis();
    }
    public final boolean k(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return HomeTabUriMatcher.c.a(p0);
    }
}
