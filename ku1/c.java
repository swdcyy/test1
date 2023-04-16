package ku1.c;
import ju1.a;
import zs1.b;
import java.lang.String;
import du1.d;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import d61.l0;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import yh3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class c extends a	// class@002e05
{
    public final l0 g;
    public final LiveData h;

    public void c(b p0,String p1,d p2){
       a.p(p0, "pkCoreModel");
       a.p(p1, "viewKey");
       a.p(p2, "pkDelegate");
       super(p0, p1);
       l0 ol0 = l0.d("multi_pk_self_render_"+p2.getLiveStreamId());
       a.o(ol0, "SpVariable.ofBool\(\"multi¡­gate.getLiveStreamId\(\)}\"\)");
       this.g = ol0;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.h = mutableLiveD;
    }
    public void y0(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       if (!this.g.b(Boolean.FALSE).booleanValue()) {
          Boolean tRUE = Boolean.TRUE;
          this.r0(this.h).setValue(tRUE);
          this.g.i(tRUE);
       }
       return;
    }
}
