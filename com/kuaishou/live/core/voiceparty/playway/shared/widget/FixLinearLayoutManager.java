package com.kuaishou.live.core.voiceparty.playway.shared.widget.FixLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FixLinearLayoutManager extends LinearLayoutManager	// class@001892
{
    public final int r;
    public final int s;

    public void FixLinearLayoutManager(Context p0,int p1,int p2,int p3){
       a.p(p0, "context");
       super(p0, p3, false);
       this.r = p1;
       this.s = p2;
    }
    public void FixLinearLayoutManager(Context p0,int p1,int p2,int p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = 0;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, FixLinearLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.generateDefaultLayoutParams();
       return new RecyclerView$LayoutParams(this.r, this.s);
    }
}
