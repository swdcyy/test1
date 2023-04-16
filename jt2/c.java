package jt2.c;
import yh3.a;
import ts2.f;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.micseats.pendant.shared.MicSeatPendantViewModel$findStateInterface$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import jt2.c$a;
import z0.a;
import androidx.lifecycle.Transformations;
import jt2.c$b;
import jt2.c$c;
import jt2.c$d;

public class c extends a	// class@00334d
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;

    public void c(f p0,LiveData p1){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatId");
       super();
       LiveData liveData = IMicSeatStateServiceKt.b(p0);
       this.a = liveData;
       LiveData liveData1 = PatchProxy.applyTwoRefs(liveData, p1, this, c.class, "1");
       if (liveData1 != PatchProxyResult.class) {
       }else {
          liveData1 = LiveDataOperators.b(liveData, p1, MicSeatPendantViewModel$findStateInterface$1.INSTANCE);
       }
       this.b = liveData1;
       liveData = Transformations.map(liveData1, new c$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.c = liveData;
       LiveData liveData2 = Transformations.map(liveData, new c$b());
       a.h(liveData2, "Transformations.map\(this\) { transform\(it\) }");
       this.d = liveData2;
       liveData = Transformations.map(liveData, new c$c());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.e = liveData;
       liveData = Transformations.map(liveData1, new c$d());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.f = liveData;
       return;
    }
    public final LiveData u0(){
       return this.e;
    }
    public final LiveData v0(){
       return this.c;
    }
    public final LiveData w0(){
       return this.d;
    }
}
