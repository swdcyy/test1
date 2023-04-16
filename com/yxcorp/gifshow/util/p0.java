package com.yxcorp.gifshow.util.p0;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.framework.init.e;
import lnc.k4;
import brd.t;
import t45.d;
import brd.z;
import lnc.f9;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public final class p0	// class@001f95
{
    public final Runnable a;
    public b b;
    public static int c = 255;

    public void p0(Runnable p0){
       super();
       this.a = p0;
    }
    public static boolean a(){
       int i = 0;
       if (p0.c < 0) {
          p0.c = a.t().a("featured_lazy_frag_2023", i);
       }
       if (p0.c > 0) {
          i = true;
       }
       return i;
    }
    public void b(String p0,Boolean p1){
       g og = 2;
       boolean b = true;
       if (p1.booleanValue()) {
          if (p0.c < 0) {
             p0.c = a.t().a("featured_lazy_frag_2023", 0);
          }
          if (p0.c != og) {
             b = 0;
          }
          if (b) {
             e.d(this.a, p0);
          }
       }else {
          int i = k4.c();
          if (i != b) {
             if (i != og) {
                if (i != 3) {
                   if (i != 4) {
                      e.d(this.a, p0);
                   }
                }
             }
             this.b = e.b().observeOn(d.a).subscribe(new f9(this), Functions.e);
          }
          e.e(this.a, p0, b);
       }
       return;
    }
}
