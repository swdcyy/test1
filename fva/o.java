package fva.o;
import erd.g;
import fva.p$a;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.hot.spot.model.HotSpotInterestInfo;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import java.util.Collection;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import fva.p;
import java.util.ArrayList;
import uua.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.adapter.interest.InterestCardWrapperAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class o implements g	// class@002a16
{
    public final p$a b;

    public void o(p$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       p p;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
       }else {
          HotSpotModel mHotSpotItem = p0.a().mHotSpotInterest.mHotSpotItems;
          String str = (mHotSpotItem == null || mHotSpotItem.isEmpty())? 1: null;
          if (!str) {
             p0 = p0.a().mHotSpotInterest.mHotSpotItems;
             a.o(p0, "response.body\(\).mHotSpotInterest.mHotSpotItems");
             p0 = p0.iterator();
             while (p0.hasNext()) {
                HotSpotItem hotSpotItem = p0.next();
                Iterator iterator = this.b.b.q.L0().iterator();
                String str1 = null;
                while (iterator.hasNext()) {
                   if (TextUtils.equals(iterator.next().mPhotoId, hotSpotItem.mPhotoId)) {
                      str1 = 1;
                   }
                }
                if (!str1) {
                   p = this.b.b.p;
                   str1 = "item";
                   a.o(hotSpotItem, str1);
                   Objects.requireNonNull(p);
                   if (PatchProxy.applyVoidOneRefs(hotSpotItem, p, InterestCardWrapperAdapter.class, "3")) {
                      continue ;
                   }
                }
                a.p(hotSpotItem, str1);
                p.h.L0().add(hotSpotItem);
                InterestCardWrapperAdapter h = p.h;
                h.n0(h.L0().indexOf(hotSpotItem));
                InterestCardWrapperAdapter h1 = p.h;
                h1.p0(h1.L0().indexOf(hotSpotItem), 1);
             }
          }
       }
       return;
    }
}
