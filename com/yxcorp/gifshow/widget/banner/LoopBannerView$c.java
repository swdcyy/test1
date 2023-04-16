package com.yxcorp.gifshow.widget.banner.LoopBannerView$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.banner.DotsIndicator;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$b;
import com.yxcorp.gifshow.widget.banner.DotsIndicator$c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;

public final class LoopBannerView$c implements Runnable	// class@00194b
{
    public final LoopBannerView b;
    public final List c;

    public void LoopBannerView$c(LoopBannerView p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       boolean b;
       boolean b1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LoopBannerView$c.class, "1")) {
          return;
       }
       this.b.getMBanners().clear();
       this.b.getMBanners().addAll(this.c);
       LoopBannerView$c tb = this.b;
       if (this.c.size() == 2) {
          this.b.getMBanners().addAll(this.c);
          b = true;
       }else {
          b = false;
       }
       tb.setTwoPageMode(b);
       RecyclerView$Adapter adapter = this.b.getMViewPager().getAdapter();
       if (adapter != null) {
          adapter.k0();
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(objArray, tb, LoopBannerView.class, "11");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(tb.getRealCount() > 1){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          tb = this.b;
          LoopBannerView.h(tb, tb.d(tb.getRealCount()), false, 2, objArray);
       }else {
          LoopBannerView.h(this.b, false, false, 2, objArray);
       }
       if (this.b.getMBanners().size() <= 1) {
          this.b.getMIndicator().setVisibility(4);
       }else {
          this.b.getMIndicator().setVisibility(false);
       }
       this.b.getMIndicator().setViewPager(new LoopBannerView$b(this.b));
       ViewGroup$LayoutParams layoutParams = this.b.getMIndicator().getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.setMarginEnd(this.b.b);
       LoopBannerView$c tb1 = this.b;
       layoutParams.bottomMargin = tb1.c;
       if (tb1.getMBanners().size() == 1) {
          LoopBannerView$a listener = this.b.getListener();
          if (listener != null) {
             Object obj1 = this.b.getMBanners().get(false);
             a.o(obj1, "mBanners[0]");
             listener.Q5(obj1);
          }
       }
       return;
    }
}
