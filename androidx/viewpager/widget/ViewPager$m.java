package androidx.viewpager.widget.ViewPager$m;
import java.util.Comparator;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.viewpager.widget.ViewPager$LayoutParams;

public class ViewPager$m implements Comparator	// class@000a1d
{

    public void ViewPager$m(){
       super();
    }
    public int a(View p0,View p1){
       ViewPager$LayoutParams layoutParams = p0.getLayoutParams();
       ViewPager$LayoutParams layoutParams1 = p1.getLayoutParams();
       ViewPager$LayoutParams a = layoutParams.a;
       if (a == layoutParams1.a) {
          return (layoutParams.e - layoutParams1.e);
       }
       int i = (a != null)? 1: -1;
       return i;
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
