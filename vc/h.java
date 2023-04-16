package vc.h;
import vc.h$c;
import vc.h$a;
import vc.h$b;
import java.lang.Object;
import kd.b;
import java.lang.String;
import java.util.Objects;
import vc.i;
import vc.i$a;
import tc.m;
import android.content.Context;
import android.app.ActivityManager;
import tc.c;
import android.graphics.Bitmap$Config;
import tc.n;
import ab.e;
import vc.c;
import vc.e;
import vc.d;
import tc.o;
import tc.z;
import java.lang.IllegalStateException;
import ua.a$b;
import ua.a;
import eb.d;
import com.facebook.imagepipeline.producers.f;
import ed.v;
import ed.u$b;
import ed.u;
import yc.f;
import yc.f$b;
import yc.f$a;
import yc.f$c;
import java.util.HashSet;
import vc.b;
import tc.j;
import sc.c;
import jb.b;
import jb.a;
import jb.c;
import java.lang.Integer;
import android.os.Build$VERSION;
import jb.b$a;
import ab.h;
import tc.h;
import tc.v;
import vc.f;
import vc.g;
import tc.r;
import yc.b;
import yc.c;
import ld.d;
import eb.c;
import com.facebook.imagepipeline.producers.n;

public class h	// class@00268e
{
    public final a A;
    public final c B;
    public final i C;
    public final boolean D;
    public final a E;
    public final a F;
    public final v G;
    public final v H;
    public final a I;
    public final Bitmap$Config a;
    public final h b;
    public final v$a c;
    public final l$b d;
    public final h e;
    public final Context f;
    public final boolean g;
    public final g h;
    public final h i;
    public final f j;
    public final r k;
    public final b l;
    public final d m;
    public final Integer n;
    public final h o;
    public final a p;
    public final c q;
    public final int r;
    public final n s;
    public final int t;
    public final d u;
    public final v v;
    public final d w;
    public final Set x;
    public final Set y;
    public final boolean z;
    public static h$c J;

    static {
       h.J = new h$c(null);
    }
    public void h(h$b p0){
       m om;
       c uoc;
       Bitmap$Config aRGB_8888;
       n on;
       o oo;
       z oz;
       h$a uoa1;
       a uoa2;
       int i;
       v ov;
       f uof;
       HashSet hashSet;
       b uob;
       j oj;
       i d;
       super();
       if (b.d()) {
          b.a("ImagePipelineConfig\(\)");
       }
       h$b c = p0.C;
       Objects.requireNonNull(c);
       i oi = new i(c);
       this.C = oi;
       c = p0.b;
       if (c == null) {
          om = new m(p0.f.getSystemService("activity"));
       }
       this.b = om;
       c = p0.d;
       if (c == null) {
          uoc = new c();
       }
       this.c = uoc;
       this.d = p0.c;
       c = p0.a;
       if (c == null) {
          aRGB_8888 = Bitmap$Config.ARGB_8888;
       }
       this.a = aRGB_8888;
       c = p0.e;
       if (c == null) {
          on = n.e();
       }
       this.e = on;
       c = p0.f;
       e.d(c);
       this.f = c;
       c = p0.z;
       if (c == null) {
          uoc = new c(new e());
       }
       this.h = uoc;
       this.g = p0.g;
       c = p0.h;
       if (c == null) {
          oo = new o();
       }
       this.i = oo;
       c = p0.j;
       if (c == null) {
          oz = z.class;
          _monitor_enter(oz);
          if (z.a == null) {
             z.a = new z();
          }
          _monitor_exit(oz);
          oz = z.a;
       }
       this.k = oz;
       this.l = p0.k;
       c = p0.l;
       if (c == null || p0.m == null) {
          f$a uoa = null;
          if (c == null) {
             f$a uoa3 = uoa;
          }
          this.m = c;
          this.n = p0.m;
          c = p0.n;
          if (c == null) {
             uoa1 = new h$a(this);
          }
          this.o = uoa1;
          c = p0.o;
          if (c == null) {
             c = p0.f;
             if (b.d()) {
                b.a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
             }
             uoa2 = a.c(c).a();
             if (b.d()) {
                b.b();
             }
          }
          this.p = uoa2;
          h$b p = p0.p;
          if (p == null) {
             p = d.c();
          }
          this.q = p;
          this.r = h.q(p0, oi);
          p = p0.B;
          if (p < null) {
             i = 0x7530;
          }
          this.t = i;
          if (b.d()) {
             b.a("ImagePipelineConfig->mNetworkFetcher");
          }
          h$b r = p0.r;
          if (r == null) {
             r = new f(i);
          }
          this.s = r;
          if (b.d()) {
             b.b();
          }
          this.u = p0.s;
          p = p0.t;
          if (p == null) {
             ov = new v(u.l().a());
          }
          this.v = ov;
          r = p0.u;
          if (r == null) {
             uof = new f(new f$b(uoa));
          }
          this.w = uof;
          h$b v = p0.v;
          if (v == null) {
             v = new HashSet();
          }
          this.x = v;
          v = p0.w;
          if (v == null) {
             hashSet = new HashSet();
          }
          this.y = hashSet;
          this.z = p0.x;
          v = p0.y;
          if (v != null) {
             uoa2 = v;
          }
          this.A = uoa2;
          this.B = p0.A;
          int i1 = ov.c();
          v = p0.i;
          if (v == null) {
             uob = new b(i1);
          }
          this.j = uob;
          this.D = p0.D;
          this.E = p0.E;
          this.F = p0.F;
          this.G = p0.G;
          c = p0.I;
          if (c == null) {
             oj = new j();
          }
          this.I = oj;
          this.H = p0.H;
          d = oi.d;
          if (d != null) {
             h.z(d, oi, new c(this.t()));
          }else if(oi.h() && c.a){
             b uob1 = c.c();
             if (uob1 != null) {
                h.z(uob1, oi, new c(this.t()));
             }
          }
          if (b.d()) {
             b.b();
          }
          return;
       }else {
          throw new IllegalStateException("You can\'t define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
       }
    }
    public static int q(h$b p0,i p1){
       p0 = p0.q;
       if (p0 != null) {
          return p0.intValue();
       }
       if (!p1.c() - 2 && Build$VERSION.SDK_INT >= 27) {
          return 2;
       }
       if (!p1.c() - 1) {
          return 1;
       }
       return 0;
    }
    public static h$b y(Context p0){
       return new h$b(p0);
    }
    public static void z(b p0,i p1,a p2){
       c.d = p0;
       p1 = p1.b;
       if (p1 != null) {
          p0.c(p1);
       }
       p0.d(p2);
       return;
    }
    public Bitmap$Config a(){
       return this.a;
    }
    public h b(){
       return this.b;
    }
    public h c(){
       return this.e;
    }
    public Context d(){
       return this.f;
    }
    public v e(){
       return this.H;
    }
    public h f(){
       return this.i;
    }
    public f g(){
       return this.j;
    }
    public i h(){
       return this.C;
    }
    public g i(){
       return this.h;
    }
    public r j(){
       return this.k;
    }
    public b k(){
       return this.l;
    }
    public c l(){
       return this.B;
    }
    public d m(){
       return this.m;
    }
    public Integer n(){
       return this.n;
    }
    public a o(){
       return this.p;
    }
    public int p(){
       return this.r;
    }
    public c r(){
       return this.q;
    }
    public n s(){
       return this.s;
    }
    public v t(){
       return this.v;
    }
    public a u(){
       return this.A;
    }
    public boolean v(){
       return this.D;
    }
    public boolean w(){
       return this.g;
    }
    public boolean x(){
       return this.z;
    }
}
