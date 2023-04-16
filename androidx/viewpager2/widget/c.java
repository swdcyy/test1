package androidx.viewpager2.widget.c;
import androidx.viewpager2.widget.ViewPager2$j;
import java.lang.Object;
import java.lang.String;
import z1.h;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.IllegalStateException;

public final class c implements ViewPager2$j	// class@000a40
{
    public final int a;

    public void c(int p0){
       super();
       h.e(p0, "Margin must be non-negative");
       this.a = p0;
    }
    public void a(View p0,float p1){
       ViewPager2 viewPager2 = this.b(p0);
       float f = (float)this.a * p1;
       if (!viewPager2.getOrientation()) {
          if (viewPager2.g()) {
             f = - f;
          }
          p0.setTranslationX(f);
       }else {
          p0.setTranslationY(f);
       }
       return;
    }
    public final ViewPager2 b(View p0){
       ViewParent parent = p0.getParent();
       ViewParent parent1 = parent.getParent();
       if (parent instanceof RecyclerView && parent1 instanceof ViewPager2) {
          return parent1;
       }
       throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
