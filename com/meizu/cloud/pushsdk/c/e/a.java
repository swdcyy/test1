package com.meizu.cloud.pushsdk.c.e.a;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.c.i$a;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.i;
import com.meizu.cloud.pushsdk.c.c.e;
import com.meizu.cloud.pushsdk.c.c.a;
import com.meizu.cloud.pushsdk.c.b.a;
import java.lang.Throwable;
import com.meizu.cloud.pushsdk.c.c.c;
import java.util.Set;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.h.b;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.meizu.cloud.pushsdk.c.e.b;
import com.meizu.cloud.pushsdk.c.d.a;

public final class a	// class@0014e3
{
    public static String a;

    public static k a(b p0){
       try{
          i$a uoa = new i$a().a(p0.e());
          a.a(uoa, p0);
          int i = p0.d();
          if (i) {
             if (i != 1) {
                if (i != 2) {
                   if (i != 3) {
                      if (i != 4) {
                         if (i == 5) {
                            uoa = uoa.d(p0.m());
                         }
                      }else {
                         uoa = uoa.b();
                      }
                   }else {
                      uoa = uoa.b(p0.m());
                   }
                }else {
                   uoa = uoa.c(p0.m());
                }
             }else {
                uoa = uoa.a(p0.m());
             }
          }else {
             uoa = uoa.a();
          }
          p0.a(new e());
          return p0.l().a(uoa.c());
       }catch(java.io.IOException e3){
          throw new a(e3);
       }
    }
    public static void a(i$a p0,b p1){
       String str;
       if (p1.h() != null) {
          str = p1.h();
       }else {
          str = a.a;
          if (str != null) {
             p1.a(str);
             str = a.a;
          }else {
          label_001a :
             c uoc = p1.o();
             if (uoc != null) {
                p0.a(uoc);
                if (p1.h() != null && !uoc.b().contains("User-Agent")) {
                   p0.a("User-Agent", p1.h());
                }
             }
             return;
          }
       }
       p0.a("User-Agent", str);
       goto label_001a ;
    }
    public static k b(b p0){
       try{
          i$a uoa = new i$a().a(p0.e());
          a.a(uoa, p0);
          p0.a(new e());
          k ok = p0.l().a(uoa.a().c());
          b.a(ok, p0.j(), p0.k());
          return ok;
       }catch(java.io.IOException e0){
          try{
             File uFile = new File(p0.j()+File.separator+p0.k());
             if (uFile.exists()) {
                uFile.delete();
             }
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
          throw new a(e0);
       }
    }
    public static k c(b p0){
       try{
          i$a uoa = new i$a().a(p0.e());
          a.a(uoa, p0);
          p0.a(new e());
          return p0.l().a(uoa.a(new b(p0.n(), p0.i())).c());
       }catch(java.io.IOException e4){
          throw new a(e4);
       }
    }
}
