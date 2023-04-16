package mu1.e;
import androidx.lifecycle.Observer;
import mu1.a;
import java.lang.Object;
import ya1.n0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.widget.LiveWishListItemView;
import com.kuaishou.live.common.core.basic.widget.LiveWishListStyle;
import mu1.d;
import java.lang.Runnable;
import ekd.k1;

public class e implements Observer	// class@00321c
{
    public final a b;

    public void e(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          a l = this.b.l;
          Objects.requireNonNull(l);
          if (!PatchProxy.applyVoidOneRefs(p0, l, LiveWishListItemView.class, "4")) {
             l.setWishListStyle(LiveWishListStyle.GIFT);
             l.d(p0, true);
          }
          k1.r(new d(this), 0);
       }
       return;
    }
}
