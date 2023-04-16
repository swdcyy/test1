package com.yxcorp.gifshow.widget.KwaiHorizontalRecycleView;
import androidx.recyclerview.widget.SafeRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$n;
import k17.b;

public class KwaiHorizontalRecycleView extends SafeRecyclerView	// class@00186e
{
    public RecyclerView$n c;

    public void KwaiHorizontalRecycleView(Context p0){
       super(p0, null);
    }
    public void KwaiHorizontalRecycleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiHorizontalRecycleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.S1, p2, 0);
       int dimensionPix = typedArray.getDimensionPixelSize(1, a1.e(8.00f));
       int dimensionPix1 = typedArray.getDimensionPixelSize(2, 0);
       int dimensionPix2 = typedArray.getDimensionPixelSize(0, 0);
       typedArray.recycle();
       this.setOverScrollMode(2);
       this.setHorizontalScrollBarEnabled(0);
       this.setVerticalScrollBarEnabled(0);
       this.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
       this.x(dimensionPix, dimensionPix1, dimensionPix2);
    }
    public void setItemDecoration(int p0){
       if (PatchProxy.isSupport(KwaiHorizontalRecycleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiHorizontalRecycleView.class, "1")) {
          return;
       }
       if (!PatchProxy.isSupport(KwaiHorizontalRecycleView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(0), this, KwaiHorizontalRecycleView.class, "2")) {
          this.x(p0, 0, 0);
       }
       return;
    }
    public void x(int p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiHorizontalRecycleView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiHorizontalRecycleView.class, "3")) {
          return;
       }
       KwaiHorizontalRecycleView tc = this.c;
       if (tc != null) {
          this.removeItemDecoration(tc);
       }
       b uob = new b(0, p1, p2, p0);
       this.c = uob;
       this.addItemDecoration(uob);
       return;
    }
}
