package g52.e$a;
import g52.i;
import g52.e;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g52.d;
import io.reactivex.g;
import t45.d;
import brd.z;

public class e$a implements i	// class@002a6f
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public t a(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new d(this)).observeOn(d.a);
    }
}
