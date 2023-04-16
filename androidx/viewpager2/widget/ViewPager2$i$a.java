package androidx.viewpager2.widget.ViewPager2$i$a;
import b2.g;
import androidx.viewpager2.widget.ViewPager2$i;
import java.lang.Object;
import android.view.View;
import b2.g$a;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPager2$i$a implements g	// class@000a36
{
    public final ViewPager2$i a;

    public void ViewPager2$i$a(ViewPager2$i p0){
       this.a = p0;
       super();
    }
    public boolean a(View p0,g$a p1){
       this.a.u((p0.getCurrentItem() + 1));
       return 1;
    }
}
