package com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl;
import android.view.View;
import com.yxcorp.plugin.search.widget.UnScrollableRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.tkruntime.v8.V8Object;
import tx4.y;
import android.content.Context;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import com.tkruntime.v8.V8Function;
import lnc.a1;

public class TKSearchScrollViewPluginImpl$c extends RecyclerView$r	// class@000776
{
    public final View a;
    public final UnScrollableRecyclerView b;
    public final TKSearchScrollViewPluginImpl c;

    public void TKSearchScrollViewPluginImpl$c(TKSearchScrollViewPluginImpl p0,View p1,UnScrollableRecyclerView p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(RecyclerView p0,int p1){
       TKSearchScrollViewPluginImpl$c uoc = TKSearchScrollViewPluginImpl$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (!p1) {
          TKSearchScrollViewPluginImpl$c tc = this.c;
          tc.B40(this.a, tc.l);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(TKSearchScrollViewPluginImpl$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKSearchScrollViewPluginImpl$c.class, "2")) {
          return;
       }
       TKSearchScrollViewPluginImpl$c tc = this.c;
       tc.k = tc.k + p1;
       if (y.a(tc.t)) {
          Object[] objArray = new Object[]{Integer.valueOf(n.P(this.b.getContext(), (float)this.c.k)),Integer.valueOf(0)};
          this.c.t.call(null, objArray);
       }
       tc = this.c;
       if (tc.k >= a1.e((float)tc.l)) {
          tc.k = 0;
          this.b.scrollToPosition(0);
          this.b.smoothScrollToPosition(1);
       }
       return;
    }
}
