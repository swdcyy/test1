package a83.a$c;
import java.lang.Runnable;
import a83.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import kg1.f;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import a83.a$b;

public final class a$c implements Runnable	// class@00007f
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$c.class, "1")) {
          return;
       }
       if (this.b.d()) {
          a$c tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(objArray, tb, a.class, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             LiveData liveData = tb.l.W2();
             a.o(liveData, "liveLiteFansGroupService.fansGroupStatusLiveData");
             Integer value = liveData.getValue();
             b = (value == null || (value.intValue() == 1 || (value != null && value.intValue() == 2)))? true: false;
          }
          if (b) {
          label_005f :
             this.b.a = false;
             return;
          }
       }
       this.b.m.d();
       goto label_005f ;
    }
}
