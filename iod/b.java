package iod.b;
import androidx.lifecycle.ViewModelProvider$Factory;
import ynd.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import iod.a;
import java.lang.IllegalArgumentException;

public final class b implements ViewModelProvider$Factory	// class@0014f9
{
    public final e a;

    public void b(e p0){
       a.p(p0, "dataOption");
       super();
       this.a = p0;
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       if (a.g(p0, a.class)) {
          return new a(this.a);
       }
       throw new IllegalArgumentException("Donot Use TextKeyboardViewModelFactory to create non-TextKeyboardViewModel");
    }
}
