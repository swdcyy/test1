package kt1.d;
import java.lang.Object;
import trd.j;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import kt1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pu1.d;
import kt1.e;
import msd.a;

public final class d	// class@002df5
{
    public final j a;
    public final MutableLiveData b;
    public final LiveData c;

    public void d(){
       super();
       this.a = new j();
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.b = mutableLiveD;
       this.c = mutableLiveD;
    }
    public final LiveData a(){
       return this.c;
    }
    public final void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "animWrapper");
       this.a.add(p0);
       this.b.setValue(new Object());
       return;
    }
    public final void c(d p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.b(new b(p0, p1, null, p2));
       return;
    }
}
