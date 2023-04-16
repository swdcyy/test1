package ju1.a;
import yh3.a;
import zs1.b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import ju1.a$a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;

public abstract class a extends a	// class@002c11
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final Observer d;
    public final b e;
    public final String f;

    public void a(b p0,String p1){
       a.p(p0, "pkCoreModel");
       a.p(p1, "viewKey");
       super();
       this.e = p0;
       this.f = p1;
       this.a = p0.l();
       this.b = p0.o();
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.c = mutableLiveD;
       a$a uoa = new a$a(this);
       this.d = uoa;
       mutableLiveD.observeForever(uoa);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.onCleared();
       this.c.removeObserver(this.d);
       return;
    }
    public final b u0(){
       return this.e;
    }
    public final MutableLiveData v0(){
       return this.a;
    }
    public final MutableLiveData w0(){
       return this.b;
    }
    public final String x0(){
       return this.f;
    }
    public void y0(){
    }
}
