package hf9.f$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hf9.b;

public final class f$a implements b$a	// class@002641
{
    public static final f$a a;

    static {
       f$a.a = new f$a();
    }
    public void f$a(){
       super();
    }
    public Object getData(){
       b uob = PatchProxy.apply(null, this, f$a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(true);
       }
       return uob;
    }
}
