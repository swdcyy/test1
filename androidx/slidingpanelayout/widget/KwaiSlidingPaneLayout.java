package androidx.slidingpanelayout.widget.KwaiSlidingPaneLayout;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import android.content.Context;
import java.util.BitSet;
import java.util.concurrent.CopyOnWriteArrayList;
import android.util.AttributeSet;
import java.lang.Object;
import java.util.Objects;
import z2.a;
import androidx.customview.widget.ViewDragHelper;
import android.view.View;
import java.lang.Runnable;
import a2.i0;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.Class;
import java.lang.Exception;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException;
import ekd.p1;
import ukd.a;
import androidx.customview.widget.ViewDragHelper$c;
import androidx.slidingpanelayout.widget.KwaiSlidingPaneLayout$a;
import java.lang.Float;
import java.util.Iterator;
import java.util.List;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import a2.q;
import java.lang.Math;
import g2.c;

public class KwaiSlidingPaneLayout extends SlidingPaneLayout	// class@00098b
{
    public float b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public BitSet g;
    public final List h;
    public boolean i;
    public boolean j;

    public void KwaiSlidingPaneLayout(Context p0){
       super(p0);
       this.e = true;
       this.g = new BitSet();
       this.h = new CopyOnWriteArrayList();
       this.i = true;
       this.j = false;
       this.c(p0);
    }
    public void KwaiSlidingPaneLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = true;
       this.g = new BitSet();
       this.h = new CopyOnWriteArrayList();
       this.i = true;
       this.j = false;
       this.c(p0);
    }
    public void KwaiSlidingPaneLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = true;
       this.g = new BitSet();
       this.h = new CopyOnWriteArrayList();
       this.i = true;
       this.j = false;
       this.c(p0);
    }
    public void a(){
       this.closePane();
       SlidingPaneLayout tmDragHelper = this.mDragHelper;
       Objects.requireNonNull(tmDragHelper);
       i0.k0(this, new a(tmDragHelper));
    }
    public final void b(MotionEvent p0){
       int i = 1;
       try{
          this.getChildAt(i).dispatchTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e3){
          Log.e("KwaiSlidingPaneLayout", "on child touch", e3);
          IgnorableOSBugException.ignoreOrThrowIt(this.getClass().getName(), e3);
       }
       return;
    }
    public final void c(Context p0){
       float f = p1.d(p0);
       this.c = f;
       f = f * 0x3fc00000;
       try{
          this.d = f;
          ViewDragHelper$c uoc = a.d(this.mDragHelper, "mCallback");
          if (uoc != null) {
             a.o(this.mDragHelper, "mCallback", new KwaiSlidingPaneLayout$a(this, uoc));
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public boolean canScroll(View p0,boolean p1,int p2,int p3,int p4){
       int i = p0;
       int i1 = 1;
       if (i instanceof ViewGroup) {
          ViewGroup viewGroup = i;
          int scrollX = p0.getScrollX();
          int scrollY = p0.getScrollY();
          int i2 = viewGroup.getChildCount() - i1;
          while (true) {
             if (i2 >= 0) {
                View childAt = viewGroup.getChildAt(i2);
                int i3 = childAt.getLeft() + (int)childAt.getTranslationX();
                int i4 = childAt.getRight() + (int)childAt.getTranslationX();
                int i5 = childAt.getTop() + (int)childAt.getTranslationY();
                int i6 = childAt.getBottom() + (int)childAt.getTranslationY();
                int i7 = p3 + scrollX;
                if (i7 >= i3 && i7 < i4) {
                   i4 = p4 + scrollY;
                   if (i4 >= i5 && i4 < i6) {
                      i7 = i7 - i3;
                      int i8 = i4 - i5;
                      i6 = i7;
                      if (this.canScroll(childAt, 1, p2, i6, i8)) {
                         return i1;
                      }
                   }
                }
                i2 = i2 - 1;
             }
          }
          return i1;
       }
       if (p1) {
          int i9 = (this.isLayoutRtlSupport())? p2: - p2;
          if (p0.canScrollHorizontally(i9)) {
             goto label_007a ;
          }
       }
       i1 = false;
       goto label_007a ;
    }
    public boolean canScrollHorizontally(int p0){
       Float uFloat = a.d(this, "mSlideOffset");
       uFloat = (uFloat != null && uFloat.floatValue() - 0x3c23d70a > 0)? 1: 0;
       if (uFloat || p0 < 0) {
          return true;
       }else {
          return super.canScrollHorizontally(p0);
       }
    }
    public boolean d(){
       return this.e;
    }
    public void dispatchOnPanelClosed(View p0){
       super.dispatchOnPanelClosed(p0);
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void dispatchOnPanelOpened(View p0){
       super.dispatchOnPanelOpened(p0);
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public void dispatchOnPanelSlide(View p0){
       super.dispatchOnPanelSlide(p0);
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, this.mSlideOffset);
       }
       return;
    }
    public void e(boolean p0,int p1){
       if (p0) {
          this.g.clear(p1);
       }else {
          this.g.set(p1);
       }
       p0 = (!this.g.cardinality())? true: false;
       this.e = p0;
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b = true;
       if (!q.c(p0)) {
          this.e(b, 14);
       }
       if (this.e == null) {
          return this.i;
       }else {
          int i = q.c(p0);
          if (i) {
             if (i != 2) {
                if (i == 5 && (this.isOpen() && (this.isSlideable() && !this.mDragHelper.isViewUnder(this.mSlideableView, (int)p0.getX(), (int)p0.getY())))) {
                   return b;
                }
             }else {
                float x = p0.getX();
                float y = p0.getY();
                if (this.b - this.d > 0 && (!this.isOpen() && this.canScroll(this, false, Math.round((x - this.b)), Math.round(x), Math.round(y)))) {
                   p0 = MotionEvent.obtain(p0);
                   p0.setAction(3);
                   return super.onInterceptTouchEvent(p0);
                }else if(this.isDimmed(this.mSlideableView) && (this.b - x) - this.c > 0){
                   c.a(this.mDragHelper, this.mSlideableView, 0);
                }
             }
          }else {
             this.b = p0.getX();
          }
          return super.onInterceptTouchEvent(p0);
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
    }
    public boolean onTouchEvent(MotionEvent p0){
       String str = "on touch";
       Float uFloat = a.d(this, "mSlideOffset");
       int i = 0;
       KwaiSlidingPaneLayout kwaiSlidingP = (uFloat == null)? null: uFloat.floatValue();
       if (this.e == null || (this.b - this.d > 0 && (kwaiSlidingP - i <= 0 && p0.getAction() != 1))) {
          this.j = true;
          this.b(p0);
          return true;
       }else if(this.j != null){
          this.j = false;
          MotionEvent motionEvent = MotionEvent.obtain(p0);
          motionEvent.setAction(3);
          this.b(motionEvent);
       }
       try{
          return super.onTouchEvent(p0);
       }catch(java.lang.ArrayIndexOutOfBoundsException e8){
          Log.e(v1, str, e8);
          return i;
       }catch(java.lang.IllegalArgumentException e8){
          Log.e(v1, str, e8);
          IgnorableOSBugException.ignoreOrThrowIt(this.getClass().getName(), e8);
          return i;
       }
    }
    public void setDisableReturnValue(boolean p0){
       this.i = p0;
    }
    public void setSlidingEnabled(boolean p0){
       this.e(p0, 1);
    }
}
