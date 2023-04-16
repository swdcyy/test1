package com.kwai.live.gzone.guess.kshell.d0$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.live.gzone.guess.kshell.d0;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class d0$a extends RecyclerView$r	// class@000d2d
{
    public final d0 a;

    public void d0$a(d0 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(d0$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, d0$a.class, "1")) {
          return;
       }
       if (p1) {
          return;
       }
       d0$a ta = this.a;
       if (ta.f == null) {
          ta.c();
       }
       return;
    }
}
