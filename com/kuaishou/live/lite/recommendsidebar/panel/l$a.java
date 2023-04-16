package com.kuaishou.live.lite.recommendsidebar.panel.l$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.lite.recommendsidebar.panel.l;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class l$a extends RecyclerView$r	// class@000b01
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, l$a.class, "1")) {
          return;
       }
       if (!p1) {
          this.a.P8();
       }
       return;
    }
}
