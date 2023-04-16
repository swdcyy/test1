package vc.j;
import vc.h;
import java.lang.Object;
import kd.b;
import java.lang.String;
import ab.e;
import vc.i;
import id.r;
import vc.f;
import java.util.concurrent.Executor;
import id.l0;
import com.facebook.common.references.a;
import vc.a;
import xc.a;
import java.lang.Class;
import cb.a;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ProducerSequenceFactory;
import java.util.Set;
import java.util.Collections;
import tc.s;
import tc.g;
import tc.h;
import ab.h;
import tc.v;
import id.k0;
import va.a;
import android.content.Context;
import zc.a;
import pc.a;
import sc.d;
import tc.l;
import pc.b;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.lang.Boolean;
import java.lang.reflect.Constructor;
import eb.c;
import tc.v$a;
import tc.l$b;
import tc.a;
import tc.r;
import tc.t;
import tc.x;
import tc.p;
import tc.y;
import tc.u;
import tc.b0;
import tc.k$a;
import eb.b;
import tc.q;
import ld.d;
import java.lang.Integer;
import ld.h;
import ld.f;
import com.facebook.cache.disk.f;
import ed.v;
import com.facebook.common.memory.b;
import com.facebook.common.memory.c;
import ua.a;
import vc.g;
import gd.d;
import sc.a;
import ed.d;
import gd.e;
import vc.m;
import eb.a;
import yc.b;
import android.graphics.Bitmap$Config;
import yc.c;
import yc.a;
import java.util.Map;
import com.facebook.imageformat.b;
import yc.d;
import vc.i$c;
import android.os.Build$VERSION;
import android.content.ContentResolver;
import com.facebook.imagepipeline.producers.n;

public class j	// class@002693
{
    public final k0 a;
    public final h b;
    public final a c;
    public l d;
    public s e;
    public l f;
    public s g;
    public g h;
    public f i;
    public b j;
    public ImagePipeline k;
    public d l;
    public m m;
    public ProducerSequenceFactory n;
    public g o;
    public f p;
    public d q;
    public d r;
    public a s;
    public static final Class t;
    public static j u;
    public static boolean v;
    public static ImagePipeline w;

    static {
       j.t = j.class;
    }
    public void j(h p0){
       super();
       if (b.d()) {
          b.a("ImagePipelineConfig\(\)");
       }
       e.d(p0);
       h oh = p0;
       this.b = oh;
       r or = (oh.h().s != null)? new r(p0.g().e()): new l0(p0.g().e());
       this.a = or;
       a.g = p0.h().q;
       this.c = new a(p0.F);
       if (b.d()) {
          b.b();
       }
       return;
    }
    public static j j(){
       j u = j.u;
       e.e(u, "ImagePipelineFactory was not initialized!");
       return u;
    }
    public static synchronized void s(h p0){
       _monitor_enter(j.class);
       if (j.u != null) {
          a.t(j.t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize\(...\)` should only be called once to avoid unexpected behavior.");
       }
       j.u = new j(p0);
       _monitor_exit(j.class);
       return;
    }
    public final ImagePipeline a(){
       j oj = this;
       j b = oj.b;
       ImagePipeline imagePipelin = new ImagePipeline(this.p(), Collections.unmodifiableSet(oj.b.x), Collections.unmodifiableSet(oj.b.y), oj.b.o, this.e(), this.g(), this.k(), this.q(), oj.b.c(), oj.a, oj.b.h().r, oj.b.h().n, b.E, b);
       return v16;
    }
    public a b(Context p0){
       a uoa = this.c();
       a uoa1 = (uoa == null)? null: uoa.a(p0);
       return uoa1;
    }
    public final a c(){
       if (this.s == null) {
          d uod = this.m();
          f uof = this.b.g();
          l ol = this.d();
          i p = this.b.h().p;
          if (!b.a) {
             Class[] uClassArray = new Class[]{d.class,f.class,l.class,Boolean.TYPE};
             Object[] objArray = new Object[]{uod,uof,ol,Boolean.valueOf(p)};
             b.b = AnimatedFactoryV2Impl.class.getConstructor(uClassArray).newInstance(objArray);
             if (b.b != null) {
                b.a = true;
             }
          }
          this.s = b.b;
       }
       return this.s;
    }
    public l d(){
       if (this.d == null) {
          j tb = this.b;
          j tb1 = this.b;
          this.d = tb.I.a(tb.b(), this.b.r(), tb1.c, tb1.d);
       }
       return this.d;
    }
    public s e(){
       if (this.e == null) {
          l ol = this.d();
          r or = this.b.j();
          or.j(ol);
          t ot = new t(or);
          this.e = new s(ol, ot);
       }
       return this.e;
    }
    public a f(){
       return this.c;
    }
    public s g(){
       v ov;
       if (this.g == null) {
          if (this.b.e() != null) {
             ov = this.b.e();
          }else if(this.f == null){
             u ou = new u(new p(), new y(), this.b.f(), null, false, null);
             this.b.r().b(v8);
             this.f = v8;
          }
          ov = this.f;
          r or = this.b.j();
          or.d(ov);
          q oq = new q(or);
          this.g = new s(ov, oq);
       }
       return this.g;
    }
    public ImagePipeline h(){
       if (j.v) {
          if (j.w == null) {
             ImagePipeline imagePipelin = this.a();
             j.w = imagePipelin;
             this.k = imagePipelin;
          }
          return j.w;
       }else if(this.k == null){
          this.k = this.a();
       }
       return this.k;
    }
    public final d i(){
       if (this.l == null) {
          if (this.b.m() == null && (this.b.n() == null && this.b.h().k != null)) {
             this.l = new h(this.b.h().b());
          }else {
             f uof = new f(this.b.h().b(), this.b.h().e, this.b.m(), this.b.n(), this.b.h().x);
             this.l = v0;
          }
       }
       return this.l;
    }
    public g k(){
       if (this.h == null) {
          g og = new g(this.l(), this.b.t().f(this.b.p()), this.b.t().g(), this.b.g().b(), this.b.g().c(), this.b.j());
          this.h = v0;
       }
       return this.h;
    }
    public f l(){
       if (this.i == null) {
          this.i = this.b.i().a(this.b.o());
       }
       return this.i;
    }
    public d m(){
       if (this.q == null) {
          this.n();
          this.q = new a(this.b.t().a(), this.f());
       }
       return this.q;
    }
    public d n(){
       if (this.r == null) {
          this.r = e.a(this.b.t(), this.b.h().o);
       }
       return this.r;
    }
    public final m o(){
       j b;
       b uob;
       b uob1;
       j oj = this;
       if (oj.m == null) {
          i m = oj.b.h().m;
          Context uContext = oj.b.d();
          a uoa = oj.b.t().h();
          if (oj.j == null) {
             if (oj.b.k() != null) {
                oj.j = oj.b.k();
             }else {
                a uoa1 = this.c();
                Map map = null;
                if (uoa1 != null) {
                   uob = uoa1.b(oj.b.a());
                   uob1 = uoa1.c(oj.b.a());
                }else {
                   uob1 = map;
                   uob = uob1;
                }
                if (oj.b.l() == null) {
                   oj.j = new a(uob, uob1, this.n(), map);
                }else {
                   oj.j = new a(uob, uob1, this.n(), oj.b.l().a);
                   uob1 = b.d();
                   uob1.b = oj.b.l().b;
                   uob1.e();
                }
             }
          }
          b = oj.b;
          boolean b1 = b.w();
          oj.m = m.a(uContext, uoa, oj.j, b.w, b1, oj.b.x(), oj.b.h().c, oj.b.g(), oj.b.t().f(oj.b.p()), oj.b.t().g(), this.e(), this.g(), this.k(), this.q(), oj.b.c(), this.m(), oj.b.h().g, oj.b.h().h, oj.b.h().i, oj.b.h().b(), this.f(), oj.b.h().u, oj.b.h().A);
       }
       return oj.m;
    }
    public final ProducerSequenceFactory p(){
       j oj = this;
       boolean b = (Build$VERSION.SDK_INT >= 24 && oj.b.h().d())? true: false;
       if (oj.n == null) {
          ProducerSequenceFactory producerSequ = new ProducerSequenceFactory(oj.b.d().getApplicationContext().getContentResolver(), this.o(), oj.b.s(), oj.b.x(), oj.b.h().h(), oj.a, oj.b.w(), b, oj.b.h().g(), oj.b.v(), this.i(), oj.b.h().f(), oj.b.h().e(), oj.b.h().i(), oj.b.h().a());
          oj.n = v1;
       }
       return oj.n;
    }
    public final g q(){
       if (this.o == null) {
          g og = new g(this.r(), this.b.t().f(this.b.p()), this.b.t().g(), this.b.g().b(), this.b.g().c(), this.b.j());
          this.o = v0;
       }
       return this.o;
    }
    public f r(){
       if (this.p == null) {
          this.p = this.b.i().a(this.b.u());
       }
       return this.p;
    }
}
