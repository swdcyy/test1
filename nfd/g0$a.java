package nfd.g0$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nfd.g0;

public class g0$a implements ViewModelProvider$Factory	// class@001daa
{

    public void g0$a(){
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, g0$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new g0();
    }
}
