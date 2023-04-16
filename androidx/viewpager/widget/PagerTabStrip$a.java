package androidx.viewpager.widget.PagerTabStrip$a;
import android.view.View$OnClickListener;
import androidx.viewpager.widget.PagerTabStrip;
import java.lang.Object;
import android.view.View;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;

public class PagerTabStrip$a implements View$OnClickListener	// class@000a04
{
    public final PagerTabStrip b;

    public void PagerTabStrip$a(PagerTabStrip p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       PagerTitleStrip b = this.b.b;
       b.setCurrentItem((b.getCurrentItem() - 1));
    }
}
