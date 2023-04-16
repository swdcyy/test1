package com.kwai.live.gzone.guess.kshell.q$b;
import com.kwai.live.gzone.guess.kshell.q$g;
import com.kwai.live.gzone.guess.kshell.q;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup$LayoutParams;

public class q$b implements q$g	// class@000d5d
{
    public final q a;

    public void q$b(q p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$b.class, "2")) {
          return;
       }
       q m = this.a.M;
       if (m != null) {
          m.m1(p0);
          this.a.M.k0();
       }
       return;
    }
    public void b(View p0,ViewGroup$LayoutParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q$b.class, "1")) {
          return;
       }
       q m = this.a.M;
       if (m != null) {
          m.Q0(p0, p1);
          this.a.M.k0();
       }
       return;
    }
}
