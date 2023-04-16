package com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter$onScrollListener$2$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter$onScrollListener$2;
import kotlin.jvm.internal.Ref$IntRef;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter;
import b04.d;
import go4.a;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.pagedy.container.widget.DynamicRootRecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView;
import android.view.ViewGroup;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hx3.d;

public final class HomeChannelPresenter$onScrollListener$2$a extends RecyclerView$r	// class@00173b
{
    public final HomeChannelPresenter$onScrollListener$2 a;
    public final Ref$IntRef b;

    public void HomeChannelPresenter$onScrollListener$2$a(HomeChannelPresenter$onScrollListener$2 p0,Ref$IntRef p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(RecyclerView p0,int p1){
       Object obj1;
       HomeChannelPresenter$onScrollListener$2$a oonScrollLis = HomeChannelPresenter$onScrollListener$2$a.class;
       if (PatchProxy.isSupport(oonScrollLis) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oonScrollLis, "1")) {
          return;
       }
       HomeChannelPresenter z = this.a.this$0.z;
       if (z != null && z.E0() == true) {
          return;
       }
       DynamicNestedRecyclerView uDynamicNest = null;
       ViewPager2 obj = PatchProxy.applyOneRefs(p0, uDynamicNest, a.class, "25");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "$this$findChildRecyclerView");
          obj = (!p0 instanceof DynamicRootRecyclerView)? uDynamicNest: p0;
          if (obj != null) {
             obj = obj.getViewPager2();
             if (obj != null) {
                uDynamicNest = a.c(obj);
             }
          }
          obj = uDynamicNest;
       }
       if (obj != null) {
          p0 = obj;
       }
       if (!p1) {
          p1 = 0;
          int childCount = p0.getChildCount();
          while (p1 < childCount) {
             View childAt = p0.getChildAt(p1);
             View view = a.e(p0);
             if (view != null && (childAt != null && d.c(childAt, this.a.this$0.getActivity(), view))) {
                HomeChannelPresenter$onScrollListener$2$a tb = this.b;
                int i = tb.element + 1;
                tb.element = i;
             }
          label_007d :
             p1++;
          }
          if (this.b.element >= 3) {
             HomeChannelPresenter z1 = this.a.this$0.z;
             if (z1 != null) {
                z1.T0(1);
             }
          }
       }
       return;
    }
}
