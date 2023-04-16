package qc.a;
import oc.a;
import rc.a;
import oc.d;
import android.graphics.Rect;
import java.lang.Object;
import oc.b;
import java.util.Objects;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import java.lang.Math;
import ab.e;
import android.graphics.Canvas;
import oc.c;
import java.util.List;
import java.util.Arrays;
import com.facebook.common.references.a;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Paint;

public class a implements a	// class@0029bd
{
    public final a a;
    public final d b;
    public final b c;
    public final Rect d;
    public final int[] e;
    public final int[] f;
    public final int g;
    public final AnimatedDrawableFrameInfo[] h;
    public final Rect i;
    public final Rect j;
    public final boolean k;
    public Bitmap l;

    public void a(a p0,d p1,Rect p2,boolean p3){
       super();
       this.i = new Rect();
       this.j = new Rect();
       this.a = p0;
       this.b = p1;
       b uob = p1.c();
       this.c = uob;
       int[] frameDuratio = uob.getFrameDurations();
       this.e = frameDuratio;
       Objects.requireNonNull(p0);
       int i = 0;
       int i1 = 0;
       while (i1 < frameDuratio.length) {
          if (frameDuratio[i1] < 11) {
             frameDuratio[i1] = 100;
          }
          i1 = i1 + 1;
       }
       a te = this.e;
       Objects.requireNonNull(this.a);
       int i3 = 0;
       for (int i2 = 0; i2 < te.length; i2++) {
          i3 = i3 + te[i2];
       }
       this.g = i3;
       te = this.e;
       Objects.requireNonNull(this.a);
       frameDuratio = new int[te.length];
       int i4 = 0;
       for (i3 = 0; i3 < te.length; i3 = i3 + 1) {
          frameDuratio[i3] = i4;
          i4 = i4 + te[i3];
       }
       this.f = frameDuratio;
       this.d = a.o(this.c, p2);
       this.k = p3;
       AnimatedDrawableFrameInfo[] uAnimatedDra = new AnimatedDrawableFrameInfo[this.c.getFrameCount()];
       this.h = uAnimatedDra;
       for (; i < this.c.getFrameCount(); i++) {
          uAnimatedDra[i] = this.c.getFrameInfo(i);
       }
       return;
    }
    public static Rect o(b p0,Rect p1){
       if (p1 == null) {
          return new Rect(0, 0, p0.getWidth(), p0.getHeight());
       }
       return new Rect(0, 0, Math.min(p1.width(), p0.getWidth()), Math.min(p1.height(), p0.getHeight()));
    }
    public synchronized void a(){
       this.n();
    }
    public int b(int p0){
       e.c(p0, this.f.length);
       return this.f[p0];
    }
    public int c(int p0){
       return this.e[p0];
    }
    public int d(){
       return this.b.b();
    }
    public d e(){
       return this.b;
    }
    public void f(int p0,Canvas p1){
       c frame = this.c.getFrame(p0);
       if (this.c.doesRenderSupportScaling()) {
          this.r(p1, frame);
       }else {
          this.q(p1, frame);
       }
       frame.dispose();
       return;
    }
    public boolean g(int p0){
       a tb = this.b;
       _monitor_enter(tb);
       d d = tb.d;
       boolean b = (d != null && d.get(p0) != null)? true: false;
       _monitor_exit(tb);
       return b;
    }
    public int getDurationMs(){
       return this.g;
    }
    public int getFrameCount(){
       return this.c.getFrameCount();
    }
    public AnimatedDrawableFrameInfo getFrameInfo(int p0){
       return this.h[p0];
    }
    public int getHeight(){
       return this.c.getHeight();
    }
    public int getLoopCount(){
       return this.c.getLoopCount();
    }
    public int getWidth(){
       return this.c.getWidth();
    }
    public int h(){
       return this.d.height();
    }
    public int i(int p0){
       Objects.requireNonNull(this.a);
       p0 = Arrays.binarySearch(this.f, p0);
       if (p0 < 0) {
          p0 = ((- p0) - 1) - 1;
       }
       return p0;
    }
    public int j(){
       return this.d.width();
    }
    public a k(Rect p0){
       if (a.o(this.c, p0).equals(this.d)) {
          return this;
       }
       return new a(this.a, this.b, p0, this.k);
    }
    public a l(int p0){
       a uoa;
       a tb = this.b;
       _monitor_enter(tb);
       d d = tb.d;
       if (d != null) {
          uoa = a.d(d.get(p0));
          _monitor_exit(tb);
       }else {
          uoa = null;
          _monitor_exit(tb);
       }
       return uoa;
    }
    public synchronized int m(){
       int i = 0;
       a tl = this.l;
       if (tl != null) {
          Objects.requireNonNull(this.a);
          i = i + tl.getAllocationByteCount();
       }
       return (i + this.c.getSizeInBytes());
    }
    public synchronized final void n(){
       a tl = this.l;
       if (tl != null) {
          tl.recycle();
          this.l = null;
       }
       return;
    }
    public synchronized final Bitmap p(int p0,int p1){
       a tl = this.l;
       if (tl != null && (tl.getWidth() < p0 || this.l.getHeight() < p1)) {
          this.n();
       }
       if (this.l == null) {
          this.l = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_8888);
       }
       this.l.eraseColor(0);
       return this.l;
    }
    public final void q(Canvas p0,c p1){
       int i;
       int i1;
       int i2;
       int i3;
       if (this.k != null) {
          float f = Math.max(((float)p1.getWidth() / (float)Math.min(p1.getWidth(), p0.getWidth())), ((float)p1.getHeight() / (float)Math.min(p1.getHeight(), p0.getHeight())));
          i = (int)((float)p1.getWidth() / f);
          i1 = (int)((float)p1.getHeight() / f);
          i2 = (int)((float)p1.getXOffset() / f);
          i3 = (int)((float)p1.getYOffset() / f);
       }else {
          i = p1.getWidth();
          i1 = p1.getHeight();
          i2 = p1.getXOffset();
          i3 = p1.getYOffset();
       }
       _monitor_enter(this);
       Bitmap uBitmap = this.p(i, i1);
       this.l = uBitmap;
       p1.renderFrame(i, i1, uBitmap);
       p0.save();
       p0.translate((float)i2, (float)i3);
       p0.drawBitmap(this.l, 0, 0, null);
       p0.restore();
       _monitor_exit(this);
       return;
    }
    public final void r(Canvas p0,c p1){
       double d = (double)this.d.width() / (double)this.c.getWidth();
       double d1 = (double)this.d.height() / (double)this.c.getHeight();
       int i = (int)Math.round(((double)p1.getWidth() * d));
       int i1 = (int)Math.round(((double)p1.getHeight() * d1));
       int i2 = (int)((double)p1.getXOffset() * d);
       int i3 = (int)((double)p1.getYOffset() * d1);
       _monitor_enter(this);
       int i4 = this.d.width();
       int i5 = this.d.height();
       this.p(i4, i5);
       a tl = this.l;
       if (tl != null) {
          p1.renderFrame(i, i1, tl);
       }
       this.i.set(0, 0, i4, i5);
       this.j.set(i2, i3, (i4 + i2), (i5 + i3));
       a tl1 = this.l;
       if (tl1 != null) {
          p0.drawBitmap(tl1, this.i, this.j, null);
       }
       _monitor_exit(this);
       return;
    }
}
