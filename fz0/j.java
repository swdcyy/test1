package fz0.j;
import erd.g;
import fz0.k;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class j implements g	// class@0023e5
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          tb.V = p0.mLiveGiftPanelWarningConfig;
       }else {
          b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBottomBarEntryPresenterV2] [onLiveBind] getTimeConsumingAudienceStatus response is null");
       }
       return;
    }
}
