package com.kds.headertabscrollview.layout.FixedFlingNestedScrollView$a;
import a2.a;
import android.view.View;
import b2.d;
import com.kds.headertabscrollview.layout.FixedFlingNestedScrollView;
import android.widget.ScrollView;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import android.widget.FrameLayout;
import b2.d$a;
import android.os.Bundle;
import java.lang.Math;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import b2.f;

public class FixedFlingNestedScrollView$a extends a	// class@000721
{

    public void FixedFlingNestedScrollView$a(){
       super();
    }
    public void f(View p0,d p1){
       super.f(p0, p1);
       p1.a0(ScrollView.class.getName());
       if (p0.isEnabled()) {
          int scrollRange = p0.getScrollRange();
          if (scrollRange > 0) {
             p1.w0(true);
             if (p0.getScrollY() > 0) {
                p1.b(d$a.r);
                p1.b(d$a.C);
             }
             if (p0.getScrollY() < scrollRange) {
                p1.b(d$a.q);
                p1.b(d$a.E);
             }
          }
       }
       return;
    }
    public boolean h(View p0,int p1,Bundle p2){
       if (super.h(p0, p1, p2)) {
          return true;
       }
       if (!p0.isEnabled()) {
          return false;
       }
       if (p1 != 4096) {
          if (p1 != 8192 && p1 != 0x1020038) {
             if (p1 != 0x102003a) {
                return false;
             }
          }else {
             p1 = Math.max((p0.getScrollY() - ((p0.getHeight() - p0.getPaddingBottom()) - p0.getPaddingTop())), false);
             if (p1 != p0.getScrollY()) {
                p0.B(false, p1, true);
                return true;
             }else {
                return false;
             }
          }
       }
       p1 = Math.min((p0.getScrollY() + ((p0.getHeight() - p0.getPaddingBottom()) - p0.getPaddingTop())), p0.getScrollRange());
       if (p1 != p0.getScrollY()) {
          p0.B(false, p1, true);
          return true;
       }else {
          return false;
       }
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       super.onInitializeAccessibilityEvent(p0, p1);
       p1.setClassName(ScrollView.class.getName());
       boolean b = (p0.getScrollRange() > 0)? true: false;
       p1.setScrollable(b);
       p1.setScrollX(p0.getScrollX());
       p1.setScrollY(p0.getScrollY());
       f.d(p1, p0.getScrollX());
       f.e(p1, p0.getScrollRange());
       return;
    }
}
