package ff1.c;
import ok.o;
import java.lang.String;
import java.lang.Object;
import df1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.follow.cache.c;

public class c implements o	// class@002319
{
    public final String b;

    public void c(String p0){
       super();
       this.b = p0;
    }
    public boolean apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       boolean b = (p0 != PatchProxyResult.class)? p0.booleanValue(): c.b().c(this.b) ^ 0x01;
       return b;
    }
}
