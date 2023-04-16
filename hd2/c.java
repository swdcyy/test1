package hd2.c;
import aq5.b;
import com.kuaishou.live.core.show.pk.a;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import org.json.JSONObject;

public final class c implements b	// class@002d61
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       c tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), tb, uoa, "10") || (p0 == AudienceBizRelation.PK && !tb.P8()))) {
          if (p1) {
             tb.S8(0x186ac, null);
          }else {
             tb.S8(0x186aa, null);
          }
       }
       return;
    }
}
