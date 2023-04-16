package q90.f$c$a;
import androidx.lifecycle.Observer;
import brd.v;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import brd.g;

public final class f$c$a implements Observer	// class@002989
{
    public final v b;

    public void f$c$a(v p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c$a.class, "1")) {
       }else if(a.g(p0.getSecond(), Boolean.FALSE)){
          this.b.onNext(Boolean.TRUE);
          this.b.onComplete();
       }
       return;
    }
}
