package androidx.viewpager2.widget.ViewPager2$d;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.IllegalStateException;
import java.lang.String;

public class ViewPager2$d implements RecyclerView$o	// class@000a31
{
    public final ViewPager2 b;

    public void ViewPager2$d(ViewPager2 p0){
       this.b = p0;
       super();
    }
    public void m3(View p0){
    }
    public void w6(View p0){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams.width == -1 && layoutParams.height == -1) {
          return;
       }
       throw new IllegalStateException("Pages must fill the whole ViewPager2 \(use match_parent\)");
    }
}
