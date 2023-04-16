package androidx.viewpager.widget.PagerTabStrip$b;
import android.view.View$OnClickListener;
import androidx.viewpager.widget.PagerTabStrip;
import java.lang.Object;
import android.view.View;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;

public class PagerTabStrip$b implements View$OnClickListener	// class@000a05
{
    public final PagerTabStrip b;

    public void PagerTabStrip$b(PagerTabStrip p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       PagerTitleStrip b = this.b.b;
       b.setCurrentItem((b.getCurrentItem() + 1));
    }
}
