package com.kuaishou.krn.page.b;
import com.kuaishou.krn.page.c$b;
import com.kuaishou.krn.page.KrnReactContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.lang.Throwable;
import mj0.c;
import lj0.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kuaishou.krn.page.KrnReactContainerView$a;

public class b implements c$b	// class@000911
{
    public final KrnReactContainerView a;

    public void b(KrnReactContainerView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.a.D();
       return;
    }
    public void b(ViewGroup p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       b ta = this.a;
       c.a.a(ta.c, p1, ta.getKrnContext());
       b ta1 = this.a;
       KrnReactContainerView g = ta1.g;
       if (g != null) {
          g.a(ta1.c);
       }
       return;
    }
}
