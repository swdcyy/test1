package com.yxcorp.gifshow.editor.fine.tuning.widget.ScrollSpeedLinearLayoutManger;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.editor.fine.tuning.widget.ScrollSpeedLinearLayoutManger$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class ScrollSpeedLinearLayoutManger extends LinearLayoutManager	// class@001baf
{
    public float r;

    public void ScrollSpeedLinearLayoutManger(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       this.r = 0x3f19999a;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(ScrollSpeedLinearLayoutManger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ScrollSpeedLinearLayoutManger.class, "1")) {
          return;
       }
       ScrollSpeedLinearLayoutManger$a uoa = new ScrollSpeedLinearLayoutManger$a(this, p0.getContext());
       uoa.p(p2);
       this.startSmoothScroll(uoa);
       return;
    }
}
