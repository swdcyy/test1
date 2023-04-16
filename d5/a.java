package d5.a;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import d5.a$a;
import n5.a;
import android.view.animation.Interpolator;
import n5.c;

public abstract class a	// class@001dfe
{
    public final List a;
    public boolean b;
    public final List c;
    public float d;
    public c e;
    public a f;
    public a g;
    public float h;
    public Object i;
    public float j;
    public float k;

    public void a(List p0){
       super();
       this.a = new ArrayList(1);
       this.b = false;
       this.d = 0;
       this.h = 0xbf800000;
       this.i = null;
       this.j = 0xbf800000;
       this.k = 0xbf800000;
       this.c = p0;
    }
    public void a(a$a p0){
       this.a.add(p0);
    }
    public a b(){
       a tf = this.f;
       if (tf != null && tf.a(this.d)) {
          return this.f;
       }
       tf = this.c;
       tf = tf.get((tf.size() - 1));
       if (this.d - tf.c() < 0) {
          int i = this.c.size() - 1;
          while (i >= 0) {
             tf = this.c.get(i);
             if (!tf.a(this.d)) {
                i = i - 1;
             }
          }
       }
       this.f = tf;
       return tf;
    }
    public float c(){
       float f;
       if (!this.k - 0xbf800000) {
          if (this.c.isEmpty()) {
             f = 0x3f800000;
          }else {
             a tc = this.c;
             f = tc.get((tc.size() - 1)).b();
          }
          this.k = f;
       }
       return this.k;
    }
    public float d(){
       a uoa = this.b();
       if (uoa.d()) {
          return 0;
       }
       return uoa.d.getInterpolation(this.e());
    }
    public float e(){
       float f = 0;
       if (this.b != null) {
          return f;
       }
       a uoa = this.b();
       if (uoa.d()) {
          return f;
       }
       return ((this.d - uoa.c()) / (uoa.b() - uoa.c()));
    }
    public float f(){
       return this.d;
    }
    public final float g(){
       if (!this.j - 0xbf800000) {
          float f = (this.c.isEmpty())? 0: this.c.get(0).c();
          this.j = f;
       }
       return this.j;
    }
    public Object h(){
       a uoa = this.b();
       float f = this.d();
       if (this.e == null && (uoa == this.g && !this.h - f)) {
          return this.i;
       }
       this.g = uoa;
       this.h = f;
       Object obj = this.i(uoa, f);
       this.i = obj;
       return obj;
    }
    public abstract Object i(a p0,float p1);
    public void j(){
       for (int i = 0; i < this.a.size(); i = i + 1) {
          this.a.get(i).e();
       }
       return;
    }
    public void k(float p0){
       if (this.c.isEmpty()) {
          return;
       }
       a uoa = this.b();
       if (p0 - this.g() < 0) {
          p0 = this.g();
       }else if(p0 - this.c() > 0){
          p0 = this.c();
       }
       if (!p0 - this.d) {
          return;
       }else {
          this.d = p0;
          a uoa1 = this.b();
          if (uoa != uoa1 || !uoa1.d()) {
             this.j();
          }
          return;
       }
    }
    public void l(c p0){
       a te = this.e;
       if (te != null) {
          te.b(null);
       }
       this.e = p0;
       if (p0 != null) {
          p0.b(this);
       }
       return;
    }
}
