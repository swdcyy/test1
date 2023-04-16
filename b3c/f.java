package b3c.f;
import yd7.a;
import b3c.g;
import ee7.d;
import com.kwai.page.component.load.LoadState;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.page.component.a;
import b3c.h;
import b3c.e;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ae7.a;

public class f extends a	// class@00039f
{
    public final g b;

    public void f(g p0,d p1){
       this.b = p0;
       super(p1);
    }
    public LoadState b(){
       f obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       h c = obj.c.c;
       e uoe = new e(obj);
       obj.k("addStateObserver");
       c.observeForever(uoe);
       obj.j.e(c, uoe);
       return LoadState.UNLOAD;
    }
}
