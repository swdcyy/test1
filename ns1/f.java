package ns1.f;
import com.kuaishou.live.viewcontroller.ViewController;
import ns1.a;
import nsd.u;
import lnc.a1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkTeamFrameView;
import java.lang.Float;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import ns1.d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import cu1.d;
import ns1.b;
import androidx.lifecycle.Observer;
import ns1.c;
import qrd.l1;
import java.util.Objects;

public final class f extends ViewController	// class@0033b5
{
    public LiveMultiPkTeamFrameView j;
    public d k;
    public final float l;
    public final a m;

    public void f(float p0,a p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = (float)a1.d(0x7f070295);
       }
       a.p(p1, "teamFrameVm");
       super();
       this.l = p0;
       this.m = p1;
       return;
    }
    public void F2(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, f.class, str)) {
          return;
       }
       LiveMultiPkTeamFrameView liveMultiPkT = new LiveMultiPkTeamFrameView(Float.valueOf(this.l), this.D2(), null, 4, null);
       this.j = v0;
       this.R2(v0);
       f tj = this.j;
       String str1 = "teamFrameView";
       if (tj == null) {
          a.S(str1);
       }
       ViewGroup$LayoutParams layoutParams = tj.getLayoutParams();
       layoutParams.width = -1;
       layoutParams.height = -1;
       d uod = new d(this);
       f tj1 = this.j;
       if (tj1 == null) {
          a.S(str1);
       }
       f tm = this.m;
       if (!PatchProxy.applyVoidTwoRefs(tj1, tm, uod, d.class, str)) {
          a.p(tj1, str1);
          a.p(tm, "viewModel");
          d.a(tm.i()).observe(uod.b, new b(tj1));
          tm.L().observe(uod.b, new c(uod, tj1));
       }
       this.k = uod;
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "2")) {
          return;
       }
       f tk = this.k;
       if (tk == null) {
          a.S("teamFrameDataBinding");
       }
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, d.class, "4")) {
          tk.a();
       }
       return;
    }
}
