package ck4.a$b;
import androidx.lifecycle.ViewModelProvider$Factory;
import ck4.a;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fk4.b;
import java.lang.ref.WeakReference;
import androidx.fragment.app.FragmentActivity;
import ak4.a;
import fk4.a;

public final class a$b implements ViewModelProvider$Factory	// class@000488
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new b(new WeakReference(this.a.f0()), this.a.i0());
    }
}
