package je9.b$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import je9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import je9.e;
import java.util.HashMap;
import java.util.Map;

public final class b$a implements b$a	// class@002a69
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       e uoe = PatchProxy.apply(null, this, b$a.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(new HashMap(this.a.r));
       }
       return uoe;
    }
}
