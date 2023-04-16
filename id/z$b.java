package id.z$b;
import id.k;
import id.z;
import id.i;
import id.e0;
import jd.c;
import id.c0;
import id.z$b$a;
import id.d0;
import java.lang.Throwable;
import java.lang.Object;
import com.facebook.common.references.a;
import id.b;
import java.lang.Boolean;
import ab.e;
import com.facebook.imagepipeline.image.a;
import bd.c;
import java.lang.String;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import android.graphics.Bitmap;
import sc.d;
import bd.h;
import java.io.Closeable;
import id.z$b$b;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public class z$b extends k	// class@0021d7
{
    public final e0 c;
    public final c0 d;
    public final c e;
    public boolean f;
    public a g;
    public int h;
    public boolean i;
    public boolean j;
    public final z k;

    public void z$b(z p0,i p1,e0 p2,c p3,c0 p4){
       this.k = p0;
       super(p1);
       this.g = null;
       this.h = 0;
       this.i = false;
       this.j = false;
       this.c = p2;
       this.e = p3;
       this.d = p4;
       p4.k(new z$b$a(this, p0));
    }
    public void g(){
       this.r();
    }
    public void h(Throwable p0){
       this.s(p0);
    }
    public void i(Object p0,int p1){
       if (!a.l(p0)) {
          if (b.e(p1)) {
             this.t(null, p1);
          }
       }else {
          _monitor_enter(this);
          if (this.f != null) {
             _monitor_exit(this);
          }else {
             z$b tg = this.g;
             this.g = a.d(p0);
             this.h = p1;
             this.i = true;
             _monitor_exit(this);
             a.f(tg);
             if (this.v()) {
                this.w();
             }
          }
       }
       return;
    }
    public final boolean o(){
       _monitor_enter(this);
       if (this.f != null) {
          _monitor_exit(this);
          return false;
       }else {
          z$b tg = this.g;
          this.g = null;
          this.f = true;
          _monitor_exit(this);
          a.f(tg);
          return true;
       }
    }
    public void p(a p0,int p1){
       a uoa;
       z$b td;
       e.a(Boolean.valueOf(a.l(p0)));
       if (!p0.j() instanceof c) {
          this.t(p0, p1);
          return;
       }else {
          this.c.onProducerStart(this.d, "PostprocessorProducer");
          try{
             int i = 0;
             uoa = this.u(p0.j());
             z$b tc = this.c;
             td = this.d;
             tc.onProducerFinishWithSuccess(td, "PostprocessorProducer", this.q(tc, td, this.e));
             this.t(uoa, p1);
             a.f(uoa);
             return;
          }catch(java.lang.Exception e5){
             z$b tc1 = this.c;
             td = this.d;
             tc1.onProducerFinishWithFailure(td, v2, e5, this.q(tc1, td, this.e));
             this.s(e5);
             a.f(uoa);
             return;
          }
       }
    }
    public final Map q(e0 p0,c0 p1,c p2){
       if (!p0.requiresExtraMap(p1, "PostprocessorProducer")) {
          return null;
       }
       return ImmutableMap.of("Postprocessor", p2.getName());
    }
    public void r(){
       if (this.o()) {
          this.n().b();
       }
       return;
    }
    public final void s(Throwable p0){
       if (this.o()) {
          this.n().onFailure(p0);
       }
       return;
    }
    public final void t(a p0,int p1){
       boolean b = b.e(p1);
       if (!b) {
          _monitor_enter(this);
          _monitor_exit(this);
          if (this.f == null) {
          label_0018 :
             this.n().d(p0, p1);
          label_001f :
             return;
          }
       }
       if (b && this.o()) {
          goto label_0018 ;
       }else {
          goto label_001f ;
       }
    }
    public final a u(a p0){
       c uoc = p0;
       a uoa = this.e.b(uoc.g(), this.k.b);
       c uoc1 = new c(uoa, p0.a(), uoc.p(), uoc.o());
       uoc1.f(uoc.getExtras());
       a.f(uoa);
       return a.o(uoc1);
    }
    public synchronized final boolean v(){
       if (this.f != null || (this.i == null || (this.j != null || !a.l(this.g)))) {
          return false;
       }
       this.j = true;
       return true;
    }
    public final void w(){
       this.k.c.execute(new z$b$b(this));
    }
}
