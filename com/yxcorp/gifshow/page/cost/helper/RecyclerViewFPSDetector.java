package com.yxcorp.gifshow.page.cost.helper.RecyclerViewFPSDetector;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.page.cost.helper.RecyclerViewFPSDetector$scrollListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RecyclerViewFPSDetector	// class@000e1e
{
    public final WeakReference a;
    public boolean b;
    public final p c;
    public final String d;

    public void RecyclerViewFPSDetector(RecyclerView p0,String p1){
       a.p(p0, "view");
       a.p(p1, "rubasKey");
       super();
       this.d = p1;
       this.a = new WeakReference(p0);
       this.c = s.c(new RecyclerViewFPSDetector$scrollListener$2(this));
    }
    public final String a(){
       return this.d;
    }
    public final RecyclerView$r b(){
       Object obj = PatchProxy.apply(null, this, RecyclerViewFPSDetector.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, RecyclerViewFPSDetector.class, "2")) {
          return;
       }
       RecyclerView recyclerView = this.a.get();
       if (recyclerView != null) {
          recyclerView.addOnScrollListener(this.b());
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, RecyclerViewFPSDetector.class, "3")) {
          return;
       }
       RecyclerView recyclerView = this.a.get();
       if (recyclerView != null) {
          recyclerView.removeOnScrollListener(this.b());
       }
       return;
    }
}
