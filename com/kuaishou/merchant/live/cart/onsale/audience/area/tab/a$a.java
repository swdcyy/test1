package com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a$a;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.LinearLayout;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import java.util.List;
import com.kuaishou.merchant.live.cart.onsale.audience.model.TabInfo;
import android.view.View;
import ekd.m1;
import com.kuaishou.merchant.live.cart.onsale.widget.TabIconifyTextViewNew;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.Objects;
import com.kwai.library.widget.textview.KwaiIconifyTextViewNew;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import ds3.a;
import java.util.Set;
import java.lang.CharSequence;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import k2b.e0;
import e34.b;

public class a$a extends ViewPager$l	// class@001926
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       a$a tb;
       boolean b;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       for (int i = 0; i < this.b.p.getTabsContainer().getChildCount(); i = i + 1) {
          TabInfo tabInfo = this.b.y.mTabInfos.get(i);
          View childAt = this.b.p.getTabsContainer().getChildAt(i);
          TabIconifyTextViewNew tabIconifyTe = m1.f(childAt, R.id.shop_tab_text);
          View view = m1.f(childAt, R.id.shop_tab_bg_container);
          KwaiImageView kwaiImageVie = m1.f(childAt, R.id.shop_tab_img);
          if (i == p0) {
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(tabIconifyTe, tb, a.class, "8")) {
                tabIconifyTe.b();
                Object tag = tabIconifyTe.getTag(R.id.live_merchant_audience_shop_tab_id);
                if (tag instanceof String) {
                   tb.B.b.m.add(tag);
                }
             }
             b.i(this.b.A, tabIconifyTe.getContentText().toString(), this.b.B.n);
          }
          tb = this.b;
          b = true;
          boolean b1 = (i == p0)? true: false;
          tb.R8(tabIconifyTe, view, b1);
          a$a tb1 = this.b;
          if (i != p0) {
             b = false;
          }
          tb1.P8(tabInfo, kwaiImageVie, b);
       }
       return;
    }
}
