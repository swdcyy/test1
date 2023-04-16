package com.yxcorp.gifshow.relation.explore.carousellayoutmanager.a;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$e;
import android.view.View;
import cac.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;

public class a extends CarouselLayoutManager$e	// class@0017f6
{
    public final float a;
    public int b;

    public void a(){
       super(0.17f, 1);
    }
    public void a(float p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public b a(View p0,float p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float f = 0x3f800000;
       float f1 = f - (this.a * Math.abs(p1));
       float f2 = 0;
       if (1 == p2) {
          p1 = Math.signum(p1) * (((float)p0.getMeasuredHeight() * (f - f1)) / 2.00f);
       }else {
          f2 = Math.signum(p1) * (((float)p0.getMeasuredWidth() * (f - f1)) / 2.00f);
          p1 = 0;
       }
       f = (f - f1) / this.a;
       View view = p0.findViewById(R.id.image_shadow);
       if (view != null) {
          view.setAlpha(f);
       }
       if (f - 0x3f733333 > 0) {
          p0.setClickable(false);
       }else {
          p0.setClickable(1);
       }
       return new b(f1, f1, (f2 * (float)this.b), p1);
    }
}
