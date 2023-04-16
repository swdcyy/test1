package androidx.viewpager.widget.CorrectOffsetViewPager;
import androidx.viewpager.widget.KwaiViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import androidx.viewpager.widget.ViewPager$f;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.Exception;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException;

public class CorrectOffsetViewPager extends KwaiViewPager	// class@0009ff
{
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    public void CorrectOffsetViewPager(Context p0){
       super(p0);
       this.e = true;
    }
    public void CorrectOffsetViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = true;
    }
    private int getClientWidth(){
       return ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight());
    }
    public boolean canScroll(View p0,boolean p1,int p2,int p3,int p4){
       if (this.e != null) {
          return super.canScroll(p0, p1, p2, p3, p4);
       }
       return this.i(p0, p1, p2, p3, p4);
    }
    public boolean canScrollHorizontally(int p0){
       if (p0 <= 0 || this.c == null) {
          return super.canScrollHorizontally(p0);
       }
       ViewPager tmAdapter = this.mAdapter;
       boolean b = false;
       if (tmAdapter == null) {
          return b;
       }
       ViewPager$f uof = this.infoForPosition((tmAdapter.j() - 1));
       if (uof == null) {
          return 1;
       }
       if (this.getScrollX() < (int)((float)this.getClientWidth() * uof.e)) {
          b = true;
       }
       return b;
    }
    public final boolean i(View p0,boolean p1,int p2,int p3,int p4){
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
                int i3 = p3 + scrollX;
                float f = (float)i3;
                float f1 = (float)childAt.getLeft() + childAt.getTranslationX();
                if (f - f1 >= 0) {
                   f1 = (float)childAt.getRight() + childAt.getTranslationX();
                   if (f - f1 < 0) {
                      int i4 = p4 + scrollY;
                      f1 = (float)i4;
                      float f2 = (float)childAt.getTop() + childAt.getTranslationY();
                      if (f1 - f2 >= 0) {
                         f2 = (float)childAt.getBottom() + childAt.getTranslationY();
                         if (f1 - f2 < 0) {
                            i3 = i3 - childAt.getLeft();
                            float f3 = (float)i3 - childAt.getTranslationX();
                            int i5 = (int)f3;
                            i4 = i4 - childAt.getTop();
                            f3 = (float)i4;
                            f3 = f3 - childAt.getTranslationY();
                            int i6 = (int)f3;
                            if (this.i(childAt, 1, p2, i5, i6)) {
                               return i1;
                            }
                         }
                      }
                   }
                }
                i2 = i2 - 1;
             }
          }
       }
       if (!p1 || !p0.canScrollHorizontally((- p2))) {
          i1 = false;
       }
       return i1;
    }
    public void j(){
       if (this.b == null && this.c != null) {
          ViewPager$f uof = this.infoForPosition(this.getCurrentItem());
          if (uof == null) {
             return;
          }else {
             this.scrollTo((int)(uof.e * (float)this.getClientWidth()), this.getScrollY());
          }
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       try{
          return super.onInterceptTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e2){
          IgnorableOSBugException.ignoreOrThrowIt(this.getClass().getName(), e2);
          return false;
       }
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 != p2) {
          this.j();
       }
       return;
    }
    public void populate(){
       if (this.d == null) {
          super.populate();
       }
       return;
    }
    public void setIgnoreChildTranslation(boolean p0){
       this.e = p0;
    }
}
