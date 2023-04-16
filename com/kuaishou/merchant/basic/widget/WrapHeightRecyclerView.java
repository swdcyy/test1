package com.kuaishou.merchant.basic.widget.WrapHeightRecyclerView;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import androidx.recyclerview.widget.RecyclerView;

public class WrapHeightRecyclerView extends WatchDispatchDrawRecyclerView	// class@0015fc
{

    public void WrapHeightRecyclerView(Context p0){
       super(p0);
    }
    public void WrapHeightRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void WrapHeightRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(WrapHeightRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, WrapHeightRecyclerView.class, "1")) {
          return;
       }
       if (this.getLayoutParams().height == -2) {
          super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(0, 0));
       }else {
          super.onMeasure(p0, p1);
       }
       return;
    }
}
