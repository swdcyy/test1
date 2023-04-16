package ni1.e;
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

public final class e implements a	// class@00332a
{

    public void e(){
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
       }else {
          a.p(p0, "source");
          a.p(p1, "result");
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxManager][refresh]success:"+p1.e());
       }
       return;
    }
}
