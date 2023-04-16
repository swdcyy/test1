package hz8.g;
import erd.g;
import hz8.d;
import java.lang.Object;
import zca.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;

public final class g implements g	// class@0025fb
{
    public final d b;

    public void g(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else if(a.g(d.P8(this.b), p0.c)){
          this.b.v = p0.a ^ 0x01;
       }
       return;
    }
}
