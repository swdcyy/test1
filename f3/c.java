package f3.c;
import f3.b;
import f3.g;
import android.content.Context;
import f3.c$c;
import android.content.res.Resources;
import f3.c$a;
import android.graphics.drawable.Drawable$Callback;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import android.graphics.drawable.AnimatedVectorDrawable;
import f3.b$a;
import android.graphics.drawable.Animatable2$AnimationCallback;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import java.util.ArrayList;
import java.lang.Object;
import f3.c$b;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import android.graphics.Canvas;
import f3.h;
import java.lang.String;
import android.animation.Animator;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable$ConstantState;
import android.os.Build$VERSION;
import f3.c$d;
import f3.a;
import android.content.res.TypedArray;
import o1.g;
import f3.e;
import java.lang.IllegalStateException;
import android.graphics.Rect;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public class c extends g implements b	// class@001fbf
{
    public c$c c;
    public Context d;
    public ArgbEvaluator e;
    public c$d f;
    public Animator$AnimatorListener g;
    public ArrayList h;
    public final Drawable$Callback i;

    public void c(){
       super(null, null, null);
    }
    public void c(Context p0){
       super(p0, null, null);
    }
    public void c(Context p0,c$c p1,Resources p2){
       super();
       this.e = null;
       this.g = null;
       this.h = null;
       c$a uoa = new c$a(this);
       this.i = uoa;
       this.d = p0;
       this.c = new c$c(p0, null, uoa, null);
    }
    public static c a(Context p0,Resources p1,XmlPullParser p2,AttributeSet p3,Resources$Theme p4){
       c uoc = new c(p0);
       uoc.inflate(p1, p2, p3, p4);
       return uoc;
    }
    public static void e(AnimatedVectorDrawable p0,b$a p1){
       p0.registerAnimationCallback(p1.a());
    }
    public static boolean h(AnimatedVectorDrawable p0,b$a p1){
       return p0.unregisterAnimationCallback(p1.a());
    }
    public void applyTheme(Resources$Theme p0){
       g tb = this.b;
       if (tb != null) {
          a.a(tb, p0);
       }
       return;
    }
    public void b(b$a p0){
       g tb = this.b;
       if (tb != null) {
          c.e(tb, p0);
          return;
       }else if(p0 == null){
          return;
       }else if(this.h == null){
          this.h = new ArrayList();
       }
       if (this.h.contains(p0)) {
          return;
       }else {
          this.h.add(p0);
          if (this.g == null) {
             this.g = new c$b(this);
          }
          this.c.c.addListener(this.g);
          return;
       }
    }
    public boolean c(b$a p0){
       g tb = this.b;
       if (tb != null) {
          c.h(tb, p0);
       }
       c th = this.h;
       if (th == null || p0 == null) {
          return false;
       }else {
          boolean b = th.remove(p0);
          if (!this.h.size()) {
             this.f();
          }
          return b;
       }
    }
    public boolean canApplyTheme(){
       g tb = this.b;
       if (tb != null) {
          return a.b(tb);
       }
       return false;
    }
    public void d(){
       g tb = this.b;
       if (tb != null) {
          tb.clearAnimationCallbacks();
          return;
       }else {
          this.f();
          c th = this.h;
          if (th == null) {
             return;
          }
          th.clear();
          return;
       }
    }
    public void draw(Canvas p0){
       g tb = this.b;
       if (tb != null) {
          tb.draw(p0);
          return;
       }else {
          this.c.b.draw(p0);
          if (this.c.c.isStarted()) {
             this.invalidateSelf();
          }
          return;
       }
    }
    public final void f(){
       c tg = this.g;
       if (tg != null) {
          this.c.c.removeListener(tg);
          this.g = null;
       }
       return;
    }
    public final void g(String p0,Animator p1){
       p1.setTarget(this.c.b.g(p0));
       c tc = this.c;
       if (tc.d == null) {
          tc.d = new ArrayList();
          this.c.e = new ArrayMap();
       }
       this.c.d.add(p1);
       this.c.e.put(p1, p0);
       return;
    }
    public int getAlpha(){
       g tb = this.b;
       if (tb != null) {
          return a.d(tb);
       }
       return this.c.b.getAlpha();
    }
    public int getChangingConfigurations(){
       g tb = this.b;
       if (tb != null) {
          return tb.getChangingConfigurations();
       }
       return (super.getChangingConfigurations() | this.c.a);
    }
    public ColorFilter getColorFilter(){
       g tb = this.b;
       if (tb != null) {
          return a.e(tb);
       }
       return this.c.b.getColorFilter();
    }
    public Drawable$ConstantState getConstantState(){
       if (this.b != null && Build$VERSION.SDK_INT >= 24) {
          return new c$d(this.b.getConstantState());
       }
       return null;
    }
    public int getIntrinsicHeight(){
       g tb = this.b;
       if (tb != null) {
          return tb.getIntrinsicHeight();
       }
       return this.c.b.getIntrinsicHeight();
    }
    public int getIntrinsicWidth(){
       g tb = this.b;
       if (tb != null) {
          return tb.getIntrinsicWidth();
       }
       return this.c.b.getIntrinsicWidth();
    }
    public int getOpacity(){
       g tb = this.b;
       if (tb != null) {
          return tb.getOpacity();
       }
       return this.c.b.getOpacity();
    }
    public void inflate(Resources p0,XmlPullParser p1,AttributeSet p2){
       this.inflate(p0, p1, p2, null);
    }
    public void inflate(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       TypedArray typedArray;
       g tb = this.b;
       if (tb != null) {
          a.g(tb, p0, p1, p2, p3);
          return;
       }else {
          int eventType = p1.getEventType();
          int i = p1.getDepth() + 1;
          while (true) {
             if (eventType != 1 && (p1.getDepth() >= i || eventType != 3)) {
                if (eventType == 2) {
                   String name = p1.getName();
                   int i1 = 0;
                   if (("animated-vector").equals(name)) {
                      typedArray = g.k(p0, p3, p2, a.e);
                      int resourceId = typedArray.getResourceId(i1, i1);
                      if (resourceId) {
                         h oh = h.e(p0, resourceId, p3);
                         oh.k(i1);
                         oh.setCallback(this.i);
                         c$c b = this.c.b;
                         if (b != null) {
                            b.setCallback(null);
                         }
                         this.c.b = oh;
                      }
                      typedArray.recycle();
                   }else if(("target").equals(name)){
                      typedArray = p0.obtainAttributes(p2, a.f);
                      String str = typedArray.getString(i1);
                      i1 = typedArray.getResourceId(1, i1);
                      if (i1) {
                         c td = this.d;
                         if (td != null) {
                            this.g(str, e.i(td, i1));
                         }else {
                            break ;
                         }
                      }
                      typedArray.recycle();
                   }
                }
                eventType = p1.next();
             }else {
                this.c.a();
                return;
             }
          }
          typedArray.recycle();
          throw new IllegalStateException("Context can\'t be null when inflating animators");
       }
    }
    public boolean isAutoMirrored(){
       g tb = this.b;
       if (tb != null) {
          return a.h(tb);
       }
       return this.c.b.isAutoMirrored();
    }
    public boolean isRunning(){
       g tb = this.b;
       if (tb != null) {
          return tb.isRunning();
       }
       return this.c.c.isRunning();
    }
    public boolean isStateful(){
       g tb = this.b;
       if (tb != null) {
          return tb.isStateful();
       }
       return this.c.b.isStateful();
    }
    public Drawable mutate(){
       g tb = this.b;
       if (tb != null) {
          tb.mutate();
       }
       return this;
    }
    public void onBoundsChange(Rect p0){
       g tb = this.b;
       if (tb != null) {
          tb.setBounds(p0);
          return;
       }else {
          this.c.b.setBounds(p0);
          return;
       }
    }
    public boolean onLevelChange(int p0){
       g tb = this.b;
       if (tb != null) {
          return tb.setLevel(p0);
       }
       return this.c.b.setLevel(p0);
    }
    public boolean onStateChange(int[] p0){
       g tb = this.b;
       if (tb != null) {
          return tb.setState(p0);
       }
       return this.c.b.setState(p0);
    }
    public void setAlpha(int p0){
       g tb = this.b;
       if (tb != null) {
          tb.setAlpha(p0);
          return;
       }else {
          this.c.b.setAlpha(p0);
          return;
       }
    }
    public void setAutoMirrored(boolean p0){
       g tb = this.b;
       if (tb != null) {
          a.j(tb, p0);
          return;
       }else {
          this.c.b.setAutoMirrored(p0);
          return;
       }
    }
    public void setColorFilter(ColorFilter p0){
       g tb = this.b;
       if (tb != null) {
          tb.setColorFilter(p0);
          return;
       }else {
          this.c.b.setColorFilter(p0);
          return;
       }
    }
    public void setTint(int p0){
       g tb = this.b;
       if (tb != null) {
          a.n(tb, p0);
          return;
       }else {
          this.c.b.setTint(p0);
          return;
       }
    }
    public void setTintList(ColorStateList p0){
       g tb = this.b;
       if (tb != null) {
          a.o(tb, p0);
          return;
       }else {
          this.c.b.setTintList(p0);
          return;
       }
    }
    public void setTintMode(PorterDuff$Mode p0){
       g tb = this.b;
       if (tb != null) {
          a.p(tb, p0);
          return;
       }else {
          this.c.b.setTintMode(p0);
          return;
       }
    }
    public boolean setVisible(boolean p0,boolean p1){
       g tb = this.b;
       if (tb != null) {
          return tb.setVisible(p0, p1);
       }
       this.c.b.setVisible(p0, p1);
       return super.setVisible(p0, p1);
    }
    public void start(){
       g tb = this.b;
       if (tb != null) {
          tb.start();
          return;
       }else if(this.c.c.isStarted()){
          return;
       }else {
          this.c.c.start();
          this.invalidateSelf();
          return;
       }
    }
    public void stop(){
       g tb = this.b;
       if (tb != null) {
          tb.stop();
          return;
       }else {
          this.c.c.end();
          return;
       }
    }
}
