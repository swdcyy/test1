package com.kuaishou.live.basic.widget.MaxHeightRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View$MeasureSpec;

public class MaxHeightRecyclerView extends RecyclerView	// class@000d34
{
    public int b;

    public void MaxHeightRecyclerView(Context p0){
       super(p0);
    }
    public void MaxHeightRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void MaxHeightRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MaxHeightRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MaxHeightRecyclerView.class, "1")) {
          return;
       }
       int size = View$MeasureSpec.getSize(p1);
       MaxHeightRecyclerView tb = this.b;
       if (tb > null && tb < size) {
          p1 = View$MeasureSpec.makeMeasureSpec(this.b, View$MeasureSpec.getMode(p1));
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void setMaxHeight(int p0){
       this.b = p0;
    }
}
