package com.yxcorp.gifshow.prettify.widget.RecycleViewWithIndicator$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.prettify.widget.RecycleViewWithIndicator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;

public class RecycleViewWithIndicator$a extends RecyclerView$r	// class@0011df
{
    public final RecycleViewWithIndicator a;

    public void RecycleViewWithIndicator$a(RecycleViewWithIndicator p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       RecycleViewWithIndicator$a uoa = RecycleViewWithIndicator$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("RecycleViewWithIndicator", "on scrollStateChanged:"+p1, objArray);
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(RecycleViewWithIndicator$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RecycleViewWithIndicator$a.class, "2")) {
          return;
       }
       if (!p1) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("RecycleViewWithIndicator", "on Scrolled", objArray);
       this.a.m();
       return;
    }
}
