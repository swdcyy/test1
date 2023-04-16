package com.kuaishou.live.lite.recommendsidebar.panel.l$b;
import androidx.recyclerview.widget.RecyclerView$i;
import com.kuaishou.live.lite.recommendsidebar.panel.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView;
import yc3.q;
import java.lang.Runnable;
import android.view.ViewGroup;

public class l$b extends RecyclerView$i	// class@000b02
{
    public final l a;

    public void l$b(l p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, l$b.class, "1")) {
          return;
       }
       if (q.f(this.a.p.q().getItems())) {
          this.a.q = -1;
       }else {
          this.a.p.h0().post(new q(this));
       }
       return;
    }
}
