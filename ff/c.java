package ff.c;
import java.lang.Object;
import ff.e;
import ff.h;
import ff.f;
import android.util.SparseArray;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.facebook.react.bridge.UiThreadUtil;
import ff.g;
import android.view.animation.Animation;
import ff.a;
import ff.c$b;
import android.view.animation.Animation$AnimationListener;
import ff.d;
import ff.c$c;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationType;
import ff.c$a;
import java.lang.Long;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;

public class c	// class@001ff4
{
    public final a a;
    public final a b;
    public final a c;
    public final SparseArray d;
    public boolean e;
    public long f;
    public Runnable g;
    public static Handler h;

    public void c(){
       super();
       this.a = new e();
       this.b = new h();
       this.c = new f();
       this.d = new SparseArray(0);
       this.f = -1;
    }
    public void a(View p0,int p1,int p2,int p3,int p4){
       c ta;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
             return;
          }
       }
       UiThreadUtil.assertOnUiThread();
       int id = p0.getId();
       g og = this.d.get(id);
       if (og != null) {
          og.a(p1, p2, p3, p4);
          return;
       }else if(!p0.getWidth() || !p0.getHeight()){
          ta = this.a;
       }else {
          ta = this.b;
       }
       Animation uAnimation = ta.a(p0, p1, p2, p3, p4);
       if (uAnimation instanceof g) {
          uAnimation.setAnimationListener(new c$b(this, id));
       }else {
          p0.layout(p1, p2, (p3 + p1), (p4 + p2));
       }
       if (uAnimation != null) {
          long duration = uAnimation.getDuration();
          if (duration - this.f > 0) {
             this.f = duration;
             this.f(duration);
          }
          p0.startAnimation(uAnimation);
       }
       return;
    }
    public void b(View p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       Animation uAnimation = this.c.a(p0, p0.getLeft(), p0.getTop(), p0.getWidth(), p0.getHeight());
       if (uAnimation != null) {
          this.c(p0);
          uAnimation.setAnimationListener(new c$c(this, p1));
          long duration = uAnimation.getDuration();
          if (duration - this.f > 0) {
             this.f(duration);
             this.f = duration;
          }
          p0.startAnimation(uAnimation);
       }else {
          p1.onAnimationEnd();
       }
       return;
    }
    public final void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       boolean b = false;
       p0.setClickable(b);
       if (p0 instanceof ViewGroup) {
          for (; b < p0.getChildCount(); b = b + 1) {
             this.c(p0.getChildAt(b));
          }
       }
       return;
    }
    public void d(ReadableMap p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       if (p0 == null) {
          this.e();
          return;
       }else {
          boolean b = false;
          this.e = b;
          String str = "duration";
          if (p0.hasKey(str)) {
             b = p0.getInt(str);
          }
          LayoutAnimationType cREATE = LayoutAnimationType.CREATE;
          if (p0.hasKey(LayoutAnimationType.toString(cREATE))) {
             this.a.c(p0.getMap(LayoutAnimationType.toString(cREATE)), b);
             this.e = true;
          }
          cREATE = LayoutAnimationType.UPDATE;
          if (p0.hasKey(LayoutAnimationType.toString(cREATE))) {
             this.b.c(p0.getMap(LayoutAnimationType.toString(cREATE)), b);
             this.e = true;
          }
          cREATE = LayoutAnimationType.DELETE;
          if (p0.hasKey(LayoutAnimationType.toString(cREATE))) {
             this.c.c(p0.getMap(LayoutAnimationType.toString(cREATE)), b);
             this.e = true;
          }
          if (this.e != null && p1 != null) {
             this.g = new c$a(this, p1);
          }
          return;
       }
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.a.e();
       this.b.e();
       this.c.e();
       this.g = null;
       this.e = false;
       this.f = -1;
       return;
    }
    public final void f(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "7")) {
          return;
       }
       if (c.h == null) {
          c.h = new Handler(Looper.getMainLooper());
       }
       uoc = this.g;
       if (uoc != null) {
          c.h.removeCallbacks(uoc);
          c.h.postDelayed(this.g, p0);
       }
       return;
    }
    public boolean g(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.e == null || (p0.getParent() != null || this.d.get(p0.getId()) != null))? true: false;
       return b;
    }
}
