package nfd.j$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nfd.j;

public class j$a implements ViewModelProvider$Factory	// class@001dbc
{

    public void j$a(){
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, j$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new j();
    }
}
