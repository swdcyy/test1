package d6b.d$h;
import erd.g;
import d6b.d;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;

public final class d$h implements g	// class@00245d
{
    public final d b;

    public void d$h(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$h.class, "1")) {
       }else if(d.P8(this.b).getActivity() != null){
          p0 = this.b;
          p0.J = true;
          p0.V8(p0.A);
       }
       return;
    }
}
