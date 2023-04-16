package g93.h$a;
import androidx.recyclerview.widget.RecyclerView$n;
import g93.h;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardLineInfo;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardElement;
import lnc.a1;

public final class h$a extends RecyclerView$n	// class@002adc
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       int i;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, h$a.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       LiveBenefitCardLineInfo value = this.a.j.getValue();
       if (value != null) {
          a.o(value, "dataProvider.value ?: return");
          value = value.mElementList;
          if (value != null && p2.getChildLayoutPosition(p1) > 0) {
             h$a ta = this.a;
             Objects.requireNonNull(ta);
             ta = PatchProxy.applyOneRefs(value, ta, h.class, "2");
             if (ta != PatchProxyResult.class) {
                i = ta.intValue();
             }else {
                Iterator iterator = value.iterator();
                while (true) {
                   value = 1;
                   if (iterator.hasNext()) {
                      p2 = iterator.next();
                      Object obj = (p2.mItemType == value)? 1: null;
                      if (!obj) {
                         continue ;
                      }
                   }else {
                      p2 = null;
                   }
                   if (p2 == null) {
                      value = 0;
                   }
                   if (value) {
                      i = a1.e(4.00f);
                   }else {
                      i = a1.e(2.00f);
                   }
                }
             }
             p0.set(i, 0, 0, 0);
          }
       }
       return;
    }
}
