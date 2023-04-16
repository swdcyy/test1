package com.yxcorp.gifshow.slider.SliderPositionerLayout$d;
import com.yxcorp.gifshow.slider.SliderView$a;
import com.yxcorp.gifshow.slider.SliderPositionerLayout;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a79.a;
import hjc.e;
import qsd.d;

public final class SliderPositionerLayout$d implements SliderView$a	// class@001d3f
{
    public float a;
    public final SliderPositionerLayout b;

    public void SliderPositionerLayout$d(SliderPositionerLayout p0){
       this.b = p0;
       super();
    }
    public void a(float p0){
       SliderPositionerLayout$d uod = SliderPositionerLayout$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "3")) {
          return;
       }
       SliderPositionerLayout$d tb = this.b;
       tb.f = false;
       tb.setPositionersVisibility(false);
       tb = this.b;
       tb.postDelayed(tb.s, 2000);
       RecyclerView$Adapter adapter = SliderPositionerLayout.a(this.b).getAdapter();
       if (!adapter instanceof a) {
          adapter = null;
       }
       if (adapter != null) {
          int i = adapter.e1(SliderPositionerLayout.a(this.b));
          if (i < 0) {
             i = this.b.A;
          }
          this.b.e(i);
       }
       return;
    }
    public void b(float p0,float p1){
       SliderPositionerLayout$d uod = SliderPositionerLayout$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uod, "2")) {
          return;
       }
       SliderPositionerLayout$d tb = this.b;
       tb.f = true;
       tb.removeCallbacks(tb.s);
       tb = this.a;
       uod = this.b;
       SliderPositionerLayout y = uod.y;
       if (tb - (float)y >= 0 || tb - (float)(- y) <= 0) {
          this.a = tb + p0;
          SliderPositionerLayout.a(this.b).scrollBy(0, d.H0((this.a * SliderPositionerLayout.b(uod).w)));
          this.a = 0;
       }else {
          this.a = tb + p0;
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, SliderPositionerLayout$d.class, "1")) {
          return;
       }
       SliderPositionerLayout$d tb = this.b;
       tb.f = true;
       tb.f();
       this.b.setPositionersVisibility(true);
       return;
    }
}
