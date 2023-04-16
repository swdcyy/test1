package com.yxcorp.gifshow.relation.explore.view.StackLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Math;
import android.view.View;
import android.content.res.Resources;
import eg.a;

public class StackLayoutManager extends RecyclerView$LayoutManager	// class@00188e
{
    public int a;
    public static int b = 4;
    public static float c = 0.081000;
    public static float d = 0.000000;

    public void StackLayoutManager(){
       super();
       this.a = 0;
    }
    public static int N(int p0,float p1,int p2,int p3){
       return ((p3 * p0) + ((int)((float)p2 * (0x3f800000 - p1)) / 2));
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, StackLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecyclerView$LayoutParams(-1, -1);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StackLayoutManager.class, "2")) {
          return;
       }
       this.detachAndScrapAttachedViews(p0);
       int i = Math.min(this.getItemCount(), StackLayoutManager.b);
       if (i < 1) {
          return;
       }
       int i1 = 0;
       while (i1 < i) {
          View view = p0.o(i1);
          if (this.a == null) {
             this.a = a.c(StackLayoutManager.d, view.getResources());
          }
          this.addView(view, 0);
          this.measureChildWithMargins(view, 0, 0);
          View int i2 = this.getWidth() - this.getDecoratedMeasuredWidth(view);
          int i3 = i2 / 2;
          i2 = this.getHeight() - this.getDecoratedMeasuredHeight(view);
          int i4 = i2 / 2;
          int i5 = i3 + this.getDecoratedMeasuredWidth(view);
          int i6 = i4 + this.getDecoratedMeasuredHeight(view);
          this.layoutDecorated(view, i3, i4, i5, i6);
          if (this.getItemCount() >= StackLayoutManager.b) {
             i2 = i - 1;
             if (i1 == i2) {
                i2 = i - 2;
             label_0072 :
                float f = StackLayoutManager.c * (float)i2;
                float f1 = 0x3f800000 - f;
                view.setScaleX(f1);
                view.setScaleY(f1);
                view.setTranslationY((float)StackLayoutManager.N(i2, f1, view.getHeight(), this.a));
                i2 = view.findViewById(R.id.mask);
                if (i2 != null) {
                   if (!i1) {
                      i2.setVisibility(8);
                   }else if(i1 == 1){
                      i2.setBackgroundResource(R.color.arg_RES_7f061d87);
                      i2.setVisibility(0);
                   }else if(i1 == 2 || i1 == 3){
                      i2.setBackgroundResource(R.color.arg_RES_7f060c40);
                      i2.setVisibility(0);
                   }
                }
                i1 = i1 + 1;
             }
          }
          i2 = i1;
          goto label_0072 ;
       }
       return;
    }
}
