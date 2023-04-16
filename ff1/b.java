package ff1.b;
import ok.o;
import ok.x;
import java.lang.Object;
import df1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;

public class b implements o	// class@002318
{
    public final x b;

    public void b(x p0){
       super();
       this.b = p0;
    }
    public boolean apply(Object p0){
       boolean b;
       p0 = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else {
          p0 = this.b;
          if (p0 != null) {
             p0 = p0.get();
             if (p0 != null && p0.mStatus != 3) {
                b = false;
             }
          }
          b = true;
       }
       return b;
    }
}
