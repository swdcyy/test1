package com.kwai.live.gzone.common.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.live.gzone.common.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class a$a extends RecyclerView$r	// class@000cab
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, a$a.class, "1")) {
          return;
       }
       if (p1) {
          return;
       }
       a$a ta = this.a;
       if (ta.f == null) {
          ta.c();
       }
       return;
    }
}
