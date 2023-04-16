package com.yxcorp.gifshow.hotspot.utils.a$b;
import androidx.recyclerview.widget.o;
import com.yxcorp.gifshow.hotspot.utils.a;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Math;
import android.view.animation.Interpolator;
import android.util.DisplayMetrics;

public class a$b extends o	// class@0018f0
{
    public final a q;

    public void a$b(a p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$b.class, "1")) {
          return;
       }
       a$b tq = this.q;
       a j = tq.j;
       if (j == null) {
          return;
       }
       int[] ointArray = tq.c(j.getLayoutManager(), p0);
       int i = ointArray[0];
       int i1 = ointArray[1];
       int i2 = this.w(Math.max(Math.abs(i), Math.abs(i1)));
       if (i2 > 0) {
          p2.f(i, i1, i2, this.j);
       }
       return;
    }
    public float v(DisplayMetrics p0){
       return (150.00f / (float)p0.densityDpi);
    }
}
