package com.yxcorp.gifshow.widget.e0;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$c;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$b;
import java.util.List;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class e0 extends m	// class@001976
{
    public final RecyclerTabWithIndicatorView$c c;
    public final int d;
    public final RecyclerTabWithIndicatorView$f e;

    public void e0(RecyclerTabWithIndicatorView$c p0,int p1,RecyclerTabWithIndicatorView$f p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
          return;
       }
       a.p(p0, "v");
       RecyclerTabWithIndicatorView y = this.c.e.y;
       RecyclerTabWithIndicatorView recyclerTabW = 1;
       if (y != null && y.a() == recyclerTabW) {
          return;
       }
       RecyclerTabWithIndicatorView$c e = this.c.e;
       e0 td = this.d;
       if (e.p == td) {
          recyclerTabW = e.y;
          if (recyclerTabW != null) {
             recyclerTabW.b(e.s.get(td));
          }
          return;
       }else {
          RecyclerView$ViewHolder itemView = this.e.itemView;
          a.o(itemView, "holder.itemView");
          e.t(itemView, this.d, recyclerTabW, recyclerTabW);
          e = this.c.e;
          recyclerTabW = e.y;
          if (recyclerTabW != null) {
             recyclerTabW.c(e.s.get(this.d));
          }
          return;
       }
    }
}
