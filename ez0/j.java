package ez0.j;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import mk1.h;
import tk1.b;

public final class j implements g	// class@00224f
{
    public final LiveAudienceGiftBoxFragment b;

    public void j(LiveAudienceGiftBoxFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveAudienceGiftBoxFragment.class, "24")) {
       }else if(QCurrentUser.me().isLogined()){
          tb.z.B.h(true);
       }
       return;
    }
}
