package com.kwai.library.widget.viewpager.VerticalViewPager$f;
import a2.a;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.View;
import b2.d;
import androidx.viewpager.widget.ViewPager;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import android.os.Bundle;
import h3.a;
import android.view.accessibility.AccessibilityEvent;
import b2.f;

public class VerticalViewPager$f extends a	// class@000a7d
{
    public final VerticalViewPager d;

    public void VerticalViewPager$f(VerticalViewPager p0){
       this.d = p0;
       super();
    }
    public void f(View p0,d p1){
       super.f(p0, p1);
       p1.a0(ViewPager.class.getName());
       p1.w0(this.l());
       if (this.d.s(1)) {
          p1.a(4096);
       }
       if (this.d.s(-1)) {
          p1.a(8192);
       }
       return;
    }
    public boolean h(View p0,int p1,Bundle p2){
       VerticalViewPager$f td;
       if (super.h(p0, p1, p2)) {
          return true;
       }
       if (p1 != 4096) {
          if (p1 != 8192) {
             return false;
          }
          if (!this.d.s(-1)) {
             return false;
          }
          td = this.d;
          td.setCurrentItem((td.g - true));
          return true;
       }else if(this.d.s(true)){
          td = this.d;
          td.setCurrentItem((td.g + true));
          return true;
       }else {
          return false;
       }
    }
    public final boolean l(){
       VerticalViewPager f = this.d.f;
       boolean b = true;
       if (f == null || f.j() <= b) {
          b = false;
       }
       return b;
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       VerticalViewPager f;
       super.onInitializeAccessibilityEvent(p0, p1);
       p1.setClassName(ViewPager.class.getName());
       f uof = f.a();
       uof.f(this.l());
       if (p1.getEventType() == 4096) {
          f = this.d.f;
          if (f != null) {
             uof.c(f.j());
             uof.b(this.d.g);
             uof.h(this.d.g);
          }
       }
       return;
    }
}
