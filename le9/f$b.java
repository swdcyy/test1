package le9.f$b;
import com.yxcorp.gifshow.camera.record.base.b$a;
import le9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import le9.e;

public final class f$b implements b$a	// class@002dc0
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       e uoe = PatchProxy.apply(null, this, f$b.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(this.a.r);
       }
       return uoe;
    }
}
