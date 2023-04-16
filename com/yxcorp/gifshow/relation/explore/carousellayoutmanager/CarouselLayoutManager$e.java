package com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$e;
import java.lang.Object;
import android.view.View;
import cac.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;

public abstract class CarouselLayoutManager$e	// class@0017f4
{

    public void CarouselLayoutManager$e(){
       super();
    }
    public b a(View p0,float p1,int p2){
       if (PatchProxy.isSupport(CarouselLayoutManager$e.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), this, CarouselLayoutManager$e.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       throw new IllegalStateException("at least one transformChild should be implemented");
    }
}
