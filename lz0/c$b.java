package lz0.c$b;
import androidx.viewpager.widget.ViewPager$l;
import lz0.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import mk1.w;
import com.kuaishou.live.common.core.basic.widget.VerticalPageIndicator;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ik1.a0;
import vg1.c;
import vg1.e;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView;

public class c$b extends ViewPager$l	// class@003081
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (!y.d(this.b.getActivity())) {
          w.r(this.b.r, p0);
       }else {
          w.q(this.b.s, p0);
       }
       this.b.d9();
       a0.t((p0 + 1), this.b.w.Z2.a());
       this.b.n9();
       this.b.S8().J(p0, this.b.S8().z(), this.b.q.getPageSize());
       return;
    }
}
