package ih1.n;
import ok.h;
import java.lang.Object;
import ch1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.models.Gift;

public final class n implements h	// class@0028ed
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public Object apply(Object p0){
       Gift gift = PatchProxy.applyOneRefs(p0, this, n.class, "1");
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
