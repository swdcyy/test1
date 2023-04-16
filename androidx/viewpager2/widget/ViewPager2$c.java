package androidx.viewpager2.widget.ViewPager2$c;
import androidx.viewpager2.widget.ViewPager2$h;
import androidx.viewpager2.widget.ViewPager2;
import android.view.ViewGroup;

public class ViewPager2$c extends ViewPager2$h	// class@000a30
{
    public final ViewPager2 a;

    public void ViewPager2$c(ViewPager2 p0){
       this.a = p0;
       super();
    }
    public void c(int p0){
       this.a.clearFocus();
       if (this.a.hasFocus()) {
          this.a.k.requestFocus(2);
       }
       return;
    }
}
