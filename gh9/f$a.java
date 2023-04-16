package gh9.f$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import gh9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gh9.g;

public final class f$a implements b$a	// class@002494
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
          og = new g(this.a.g2());
       }
       return og;
    }
}
