package ih1.r;
import ok.h;
import java.lang.Object;
import ch1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.models.Gift;

public final class r implements h	// class@0028f2
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public Object apply(Object p0){
       Gift gift = PatchProxy.applyOneRefs(p0, this, r.class, "1");
       if (gift != PatchProxyResult.class) {
       }else if(p0 != null){
          p0 = p0.b();
       }else {
          int i = 0;
       }
       gift = p0;
       return gift;
    }
}
