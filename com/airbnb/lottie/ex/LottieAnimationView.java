package com.airbnb.lottie.ex.LottieAnimationView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import com.airbnb.lottie.ex.LottieAnimationView$a;
import com.airbnb.lottie.ex.LottieAnimationView$b;
import a5.f;
import com.airbnb.lottie.ex.RenderMode;
import java.util.HashSet;
import android.util.AttributeSet;
import g5.d;
import java.lang.Object;
import n5.c;
import a5.m;
import java.util.Set;
import android.view.ViewGroup;
import android.view.MotionEvent;
import e5.a;
import java.util.Map;
import android.view.View;
import e5.c;
import java.lang.String;
import a5.d;
import e5.b;
import java.util.Iterator;
import com.airbnb.lottie.ex.LottieAnimationView$c;
import java.lang.Enum;
import a5.e;
import android.os.Build$VERSION;
import android.graphics.Paint;
import android.widget.ImageView;
import m5.c;
import a5.o;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.IllegalArgumentException;
import a5.p;
import a5.j;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import java.util.ArrayList;
import android.os.Parcelable;
import com.airbnb.lottie.ex.LottieAnimationView$SavedState;
import android.view.View$BaseSavedState;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.airbnb.lottie.ex.a;
import com.airbnb.lottie.ex.d;
import java.util.concurrent.Callable;
import com.airbnb.lottie.ex.c;
import android.util.JsonReader;
import java.io.StringReader;
import java.io.Reader;
import com.airbnb.lottie.ex.e;
import java.lang.StringBuilder;
import com.airbnb.lottie.ex.b;
import android.graphics.drawable.Drawable$Callback;
import java.lang.Math;
import java.util.Collection;
import a5.f$o;
import a5.i;
import a5.h;
import a5.b;
import a5.c;
import f5.b;
import android.graphics.Bitmap;
import a5.q;

public class LottieAnimationView extends AppCompatImageView	// class@000d9d
{
    public final h d;
    public final h e;
    public final f f;
    public String g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public RenderMode l;
    public Set m;
    public m n;
    public e o;
    public static final String p;

    static {
       LottieAnimationView.p = "LottieAnimationView";
    }
    public void LottieAnimationView(Context p0){
       super(p0);
       this.d = new LottieAnimationView$a(this);
       this.e = new LottieAnimationView$b(this);
       this.f = new f();
       this.i = false;
       this.j = false;
       this.k = false;
       this.l = RenderMode.AUTOMATIC;
       this.m = new HashSet();
       this.i(null);
    }
    public void LottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new LottieAnimationView$a(this);
       this.e = new LottieAnimationView$b(this);
       this.f = new f();
       this.i = false;
       this.j = false;
       this.k = false;
       this.l = RenderMode.AUTOMATIC;
       this.m = new HashSet();
       this.i(p1);
    }
    public void LottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new LottieAnimationView$a(this);
       this.e = new LottieAnimationView$b(this);
       this.f = new f();
       this.i = false;
       this.j = false;
       this.k = false;
       this.l = RenderMode.AUTOMATIC;
       this.m = new HashSet();
       this.i(p1);
    }
    public void a(d p0,Object p1,c p2){
       this.f.a(p0, p1, p2);
    }
    public final void c(){
       LottieAnimationView tn = this.n;
       if (tn != null) {
          _monitor_enter(tn);
          tn.a.remove(this.d);
          _monitor_exit(tn);
          tn = this.n;
          _monitor_enter(tn);
          tn.b.remove(this.e);
          _monitor_exit(tn);
       }
       return;
    }
    public final boolean d(ViewGroup p0,MotionEvent p1,a p2){
       Map map = p2.a();
       if (map == null) {
          return false;
       }
       int i = p0.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return false;
          }
          View childAt = p0.getChildAt(i);
          if (childAt instanceof ViewGroup && this.d(childAt, p1, p2)) {
             break ;
          }else if(map.containsKey(childAt) && (p2.c(childAt) && (this.n(p1.getX(), p1.getY(), p2, childAt) && map.get(childAt).onClick()))){
             return 1;
          }else {
             i = i - 1;
          }
       }
       return 1;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       p0.toString();
       if (p0.getAction() == 1) {
          b uob = this.f.h();
          if (uob != null && uob.d() != null) {
             Iterator iterator = uob.d().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                a uoa = uob.a(str);
                View view = uob.b(str);
                if (view instanceof ViewGroup) {
                   this.d(view, p0, uoa);
                }else if(uoa.c(view) && this.n(p0.getX(), p0.getY(), uoa, view)){
                   Map map = uoa.a();
                   if (map != null) {
                      map.get(view).onClick();
                   }
                }
             }
          }
       }
       return true;
    }
    public void e(boolean p0){
       LottieAnimationView tf = this.f;
       if (tf.n == p0) {
       }else {
          tf.n = p0;
          if (tf.c != null) {
             tf.e();
          }
       }
       return;
    }
    public final void f(){
       int i = LottieAnimationView$c.a[this.l.ordinal()];
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
    public e getComposition(){
       return this.o;
    }
    public long getDuration(){
       LottieAnimationView to = this.o;
       long l = (to != null)? (long)to.d(): 0;
       return l;
    }
    public b getDynamicViewConfig(){
       return this.f.h();
    }
    public int getFrame(){
       return (int)this.f.d.e();
    }
    public String getImageAssetsFolder(){
       return this.f.i();
    }
    public float getMaxFrame(){
       return this.f.d.f();
    }
    public float getMinFrame(){
       return this.f.d.g();
    }
    public o getPerformanceTracker(){
       f c = this.f.c;
       o oo = (c != null)? c.k(): null;
       return oo;
    }
    public float getProgress(){
       return this.f.j();
    }
    public int getRepeatCount(){
       return this.f.k();
    }
    public int getRepeatMode(){
       return this.f.l();
    }
    public float getScale(){
       return this.f.m();
    }
    public float getSpeed(){
       return this.f.d.h();
    }
    public final void i(AttributeSet p0){
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
          this.j = b;
          this.k = b;
       }
       i2 = -1;
       if (typedArray.getBoolean(5, i)) {
          this.f.B(i2);
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
       this.e(typedArray.getBoolean(2, i));
       if (typedArray.hasValue(b)) {
          String[] stringArray = new String[]{"**"};
          this.a(new d(stringArray), j.B, new c(new p(typedArray.getColor(b, i))));
       }
       i1 = 11;
       if (typedArray.hasValue(i1)) {
          this.f.C(typedArray.getFloat(i1, 0x3f800000));
       }
       typedArray.recycle();
       if (Build$VERSION.SDK_INT <= 22) {
          this.l = RenderMode.SOFTWARE;
       }
       this.f();
       return;
    }
    public void invalidateDrawable(Drawable p0){
       LottieAnimationView tf = this.f;
       if (this.getDrawable() == tf) {
          super.invalidateDrawable(tf);
       }else {
          super.invalidateDrawable(p0);
       }
       return;
    }
    public boolean j(){
       return this.f.n();
    }
    public void k(){
       this.f.o();
       this.f();
    }
    public final boolean n(float p0,float p1,a p2,View p3){
       if (p3 == null) {
          return false;
       }
       Rect rect = p2.b(p3);
       if (rect == null) {
          return false;
       }
       return rect.contains((int)p0, (int)p1);
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (this.k != null && this.j != null) {
          this.k();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (this.j()) {
          LottieAnimationView tf = this.f;
          tf.g.clear();
          tf.d.cancel();
          this.f();
          this.j = true;
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
          this.g = b;
          if (!TextUtils.isEmpty(b)) {
             this.setAnimation(this.g);
          }
          b = p0.c;
          this.h = b;
          if (b != null) {
             this.setAnimation(b);
          }
          this.setProgress(p0.d);
          if (p0.e != null) {
             this.k();
          }
          this.f.r(p0.f);
          this.setRepeatMode(p0.g);
          this.setRepeatCount(p0.h);
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       LottieAnimationView$SavedState savedState = new LottieAnimationView$SavedState(super.onSaveInstanceState());
       savedState.b = this.g;
       savedState.c = this.h;
       savedState.d = this.f.j();
       savedState.e = this.f.n();
       savedState.f = this.f.i();
       savedState.g = this.f.l();
       savedState.h = this.f.k();
       return savedState;
    }
    public void onVisibilityChanged(View p0,int p1){
       LottieAnimationView tf = this.f;
       if (tf == null) {
          return;
       }
       if (!p1) {
          if (this.i != null) {
             tf.p();
             this.f();
          }
       }else {
          this.i = this.j();
          if (this.j()) {
             tf = this.f;
             tf.g.clear();
             tf.d.k();
             this.f();
          }
       }
       return;
    }
    public void setAnimation(int p0){
       this.h = p0;
       this.g = null;
       this.setCompositionTask(a.a(a.g(p0), new d(this.getContext().getApplicationContext(), p0)));
    }
    public void setAnimation(String p0){
       this.g = p0;
       this.h = 0;
       this.setCompositionTask(a.a(p0, new c(this.getContext().getApplicationContext(), p0)));
    }
    public void setAnimationFromJson(String p0){
       this.setCompositionTask(a.a(null, new e(new JsonReader(new StringReader(p0)), null)));
    }
    public void setAnimationFromUrl(String p0){
       this.setCompositionTask(a.a("url_"+p0, new b(this.getContext(), p0)));
    }
    public void setComposition(e p0){
       f d;
       if (d.a) {
          StringBuilder str = "Set Composition \n"+p0;
       }
       this.f.setCallback(this);
       this.o = p0;
       LottieAnimationView tf = this.f;
       boolean b = false;
       if (tf.c != p0) {
          tf.r = b;
          tf.f();
          tf.c = p0;
          tf.e();
          d = tf.d;
          if (d.k == null) {
             b = true;
          }
          d.k = p0;
          if (b) {
             d.o((float)(int)Math.max(d.i, p0.l()), (float)(int)Math.min(d.j, p0.f()));
          }else {
             d.o((float)(int)p0.l(), (float)(int)p0.f());
          }
          c g = d.g;
          d.g = 0;
          d.n((int)g);
          tf.A(tf.d.getAnimatedFraction());
          tf.C(tf.e);
          tf.D();
          Iterator iterator1 = new ArrayList(tf.g).iterator();
          while (iterator1.hasNext()) {
             iterator1.next().a(p0);
             iterator1.remove();
          }
          tf.g.clear();
          p0.q(tf.q);
          g = 1;
       }
       this.f();
       if (this.getDrawable() == this.f && !b) {
          return;
       }else {
          this.setImageDrawable(null);
          this.setImageDrawable(this.f);
          this.requestLayout();
          Iterator iterator = this.m.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
          return;
       }
    }
    public final void setCompositionTask(m p0){
       this.o = null;
       this.f.f();
       this.c();
       p0.b(this.d);
       p0.a(this.e);
       this.n = p0;
    }
    public void setDynamicViewConfig(b p0){
       this.f.s = p0;
    }
    public void setFontAssetDelegate(b p0){
    }
    public void setFrame(int p0){
       this.f.q(p0);
    }
    public void setImageAssetDelegate(c p0){
       LottieAnimationView tf = this.f;
       tf.j = p0;
       f h = tf.h;
       if (h != null) {
          h.b(p0);
       }
       return;
    }
    public void setImageAssetsFolder(String p0){
       this.f.r(p0);
    }
    public void setImageBitmap(Bitmap p0){
       this.c();
       super.setImageBitmap(p0);
    }
    public void setImageDrawable(Drawable p0){
       this.c();
       super.setImageDrawable(p0);
    }
    public void setImageResource(int p0){
       this.c();
       super.setImageResource(p0);
    }
    public void setMaxFrame(int p0){
       this.f.s(p0);
    }
    public void setMaxFrame(String p0){
       this.f.t(p0);
    }
    public void setMaxProgress(float p0){
       this.f.u(p0);
    }
    public void setMinAndMaxFrame(String p0){
       this.f.w(p0);
    }
    public void setMinFrame(int p0){
       this.f.x(p0);
    }
    public void setMinFrame(String p0){
       this.f.y(p0);
    }
    public void setMinProgress(float p0){
       this.f.z(p0);
    }
    public void setPerformanceTrackingEnabled(boolean p0){
       LottieAnimationView tf = this.f;
       tf.q = p0;
       f c = tf.c;
       if (c != null) {
          c.q(p0);
       }
       return;
    }
    public void setProgress(float p0){
       this.f.A(p0);
    }
    public void setRenderMode(RenderMode p0){
       this.l = (Build$VERSION.SDK_INT <= 22)? RenderMode.SOFTWARE: p0;
       this.f();
       return;
    }
    public void setRepeatCount(int p0){
       this.f.B(p0);
    }
    public void setRepeatMode(int p0){
       this.f.d.setRepeatMode(p0);
    }
    public void setScale(float p0){
       this.f.C(p0);
       if (this.getDrawable() == this.f) {
          this.setImageDrawable(null);
          this.setImageDrawable(this.f);
       }
       return;
    }
    public void setSpeed(float p0){
       this.f.d.p(p0);
    }
    public void setTextDelegate(q p0){
       this.f.m = p0;
    }
}
