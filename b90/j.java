package b90.j;
import erd.g;
import b90.e;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.logic.c;
import androidx.lifecycle.MutableLiveData;

public final class j implements g	// class@000afd
{
    public final e b;

    public void j(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          a.o(p0, "totalProgress");
          this.b.i.c(p0.intValue());
          if (p0.intValue() == 100) {
             this.b.s0().setValue(this.b.h);
          }
       }
       return;
    }
}
