package ce8.e;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;
import ce8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;
import ce8.d;
import java.lang.Runnable;
import zi8.d1;
import java.util.Objects;
import ce8.c;
import dc8.u;
import ce8.b;

public class e extends ViewModel	// class@0003ff
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final a g;

    public void e(){
       super();
       this.a = new MutableLiveData();
       this.b = new MutableLiveData(Boolean.FALSE);
       this.c = new MutableLiveData();
       this.d = new MutableLiveData();
       this.e = new MutableLiveData();
       this.f = new MutableLiveData();
       this.g = new a(this);
    }
    public boolean o0(){
       Boolean obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.getValue();
       boolean b = (obj != null && obj.booleanValue())? true: false;
       return b;
    }
    public LiveData p0(){
       return this.c;
    }
    public LiveData q0(){
       return this.f;
    }
    public LiveData r0(){
       return this.d;
    }
    public LiveData s0(){
       return this.e;
    }
    public LiveData t0(){
       return this.a;
    }
    public void u0(){
       if (PatchProxy.applyVoid(null, this, e.class, "9")) {
          return;
       }
       d1.f(new d(this));
       return;
    }
    public void v0(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       e tg = this.g;
       Objects.requireNonNull(tg);
       d1.f(new c(tg));
       return;
    }
    public void w0(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.c.postValue(p0);
       return;
    }
    public void x0(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       this.d.postValue(p0);
       return;
    }
    public void y0(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       e tg = this.g;
       Objects.requireNonNull(tg);
       d1.f(new b(tg));
       this.a.postValue(p0);
       return;
    }
}
