package com.kuaishou.live.common.core.component.gift.i;
import erd.g;
import com.kuaishou.live.common.core.component.gift.LiveGiftSelectDialogFragment;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.models.Gift;
import vg1.a;
import ug1.p0;
import vg1.l;
import java.util.Collection;
import ekd.q;
import rm1.f;
import vg1.e;
import android.widget.BaseAdapter;
import com.kwai.library.widget.viewpager.GridViewPager;
import ug1.r0;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import java.lang.CharSequence;
import android.widget.TextView;

public final class i implements g	// class@00131c
{
    public final LiveGiftSelectDialogFragment b;

    public void i(LiveGiftSelectDialogFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveGiftSelectDialogFragment.class, "12")) {
       }else {
          int i = 0;
          tb.P = p0.get(i);
          if (tb.O == null) {
             tb.O = new a(new p0(tb));
          }
          LiveGiftSelectDialogFragment o = tb.O;
          Objects.requireNonNull(o);
          if (!q.f(p0)) {
             o.e(f.f(p0));
          }
          tb.F.setAdapter(tb.O);
          tb.F.addOnPageChangeListener(new r0(tb));
          tb.O.V(i);
          tb.E.setItemCount(tb.F.getPageCount());
          tb.O.notifyDataSetChanged();
       }
       p0 = tb.M;
       if (p0 == null || p0 > tb.P.mMaxBatchCount) {
          p0 = tb.R;
          tb.M = p0;
          tb.H.setText(String.valueOf(p0));
       }
       return;
    }
}
