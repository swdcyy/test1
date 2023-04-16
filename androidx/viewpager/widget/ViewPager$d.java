package androidx.viewpager.widget.ViewPager$d;
import a2.z;
import androidx.viewpager.widget.ViewPager;
import java.lang.Object;
import android.graphics.Rect;
import android.view.View;
import a2.u0;
import a2.i0;
import android.view.ViewGroup;
import java.lang.Math;

public class ViewPager$d implements z	// class@000a14
{
    public final Rect a;
    public final ViewPager b;

    public void ViewPager$d(ViewPager p0){
       this.b = p0;
       super();
       this.a = new Rect();
    }
    public u0 a(View p0,u0 p1){
       u0 ou0 = i0.f0(p0, p1);
       if (ou0.o()) {
          return ou0;
       }
       ViewPager$d ta = this.a;
       ta.left = ou0.i();
       ta.top = ou0.k();
       ta.right = ou0.j();
       ta.bottom = ou0.h();
       int childCount = this.b.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          u0 ou01 = i0.i(this.b.getChildAt(i), ou0);
          ta.left = Math.min(ou01.i(), ta.left);
          ta.top = Math.min(ou01.k(), ta.top);
          ta.right = Math.min(ou01.j(), ta.right);
          ta.bottom = Math.min(ou01.h(), ta.bottom);
       }
       return ou0.q(ta.left, ta.top, ta.right, ta.bottom);
    }
}
