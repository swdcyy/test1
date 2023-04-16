package eja.r0;
import erd.g;
import eja.o0$b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eja.o0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import eja.q0;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class r0 implements g	// class@0026ef
{
    public final o0$b b;

    public void r0(o0$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r0.class, "1")) {
       }else {
          o0.P8(this.b.b).h0().post(new q0(this));
       }
       return;
    }
}
