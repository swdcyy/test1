package com.yxcorp.plugin.search.widget.CenterLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.plugin.search.widget.CenterLayoutManager$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class CenterLayoutManager extends LinearLayoutManager	// class@0007bf
{
    public int r;

    public void CenterLayoutManager(Context p0){
       super(p0);
    }
    public void CenterLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
    }
    public void CenterLayoutManager(Context p0,int p1,boolean p2,int p3){
       super(p0, p1, p2);
       this.r = p3;
    }
    public void CenterLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(CenterLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CenterLayoutManager.class, "1")) {
          return;
       }
       CenterLayoutManager$a uoa = new CenterLayoutManager$a(this, p0.getContext());
       uoa.p(p2);
       this.startSmoothScroll(uoa);
       return;
    }
}
