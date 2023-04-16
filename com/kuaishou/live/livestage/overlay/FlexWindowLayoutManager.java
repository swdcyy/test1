package com.kuaishou.live.livestage.overlay.FlexWindowLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.livestage.overlay.FlexWindowLayoutManager$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.livestage.overlay.FlexWindowLayoutManager$a;
import brd.t;
import erd.g;
import crd.b;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt;
import com.kuaishou.live.livestage.ScaleType;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import fe3.a;
import me3.a;
import java.lang.Enum;
import java.lang.Math;
import android.view.View;
import fe3.g;
import androidx.recyclerview.widget.RecyclerView;

public final class FlexWindowLayoutManager extends RecyclerView$LayoutManager	// class@000bf2
{
    public ScaleType a;
    public float b;
    public float c;
    public int d;
    public int e;
    public final FlexWindowLayoutManager$b f;

    public void FlexWindowLayoutManager(FlexWindowLayoutManager$b p0){
       a.p(p0, "windowSizeLookUp");
       super();
       this.f = p0;
       ReactiveExtensionKt.f(p0.a, new FlexWindowLayoutManager$a(this));
       this.a = ScaleType.FIT_XY;
    }
    public boolean canScrollHorizontally(){
       return false;
    }
    public boolean canScrollVertically(){
       return false;
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, FlexWindowLayoutManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecyclerView$LayoutParams(-1, -1);
    }
    public boolean isAutoMeasureEnabled(){
       return false;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       float f;
       int i3;
       int i4;
       float f4;
       int i6;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FlexWindowLayoutManager.class, "2")) {
          return;
       }
       a.p(p0, "recycler");
       a.p(p1, "state");
       if (!p1.c()) {
          this.removeAndRecycleAllViews(p0);
          return;
       }else if(PatchProxy.applyVoid(null, this, FlexWindowLayoutManager.class, "3")){
          a uoa = this.f.d();
          i6 = uoa.a();
          f4 = (float)i6;
          float f5 = (float)this.getWidth() / f4;
          float f6 = (float)uoa.b();
          f = (float)this.getHeight() / f6;
          i3 = a.a[this.a.ordinal()];
          i4 = 2;
          if (i3 != 1) {
             if (i3 == i4) {
                this.b = f5;
                this.c = f;
             }
          }else {
             f5 = Math.min(f5, f);
             this.b = f5;
             this.c = f5;
          }
          f4 = (float)i4;
          this.d = (int)(((float)this.getWidth() - (this.b * f4)) / f4);
          this.e = (int)(((float)this.getHeight() - (this.c * f6)) / f4);
       }
       this.detachAndScrapAttachedViews(p0);
       int i = Math.min(this.f.a(), p1.c());
       int i1 = 0;
       while (i1 < i) {
          View view = p0.o(i1);
          a.o(view, "recycler.getViewForPosition\(position\)");
          g og = this.f.b(i1);
          this.addView(view);
          if (!PatchProxy.applyVoidTwoRefs(view, og, this, FlexWindowLayoutManager.class, "4")) {
             f = (float)og.b() * this.b;
             int i2 = (int)f;
             float f1 = (float)og.a() * this.c;
             i3 = (int)f1;
             float f2 = (float)og.c() * this.b;
             float f3 = (float)this.d + f2;
             i4 = (int)f3;
             f4 = (float)og.d() * this.c;
             f2 = (float)this.e + f4;
             int i5 = (int)f2;
             i6 = this.getWidth() - i2;
             int i7 = this.getHeight() - i3;
             this.measureChild(view, i6, i7);
             i7 = i4 + i2;
             int i8 = i5 + i3;
             i2 = i4;
             i3 = i5;
             this.layoutDecorated(view, i2, i3, i7, i8);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void scrollToPosition(int p0){
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
    }
}
