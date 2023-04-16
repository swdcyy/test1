package com.loc.bj$f;
import com.loc.bj;
import java.lang.Object;
import com.loc.bj$c;
import android.os.SystemClock;
import java.lang.String;
import com.loc.bl$b;
import com.loc.m;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.bj$a;
import java.net.URL;
import java.text.DecimalFormat;
import com.loc.bl;
import com.loc.bm;

public final class bj$f	// class@00139a
{
    public long a;
    public long b;
    public bj$c c;
    public bj$a d;
    public bj$c e;
    public String f;
    public URL g;
    public final bj h;

    public void bj$f(bj p0){
       this.h = p0;
       super();
       this.a = 0;
       this.b = 0;
       this.c = new bj$c();
    }
    public final void a(){
       this.c.h = SystemClock.elapsedRealtime() - this.b;
    }
    public final void a(int p0){
       ("----errorcode-----").concat(String.valueOf(p0));
       bj.a();
       this.c.f = SystemClock.elapsedRealtime() - this.a;
       bj$f tc = this.c;
       tc.m = p0;
       boolean b = false;
       if (tc.b.e()) {
          m.a(b, this.c.e);
       }
       boolean b1 = bj.a(this.h, this.c.e);
       if (b1) {
          if (bj.b(this.h) && (!TextUtils.isEmpty(bj.a(this.h)) && this.c.b.b())) {
             m.d();
          }
       label_0058 :
          if (this.c.b.c()) {
             m.a(this.c.b.c(), this.c.e);
          }
          m.c(this.e);
          m.a(b, this.d);
          m.b(this.c);
       }
       m.a(this.g.toString(), this.c.b.c(), true, b1);
       this.c.toString();
       bj.a();
       return;
    }
    public final void a(long p0){
       this.c.l = new DecimalFormat("0.00").format((double)((float)p0 / 1024.00f));
    }
    public final void a(bl p0,URL p1){
       this.g = p1;
       this.c.d = p1.getPath();
       this.c.e = p1.getHost();
       if (!TextUtils.isEmpty(bj.a(this.h)) && p0.u().b()) {
          bj$f tc = this.c;
          tc.c = ((tc.e).replace("[", "")).replace("]", "");
          tc.e = bj.a(this.h);
       }
       if (p0.u().b()) {
          p0.a(this.c.e);
       }
       if (p0.u().d()) {
          this.f = p0.x();
       }
       return;
    }
    public final void a(bm p0){
       this.c.f = SystemClock.elapsedRealtime() - this.a;
       if (p0 != null) {
          p0.f = this.c.b.c();
       }
       if (this.c.b.b()) {
          bj$f tc = this.c;
          if (tc.f - 0x2710 > 0) {
             m.a(false, tc.e);
          }
       }
       if (this.c.b.d()) {
          m.a(false, this.f);
       }
       boolean b = bj.a(this.h, this.c.e);
       if (b) {
          m.c(this.c);
          boolean b1 = true;
          m.a(b1, this.d);
          bj$f tc1 = this.c;
          if (tc1.f - (long)m.e > 0) {
             bj$c uoc = tc1.a();
             if (uoc != null) {
                uoc.m = b1;
                m.b(uoc);
                uoc.toString();
                bj.a();
             }
          }
       }
       m.a(this.g.toString(), this.c.b.c(), false, b);
       this.c.toString();
       bj.a();
       return;
    }
    public final void b(){
       this.c.i = SystemClock.elapsedRealtime() - this.b;
    }
    public final void b(int p0){
       this.c.n = p0;
    }
    public final void c(){
       this.c.j = SystemClock.elapsedRealtime() - this.b;
    }
    public final void d(){
       bj$c uoc = this.c.a();
       if (this.c.f - (long)m.e > 0) {
          uoc.m = 1;
       }
       m.a(uoc);
       return;
    }
}
