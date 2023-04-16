package ch2.a$a;
import uw1.g;
import ch2.a;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import ch2.n;
import java.util.Iterator;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import java.util.Objects;
import uw1.f;
import ch2.b;

public class a$a implements g	// class@000531
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.a.r.v4().iterator();
       while (iterator.hasNext()) {
          LiveKrnRedPackMessage$LiveKrnRedPack liveKrnRedPa = iterator.next();
          if (liveKrnRedPa != null) {
             a$a ta = this.a;
             Objects.requireNonNull(ta);
             b uob = PatchProxy.applyOneRefs(liveKrnRedPa, ta, a.class, "4");
             if (uob != PatchProxyResult.class) {
             }else {
                uob = new b(ta, liveKrnRedPa);
             }
             obj.add(uob);
          }
       }
       return obj;
    }
}
