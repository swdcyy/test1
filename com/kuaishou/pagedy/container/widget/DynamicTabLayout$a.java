package com.kuaishou.pagedy.container.widget.DynamicTabLayout$a;
import androidx.viewpager2.widget.ViewPager2$h;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.Float;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.HorizontalScrollView;

public class DynamicTabLayout$a extends ViewPager2$h	// class@000a74
{
    public final DynamicTabLayout a;

    public void DynamicTabLayout$a(DynamicTabLayout p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       DynamicTabLayout$a uoa = DynamicTabLayout$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.a;
       DynamicTabLayout g = uoa.g;
       if (g == null) {
          return;
       }
       if (!p0) {
          uoa.g(g.getCurrentItem(), 0);
       }
       DynamicTabLayout e = this.a.e;
       if (e != null) {
          e.a(p0);
       }
       if (p0 == 1) {
          DynamicTabLayout$a ta = this.a;
          ta.R = ta.g.getCurrentItem();
       }
       return;
    }
    public void b(int p0,float p1,int p2){
       if (PatchProxy.isSupport(DynamicTabLayout$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, DynamicTabLayout$a.class, "1")) {
          return;
       }
       int childCount = this.a.f.getChildCount();
       DynamicTabLayout$a ta = this.a;
       boolean b = false;
       int i = (ta.N != null)? 1: 0;
       if (p0 >= (childCount - i)) {
          return;
       }else {
          ta.i = p0;
          ta.j = p1;
          if (ta.U0 != null) {
             float f = (float)ta.f.getChildAt(p0).getWidth();
             if (p0 < (this.a.f.getChildCount() - 1)) {
                int i1 = p0 + 1;
                f = ((float)this.a.f.getChildAt(i1).getLeft() + ((float)this.a.f.getChildAt(i1).getWidth() / 2.00f)) - ((float)this.a.f.getChildAt(p0).getLeft() + ((float)this.a.f.getChildAt(p0).getWidth() / 2.00f));
             }
             this.a.g(p0, (int)(f * p1));
          }else {
             ta.g(p0, (int)((float)ta.f.getChildAt(p0).getWidth() * p1));
          }
          this.a.invalidate();
          DynamicTabLayout e = this.a.e;
          if (e != null) {
             e.b(p0, p1, p2);
          }
          DynamicTabLayout$a ta1 = this.a;
          if (ta1.R == p0) {
             b = true;
          }
          ta1.S = b;
          return;
       }
    }
    public void c(int p0){
       DynamicTabLayout$a uoa = DynamicTabLayout$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       uoa = this.a;
       uoa.i = p0;
       uoa.h(p0);
       DynamicTabLayout e = this.a.e;
       if (e != null) {
          e.c(p0);
       }
       return;
    }
}
