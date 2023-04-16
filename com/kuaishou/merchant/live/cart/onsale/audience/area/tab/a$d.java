package com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a$d;
import o34.e;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a;
import java.lang.Object;
import o34.f$a;
import o34.f$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import ot3.l0;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import java.util.List;
import com.kuaishou.merchant.live.cart.onsale.audience.model.TabInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.viewpager.widget.ViewPager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class a$d implements e	// class@001929
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void a(f$a p0,f$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$d.class, "1")) {
          return;
       }
       Map map = p0.a();
       String str = map.get("tabId");
       int i = (int)l0.b("tabType", map);
       int i1 = 0;
       while (i1 < this.a.y.mTabInfos.size()) {
          TabInfo tabInfo = this.a.y.mTabInfos.get(i1);
          if (TextUtils.n(str, tabInfo.mTabId) && i == tabInfo.mTabType) {
             this.a.q.setCurrentItem(i1);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public boolean b(f$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(p0.name(), "liveCartSwitchTab");
    }
}
