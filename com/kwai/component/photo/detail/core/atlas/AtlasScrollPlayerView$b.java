package com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$b;
import androidx.recyclerview.widget.o;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView;
import android.content.Context;
import lnc.a1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import android.view.animation.Interpolator;
import android.util.DisplayMetrics;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class AtlasScrollPlayerView$b extends o	// class@000a11
{
    public final float q;
    public final AtlasScrollPlayerView r;

    public void AtlasScrollPlayerView$b(AtlasScrollPlayerView p0,Context p1){
       this.r = p0;
       super(p1);
       this.q = 1000.00f / (float)a1.e(50.00f);
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AtlasScrollPlayerView$b.class, "2")) {
          return;
       }
       int i = this.t(p0, this.z());
       int i1 = this.u(p0, this.B());
       int i2 = this.w((int)Math.sqrt((double)((i * i) + (i1 * i1))));
       if (i2 > 0) {
          p2.f((- i), (- i1), i2, this.i);
       }
       return;
    }
    public float v(DisplayMetrics p0){
       return this.q;
    }
    public int w(int p0){
       AtlasScrollPlayerView$b uob = AtlasScrollPlayerView$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.x(p0);
    }
}
