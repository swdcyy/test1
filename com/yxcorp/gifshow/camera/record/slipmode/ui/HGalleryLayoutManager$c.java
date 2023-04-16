package com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$c;
import androidx.recyclerview.widget.o;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import androidx.recyclerview.widget.RecyclerView$x;
import java.lang.Math;
import android.view.animation.Interpolator;
import android.util.DisplayMetrics;

public class HGalleryLayoutManager$c extends o	// class@000f26
{

    public void HGalleryLayoutManager$c(Context p0){
       super(p0);
    }
    public static int D(View p0,RecyclerView$LayoutManager p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, HGalleryLayoutManager$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p1 == null || !p1.canScrollHorizontally()) {
          return i;
       }
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       int i1 = p1.getDecoratedLeft(p0) - layoutParams.leftMargin;
       int paddingLeft = p1.getPaddingLeft();
       int i2 = p1.getWidth() - p1.getPaddingRight();
       int i3 = (p1.getDecoratedRight(p0) + layoutParams.rightMargin) - i1;
       if (!i3) {
          return i;
       }
       float f = (float)i3;
       i1 = (i1 + (int)(f / 2.00f)) - (int)((float)(i2 - paddingLeft) / 2.00f);
       float f1 = (float)i1;
       float s = HGalleryLayoutManager.s;
       if (f1 - (f + s) > 0) {
       label_0058 :
          f1 = f1 - s;
       }else {
          float f2 = 0x3f800000;
          if (i1 >= 0 && f1 - (f + s) <= 0) {
             s = s * ((f2 * f1) / (f + s));
             goto label_0058 ;
          }else if(i1 <= 0 && f1 - ((float)(- i3) - s) >= 0){
             f1 = f1 + (((((f2 * f) / (f + s)) * f1) / (float)(i3 * -1)) * s);
          }else {
             f1 = f1 + s;
          }
       }
       i3 = (int)f1;
       return i3;
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       int i1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, HGalleryLayoutManager$c.class, "3")) {
          return;
       }
       int i = HGalleryLayoutManager$c.D(p0, this.e());
       RecyclerView$LayoutManager obj = PatchProxy.applyOneRefs(p0, this, HGalleryLayoutManager$c.class, "2");
       if (obj != PatchProxyResult.class) {
          i1 = obj.intValue();
       }else {
          obj = this.e();
          if (obj == null || !obj.canScrollVertically()) {
             i1 = 0;
          }else {
             RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
             int i3 = obj.getDecoratedTop(p0) - layoutParams.topMargin;
             float f = 2.00f;
             i1 = (int)((float)((obj.getHeight() - obj.getPaddingBottom()) - obj.getPaddingTop()) / f) - (i3 + (int)((float)((obj.getDecoratedBottom(p0) + layoutParams.bottomMargin) - i3) / f));
          }
       }
       int i2 = this.w((int)Math.sqrt((double)((i * i) + (i1 * i1))));
       if (i2 > 0) {
          p2.f(i, (- i1), i2, this.j);
       }
       return;
    }
    public float v(DisplayMetrics p0){
       return (100.00f / (float)p0.densityDpi);
    }
}
