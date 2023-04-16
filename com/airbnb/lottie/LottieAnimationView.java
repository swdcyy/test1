package com.airbnb.lottie.LottieAnimationView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView$a;
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView$b;
import com.airbnb.lottie.LottieAnimationView$c;
import w4.h;
import com.airbnb.lottie.RenderMode;
import java.util.HashSet;
import android.util.AttributeSet;
import android.widget.ImageView;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.IllegalArgumentException;
import java.lang.String;
import w4.q;
import p5.d;
import w5.c;
import java.lang.Object;
import w4.l;
import android.util.JsonReader;
import com.airbnb.lottie.b;
import java.util.concurrent.Callable;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import java.io.StringReader;
import java.io.Reader;
import android.animation.Animator$AnimatorListener;
import v5.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import w4.k;
import java.util.Set;
import w4.e;
import v5.c;
import w4.o;
import w4.j;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieAnimationView$d;
import java.lang.Enum;
import android.os.Build$VERSION;
import android.graphics.Paint;
import android.os.Parcelable;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import android.view.View;
import android.view.View$BaseSavedState;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import w4.d;
import java.lang.StringBuilder;
import android.graphics.drawable.Drawable$Callback;
import java.util.Iterator;
import w4.b;
import o5.a;
import w4.c;
import o5.b;
import android.graphics.Bitmap;
import w4.r;

public class LottieAnimationView extends AppCompatImageView	// class@000d8a
{
    public boolean autoPlay;
    public final j d;
    public final j e;
    public j f;
    public final h g;
    public String h;
    public int i;
    public boolean j;
    public boolean k;
    public RenderMode l;
    public Set m;
    public LottieTask n;
    public e o;
    public static final String p;
    public static final j q;

    static {
       LottieAnimationView.p = "LottieAnimationView";
       LottieAnimationView.q = new LottieAnimationView$a();
    }
    public void LottieAnimationView(Context p0){
       super(p0);
       this.d = new LottieAnimationView$b(this);
       this.e = new LottieAnimationView$c(this);
       this.g = new h();
       this.j = false;
       this.k = false;
       this.autoPlay = false;
       this.l = RenderMode.AUTOMATIC;
       this.m = new HashSet();
       this.o(null);
    }
    public void LottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new LottieAnimationView$b(this);
       this.e = new LottieAnimationView$c(this);
       this.g = new h();
       this.j = false;
       this.k = false;
       this.autoPlay = false;
       this.l = RenderMode.AUTOMATIC;
       this.m = new HashSet();
       this.o(p1);
    }
    public void LottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new LottieAnimationView$b(this);
       this.e = new LottieAnimationView$c(this);
       this.g = new h();
       this.j = false;
       this.k = false;
       this.autoPlay = false;
       this.l = RenderMode.AUTOMATIC;
       this.m = new HashSet();
       this.o(p1);
    }
    private void o(AttributeSet p0){
       int i1;
       boolean b;
       int i2;
       String str;
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.a3);
       int i = 0;
       if (!this.isInEditMode()) {
          i1 = 7;
          b = typedArray.hasValue(i1);
          i2 = 3;
          boolean b1 = typedArray.hasValue(i2);
          boolean b2 = typedArray.hasValue(13);
          if (!b || !b1) {
             if (b) {
                i1 = typedArray.getResourceId(i1, i);
                if (i1) {
                   this.setAnimation(i1);
                }
             }else if(b1){
                str = typedArray.getString(i2);
                if (str != null) {
                   this.setAnimation(str);
                }
             }else if(b2){
                str = typedArray.getString(13);
                if (str != null) {
                   this.setAnimationFromUrl(str);
                }
             }
          }else {
             throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
          }
       }
       b = true;
       if (typedArray.getBoolean(i, i)) {
          this.k = b;
          this.autoPlay = b;
       }
       i2 = -1;
       if (typedArray.getBoolean(5, i)) {
          this.g.D(i2);
       }
       i1 = 10;
       if (typedArray.hasValue(i1)) {
          this.setRepeatMode(typedArray.getInt(i1, b));
       }
       i1 = 9;
       if (typedArray.hasValue(i1)) {
          this.setRepeatCount(typedArray.getInt(i1, i2));
       }
       i1 = 12;
       if (typedArray.hasValue(i1)) {
          this.setSpeed(typedArray.getFloat(i1, 0x3f800000));
       }
       this.setImageAssetsFolder(typedArray.getString(4));
       this.setProgress(typedArray.getFloat(6, 0));
       this.k(typedArray.getBoolean(2, i));
       if (typedArray.hasValue(b)) {
          String[] stringArray = new String[]{"**"};
          this.e(new d(stringArray), l.B, new c(new q(typedArray.getColor(b, i))));
       }
       i1 = 11;
       if (typedArray.hasValue(i1)) {
          this.g.E(typedArray.getFloat(i1, 0x3f800000));
       }
       typedArray.recycle();
       this.n();
       return;
    }
    public void A(JsonReader p0,String p1){
       this.setCompositionTask(a.a(p1, new b(p0, p1)));
    }
    public void B(String p0,String p1){
       this.A(new JsonReader(new StringReader(p0)), p1);
    }
    public void C(int p0,int p1){
       this.g.w(p0, p1);
    }
    public void a(Animator$AnimatorListener p0){
       this.g.d.addListener(p0);
    }
    public void c(ValueAnimator$AnimatorUpdateListener p0){
       this.g.d.addUpdateListener(p0);
    }
    public boolean d(k p0){
       return this.m.add(p0);
    }
    public void e(d p0,Object p1,c p2){
       this.g.a(p0, p1, p2);
    }
    public void f(){
       this.g.f();
       this.n();
    }
    public e getComposition(){
       return this.o;
    }
    public long getDuration(){
       LottieAnimationView to = this.o;
       long l = (to != null)? (long)to.d(): 0;
       return l;
    }
    public int getFrame(){
       return (int)this.g.d.e();
    }
    public String getImageAssetsFolder(){
       return this.g.i();
    }
    public float getMaxFrame(){
       return this.g.d.f();
    }
    public float getMinFrame(){
       return this.g.d.g();
    }
    public o getPerformanceTracker(){
       h c = this.g.c;
       o oo = (c != null)? c.k(): null;
       return oo;
    }
    public float getProgress(){
       return this.g.j();
    }
    public int getRepeatCount(){
       return this.g.k();
    }
    public int getRepeatMode(){
       return this.g.l();
    }
    public float getScale(){
       return this.g.m();
    }
    public float getSpeed(){
       return this.g.d.h();
    }
    public final void i(){
       LottieAnimationView tn = this.n;
       if (tn != null) {
          tn.removeListener(this.d);
          this.n.removeFailureListener(this.e);
       }
       return;
    }
    public void invalidateDrawable(Drawable p0){
       LottieAnimationView tg = this.g;
       if (this.getDrawable() == tg) {
          super.invalidateDrawable(tg);
       }else {
          super.invalidateDrawable(p0);
       }
       return;
    }
    public void j(boolean p0){
       LottieAnimationView tn = this.n;
       if (tn != null) {
          tn.removeAllListeners();
          this.n.cancel(p0);
       }
       return;
    }
    public void k(boolean p0){
       LottieAnimationView tg = this.g;
       if (tg.n == p0) {
       }else {
          tg.n = p0;
          if (tg.c != null) {
             tg.e();
          }
       }
       return;
    }
    public final void n(){
       int i = LottieAnimationView$d.a[this.l.ordinal()];
       int i1 = 2;
       if (i != 1) {
          if (i != i1) {
             if (i == 3) {
                LottieAnimationView to = this.o;
                int i2 = 0;
                if (to == null || (!to.m() || Build$VERSION.SDK_INT >= 28)) {
                   to = this.o;
                   if (to == null || to.j() <= 4) {
                      i2 = 1;
                   }
                }
                if (!i2) {
                   i1 = 1;
                }
                this.setLayerType(i1, null);
             }
          }else {
             this.setLayerType(1, null);
          }
       }else {
          this.setLayerType(i1, null);
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (this.autoPlay != null && this.k != null) {
          this.s();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (this.p()) {
          this.f();
          this.k = true;
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof LottieAnimationView$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.getSuperState());
          LottieAnimationView$SavedState b = p0.b;
          this.h = b;
          if (!TextUtils.isEmpty(b)) {
             this.setAnimation(this.h);
          }
          b = p0.c;
          this.i = b;
          if (b != null) {
             this.setAnimation(b);
          }
          this.setProgress(p0.d);
          if (p0.e != null) {
             this.s();
          }
          this.g.s(p0.f);
          this.setRepeatMode(p0.g);
          this.setRepeatCount(p0.h);
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       LottieAnimationView$SavedState savedState = new LottieAnimationView$SavedState(super.onSaveInstanceState());
       savedState.b = this.h;
       savedState.c = this.i;
       savedState.d = this.g.j();
       savedState.e = this.g.n();
       savedState.f = this.g.i();
       savedState.g = this.g.l();
       savedState.h = this.g.k();
       return savedState;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (this.g == null) {
          return;
       }
       if (this.isShown()) {
          if (this.j != null) {
             this.y();
          }
          this.j = false;
       }else if(this.p()){
          this.r();
          this.j = true;
       }
       return;
    }
    public boolean p(){
       return this.g.n();
    }
    public void q(boolean p0){
       LottieAnimationView tg = this.g;
       int i = (p0)? -1: 0;
       tg.D(i);
       return;
    }
    public void r(){
       LottieAnimationView tg = this.g;
       tg.g.clear();
       tg.d.k();
       this.n();
    }
    public void s(){
       this.g.o();
       this.n();
    }
    public void setAnimation(int p0){
       this.i = p0;
       this.h = null;
       this.setCompositionTask(a.h(this.getContext(), p0));
    }
    public void setAnimation(String p0){
       this.h = p0;
       this.i = 0;
       this.setCompositionTask(a.b(this.getContext(), p0));
    }
    public void setAnimationFromFile(String p0){
       LottieTask lottieTask = a.c(p0);
       if (lottieTask == null) {
          this.e.onResult(new FileNotFoundException());
          return;
       }else {
          this.setCompositionTask(lottieTask);
          return;
       }
    }
    public void setAnimationFromJson(String p0){
       this.B(p0, null);
    }
    public void setAnimationFromUrl(String p0){
       this.setCompositionTask(a.i(this.getContext(), p0));
    }
    public void setAutoPlay(boolean p0){
       this.autoPlay = p0;
    }
    public void setComposition(e p0){
       if (d.a) {
          StringBuilder str = "Set Composition \n"+p0;
       }
       this.g.setCallback(this);
       this.o = p0;
       boolean b = this.g.q(p0);
       this.n();
       if (this.getDrawable() == this.g && !b) {
          return;
       }else {
          this.setImageDrawable(null);
          this.setImageDrawable(this.g);
          this.requestLayout();
          Iterator iterator = this.m.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
          return;
       }
    }
    public final void setCompositionTask(LottieTask p0){
       this.o = null;
       this.g.g();
       this.i();
       this.n = p0.addListener(this.d).addFailureListener(this.e);
    }
    public void setFailureListener(j p0){
       this.f = p0;
    }
    public void setFontAssetDelegate(b p0){
       LottieAnimationView tg = this.g;
       tg.l = p0;
       h k = tg.k;
       if (k != null) {
          k.e = p0;
       }
       return;
    }
    public void setFrame(int p0){
       this.g.r(p0);
    }
    public void setImageAssetDelegate(c p0){
       LottieAnimationView tg = this.g;
       tg.j = p0;
       h h = tg.h;
       if (h != null) {
          h.b(p0);
       }
       return;
    }
    public void setImageAssetsFolder(String p0){
       this.g.s(p0);
    }
    public void setImageBitmap(Bitmap p0){
       this.i();
       super.setImageBitmap(p0);
    }
    public void setImageDrawable(Drawable p0){
       this.i();
       super.setImageDrawable(p0);
    }
    public void setImageResource(int p0){
       this.i();
       super.setImageResource(p0);
    }
    public void setMaxFrame(int p0){
       this.g.t(p0);
    }
    public void setMaxFrame(String p0){
       this.g.u(p0);
    }
    public void setMaxProgress(float p0){
       this.g.v(p0);
    }
    public void setMinAndMaxFrame(String p0){
       this.g.x(p0);
    }
    public void setMinFrame(int p0){
       this.g.z(p0);
    }
    public void setMinFrame(String p0){
       this.g.A(p0);
    }
    public void setMinProgress(float p0){
       this.g.B(p0);
    }
    public void setPerformanceTrackingEnabled(boolean p0){
       LottieAnimationView tg = this.g;
       tg.q = p0;
       h c = tg.c;
       if (c != null) {
          c.q(p0);
       }
       return;
    }
    public void setProgress(float p0){
       this.g.C(p0);
    }
    public void setRenderMode(RenderMode p0){
       this.l = p0;
       this.n();
    }
    public void setRepeatCount(int p0){
       this.g.D(p0);
    }
    public void setRepeatMode(int p0){
       this.g.d.setRepeatMode(p0);
    }
    public void setScale(float p0){
       this.g.E(p0);
       if (this.getDrawable() == this.g) {
          this.setImageDrawable(null);
          this.setImageDrawable(this.g);
       }
       return;
    }
    public void setSpeed(float p0){
       this.g.d.p(p0);
    }
    public void setTextDelegate(r p0){
       this.g.m = p0;
    }
    public void t(){
       this.g.d.removeAllListeners();
    }
    public void u(){
       this.m.clear();
    }
    public void v(Animator$AnimatorListener p0){
       this.g.d.removeListener(p0);
    }
    public boolean w(k p0){
       return this.m.remove(p0);
    }
    public void x(ValueAnimator$AnimatorUpdateListener p0){
       this.g.d.removeUpdateListener(p0);
    }
    public void y(){
       this.g.p();
       this.n();
    }
    public void z(){
       this.g.d.m();
    }
}
