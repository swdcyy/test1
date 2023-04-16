package abc.z;
import erd.a;
import com.yxcorp.gifshow.relation.intimate.dialog.p;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.util.Objects;
import crd.b;

public final class z implements a	// class@0000e5
{
    public final p b;
    public final ProgressFragment c;

    public void z(p p0,ProgressFragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       z tb = this.b;
       Objects.requireNonNull(tb);
       this.c.dismiss();
       tb.t.dispose();
       tb.t = null;
    }
}
