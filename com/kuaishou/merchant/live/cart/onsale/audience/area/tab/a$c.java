package com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a$c;
import o34.e;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a;
import m34.b;
import java.lang.Object;
import o34.f$a;
import o34.f$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.LiveAudienceCommodityFragment;
import java.util.Map;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import g9c.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import androidx.recyclerview.widget.RecyclerView;
import l54.c;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import l54.a;
import androidx.recyclerview.widget.RecyclerView$r;
import l54.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import com.kuaishou.merchant.live.cart.onsale.audience.a$b;
import com.kwai.robust.PatchProxyResult;

public class a$c implements e	// class@001928
{
    public final b a;
    public final a b;

    public void a$c(a p0,b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(f$a p0,f$b p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$c.class, "1")) {
          return;
       }
       Fragment uFragment = this.a.t();
       if (uFragment instanceof LiveAudienceCommodityFragment) {
          Map map = p0.a();
          Object obj = map.get("id");
          String str = map.get("buyerCouponId");
          map = map.get("snapTop");
          boolean b = (map instanceof Boolean)? map.booleanValue(): false;
          if (!TextUtils.x(obj)) {
             a$c tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(obj, uFragment, Boolean.valueOf(b), tb, a.class, "4")) {
                g og = uFragment.g7();
                int i = og.Q0().size();
                int i1 = 0;
                while (i1 < i) {
                   RecyclerView$LayoutManager obj1 = og.Q0().get(i1);
                   if (obj1 instanceof ComponentInfo && (obj1.getId()).startsWith(obj)) {
                      uoa = tb.u;
                      RecyclerView recyclerView = uFragment.h0();
                      Objects.requireNonNull(uoa);
                      if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(recyclerView, Integer.valueOf(i1), Boolean.valueOf(b), obj, uoa, c.class, "3")) {
                         RecyclerView$LayoutManager layoutManage = recyclerView.getLayoutManager();
                         if (layoutManage instanceof LinearLayoutManager) {
                            obj1 = layoutManage;
                            if (i1 <= obj1.c() && i1 >= obj1.h()) {
                               uoa.b(recyclerView, i1, obj);
                               break ;
                            }else {
                               recyclerView.addOnScrollListener(new a(uoa, i1, recyclerView, obj));
                               if (b) {
                                  b uob = new b(uoa, recyclerView.getContext());
                                  uob.p(i1);
                                  layoutManage.startSmoothScroll(uob);
                               }else {
                                  recyclerView.smoothScrollToPosition(i1);
                               }
                               uoa.b = true;
                               break ;
                            }
                         }
                      }
                   }
                   i1 = i1 + 1;
                }
             }
          }else if(!TextUtils.x(str)){
             a$c tb1 = this.b;
             Objects.requireNonNull(tb1);
             if (!PatchProxy.applyVoidOneRefs(str, tb1, uoa, "5")) {
                tb1.B.l.a(str);
             }
          }
       }
    label_010f :
       return;
    }
    public boolean b(f$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(p0.name(), "liveCartScrollAction");
    }
}
