package com.yxcorp.gifshow.share.widget.ForwardGridFragment$c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.share.widget.ForwardGridFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.LinearLayout;
import usd.k;
import usd.q;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import trd.l0;
import android.view.View;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class ForwardGridFragment$c implements ViewPager$i	// class@001cbb
{
    public final ForwardGridFragment b;

    public void ForwardGridFragment$c(ForwardGridFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       ForwardGridFragment$c uoc = ForwardGridFragment$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       int i = 0;
       k ok = q.n1(i, ForwardGridFragment.Ih(this.b).getChildCount());
       ArrayList uArrayList = new ArrayList(u.Y(ok, 10));
       Iterator iterator = ok.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(ForwardGridFragment.Ih(this.b).getChildAt(iterator.b()));
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          i = (i == p0)? 0x7f081a4d: 0x7f08027c;
          obj.setBackgroundResource(i);
          i = i1;
       }
       return;
    }
}
