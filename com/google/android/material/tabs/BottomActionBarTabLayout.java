package com.google.android.material.tabs.BottomActionBarTabLayout;
import com.google.android.material.tabs.TabLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout$f;
import com.google.android.material.tabs.BottomActionBarTabLayout$a;
import android.view.View;
import android.widget.LinearLayout;
import a2.i0;
import android.widget.HorizontalScrollView;
import android.content.res.Resources;
import android.content.res.Configuration;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;

public final class BottomActionBarTabLayout extends TabLayout	// class@0016b2
{
    public boolean b;
    public BottomActionBarTabLayout$a c;
    public int d;
    public int e;

    public void BottomActionBarTabLayout(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void BottomActionBarTabLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
    }
    public void BottomActionBarTabLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1, p2);
    }
    public void D(TabLayout$f p0,boolean p1){
       a.p(p0, "tab");
       BottomActionBarTabLayout tc = this.c;
       if (tc != null) {
          a.m(tc);
          if (tc.a(p0)) {
             return;
          }
       }
       super.D(p0, p1);
       return;
    }
    public final TabLayout$f N(View p0){
       a.p(p0, "view");
       TabLayout$f uof = this.w();
       a.o(uof, "newTab\(\)");
       TabLayout$f h = uof.h;
       a.o(h, "tab.view");
       h.setClipChildren(false);
       uof.k(p0);
       i0.J0(uof.h, false, false, false, false);
       this.b(uof);
       return uof;
    }
    public final void O(int p0){
       if (this.b == null) {
          return;
       }
       this.d = p0 / 2;
       Context context = this.getContext();
       a.o(context, "context");
       Resources resources = context.getResources();
       a.o(resources, "context.resources");
       p0++;
       this.e = a1.e((float)resources.getConfiguration().screenWidthDp) / p0;
       TabLayout$f uof = this.v(this.d);
       TabLayout$f h = (uof != null)? uof.h: null;
       if (h != null) {
          h = uof.h;
          a.o(h, "tab.view");
          ViewGroup$LayoutParams layoutParams = h.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.leftMargin = this.e;
          uof = uof.h;
          a.o(uof, "tab.view");
          uof.setLayoutParams(layoutParams);
       }
       return;
    }
    public final View P(TabLayout$f p0){
       a.p(p0, "tab");
       p0 = p0.h;
       a.o(p0, "tab.view");
       return p0;
    }
    public final void Q(int p0){
       if (this.getSelectedTabPosition() != p0 && p0 < this.getTabCount()) {
          TabLayout$f uof = this.v(p0);
          a.m(uof);
          a.o(uof, "getTabAt\(position\)!!");
          this.D(uof, false);
       }
       return;
    }
    public void d(TabLayout$f p0,int p1,boolean p2){
       a.p(p0, "tab");
       super.d(p0, p1, p2);
       if (this.b != null && p1 == this.d) {
          p0 = p0.h;
          a.o(p0, "tab.view");
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.leftMargin = this.e;
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
       this.O(this.getTabCount());
    }
    public final void setHasShootButton(boolean p0){
       this.b = p0;
       this.O(this.getTabCount());
    }
    public final void setTabSelectInterceptor(BottomActionBarTabLayout$a p0){
       a.p(p0, "interceptor");
       this.c = p0;
    }
}
