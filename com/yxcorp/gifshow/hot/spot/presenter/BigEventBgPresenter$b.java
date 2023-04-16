package com.yxcorp.gifshow.hot.spot.presenter.BigEventBgPresenter$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.hot.spot.presenter.BigEventBgPresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.component.homepage_interface.homeitemfragment.ui.HomeItemLayoutManager;
import java.util.Objects;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Math;
import bo5.a;
import java.lang.Float;
import androidx.fragment.app.Fragment;
import zq6.p;
import as6.a;

public final class BigEventBgPresenter$b extends RecyclerView$r	// class@001845
{
    public final BigEventBgPresenter a;

    public void BigEventBgPresenter$b(BigEventBgPresenter p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(BigEventBgPresenter$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, BigEventBgPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       p2 = 0;
       if (p0.getLayoutManager() instanceof HomeItemLayoutManager) {
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.kwai.component.homepage_interface.homeitemfragment.ui.HomeItemLayoutManager");
          int[] ointArray = new int[2];
          int i = layoutManage.findFirstVisibleItemPositions(ointArray)[p2];
          if (i) {
             return;
          }else {
             View childAt = BigEventBgPresenter.P8(this.a).h0().getChildAt(i);
             a.o(childAt, "mFragment.recyclerView.g¡­firstVisibleItemPosition\)");
             p2 = Math.abs(childAt.getTop());
          }
       }
       BigEventBgPresenter$b uob = 99;
       String str = "HomeTopStateId.BAR_BACKGROUND_ALPHA";
       if (p2 >= 0 && uob >= p2) {
          p q1 = a.q;
          a.o(q1, str);
          a.a(BigEventBgPresenter.P8(this.a), q1, Float.valueOf(((float)1 - ((float)p2 / 100.00f))));
       }else {
          p q = a.q;
          a.o(q, str);
          a.a(BigEventBgPresenter.P8(this.a), q, Float.valueOf(0));
       }
       return;
    }
}
