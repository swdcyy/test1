package com.kuaishou.live.core.voiceparty.playway.shared.widget.FixGridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.GridLayoutManager$LayoutParams;

public final class FixGridLayoutManager extends GridLayoutManager	// class@001891
{
    public final int A;
    public final int B;

    public void FixGridLayoutManager(Context p0,int p1,int p2,int p3,int p4){
       a.p(p0, "context");
       super(p0, p1, p4, false);
       this.A = p2;
       this.B = p3;
    }
    public void FixGridLayoutManager(Context p0,int p1,int p2,int p3,int p4,int p5,u p6){
       int i = (p5 & 0x10)? 1: p4;
       super(p0, p1, p2, p3, i);
       return;
    }
    public boolean canScrollHorizontally(){
       return false;
    }
    public boolean canScrollVertically(){
       return false;
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, FixGridLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.generateDefaultLayoutParams();
       return new GridLayoutManager$LayoutParams(this.A, this.B);
    }
}
