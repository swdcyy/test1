package ah5.c$a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$e;
import ah5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.widget.HorizontalScrollView;
import android.view.View;

public class c$a implements PagerSlidingTabStrip$e	// class@0000a0
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       if (this.a.p.zh().getScrollX()) {
          this.a.r.setVisibility(0);
       }else {
          this.a.r.setVisibility(4);
       }
       return;
    }
}
