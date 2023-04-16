package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.b$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.b;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class b$a extends RecyclerView$r	// class@000818
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, b$a.class, "1")) {
          return;
       }
       if (!p1) {
          this.a.Z8();
       }
       return;
    }
}
