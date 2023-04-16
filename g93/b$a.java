package g93.b$a;
import f93.a;
import g93.b;
import java.lang.Object;
import f93.e;
import f93.b;
import n93.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import g93.g;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardInfo;
import vq5.d;
import com.kuaishou.live.lite.benefitcard.LiveLiteBenefitCardType;

public final class b$a implements a	// class@002ad3
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public a a(e p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cardData");
       a.p(p1, "delegate");
       return new g(p0.b, this.a.d, p1);
    }
    public LiveLiteBenefitCardType getType(){
       return LiveLiteBenefitCardType.COMMON;
    }
}
