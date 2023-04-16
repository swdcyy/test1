package androidx.appcompat.widget.DropDownListView;
import android.widget.ListView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.widget.AbsListView;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.NoSuchFieldException;
import android.view.View;
import a2.m0;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import e2.e;
import e2.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.IllegalAccessException;
import androidx.core.graphics.drawable.a;
import android.os.Build$VERSION;
import androidx.appcompat.widget.DropDownListView$b;
import androidx.appcompat.widget.DropDownListView$a;

public class DropDownListView extends ListView	// class@000600
{
    public final Rect b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Field h;
    public DropDownListView$a i;
    public boolean j;
    public boolean k;
    public boolean l;
    public m0 m;
    public e n;
    public DropDownListView$b o;

    public void DropDownListView(Context p0,boolean p1){
       super(p0, null, 0x7f040313);
       this.b = new Rect();
       int i = 0;
       this.c = i;
       this.d = i;
       this.e = i;
       this.f = i;
       this.k = p1;
       try{
          this.setCacheColorHint(i);
          Field declaredFiel = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
          this.h = declaredFiel;
          declaredFiel.setAccessible(true);
       }catch(java.lang.NoSuchFieldException e3){
          e3.printStackTrace();
       }
       return;
    }
    public final void a(){
       boolean b = false;
       this.l = b;
       this.setPressed(b);
       this.drawableStateChanged();
       View childAt = this.getChildAt((this.g - this.getFirstVisiblePosition()));
       if (childAt != null) {
          childAt.setPressed(b);
       }
       DropDownListView tm = this.m;
       if (tm != null) {
          tm.b();
          this.m = null;
       }
       return;
    }
    public final void b(View p0,int p1){
       this.performItemClick(p0, p1, this.getItemIdAtPosition(p1));
    }
    public final void c(Canvas p0){
       if (!this.b.isEmpty()) {
          Drawable selector = this.getSelector();
          if (selector != null) {
             selector.setBounds(this.b);
             selector.draw(p0);
          }
       }
       return;
    }
    public int d(int p0,int p1,int p2,int p3,int p4){
       p1 = this.getListPaddingTop();
       p2 = this.getListPaddingBottom();
       int dividerHeigh = this.getDividerHeight();
       Drawable divider = this.getDivider();
       ListAdapter adapter = this.getAdapter();
       if (adapter == null) {
          return (p1 + p2);
       }
       p1 = p1 + p2;
       if (dividerHeigh <= 0 || divider == null) {
          dividerHeigh = 0;
       }
       int count = adapter.getCount();
       View view = null;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i >= count) {
             return p1;
          }
          int itemViewType = adapter.getItemViewType(i);
          if (itemViewType != i1) {
             view = null;
             i1 = itemViewType;
          }
          view = adapter.getView(i, view, this);
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          if (layoutParams == null) {
             layoutParams = this.generateDefaultLayoutParams();
             view.setLayoutParams(layoutParams);
          }
          layoutParams = layoutParams.height;
          itemViewType = (layoutParams > null)? View$MeasureSpec.makeMeasureSpec(layoutParams, 0x40000000): View$MeasureSpec.makeMeasureSpec(0, 0);
          view.measure(p0, itemViewType);
          view.forceLayout();
          if (i > 0) {
             p1 = p1 + dividerHeigh;
          }
          p1 = p1 + view.getMeasuredHeight();
          if (p1 >= p3) {
             if (p4 >= 0 && (i > p4 && (i2 > 0 && p1 != p3))) {
                p3 = i2;
                break ;
             }
             break ;
          }else if(p4 >= 0 && i >= p4){
             i2 = p1;
          }
          i = i + 1;
       }
       return p3;
    }
    public void dispatchDraw(Canvas p0){
       this.c(p0);
       super.dispatchDraw(p0);
    }
    public void drawableStateChanged(){
       if (this.o != null) {
          return;
       }
       super.drawableStateChanged();
       this.setSelectorEnabled(true);
       this.k();
       return;
    }
    public boolean e(MotionEvent p0,int p1){
       DropDownListView uDropDownLis;
       boolean b;
       int actionMasked = p0.getActionMasked();
       if (actionMasked != 1) {
          if (actionMasked != 2) {
             if (actionMasked == 3) {
             label_0018 :
                uDropDownLis = null;
                b = false;
             label_0044 :
                if (!b || uDropDownLis) {
                   this.a();
                }
                if (b) {
                   if (this.n == null) {
                      this.n = new e(this);
                   }
                   this.n.m(true);
                   this.n.onTouch(this, p0);
                }else {
                   DropDownListView tn = this.n;
                   if (tn != null) {
                      tn.m(false);
                   }
                }
                return b;
             }
          }else {
             b = true;
          label_0012 :
             p1 = p0.findPointerIndex(p1);
             if (p1 < 0) {
                goto label_0018 ;
             }else {
                int i = (int)p0.getX(p1);
                p1 = (int)p0.getY(p1);
                int i1 = this.pointToPosition(i, p1);
                if (i1 == -1) {
                   uDropDownLis = 1;
                   goto label_0044 ;
                }else {
                   View childAt = this.getChildAt((i1 - this.getFirstVisiblePosition()));
                   this.i(childAt, i1, (float)i, (float)p1);
                   if (actionMasked == 1) {
                      this.b(childAt, i1);
                   }
                }
             }
          }
       }else {
          b = false;
          goto label_0012 ;
       }
       uDropDownLis = null;
       b = true;
       goto label_0044 ;
    }
    public final void f(int p0,View p1){
       DropDownListView tb = this.b;
       tb.set(p1.getLeft(), p1.getTop(), p1.getRight(), p1.getBottom());
       tb.left = tb.left - this.c;
       tb.top = tb.top - this.d;
       tb.right = tb.right + this.e;
       int i = tb.bottom + this.f;
       try{
          tb.bottom = i;
          boolean booleanx = this.h.getBoolean(this);
          if (p1.isEnabled() != booleanx) {
             DropDownListView th = this.h;
             booleanx = (!booleanx)? true: false;
             th.set(this, Boolean.valueOf(booleanx));
             if (p0 != -1) {
                this.refreshDrawableState();
             }
          }
       }catch(java.lang.IllegalAccessException e6){
          e6.printStackTrace();
       }
       return;
    }
    public final void g(int p0,View p1){
       Drawable selector = this.getSelector();
       boolean b = true;
       int i = (selector != null && p0 != -1)? 1: 0;
       if (i) {
          selector.setVisible(false, false);
       }
       this.f(p0, p1);
       if (i) {
          DropDownListView tb = this.b;
          float f = tb.exactCenterX();
          float f1 = tb.exactCenterY();
          if (this.getVisibility()) {
             b = false;
          }
          selector.setVisible(b, false);
          a.k(selector, f, f1);
       }
       return;
    }
    public final void h(int p0,View p1,float p2,float p3){
       this.g(p0, p1);
       Drawable selector = this.getSelector();
       if (selector != null && p0 != -1) {
          a.k(selector, p2, p3);
       }
       return;
    }
    public boolean hasFocus(){
       boolean b = (this.k != null || super.hasFocus())? true: false;
       return b;
    }
    public boolean hasWindowFocus(){
       boolean b = (this.k != null || super.hasWindowFocus())? true: false;
       return b;
    }
    public final void i(View p0,int p1,float p2,float p3){
       this.l = true;
       this.drawableHotspotChanged(p2, p3);
       if (!this.isPressed()) {
          this.setPressed(true);
       }
       this.layoutChildren();
       DropDownListView tg = this.g;
       if (tg != -1) {
          View childAt = this.getChildAt((tg - this.getFirstVisiblePosition()));
          if (childAt != null && (childAt != p0 && childAt.isPressed())) {
             childAt.setPressed(false);
          }
       }
       this.g = p1;
       p0.drawableHotspotChanged((p2 - (float)p0.getLeft()), (p3 - (float)p0.getTop()));
       if (!p0.isPressed()) {
          p0.setPressed(true);
       }
       this.h(p1, p0, p2, p3);
       this.setSelectorEnabled(false);
       this.refreshDrawableState();
       return;
    }
    public boolean isFocused(){
       boolean b = (this.k != null || super.isFocused())? true: false;
       return b;
    }
    public boolean isInTouchMode(){
       boolean b = (this.k == null || (this.j != null || super.isInTouchMode()))? true: false;
       return b;
    }
    public final boolean j(){
       return this.l;
    }
    public final void k(){
       Drawable selector = this.getSelector();
       if (selector != null && (this.j() && this.isPressed())) {
          selector.setState(this.getDrawableState());
       }
    label_0019 :
       return;
    }
    public void onDetachedFromWindow(){
       this.o = null;
       super.onDetachedFromWindow();
    }
    public boolean onHoverEvent(MotionEvent p0){
       if (Build$VERSION.SDK_INT < 26) {
          return super.onHoverEvent(p0);
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked == 10 && this.o == null) {
          DropDownListView$b uob = new DropDownListView$b(this);
          this.o = uob;
          uob.b();
       }
       boolean b = super.onHoverEvent(p0);
       if (actionMasked == 9 || actionMasked == 7) {
          int i = this.pointToPosition((int)p0.getX(), (int)p0.getY());
          if (i != -1 && i != this.getSelectedItemPosition()) {
             View childAt = this.getChildAt((i - this.getFirstVisiblePosition()));
             if (childAt.isEnabled()) {
                this.setSelectionFromTop(i, (childAt.getTop() - this.getTop()));
             }
             this.k();
          }
       }else {
          this.setSelection(-1);
       }
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       if (p0.getAction()) {
       }else {
          this.g = this.pointToPosition((int)p0.getX(), (int)p0.getY());
       }
       DropDownListView to = this.o;
       if (to != null) {
          to.a();
       }
       return super.onTouchEvent(p0);
    }
    public void setListSelectionHidden(boolean p0){
       this.j = p0;
    }
    public void setSelector(Drawable p0){
       DropDownListView$a uoa = (p0 != null)? new DropDownListView$a(p0): null;
       this.i = uoa;
       super.setSelector(uoa);
       Rect rect = new Rect();
       if (p0 != null) {
          p0.getPadding(rect);
       }
       this.c = rect.left;
       this.d = rect.top;
       this.e = rect.right;
       this.f = rect.bottom;
       return;
    }
    public final void setSelectorEnabled(boolean p0){
       DropDownListView ti = this.i;
       if (ti != null) {
          ti.c(p0);
       }
       return;
    }
}
