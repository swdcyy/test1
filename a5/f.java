package a5.f;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.lang.String;
import java.lang.Class;
import android.graphics.Matrix;
import m5.c;
import java.util.HashSet;
import java.util.ArrayList;
import a5.f$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import m5.a;
import a5.f$d;
import java.lang.Object;
import a5.e;
import m5.e;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import androidx.collection.SparseArrayCompat;
import g5.d;
import n5.c;
import a5.f$e;
import g5.e;
import java.util.List;
import java.util.Collections;
import com.airbnb.lottie.ex.model.layer.a;
import a5.j;
import android.graphics.Canvas;
import a5.d;
import java.lang.Math;
import com.airbnb.lottie.ex.model.layer.b;
import com.airbnb.lottie.ex.model.layer.Layer;
import com.airbnb.lottie.ex.model.layer.Layer$LayerType;
import h5.l;
import h5.e;
import h5.m;
import h5.g;
import h5.b;
import h5.d;
import com.airbnb.lottie.ex.model.layer.Layer$MatteType;
import h5.j;
import h5.k;
import e5.b;
import a5.f$g;
import java.lang.System;
import a5.f$h;
import a5.f$c;
import a5.f$k;
import java.lang.Runnable;
import android.graphics.ColorFilter;
import a5.f$n;
import g5.g;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import a5.f$l;
import a5.f$b;
import a5.f$a;
import a5.f$i;
import a5.f$m;
import a5.f$j;

public class f extends Drawable implements Drawable$Callback, Animatable	// class@0000e5
{
    public final Matrix b;
    public e c;
    public final c d;
    public float e;
    public final Set f;
    public final ArrayList g;
    public b h;
    public String i;
    public c j;
    public a k;
    public b l;
    public q m;
    public boolean n;
    public b o;
    public int p;
    public boolean q;
    public boolean r;
    public b s;
    public static final String t;

    static {
       f.t = f.class.getSimpleName();
    }
    public void f(){
       super();
       this.b = new Matrix();
       c uoc = new c();
       this.d = uoc;
       this.e = 0x3f800000;
       this.f = new HashSet();
       this.g = new ArrayList();
       this.p = 255;
       this.r = false;
       uoc.addUpdateListener(new f$f(this));
    }
    public void A(float p0){
       f tc = this.c;
       if (tc == null) {
          this.g.add(new f$d(this, p0));
          return;
       }else {
          this.q((int)e.e(tc.l(), this.c.f(), p0));
          return;
       }
    }
    public void B(int p0){
       this.d.setRepeatCount(p0);
    }
    public void C(float p0){
       this.e = p0;
       this.D();
    }
    public final void D(){
       if (this.c == null) {
          return;
       }
       float f = this.m();
       this.setBounds(0, 0, (int)((float)this.c.b().width() * f), (int)((float)this.c.b().height() * f));
       return;
    }
    public boolean E(){
       boolean b = (this.m == null && this.c.c().size() > 0)? true: false;
       return b;
    }
    public void a(d p0,Object p1,c p2){
       List list;
       if (this.o == null) {
          this.g.add(new f$e(this, p0, p1, p2));
          return;
       }else {
          int i = 1;
          if (p0.d() != null) {
             p0.d().f(p1, p2);
          }else {
             int i1 = 0;
             if (this.o == null) {
                list = Collections.emptyList();
             }else {
                ArrayList uArrayList = new ArrayList();
                String[] stringArray = new String[i1];
                this.o.g(p0, i1, uArrayList, new d(stringArray));
                list = uArrayList;
             }
             while (i1 < list.size()) {
                list.get(i1).d().f(p1, p2);
                i1 = i1 + 1;
             }
             i = i ^ list.isEmpty();
          }
          if (i) {
             this.invalidateSelf();
             if (p1 == j.A) {
                this.A(this.j());
             }
          }
          return;
       }
    }
    public void draw(Canvas p0){
       float f1;
       this.r = false;
       d.a("Drawable#draw");
       if (this.o == null) {
          return;
       }
       f te = this.e;
       float f = Math.min(((float)p0.getWidth() / (float)this.c.b().width()), ((float)p0.getHeight() / (float)this.c.b().height()));
       int i = 0x3f800000;
       if (te - f > 0) {
          f1 = this.e / f;
       }else {
          f = te;
          f1 = 0x3f800000;
       }
       int i1 = -1;
       if (f1 - i > 0) {
          i1 = p0.save();
          float f2 = (float)this.c.b().width() / 2.00f;
          float f3 = (float)this.c.b().height() / 2.00f;
          float f4 = f2 * f;
          float f5 = f3 * f;
          p0.translate(((this.m() * f2) - f4), ((this.m() * f3) - f5));
          p0.scale(f1, f1, f4, f5);
       }
       this.b.reset();
       this.b.preScale(f, f);
       this.o.a(p0, this.b, this.p);
       d.b("Drawable#draw");
       if (i1 > 0) {
          p0.restoreToCount(i1);
       }
       return;
    }
    public final void e(){
       f uof = this;
       f c = uof.c;
       Rect rect = c.b();
       Layer layer = v11;
       l ol = v14;
       l ol1 = new l(null, null, null, null, null, null, null, null, null);
       int i = rect.width();
       int i1 = rect.height();
       Layer layer1 = v11;
       layer = new Layer(Collections.emptyList(), c, "__container", -1, Layer$LayerType.PRE_COMP, -1, null, Collections.emptyList(), ol, 0, 0, 0, 0, 0, i, i1, null, null, Collections.emptyList(), Layer$MatteType.NONE, null, false);
       uof.o = new b(uof, layer1, uof.c.h(), uof.c);
    }
    public void f(){
       if (this.d.isRunning()) {
          this.d.cancel();
       }
       this.c = null;
       this.o = null;
       this.h = null;
       f td = this.d;
       td.k = null;
       td.i = 0xcf000000;
       td.j = 0x4f000000;
       this.invalidateSelf();
       return;
    }
    public e g(){
       return this.c;
    }
    public int getAlpha(){
       return this.p;
    }
    public int getIntrinsicHeight(){
       f tc = this.c;
       int i = (tc == null)? -1: (int)((float)tc.b().height() * this.m());
       return i;
    }
    public int getIntrinsicWidth(){
       f tc = this.c;
       int i = (tc == null)? -1: (int)((float)tc.b().width() * this.m());
       return i;
    }
    public int getOpacity(){
       return -3;
    }
    public b h(){
       return this.s;
    }
    public String i(){
       return this.i;
    }
    public void invalidateDrawable(Drawable p0){
       Drawable$Callback callback = this.getCallback();
       if (callback == null) {
          return;
       }
       callback.invalidateDrawable(this);
       return;
    }
    public void invalidateSelf(){
       if (this.r != null) {
          return;
       }
       this.r = true;
       Drawable$Callback callback = this.getCallback();
       if (callback != null) {
          callback.invalidateDrawable(this);
       }
       return;
    }
    public boolean isRunning(){
       return this.n();
    }
    public float j(){
       return this.d.d();
    }
    public int k(){
       return this.d.getRepeatCount();
    }
    public int l(){
       return this.d.getRepeatMode();
    }
    public float m(){
       return this.e;
    }
    public boolean n(){
       return this.d.isRunning();
    }
    public void o(){
       if (this.o == null) {
          this.g.add(new f$g(this));
          return;
       }else {
          f td = this.d;
          td.l = true;
          td.b(td.i());
          float f = (td.i())? td.f(): td.g();
          td.n((int)f);
          td.f = System.nanoTime();
          td.h = 0;
          td.j();
          return;
       }
    }
    public void p(){
       if (this.o == null) {
          this.g.add(new f$h(this));
          return;
       }else {
          f td = this.d;
          td.l = true;
          td.j();
          td.f = System.nanoTime();
          if (td.i() && !td.e() - td.g()) {
             td.g = td.f();
          }else if(!td.i() && !td.e() - td.f()){
             td.g = td.g();
          }
          return;
       }
    }
    public void q(int p0){
       if (this.c == null) {
          this.g.add(new f$c(this, p0));
          return;
       }else {
          this.d.n(p0);
          return;
       }
    }
    public void r(String p0){
       this.i = p0;
    }
    public void s(int p0){
       if (this.c == null) {
          this.g.add(new f$k(this, p0));
          return;
       }else {
          f td = this.d;
          td.o(td.i, ((float)p0 + 0x3f7d70a4));
          return;
       }
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       Drawable$Callback callback = this.getCallback();
       if (callback == null) {
          return;
       }
       callback.scheduleDrawable(this, p1, p2);
       return;
    }
    public void setAlpha(int p0){
       this.p = p0;
    }
    public void setColorFilter(ColorFilter p0){
    }
    public void start(){
       this.o();
    }
    public void stop(){
       this.g.clear();
       f td = this.d;
       td.k();
       td.a(td.i());
    }
    public void t(String p0){
       f tc = this.c;
       if (tc == null) {
          this.g.add(new f$n(this, p0));
          return;
       }else {
          g og = tc.i(p0);
          if (og == null) {
             throw new IllegalArgumentException("Cannot find marker with name "+p0+".");
          }
          this.s((int)(og.b + og.c));
          return;
       }
    }
    public void u(float p0){
       f tc = this.c;
       if (tc == null) {
          this.g.add(new f$l(this, p0));
          return;
       }else {
          this.s((int)e.e(tc.l(), this.c.f(), p0));
          return;
       }
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
       Drawable$Callback callback = this.getCallback();
       if (callback == null) {
          return;
       }
       callback.unscheduleDrawable(this, p1);
       return;
    }
    public void v(int p0,int p1){
       if (this.c == null) {
          this.g.add(new f$b(this, p0, p1));
          return;
       }else {
          this.d.o((float)p0, ((float)p1 + 0x3f7d70a4));
          return;
       }
    }
    public void w(String p0){
       f tc = this.c;
       if (tc == null) {
          this.g.add(new f$a(this, p0));
          return;
       }else {
          g og = tc.i(p0);
          if (og == null) {
             throw new IllegalArgumentException("Cannot find marker with name "+p0+".");
          }
          int i = (int)og.b;
          this.v(i, ((int)og.c + i));
          return;
       }
    }
    public void x(int p0){
       if (this.c == null) {
          this.g.add(new f$i(this, p0));
          return;
       }else {
          f td = this.d;
          td.o((float)p0, (float)(int)td.j);
          return;
       }
    }
    public void y(String p0){
       f tc = this.c;
       if (tc == null) {
          this.g.add(new f$m(this, p0));
          return;
       }else {
          g og = tc.i(p0);
          if (og == null) {
             throw new IllegalArgumentException("Cannot find marker with name "+p0+".");
          }
          this.x((int)og.b);
          return;
       }
    }
    public void z(float p0){
       f tc = this.c;
       if (tc == null) {
          this.g.add(new f$j(this, p0));
          return;
       }else {
          this.x((int)e.e(tc.l(), this.c.f(), p0));
          return;
       }
    }
}
