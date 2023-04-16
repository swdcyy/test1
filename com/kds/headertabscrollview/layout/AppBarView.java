package com.kds.headertabscrollview.layout.AppBarView;
import in.b;
import com.google.android.material.appbar.AppBarLayout;
import com.kds.headertabscrollview.layout.AppBarView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.google.android.material.appbar.KdsReboundBehavior;
import sj.f$b;
import android.widget.LinearLayout;
import android.content.res.Resources;
import cw9.c;
import sj.f;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewOutlineProvider;
import in.b$a;
import android.view.View$MeasureSpec;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import java.lang.Class;
import java.lang.reflect.Method;
import com.kds.headertabscrollview.layout.TabsView;
import android.widget.HorizontalScrollView;
import kotlin.TypeCastException;
import android.view.ViewGroup$MarginLayoutParams;

public final class AppBarView extends AppBarLayout implements b	// class@000717
{
    public int n;
    public int o;
    public int p;
    public final KdsReboundBehavior q;
    public static final AppBarView$a r;

    static {
       AppBarView.r = new AppBarView$a(null);
    }
    public void AppBarView(Context p0){
       Context context;
       a.q(p0, "context");
       super(p0);
       this.p = -1;
       f$b uob = new f$b();
       context = this.getContext();
       a.h(context, "getContext\(\)");
       uob.d(c.b(context.getResources(), R.dimen.arg_RES_7f070480));
       uob.e(R.id.kds_htsv_view_pager);
       uob.b(true);
       uob.c(true);
       context = this.getContext();
       a.h(context, "getContext\(\)");
       uob.f(c.b(context.getResources(), R.dimen.arg_RES_7f070481));
       KdsReboundBehavior kdsReboundBe = new KdsReboundBehavior(uob.a());
       this.q = kdsReboundBe;
       CoordinatorLayout$LayoutParams layoutParams = new CoordinatorLayout$LayoutParams(-1, -2);
       layoutParams.o(kdsReboundBe);
       this.setLayoutParams(layoutParams);
       this.setOutlineProvider(null);
    }
    public void a(){
       b$a.a(this);
    }
    public final int getHeaderScrollFlag(){
       return this.n;
    }
    public final KdsReboundBehavior getReboundBehavior(){
       return this.q;
    }
    public final int getStickyHeaderHeight(){
       return this.o;
    }
    public void onMeasure(int p0,int p1){
       View$MeasureSpec.getSize(p1);
       int i = 0;
       this.o = i;
       int childCount = this.getChildCount();
       int i1 = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (childAt != null) {
             i1 = i1 + this.t(childAt);
             this.setChildScrollFlag(childAt);
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             if (!layoutParams instanceof AppBarLayout$LayoutParams) {
                layoutParams = null;
             }
             if (layoutParams != null && !layoutParams.a()) {
                int i2 = this.o + this.t(childAt);
                this.o = i2;
             }
          }
       label_0037 :
          i = i + 1;
       }
       p1 = View$MeasureSpec.getSize(p1);
       if (!p1 || this.getLayoutParams().height == -2) {
          p1 = this.getPaddingBottom() + (i1 + this.getPaddingTop());
       }
       this.getMeasuredHeight();
       this.getHeight();
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(p1, 0x40000000));
       AppBarView tp = this.p;
       if (tp < null || (p1 != tp || this.getMeasuredHeight() != this.getHeight())) {
          this.requestLayout();
       }
       this.p = p1;
       return;
    }
    public final void resetPendingAction(){
       Class superclass = AppBarView.class.getSuperclass();
       if (superclass != null) {
          Class[] uClassArray = new Class[0];
          Method declaredMeth = superclass.getDeclaredMethod("resetPendingAction", uClassArray);
          if (declaredMeth != null) {
             declaredMeth.setAccessible(true);
             Object[] objArray = new Object[0];
             declaredMeth.invoke(this, objArray);
          }
       }
       return;
    }
    public final void setChildScrollFlag(View p0){
       ViewGroup$LayoutParams layoutParams;
       if (p0 instanceof TabsView) {
          layoutParams = p0.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.d(0);
          }else {
             throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
          }
       }else {
          layoutParams = p0.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.d(this.n);
          }else {
             throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
          }
       }
       return;
    }
    public final void setHeaderScrollFlag(int p0){
       this.n = p0;
    }
    public final int t(View p0){
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams != null) {
          return ((layoutParams.topMargin + p0.getMeasuredHeight()) + layoutParams.bottomMargin);
       }
       throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
