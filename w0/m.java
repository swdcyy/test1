package w0.m;
import android.view.View$OnTouchListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import java.lang.Object;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.Runnable;
import v0.e;
import android.view.ViewParent;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.ListView;
import androidx.appcompat.widget.DropDownListView;
import w0.m$a;
import w0.m$b;

public abstract class m implements View$OnTouchListener, View$OnAttachStateChangeListener	// class@002eab
{
    public final float b;
    public final int c;
    public final int d;
    public final View e;
    public Runnable f;
    public Runnable g;
    public boolean h;
    public int i;
    public final int[] j;

    public void m(View p0){
       super();
       int[] ointArray = new int[2];
       this.j = ointArray;
       this.e = p0;
       p0.setLongClickable(true);
       p0.addOnAttachStateChangeListener(this);
       this.b = (float)ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
       int tapTimeout = ViewConfiguration.getTapTimeout();
       this.c = tapTimeout;
       this.d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
    public static boolean h(View p0,float p1,float p2,float p3){
       float f = - p3;
       boolean b = (p1 - f >= 0 && (p2 - f >= 0 && (p1 - ((float)(p0.getRight() - p0.getLeft()) + p3) < 0 && p2 - ((float)(p0.getBottom() - p0.getTop()) + p3) < 0)))? true: false;
       return b;
    }
    public final void a(){
       m tg = this.g;
       if (tg != null) {
          this.e.removeCallbacks(tg);
       }
       tg = this.f;
       if (tg != null) {
          this.e.removeCallbacks(tg);
       }
       return;
    }
    public abstract e b();
    public boolean c(){
       e uoe = this.b();
       if (uoe != null && !uoe.d()) {
          uoe.show();
       }
       return true;
    }
    public boolean d(){
       e uoe = this.b();
       if (uoe != null && uoe.d()) {
          uoe.dismiss();
       }
       return true;
    }
    public void e(){
       this.a();
       m te = this.e;
       if (te.isEnabled() && !te.isLongClickable()) {
          if (!this.c()) {
             return;
          }else {
             te.getParent().requestDisallowInterceptTouchEvent(true);
             long l = SystemClock.uptimeMillis();
             MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0, 0, 0);
             te.onTouchEvent(motionEvent);
             motionEvent.recycle();
             this.h = true;
          }
       }
       return;
    }
    public final boolean f(MotionEvent p0){
       m te = this.e;
       e uoe = this.b();
       boolean b = false;
       if (uoe != null && uoe.d()) {
          DropDownListView uDropDownLis = uoe.i();
          if (uDropDownLis != null && uDropDownLis.isShown()) {
             MotionEvent motionEvent = MotionEvent.obtainNoHistory(p0);
             this.i(te, motionEvent);
             this.j(uDropDownLis, motionEvent);
             boolean b1 = uDropDownLis.e(motionEvent, this.i);
             motionEvent.recycle();
             int actionMasked = p0.getActionMasked();
             actionMasked = (actionMasked != 1 && actionMasked != 3)? 1: 0;
             if (b1 && actionMasked) {
                b = true;
             }
          }
       }
    label_0044 :
       return b;
    }
    public final boolean g(MotionEvent p0){
       m te = this.e;
       if (!te.isEnabled()) {
          return false;
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 0.00f) {
                if (actionMasked == 3) {
                }
             }else {
                actionMasked = p0.findPointerIndex(this.i);
                if (actionMasked >= 0 && !m.h(te, p0.getX(actionMasked), p0.getY(actionMasked), this.b)) {
                   this.a();
                   te.getParent().requestDisallowInterceptTouchEvent(true);
                   return true;
                }
             }
          }else {
          }
       }else {
          this.i = p0.getPointerId(false);
          if (this.f == null) {
             this.f = new m$a(this);
          }
          te.postDelayed(this.f, (long)this.c);
          if (this.g == null) {
             this.g = new m$b(this);
          }
          te.postDelayed(this.g, (long)this.d);
       }
    label_006d :
       return false;
    }
    public final boolean i(View p0,MotionEvent p1){
       m tj = this.j;
       p0.getLocationOnScreen(tj);
       p1.offsetLocation((float)tj[0], (float)tj[1]);
       return 1;
    }
    public final boolean j(View p0,MotionEvent p1){
       m tj = this.j;
       p0.getLocationOnScreen(tj);
       p1.offsetLocation((float)(- tj[0]), (float)(- tj[1]));
       return 1;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       boolean b1;
       m th = this.h;
       boolean b = true;
       if (th != null) {
          if (this.f(p1) || !this.d()) {
             b1 = true;
          }else {
             b1 = false;
          }
       }else if(this.g(p1) && this.c()){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          long l = SystemClock.uptimeMillis();
          MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0, 0, 0);
          this.e.onTouchEvent(motionEvent);
          motionEvent.recycle();
       }
       this.h = b1;
       if (!b1 && th == null) {
          b = false;
       }
       return b;
    }
    public void onViewAttachedToWindow(View p0){
    }
    public void onViewDetachedFromWindow(View p0){
       this.h = false;
       this.i = -1;
       m tf = this.f;
       if (tf != null) {
          this.e.removeCallbacks(tf);
       }
       return;
    }
}
