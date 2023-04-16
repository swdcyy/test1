package ih1.g;
import yg1.a;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class g implements a	// class@0028e2
{

    public void g(){
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
       }else {
          a.p(p0, "source");
          a.p(p1, "result");
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxRepositories][prefetch]normalPager response "+p1.e());
       }
       return;
    }
}
