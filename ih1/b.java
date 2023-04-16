package ih1.b;
import ok.h;
import java.lang.Object;
import ch1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.models.Gift;

public final class b implements h	// class@0028d4
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public Object apply(Object p0){
       Gift gift = PatchProxy.applyOneRefs(p0, this, b.class, "1");
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
