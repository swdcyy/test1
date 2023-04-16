package com.yxcorp.gifshow.music.util.RealTimeLogger$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.music.util.RealTimeLogger;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class RealTimeLogger$a extends RecyclerView$r	// class@00207f
{
    public final RealTimeLogger a;

    public void RealTimeLogger$a(RealTimeLogger p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(RealTimeLogger$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, RealTimeLogger$a.class, "1")) {
          return;
       }
       if (!p1) {
          this.a.c();
       }
       return;
    }
}
