package com.kuaishou.krn.page.a;
import com.kuaishou.krn.page.c$b;
import com.kuaishou.krn.page.KrnFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.delegate.KrnDelegate;
import java.util.Objects;
import ik0.j;
import android.view.ViewGroup;
import java.lang.Throwable;
import mj0.c;
import lj0.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;

public class a implements c$b	// class@000910
{
    public final KrnFragment a;

    public void a(KrnFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       if (this.a.getKrnDelegate() != null) {
          a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, KrnFragment.class, "28")) {
             ta.o.a();
          }
          this.a.D();
       }
       return;
    }
    public void b(ViewGroup p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, KrnFragment.class, "42")) {
          ta.o.b();
       }
       a ta1 = this.a;
       c.a.a(ta1.e, p1, ta1.getKrnContext());
       return;
    }
}
