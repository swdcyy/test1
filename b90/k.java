package b90.k;
import erd.g;
import b90.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.logic.c;
import androidx.lifecycle.MutableLiveData;

public final class k implements g	// class@000afe
{
    public final e b;

    public void k(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          this.b.i.c(0);
          this.b.q0().setValue(p0);
       }
       return;
    }
}
