package gi9.d;
import erd.g;
import gi9.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import w46.b;
import com.yxcorp.gifshow.util.PostUtils;

public final class d implements g	// class@0024aa
{
    public final b b;

    public void d(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().u("VPController", p0, objArray);
          PostUtils.D("VPController", "", p0);
       }
       return;
    }
}
