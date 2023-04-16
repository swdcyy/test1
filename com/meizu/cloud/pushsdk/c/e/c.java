package com.meizu.cloud.pushsdk.c.e.c;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.c.b.a;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.e.a;
import com.meizu.cloud.pushsdk.c.h.b;
import com.meizu.cloud.pushsdk.c.h.a;
import com.meizu.cloud.pushsdk.c.a.e;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Throwable;

public final class c	// class@0014e6
{

    public static c a(b p0){
       int i = p0.g();
       if (!i) {
          return c.b(p0);
       }
       if (i == 1) {
          return c.c(p0);
       }
       if (i != 2) {
          return new c(new a());
       }
       return c.d(p0);
    }
    public static c b(b p0){
       c uoc;
       k ok = null;
       try{
          ok = a.a(p0);
          if (ok == null) {
             a.a(ok, p0);
             return new c(b.a(new a()));
          }else if(p0.f() == e.d){
             uoc = new c(ok);
             uoc.a(ok);
             a.a(ok, p0);
             return uoc;
          }else if(ok.a() >= 400){
             uoc = new c(b.a(new a(ok), p0, ok.a()));
             uoc.a(ok);
             a.a(ok, p0);
             return uoc;
          }else {
             try{
                uoc = p0.a(ok);
                uoc.a(ok);
                a.a(ok, p0);
                return uoc;
             }catch( e0){
             }
          }
       }catch(com.meizu.cloud.pushsdk.c.b.a e1){
          a.a(ok, p0);
          return new c(b.a(new a(e1)));
       }catch(java.lang.Exception e1){
          a.a(ok, p0);
          return new c(b.a(e1));
       }
    }
    public static c c(b p0){
       try{
          k ok = a.b(p0);
          if (ok == null) {
             return new c(b.a(new a()));
          }
          if (ok.a() >= 400) {
             c uoc = new c(b.a(new a(ok), p0, ok.a()));
             uoc.a(ok);
             return uoc;
          }else {
             c uoc1 = new c("success");
             uoc1.a(ok);
             return uoc1;
          }
       }catch(com.meizu.cloud.pushsdk.c.b.a e4){
          return new c(b.a(new a(e4)));
       }catch(java.lang.Exception e4){
          return new c(b.a(e4));
       }
    }
    public static c d(b p0){
       c uoc;
       k ok = null;
       try{
          ok = a.c(p0);
          if (ok == null) {
             a.a(ok, p0);
             return new c(b.a(new a()));
          }else if(p0.f() == e.d){
             uoc = new c(ok);
             uoc.a(ok);
             a.a(ok, p0);
             return uoc;
          }else if(ok.a() >= 400){
             uoc = new c(b.a(new a(ok), p0, ok.a()));
             uoc.a(ok);
             a.a(ok, p0);
             return uoc;
          }else {
             try{
                uoc = p0.a(ok);
                uoc.a(ok);
                a.a(ok, p0);
                return uoc;
             }catch( e0){
             }
          }
       }catch(com.meizu.cloud.pushsdk.c.b.a e1){
          a.a(ok, p0);
          return new c(b.a(e1));
       }catch(java.lang.Exception e1){
          a.a(ok, p0);
          return new c(b.a(e1));
       }
    }
}
