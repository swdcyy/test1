package hn1.e0$g;
import erd.g;
import hn1.e0;
import java.lang.Object;
import hn1.d0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.d0$d;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import zh3.c;
import yh3.a;
import kotlin.jvm.internal.a;

public final class e0$g implements g	// class@002725
{
    public final e0 b;

    public void e0$g(e0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$g.class, "1")) {
       }else if(p0 instanceof d0$d){
          this.b.a.setValue(Boolean.FALSE);
       }
       e0$g tb = this.b;
       a.o(p0, "it");
       tb.s0(tb.u0()).q(p0);
       return;
    }
}
