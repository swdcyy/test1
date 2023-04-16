package cu1.e;
import yh3.a;
import eu1.a;
import androidx.lifecycle.LifecycleOwner;
import zs1.b;
import du1.d;
import st1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cu1.e$a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ut1.j;
import gu1.i;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import l02.f;

public final class e extends a	// class@001e54
{
    public final Observer a;
    public final i b;
    public final LiveData c;
    public boolean d;
    public final a e;
    public final LifecycleOwner f;
    public final b g;
    public final d h;

    public void e(a p0,LifecycleOwner p1,b p2,d p3,a p4){
       a.p(p0, "liveMultiPkLayoutDataModel");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "pkCoreModel");
       a.p(p3, "pkDelegate");
       a.p(p4, "logDelegate");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       e$a uoa = new e$a(this);
       this.a = uoa;
       p0.a().observeForever(uoa);
       i oi = (p2.w().i != null)? new i(p2, p3, p4): null;
       this.b = oi;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       return;
    }
    public void onCleared(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "3")) {
          return;
       }
       super.onCleared();
       this.c.removeObservers(this.f);
       this.e.a().removeObserver(this.a);
       e tb = this.b;
       if (tb != null && !PatchProxy.applyVoid(objArray, tb, i.class, "1")) {
          tb.d.d1(tb.b);
       }
       return;
    }
    public final LiveData u0(){
       return this.c;
    }
}
