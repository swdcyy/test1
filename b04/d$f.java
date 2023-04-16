package b04.d$f;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import uw3.a;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b04.d;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.IllegalArgumentException;

public class d$f implements ViewModelProvider$Factory	// class@0002f8
{
    public a a;

    public void d$f(FragmentActivity p0){
       super();
       this.a = a.p0(p0);
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isAssignableFrom(d.class)) {
          return new d(this.a.o0());
       }
       throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
