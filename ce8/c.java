package ce8.c;
import java.lang.Runnable;
import ce8.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ce8.e;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import dc8.u;
import java.lang.Boolean;

public final class c implements Runnable	// class@0003fd
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, a.class, "3")) {
       }else if(!tb.a.o0() || tb.b == null){
          u value = tb.a().getValue();
          if (value != null) {
             value.b = tb.b.booleanValue();
             tb.b = null;
             tb.a().postValue(value);
          }
       }
       return;
    }
}
