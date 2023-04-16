package ga.n0;
import java.lang.Object;
import lnc.a1;
import java.util.Locale;
import java.lang.String;
import android.content.Context;
import android.view.Window;
import java.util.Calendar;
import android.view.View;
import android.view.ViewGroup;
import ba.b;
import ga.m0;
import ea.g;
import ca.a;
import ga.j0;
import android.content.res.Resources;
import cw9.c;
import zf6.j;
import ga.l0;
import fa.e;
import zf6.l;
import ga.r;
import ga.l;
import ga.k0;
import ea.c;
import ga.n0$a;
import android.app.Activity;

public class n0	// class@00207a
{
    public boolean a;
    public Calendar b;
    public r c;
    public n0$a d;
    public ViewGroup e;
    public int f;
    public boolean[] g;
    public String h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public a n;
    public boolean o;
    public int p;
    public int q;

    public void n0(){
       super();
       this.i = a1.a(0x7f060c25);
       this.j = true;
       this.k = true;
       this.q = 0;
    }
    public static boolean b(){
       return ("zh").equals(Locale.getDefault().getLanguage());
    }
    public final void a(Context p0,Window p1,Calendar p2,Calendar p3){
       if (p2 == null) {
          p2 = Calendar.getInstance();
          p2.set(1900, 0, 1, 1, 1);
       }
       if (p3 == null) {
          p3 = Calendar.getInstance();
       }
       n0 te = this.e;
       if (te == null) {
          te = p1.getDecorView().findViewById(0x1020002);
       }
       b uob = new b(p0, new m0(this));
       b a = uob.a;
       a.w = p2;
       a.x = p3;
       a.P = 0x7f0d114c;
       a.e = new j0(this, p0);
       p3.s = (float)c.b(p0.getResources(), 0x7f07110d);
       uob.a.h0 = j.c(p0, 0x7f060c33, this.q);
       p3.g0 = j.c(p0, 0x7f060c33, this.q);
       b a1 = uob.a;
       a1.i0 = j.c(p0, 0x7f060c27, this.q);
       a1.A = this.j;
       a1.k0 = 2.60f;
       a1.Q = te;
       String str = p0.getString(R.string.arg_RES_7f104fd5);
       String str1 = p0.getString(R.string.arg_RES_7f104fd3);
       String str2 = p0.getString(R.string.arg_RES_7f104fd2);
       String str3 = "";
       String str4 = (n0.b())? p0.getString(R.string.arg_RES_7f101cac): str3;
       if (n0.b()) {
          str3 = p0.getString(R.string.arg_RES_7f101cad);
       }
       b a2 = uob.a;
       a2.D = str;
       a2.E = str1;
       a2.F = str2;
       a2.G = str4;
       a2.H = str3;
       a2.I = null;
       a2.J = 0;
       a2.K = 0;
       a2.L = 0;
       a2.M = 0;
       a2.N = 0;
       a2.O = 0;
       a2.c = new l0(this);
       a2.j0 = this.i;
       a2.l0 = this.l;
       a2.m0 = this.m;
       a2.n0 = this.k;
       str1.f0 = c.b(p0.getResources(), 0x7f0710e9);
       b a3 = uob.a;
       a3.e0 = c.b(p0.getResources(), 0x7f0710ef);
       n0 tg = this.g;
       if (tg != null && tg.length == 6) {
          a3.u = tg;
       }
       tg = this.p;
       if (tg != null && tg != null) {
          e.a(tg, a3);
       }
       tg = this.q;
       a3 = uob.a;
       a3.C = tg;
       if (tg != null) {
          a3.S = l.h(a3.S, tg);
       }
       r or = new r(uob.a);
       this.c = or;
       if (this.f != null) {
          or.c(R.id.timepicker).setBackgroundResource(this.f);
       }
       this.c.m(new k0(this));
       return;
    }
    public n0 c(Calendar p0){
       this.b = p0;
       return this;
    }
    public void d(int p0){
       this.q = p0;
    }
    public void e(n0$a p0){
       this.d = p0;
    }
    public n0 f(String p0){
       this.h = p0;
       return this;
    }
    public n0 g(boolean[] p0){
       this.g = p0;
       return this;
    }
    public void h(Activity p0){
       if (this.c == null) {
          this.a(p0, p0.getWindow(), null, null);
       }
       int i = 0x7f0a0ead;
       if (this.c.c(i) != null) {
          this.c.c(i).setEnabled(false);
       }
       this.c.r(this.b);
       this.c.o();
       return;
    }
}
