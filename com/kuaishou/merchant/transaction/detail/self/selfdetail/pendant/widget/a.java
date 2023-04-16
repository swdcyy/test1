package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.widget.a;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.widget.DetailPendantViewPager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.widget.DetailPendantViewPager$b;

public class a extends ViewPager$l	// class@000755
{
    public final DetailPendantViewPager b;

    public void a(DetailPendantViewPager p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (!p0 && (this.b.getAdapter() != null && this.b.getAdapter().j() > 0)) {
          a tb = this.b;
          if (tb.B != null) {
             if (tb.w == (tb.getAdapter().j() - 1)) {
                this.b.setCurrentItem(0, 0);
             }
             this.b.o();
          }
       }
       return;
    }
    public void onPageSelected(int p0){
       DetailPendantViewPager a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.w = p0;
       a = uoa.A;
       if (a != null) {
          a.a(p0);
       }
       return;
    }
}
