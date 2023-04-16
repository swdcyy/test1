package k7a.f;
import erd.g;
import k7a.h;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.util.Objects;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;

public final class f implements g	// class@002c0e
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b1;
       f tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = false;
       if (p0 == ActivityEvent.RESUME && tb.A != null) {
          tb.P8("repreload player when detail resume:");
          tb.A = b;
          tb.V8("resume");
       }else if(p0 == ActivityEvent.PAUSE){
          Object[] objArray = null;
          p0 = PatchProxy.apply(objArray, tb, h.class, "5");
          if (p0 != PatchProxyResult.class) {
             b1 = p0.booleanValue();
          }else {
             p0 = tb.v;
             if (p0 != null) {
                objArray = p0.getViewLifecycleOwnerLiveData().getValue();
             }
             if (objArray == null || objArray.getLifecycle().getCurrentState() == Lifecycle$State.DESTROYED) {
                b = 1;
             }
             b1 = b;
          }
          if (!b1) {
             tb.P8("remove player when detail PAUSE:");
             tb.S8(true);
          }
       }
       return;
    }
}
