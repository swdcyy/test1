package androidx.viewpager.widget.ViewPager$g;
import a2.a;
import androidx.viewpager.widget.ViewPager;
import android.view.View;
import b2.d;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import android.os.Bundle;
import h3.a;
import android.view.accessibility.AccessibilityEvent;

public class ViewPager$g extends a	// class@000a17
{
    public final ViewPager d;

    public void ViewPager$g(ViewPager p0){
       this.d = p0;
       super();
    }
    public void f(View p0,d p1){
       super.f(p0, p1);
       p1.a0(ViewPager.class.getName());
       p1.w0(this.l());
       if (this.d.canScrollHorizontally(1)) {
          p1.a(4096);
       }
       if (this.d.canScrollHorizontally(-1)) {
          p1.a(8192);
       }
       return;
    }
    public boolean h(View p0,int p1,Bundle p2){
       ViewPager$g td;
       if (super.h(p0, p1, p2)) {
          return true;
       }
       if (p1 != 4096) {
          if (p1 != 8192) {
             return false;
          }
          if (!this.d.canScrollHorizontally(-1)) {
             return false;
          }
          td = this.d;
          td.setCurrentItem((td.mCurItem - true));
          return true;
       }else if(this.d.canScrollHorizontally(true)){
          td = this.d;
          td.setCurrentItem((td.mCurItem + true));
          return true;
       }else {
          return false;
       }
    }
    public final boolean l(){
       ViewPager mAdapter = this.d.mAdapter;
       boolean b = true;
       if (mAdapter == null || mAdapter.j() <= b) {
          b = false;
       }
       return b;
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       super.onInitializeAccessibilityEvent(p0, p1);
       p1.setClassName(ViewPager.class.getName());
       p1.setScrollable(this.l());
       if (p1.getEventType() == 4096) {
          ViewPager mAdapter = this.d.mAdapter;
          if (mAdapter != null) {
             p1.setItemCount(mAdapter.j());
             p1.setFromIndex(this.d.mCurItem);
             p1.setToIndex(this.d.mCurItem);
          }
       }
       return;
    }
}
