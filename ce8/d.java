package ce8.d;
import java.lang.Runnable;
import ce8.e;
import java.lang.Object;
import java.util.Objects;
import ce8.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import dc8.u;

public final class d implements Runnable	// class@0003fe
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void run(){
       e g = this.b.g;
       Objects.requireNonNull(g);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Boolean.FALSE, g, uoa, "2") && g.a.o0())) {
          u value = g.a().getValue();
          if (value == null) {
             value = new u();
             value.b = true;
          }
          u b = value.b;
          if (b != null) {
             if (g.b == null) {
                g.b = Boolean.valueOf(b);
             }
             value.b = false;
             g.a().postValue(value);
          }
       }
    label_0050 :
       return;
    }
}
