package com.gifshow.tuna.player.poi.g;
import erd.g;
import com.gifshow.tuna.player.poi.PoiFoodListSlidePlayFragment;
import java.lang.Object;
import com.gifshow.tuna.player.poi.PoiFoodFeedListModel;
import java.util.Objects;
import com.gifshow.tuna.player.poi.PoiFoodFeedListModel$Data;
import java.util.Collection;
import ekd.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.gifshow.tuna.player.component.TunaSlidePlayFragment;
import oj.k;
import com.gifshow.tuna.player.component.TunaSlidePlayFragment$PageState;
import android.view.ViewGroup;
import android.view.View;
import nj.h;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Integer;
import androidx.viewpager2.widget.ViewPager2;
import nj.k;
import java.lang.Runnable;
import ekd.k1;

public final class g implements g	// class@0015f6
{
    public final PoiFoodListSlidePlayFragment b;

    public void g(PoiFoodListSlidePlayFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       TunaSlidePlayFragment j;
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          PoiFoodFeedListModel mData = p0.mData;
          if (mData != null && !q.f(mData.mPoiDishVOList)) {
             p0.mPoiId = tb.u;
             boolean b = false;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, PoiFoodListSlidePlayFragment.class, "3")) {
                tb.t = p0;
                mData = p0.mData;
                if (mData != null && !q.f(mData.mPoiDishVOList)) {
                   j = tb.n;
                   if (j != null) {
                      j.o = tb.t;
                   }
                   p0 = p0.mData.mPoiDishVOList;
                   if (!PatchProxy.applyVoidOneRefs(p0, tb, TunaSlidePlayFragment.class, "7")) {
                      tb.p = TunaSlidePlayFragment$PageState.SUCCESS;
                      tb.j.setVisibility(b);
                      tb.k.setVisibility(4);
                      tb.l.setVisibility(4);
                      j = tb.n;
                      Objects.requireNonNull(j);
                      if (!PatchProxy.applyVoidOneRefs(p0, j, h.class, "1") && !q.f(p0)) {
                         j.m.clear();
                         j.m.addAll(p0);
                         j.k0();
                      }
                   }
                }
             }
          label_0086 :
             p0 = tb.v;
             if (!PatchProxy.isSupport(TunaSlidePlayFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tb, TunaSlidePlayFragment.class, "10")) {
                j = tb.j;
                if (j != null) {
                   j.m(p0, b);
                   k1.r(new k(tb, p0), 0);
                }
             }
          }else {
          label_00b1 :
             tb.fh();
          }
       }else {
          goto label_00b1 ;
       }
       return;
    }
}
