package hi2.f;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fi2.d;

public final class f	// class@002da3
{
    public String a;

    public void f(LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo p0){
       a.p(p0, "info");
       super();
       this.a = "";
       p0 = p0.badgeLabelBgColor;
       if (p0 != null) {
          this.a = p0;
       }
       return;
    }
    public final Integer a(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b.d(this.a);
    }
}
