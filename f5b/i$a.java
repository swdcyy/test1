package f5b.i$a;
import android.view.View$OnClickListener;
import f5b.i;
import androidx.viewpager.widget.ViewPager;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip$c;
import a5b.f;
import a5b.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class i$a implements View$OnClickListener	// class@0028ac
{
    public final i b;
    public final ViewPager c;
    public final int d;

    public void i$a(i p0,ViewPager p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       i$a tc = this.c;
       if (tc != null && this.d != tc.getCurrentItem()) {
          this.b.m.onClick(p0);
          boolean b = false;
          i r = this.b.r;
          if (r != null) {
             h oh = f.d.a(r);
             if (oh != null) {
                String str = oh.a();
                if (str != null) {
                   b = TextUtils.x(str) ^ 0x01;
                }
             }
          }
          this.c.setCurrentItem(this.d, b);
       }
       return;
    }
}
