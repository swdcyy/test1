package com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$a;
import androidx.recyclerview.widget.o;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.util.DisplayMetrics;

public class CarouselLayoutManager$a extends o	// class@0017f0
{
    public final CarouselLayoutManager q;

    public void CarouselLayoutManager$a(CarouselLayoutManager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public int t(View p0,int p1){
       CarouselLayoutManager$a uoa = CarouselLayoutManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!this.q.canScrollHorizontally()) {
          return 0;
       }else {
          return (int)((float)this.q.V(p0) / CarouselLayoutManager.n);
       }
    }
    public int u(View p0,int p1){
       CarouselLayoutManager$a uoa = CarouselLayoutManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!this.q.canScrollVertically()) {
          return 0;
       }else {
          return (int)((float)this.q.V(p0) / CarouselLayoutManager.n);
       }
    }
    public float v(DisplayMetrics p0){
       return (CarouselLayoutManager.o / (float)p0.densityDpi);
    }
}
