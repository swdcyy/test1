package cu1.d$a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.MediatorLiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;

public final class d$a implements Observer	// class@001e51
{
    public final MediatorLiveData b;

    public void d$a(MediatorLiveData p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.b.setValue(p0);
       }
       return;
    }
}
