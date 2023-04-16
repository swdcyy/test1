package eod.e$d;
import jn9.b$b;
import eod.e;
import java.lang.Object;
import nn9.a;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import androidx.lifecycle.MutableLiveData;
import iod.a;
import androidx.lifecycle.LiveData;
import jod.f;
import ynd.g;
import nn9.b;
import nn9.d;
import jn9.b$b$a;

public final class e$d implements b$b	// class@000dbb
{
    public final e a;

    public void e$d(e p0){
       this.a = p0;
       super();
    }
    public void a(a p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$d.class, "1")) {
          return;
       }
       a.p(p0, "state");
       a.p(p1, "result");
       if (p0.a() == LoadingStatus.DATA_LOADING_FINISH && (a.g(this.a.h.u0().getValue(), this.a.i.a().d()) ^ 0x01)) {
          this.a.h.u0().setValue(this.a.i.a().d());
       }
       return;
    }
    public void b(b p0,b p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, e$d.class, "2");
    }
    public void c(d p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$d.class, "3")) {
          return;
       }
       a.p(p0, "newState");
       b$b$a.b(this, p0, p1);
       return;
    }
}
