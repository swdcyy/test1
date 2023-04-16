package com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$g;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import q87.c;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;

public final class RecyclerTabWithIndicatorView$g implements Runnable	// class@0018b3
{
    public final RecyclerTabWithIndicatorView b;
    public final View c;
    public final boolean d;

    public void RecyclerTabWithIndicatorView$g(RecyclerTabWithIndicatorView p0,View p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, RecyclerTabWithIndicatorView$g.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("RecyclerTabWithIndicatorView", "scroller to run", objArray);
       if (this.c == this.b.o) {
          Object[] objArray1 = new Object[i];
          a.D().s("RecyclerTabWithIndicatorView", "scroller to view === mSelectedView", objArray1);
          this.b.k();
          this.b.j(this.c, this.d);
       }
       return;
    }
}
