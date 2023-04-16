package androidx.viewpager2.widget.ViewPager2$RecyclerViewImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import android.content.Context;
import java.lang.CharSequence;
import androidx.viewpager2.widget.ViewPager2$e;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.MotionEvent;

public class ViewPager2$RecyclerViewImpl extends RecyclerView	// class@000a2b
{
    public final ViewPager2 this$0;

    public void ViewPager2$RecyclerViewImpl(ViewPager2 p0,Context p1){
       this.this$0 = p0;
       super(p1);
    }
    public CharSequence getAccessibilityClassName(){
       if (this.this$0.u.d()) {
          return this.this$0.u.n();
       }
       return super.getAccessibilityClassName();
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       super.onInitializeAccessibilityEvent(p0);
       p0.setFromIndex(this.this$0.e);
       p0.setToIndex(this.this$0.e);
       this.this$0.u.onRvInitializeAccessibilityEvent(p0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b = (this.this$0.h() && super.onInterceptTouchEvent(p0))? true: false;
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b = (this.this$0.h() && super.onTouchEvent(p0))? true: false;
       return b;
    }
}
