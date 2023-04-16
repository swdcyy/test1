package com.yxcorp.gifshow.v3.widget.CenterLayoutManager;
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
import com.yxcorp.gifshow.v3.widget.CenterLayoutManager$b;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.widget.CenterLayoutManager$a;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class CenterLayoutManager extends LinearLayoutManager	// class@00162d
{
    public float r;
    public int s;
    public int t;

    public void CenterLayoutManager(Context p0,int p1){
       super(p0);
       this.r = 100.00f;
       this.s = 0;
       this.t = 0;
       this.s = p1;
    }
    public void CenterLayoutManager(Context p0,int p1,boolean p2,int p3){
       super(p0, p1, p2);
       this.r = 100.00f;
       this.s = 0;
       this.t = 0;
       this.s = p3;
    }
    public void CenterLayoutManager(Context p0,AttributeSet p1,int p2,int p3,int p4){
       super(p0, p1, p2, p3);
       this.r = 100.00f;
       this.s = 0;
       this.t = 0;
       this.s = p4;
    }
    public void W0(float p0){
       this.r = p0;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(CenterLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CenterLayoutManager.class, "1")) {
          return;
       }
       CenterLayoutManager$b uob = (this.k())? new CenterLayoutManager$b(this, p0.getContext()): new CenterLayoutManager$a(this, p0.getContext());
       uob.p(p2);
       this.startSmoothScroll(uob);
       return;
    }
}
