package ez0.g0$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class g0$c implements g	// class@002245
{
    public static final g0$c b;

    static {
       g0$c.b = new g0$c();
    }
    public void g0$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$c.class, "1")) {
       }else {
          b.I(LiveLogTag.GIFT, "LiveAudienceGiftPanelUpdateManager#handleRefreshGiftPanel", p0);
       }
       return;
    }
}
