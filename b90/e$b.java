package b90.e$b;
import com.kuaishou.logic.c$a;
import b90.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.lifecycle.MutableLiveData;

public final class e$b implements c$a	// class@000af7
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.r0().setValue(Integer.valueOf(p0));
       return;
    }
}
