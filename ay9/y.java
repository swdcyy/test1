package ay9.y;
import java.lang.Runnable;
import ay9.a0;
import java.lang.Object;
import e8a.d;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;
import java.util.HashMap;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import msd.a;
import java.util.Map;
import ay9.q;
import ay9.u;
import lnc.c3$a;
import lnc.c3;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.model.mix.TagItem;
import java.lang.String;
import com.yxcorp.gifshow.rich.RichTextTagUtil;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.l0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class y implements Runnable	// class@000310
{
    public final a0 b;

    public void y(a0 p0){
       this.b = p0;
    }
    public final void run(){
       y tb = this.b;
       if (tb.p0() != null) {
          tb.p0().i();
       }
       HashMap hashMap = new HashMap();
       if (tb.H().R() != null) {
          hashMap.putAll(tb.H().R().invoke());
       }
       hashMap.put("tag_area", "FEED_LEFT_CORNER");
       c3.c(tb.x, new u(tb, hashMap));
       Iterator iterator = tb.y.iterator();
       while (iterator.hasNext()) {
          String str = RichTextTagUtil.a(iterator.next().mTag);
          if (!TextUtils.x(str)) {
             u1.u0(3, l0.c(""), l0.b(str));
          }
       }
       return;
    }
}
