package hc.a;
import android.graphics.drawable.Animatable;
import ob.a;
import android.graphics.drawable.Drawable;
import hc.c;
import dc.a;
import hc.a$a;
import jc.b;
import jc.a;
import dc.d;
import android.graphics.Canvas;
import java.lang.Math;
import hc.b;
import cb.a;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import java.lang.Runnable;
import hc.a$b;
import android.os.SystemClock;
import android.graphics.Rect;
import xb.f;
import android.graphics.ColorFilter;

public class a extends Drawable implements Animatable, a	// class@00211b
{
    public a b;
    public b c;
    public boolean d;
    public long e;
    public long f;
    public long g;
    public int h;
    public long i;
    public long j;
    public int k;
    public long l;
    public long m;
    public int n;
    public b o;
    public a$b p;
    public f q;
    public final Runnable r;
    public static final Class s;
    public static final b t;

    static {
       a.s = a.class;
       a.t = new c();
    }
    public void a(){
       super(null);
    }
    public void a(a p0){
       super();
       this.l = 8;
       this.m = 0;
       this.o = a.t;
       this.p = null;
       this.r = new a$a(this);
       this.b = p0;
       this.c = a.e(p0);
    }
    public static b e(a p0){
       if (p0 == null) {
          return null;
       }
       return new a(p0);
    }
    public void a(){
       a tb = this.b;
       if (tb != null) {
          tb.clear();
       }
       return;
    }
    public void draw(Canvas p0){
       long l6;
       long l7;
       long this;
       a uoa = this;
       if (uoa.b == null || uoa.c == null) {
          return;
       }
       long l = this.j();
       long l1 = (uoa.d != null)? (l - uoa.e) + uoa.m: Math.max(uoa.f, 0);
       long l2 = l1;
       int i = uoa.c.b(l2, uoa.f);
       boolean b = false;
       a uoa1 = -1;
       if (i == uoa1) {
          i = uoa.b.getFrameCount() - 1;
          uoa.o.a(uoa);
          uoa.d = b;
       }else if(!i && (uoa.h != uoa1 && l - uoa.g >= 0)){
          uoa.o.c(uoa);
       }
       int i1 = i;
       boolean b1 = uoa.b.drawFrame(uoa, p0, i1);
       if (b1) {
          uoa.o.d(uoa, i1);
          uoa.h = i1;
       }
       if (!b1) {
          uoa.n = uoa.n + 1;
          if (a.l(2)) {
             a.n(a.s, "Dropped a frame. Count: %s", Integer.valueOf(uoa.n));
          }
       }
       long l3 = this.j();
       a uoa2 = -1;
       if (uoa.d != null) {
          long l4 = uoa.c.a((l3 - uoa.e));
          if (l4 - uoa2) {
             l1 = uoa.l + l4;
             long l5 = uoa.e + l1;
             uoa.g = l5;
             uoa.scheduleSelf(uoa.r, l5);
             l6 = l1;
          }else {
             uoa.o.a(uoa);
             uoa.d = b;
             l6 = uoa2;
          }
          l7 = l4;
       }else {
          l7 = uoa2;
          l6 = l7;
       }
       a p = uoa.p;
       if (p != null) {
          p.a(this, uoa.c, i1, b1, uoa.d, uoa.e, l2, uoa.f, l, l3, l7, l6);
          i = this;
          this = l2;
       }else {
          i = this;
          this = l2;
       }
       i.f = this;
       return;
    }
    public a f(){
       return this.b;
    }
    public int g(){
       a tb = this.b;
       int i = (tb == null)? 0: tb.getFrameCount();
       return i;
    }
    public int getIntrinsicHeight(){
       a tb = this.b;
       if (tb == null) {
          return super.getIntrinsicHeight();
       }
       return tb.getIntrinsicHeight();
    }
    public int getIntrinsicWidth(){
       a tb = this.b;
       if (tb == null) {
          return super.getIntrinsicWidth();
       }
       return tb.getIntrinsicWidth();
    }
    public int getOpacity(){
       return -3;
    }
    public long h(){
       if (this.b == null) {
          return 0;
       }
       a tc = this.c;
       if (tc != null) {
          return tc.c();
       }
       int i1 = 0;
       for (int i = 0; i < this.b.getFrameCount(); i = i + 1) {
          i1 = i1 + this.b.getFrameDurationMs(i);
       }
       return (long)i1;
    }
    public void i(int p0){
       if (this.b != null) {
          a tc = this.c;
          if (tc != null) {
             this.f = tc.e(p0);
             long l = this.j() - this.f;
             this.e = l;
             this.g = l;
             this.invalidateSelf();
          }
       }
       return;
    }
    public boolean isRunning(){
       return this.d;
    }
    public final long j(){
       return SystemClock.uptimeMillis();
    }
    public void k(a p0){
       this.b = p0;
       if (p0 != null) {
          this.c = new a(p0);
          this.b.setBounds(this.getBounds());
          p0 = this.q;
          if (p0 != null) {
             p0.a(this);
          }
       }
       this.c = a.e(this.b);
       this.stop();
       return;
    }
    public void l(b p0){
       if (p0 != null) {
       }else {
          p0 = a.t;
       }
       this.o = p0;
       return;
    }
    public void onBoundsChange(Rect p0){
       super.onBoundsChange(p0);
       a tb = this.b;
       if (tb != null) {
          tb.setBounds(p0);
       }
       return;
    }
    public boolean onLevelChange(int p0){
       if (this.d != null) {
          return false;
       }
       long l = (long)p0;
       if (!this.f - l) {
          return false;
       }
       this.f = l;
       this.invalidateSelf();
       return true;
    }
    public void setAlpha(int p0){
       if (this.q == null) {
          this.q = new f();
       }
       this.q.b(p0);
       a tb = this.b;
       if (tb != null) {
          tb.setAlpha(p0);
       }
       return;
    }
    public void setColorFilter(ColorFilter p0){
       if (this.q == null) {
          this.q = new f();
       }
       this.q.c(p0);
       a tb = this.b;
       if (tb != null) {
          tb.setColorFilter(p0);
       }
       return;
    }
    public void start(){
       if (this.d == null) {
          a tb = this.b;
          if (tb != null && tb.getFrameCount() > 1) {
             this.d = true;
             long l = this.j();
             long l1 = l - this.i;
             this.e = l1;
             this.g = l1;
             this.f = l - this.j;
             this.h = this.k;
             this.invalidateSelf();
             this.o.e(this);
          }
       }
       return;
    }
    public void stop(){
       if (this.d == null) {
          return;
       }
       long l = this.j();
       this.i = l - this.e;
       this.j = l - this.f;
       this.k = this.h;
       this.d = false;
       this.e = 0;
       this.g = 0;
       this.f = -1;
       this.h = -1;
       this.unscheduleSelf(this.r);
       this.o.a(this);
       return;
    }
}
