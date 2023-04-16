package com.yxcorp.gifshow.detail.comment.nonslide.CoordinatorLinearLayoutManager$a;
import androidx.recyclerview.widget.o;
import com.yxcorp.gifshow.detail.comment.nonslide.CoordinatorLinearLayoutManager;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import android.view.animation.Interpolator;

public class CoordinatorLinearLayoutManager$a extends o	// class@001392
{
    public final CoordinatorLinearLayoutManager q;

    public void CoordinatorLinearLayoutManager$a(CoordinatorLinearLayoutManager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CoordinatorLinearLayoutManager$a.class, "1")) {
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
}
