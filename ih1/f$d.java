package ih1.f$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class f$d implements g	// class@0028dc
{
    public static final f$d b;

    static {
       f$d.b = new f$d();
    }
    public void f$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$d.class, "1")) {
       }else {
          b.I(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxRepositories][prefetch]normalPager request error!!!", p0);
       }
       return;
    }
}
