package androidx.core.view.ScrollStrategyViewPager;
import androidx.viewpager.widget.SelectedReasonViewPager;
import android.content.Context;
import io.reactivex.subjects.PublishSubject;
import android.util.AttributeSet;
import java.lang.Boolean;
import androidx.core.view.ScrollStrategy;
import java.lang.Object;
import java.lang.reflect.Field;
import java.lang.Exception;
import java.lang.Float;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;
import androidx.viewpager.widget.OptimizedViewPager;
import androidx.core.view.ScrollStrategyViewPager$b;
import brd.y;
import android.view.MotionEvent;
import java.lang.String;
import java.lang.Class;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.graphics.Rect;
import android.view.View;
import t17.a;
import androidx.core.view.ScrollStrategyViewPager$a;
import androidx.viewpager.widget.ViewPager$i;
import a2.e0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;

public class ScrollStrategyViewPager extends SelectedReasonViewPager	// class@00071c
{
    public ScrollStrategy p;
    public Field q;
    public Field r;
    public Field s;
    public Field t;
    public Field u;
    public Float v;
    public boolean w;
    public final PublishSubject x;
    public ScrollStrategyViewPager$b y;

    public void ScrollStrategyViewPager(Context p0){
       super(p0);
       this.q = null;
       this.r = null;
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.w = false;
       this.x = PublishSubject.g();
       this.z();
    }
    public void ScrollStrategyViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.q = null;
       this.r = null;
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.w = false;
       this.x = PublishSubject.g();
       this.z();
    }
    private void B(Boolean p0){
       ScrollStrategy dISABLE_ALL_ = (p0.booleanValue())? ScrollStrategy.DISABLE_ALL_TOUCH: ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL;
       this.setScrollStrategy(dISABLE_ALL_);
       return;
    }
    public static void u(ScrollStrategyViewPager p0,Boolean p1){
       p0.B(p1);
    }
    public final boolean A(){
       boolean b = false;
       try{
          boolean booleanx = this.u.getBoolean(this);
          if (this.t.getBoolean(this) && !booleanx) {
             b = true;
          }
          return b;
       }catch(java.lang.Exception e1){
          this.x(e1);
          return b;
       }
    }
    public final void C(){
       ScrollStrategyViewPager tv = this.v;
       if (tv == null) {
          return;
       }
       try{
          this.r.setFloat(this, tv.floatValue());
          this.v = null;
       }catch(java.lang.Exception e0){
          this.x(e0);
       }
       return;
    }
    public boolean canScrollHorizontally(int p0){
       ScrollStrategyViewPager tp = this.p;
       boolean b = false;
       if (tp == ScrollStrategy.DISABLE_ALL_TOUCH) {
          return b;
       }
       tp = (tp != null && (p0 <= 0 || (tp == ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL && !this.getCurrentItem())))? 1: 0;
       if (this.isEnabled() && (tp && super.canScrollHorizontally(p0))) {
          b = true;
       }
    label_002a :
       return b;
    }
    public void dataSetChanged(){
       super.dataSetChanged();
       ScrollStrategyViewPager ty = this.y;
       if (ty != null) {
          ty.a();
       }
       return;
    }
    public y getDisableAllTouchObserver(){
       return this.x;
    }
    public ScrollStrategy getScrollStrategy(){
       return this.p;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       if (!this.isEnabled()) {
          return false;
       }
       ScrollStrategyViewPager tp = this.p;
       if (tp == ScrollStrategy.DISABLE_ALL_TOUCH) {
          return false;
       }
       if (tp != ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL) {
          return super.onInterceptTouchEvent(p0);
       }
       if (this.getCurrentItem() > 1) {
          return false;
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked == 2 && this.y(this, p0)) {
          return false;
       }
       if (actionMasked == 2 && this.A()) {
          this.w();
       }
       this.C();
       return super.onInterceptTouchEvent(p0);
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (this.p == ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL) {
          try{
             this.s.setInt(this, -1);
          }catch(java.lang.IllegalAccessException e1){
             this.x(e1);
          }
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b = false;
       if (!this.isEnabled()) {
          return b;
       }
       ScrollStrategyViewPager tp = this.p;
       if (tp == ScrollStrategy.DISABLE_ALL_TOUCH) {
          return b;
       }
       if (tp != ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL) {
          return super.onTouchEvent(p0);
       }
       if (this.getCurrentItem() > 1) {
          return b;
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked == 2 && this.A()) {
          this.w();
       }else if(actionMasked == 1 && this.A()){
          this.w = true;
       }
       this.C();
       return super.onTouchEvent(p0);
    }
    public void setCurrentItemInternal(int p0,boolean p1,boolean p2,int p3){
       if (this.p == ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL && this.w != null) {
          this.w = false;
          if (p0 > 1) {
             p0 = 1;
          }
       }
       super.setCurrentItemInternal(p0, p1, p2, p3);
       return;
    }
    public void setDataSetChangeListener(ScrollStrategyViewPager$b p0){
       this.y = p0;
    }
    public void setDisableScrolled(boolean p0){
       this.setEnabled((p0 ^ 0x01));
    }
    public void setScrollStrategy(ScrollStrategy p0){
       this.p = p0;
       if (p0 == ScrollStrategy.ONLY_FIRST_TWO_TOUCH_SCROLL && this.r == null) {
          try{
             this.q = this.v("mFirstOffset");
             this.r = this.v("mLastOffset");
             this.s = this.v("mGutterSize");
             this.t = this.v("mIsBeingDragged");
             this.u = this.v("mIsUnableToDrag");
          }catch(java.lang.NoSuchFieldException e2){
             this.x(e2);
          }
       }
    }
    public final Field v(String p0){
       Field declaredFiel = ViewPager.class.getDeclaredField(p0);
       declaredFiel.setAccessible(true);
       return declaredFiel;
    }
    public void w(){
       try{
          this.v = Float.valueOf(this.r.getFloat(this));
          this.r.setFloat(this, (this.q.getFloat(this) + 0x3f800000));
       }catch(java.lang.Exception e0){
          this.x(e0);
       }
       return;
    }
    public final void x(Exception p0){
       p0.printStackTrace();
       ExceptionHandler.handleCaughtException(p0);
       this.p = ScrollStrategy.DISABLE_ALL_TOUCH;
    }
    public final boolean y(ViewGroup p0,MotionEvent p1){
       boolean b;
       Rect rect = new Rect();
       int i = 0;
       float f = 0;
       while (true) {
          if (i >= p0.getChildCount()) {
             return f;
          }
          View childAt = p0.getChildAt(i);
          if (childAt instanceof a && childAt.isShown()) {
             childAt.getGlobalVisibleRect(rect);
             f = rect.contains((int)p1.getRawX(), (int)p1.getRawY());
          }
          b = true;
          if (f) {
             break ;
          }else if(childAt instanceof ViewGroup && this.y(childAt, p1)){
             return b;
          }else {
             i = i + 1;
          }
       }
       return b;
    }
    public final void z(){
       this.setIgnoreChildTranslation(false);
       this.l();
       this.addOnPageChangeListener(new ScrollStrategyViewPager$a(this));
       this.x.subscribe(new e0(this), Functions.e);
    }
}
