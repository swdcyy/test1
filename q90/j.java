package q90.j;
import android.view.View$OnClickListener;
import q90.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSPagerSlidingTabStrip;
import com.kwai.library.widget.popup.common.c;

public final class j implements View$OnClickListener	// class@002994
{
    public final f b;

    public void j(f p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       j tb = this.b;
       Objects.requireNonNull(tb);
       f uof = PatchProxy.apply(null, tb, f.class, "4");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = tb.q;
          if (uof == null) {
             a.S("mTabViewPager");
          }
       }
       uof.setCurrentItem(1, false);
       this.b.Z8().t(1, false);
       f g = this.b.G;
       if (g != null) {
          g.o();
       }
       return;
    }
}
