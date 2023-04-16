package ir1.c;
import yh3.a;
import nq1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import java.util.ArrayList;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.util.HashMap;
import brd.t;
import io.reactivex.BackpressureStrategy;
import androidx.lifecycle.LiveData;
import sn1.a;
import ir1.c$a;
import erd.g;
import crd.b;
import krd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;

public class c extends a	// class@002986
{
    public a a;
    public final List b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;

    public void c(a p0){
       a.p(p0, "basicModel");
       super();
       this.a = new a();
       this.b = new ArrayList();
       this.c = new MutableLiveData(Boolean.FALSE);
       this.d = new MutableLiveData(new ArrayList());
       this.e = new MutableLiveData(new HashMap());
       this.f = a.a(p0.b(), null, 1, null);
       this.g = a.a(p0.f(), null, 1, null);
       this.h = a.a(p0.d(), null, 1, null);
       b uob = p0.c().subscribe(new c$a(this));
       a.o(uob, "basicModel.roomInfoObser¡­nfoList\(it\)\n      }\n    }");
       a.b(this.a, uob);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       super.onCleared();
       this.a.d();
       return;
    }
    public final LiveData u0(){
       return this.c;
    }
    public final LiveData v0(){
       return this.e;
    }
    public final LiveData w0(){
       return this.d;
    }
}
