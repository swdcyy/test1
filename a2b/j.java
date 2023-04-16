package a2b.j;
import erd.g;
import a2b.k;
import java.lang.Object;
import com.yxcorp.gifshow.local.sub.entrance.function.model.FunctionCardResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;
import com.kwai.component.feedstaggercard.model.CardStyle;
import lnc.a1;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.yxcorp.utility.n;

public final class j implements g	// class@00002b
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       View[] viewArray;
       k q;
       j tb = this.b;
       Objects.requireNonNull(tb);
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, ok, "4")) {
       }else {
          int i = 1;
          if (p0 == null || q.f(p0.mNearbyTopCards)) {
             viewArray = new View[i];
             viewArray[0] = tb.q;
             n.Z(8, viewArray);
          }else if(tb.q == null){
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, tb, ok, "5")) {
                k r = tb.r;
                if (r != null) {
                   NearbyHeaderFunctionEntranceView nearbyHeader = r.inflate();
                   tb.q = nearbyHeader;
                   if (nearbyHeader != null) {
                      nearbyHeader.setItemCardClickListener(tb);
                      if (!PatchProxy.applyVoid(objArray, tb, ok, "6") && tb.q != null) {
                         ok = tb.u;
                         viewArray = (ok != null && CardStyle.isV4Bottom(ok.mBottomType))? 1: 0;
                         int i1 = a1.e(0);
                         float f = (viewArray)? 4.00f: 8.00f;
                         int i2 = a1.e(f);
                         q = tb.q;
                         Objects.requireNonNull(q);
                         if (!PatchProxy.isSupport(NearbyHeaderFunctionEntranceView.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(0), Integer.valueOf(i1), Integer.valueOf(0), Integer.valueOf(i2), q, NearbyHeaderFunctionEntranceView.class, "4")) {
                            nearbyHeader = q.b;
                            if (nearbyHeader == null) {
                               a.S("mFunctionListRecyclerView");
                            }
                            nearbyHeader.setPadding(0, i1, 0, i2);
                         }
                      }
                   }
                }
             }
          }
          viewArray = new View[i];
          viewArray[0] = tb.q;
          n.Z(0, viewArray);
          tb.q.setDate(p0);
       }
       return;
    }
}
