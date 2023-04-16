package ds2.f;
import erd.g;
import ds2.d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;

public final class f implements g	// class@00258f
{
    public final d b;

    public void f(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else if(p0 instanceof KwaiException && p0.mErrorCode == 601){
          this.b.y0();
       }
       return;
    }
}
