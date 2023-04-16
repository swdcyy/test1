package com.kwai.nearby.local.presenter.b$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.nearby.local.presenter.b;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import y8c.g;
import y8c.q;
import sc7.b0;

public class b$a extends RecyclerView$r	// class@000fa9
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1 == 1) {
          b$a ta = this.a;
          ta.R8(ta.v, ta.x.g7());
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$a.class, "2")) {
          return;
       }
       if (p2 > 0) {
          b$a ta = this.a;
          ta.R8(ta.v, ta.x.g7());
       }
       return;
    }
}
