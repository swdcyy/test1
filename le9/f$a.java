package le9.f$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import le9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import le9.g;
import java.util.Map;

public final class f$a implements b$a	// class@002dbf
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       g og = PatchProxy.apply(null, this, f$a.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          f$a ta = this.a;
          og = new g(ta.p, ta.q);
       }
       return og;
    }
}
