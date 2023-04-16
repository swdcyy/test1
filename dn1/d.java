package dn1.d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveHotspotSimpleInfo;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper;
import dn1.c;
import java.lang.Runnable;

public final class d implements Observer	// class@001fce
{
    public final FixedEntranceViewController b;

    public void d(FixedEntranceViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          Boolean first = p0.getFirst();
          p0 = p0.getSecond();
          d tb = this.b;
          String str = "isCoreAnchorTemp";
          if (tb.r == null) {
             tb.e3(p0);
             p0 = this.b;
             a.o(first, str);
             boolean b = first.booleanValue();
             Objects.requireNonNull(p0);
             FixedEntranceViewController uFixedEntran = FixedEntranceViewController.class;
             if (!PatchProxy.isSupport(uFixedEntran) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), p0, uFixedEntran, "13")) {
                p0.f3(b);
                if (b) {
                   p0 = p0.l;
                   if (p0 == null) {
                      a.S("fixEntranceView");
                   }
                   p0 = p0.getBackground();
                   Objects.requireNonNull(p0, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                   p0.setColor(a1.a(R.color.arg_RES_7f0604d9));
                }else {
                   FixedEntranceViewController n = p0.n;
                   if (n == null) {
                      a.S("scrollHotListContainer");
                   }
                   n.d();
                   p0 = p0.l;
                   if (p0 == null) {
                      a.S("fixEntranceView");
                   }
                   p0 = p0.getBackground();
                   Objects.requireNonNull(p0, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                   p0.setColor(a1.a(R.color.arg_RES_7f060846));
                }
             }
             p0.s = first.booleanValue();
          }else if(tb.s != null){
             a.o(first, str);
             if (first.booleanValue()) {
             label_00c0 :
                return;
             }
          }
          a.o(first, str);
          this.b.f3(first.booleanValue());
          FixedEntranceViewController.X2(this.b).post(new c(this, first, p0));
          goto label_00c0 ;
       }
    }
}
