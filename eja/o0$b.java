package eja.o0$b;
import erd.g;
import eja.o0;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import crd.b;
import lnc.b9;
import brd.t;
import eja.p0;
import erd.r;
import eja.r0;
import z99.b;
import androidx.recyclerview.widget.RecyclerView;
import eja.s0;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class o0$b implements g	// class@0026e4
{
    public final o0 b;

    public void o0$b(o0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0$b.class, "1")) {
       }else if(!o0.P8(this.b).Vg().a()){
          b9.a(this.b.s);
          p0 = this.b;
          p0.s = o0.P8(p0).Vg().g().filter(p0.b).subscribe(new r0(this), new b());
       }else {
          o0.P8(this.b).h0().post(new s0(this));
       }
       return;
    }
}
