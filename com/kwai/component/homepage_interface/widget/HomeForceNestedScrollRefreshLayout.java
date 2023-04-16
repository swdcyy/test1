package com.kwai.component.homepage_interface.widget.HomeForceNestedScrollRefreshLayout;
import com.kwai.component.homepage_interface.widget.ForceNestedScrollRefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.refresh.RefreshLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class HomeForceNestedScrollRefreshLayout extends ForceNestedScrollRefreshLayout	// class@000986
{
    public int k1;

    public void HomeForceNestedScrollRefreshLayout(Context p0){
       super(p0);
       this.k1 = -1;
    }
    public void HomeForceNestedScrollRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k1 = -1;
    }
    public int getChildDrawingOrder(int p0,int p1){
       HomeForceNestedScrollRefreshLayout tk1 = this.k1;
       if (tk1 < null) {
       }else {
          p0--;
          if (p1 == p0) {
             HomeForceNestedScrollRefreshLayout homeForceNes = tk1;
          }else if(p1 >= tk1){
             p1++;
          }
       }
       return p1;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(HomeForceNestedScrollRefreshLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HomeForceNestedScrollRefreshLayout.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.k1 = -1;
       p0 = 0;
       p1 = this.getChildCount();
       while (p0 < p1) {
          if (this.getChildAt(p0) == this.N) {
             this.k1 = p0;
             break ;
          }else {
             p0++;
          }
       }
       return;
    }
    public final void setRefreshViewMarginTop(int p0){
       if (PatchProxy.isSupport(HomeForceNestedScrollRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HomeForceNestedScrollRefreshLayout.class, "2")) {
          return;
       }
       View refreshView = this.getRefreshView();
       a.o(refreshView, "refreshView");
       ViewGroup$LayoutParams layoutParams = refreshView.getLayoutParams();
       if (!layoutParams instanceof RefreshLayout$LayoutParams) {
          layoutParams = null;
       }
       if (layoutParams != null) {
          layoutParams.topMargin = p0;
          View refreshView1 = this.getRefreshView();
          a.o(refreshView1, "refreshView");
          refreshView1.setLayoutParams(layoutParams);
       }
       return;
    }
}
