package aj1.b;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public final class b	// class@0000af
{
    public final String a;
    public final k b;

    public void b(k p0){
       a.p(p0, "liveStreamPackage");
       super();
       this.b = p0;
       this.a = "GIFT_GROUP_DIY_INPUT_CARD";
    }
    public final ClientContent$GiftPackage a(int p0){
       ClientContent$GiftPackage obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$GiftPackage();
       obj.identity = String.valueOf(p0);
       return obj;
    }
}
