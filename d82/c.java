package d82.c;
import erd.g;
import d82.f;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import d82.f$a;
import android.app.Dialog;

public final class c implements g	// class@00248b
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       b.y(LiveLogTag.LIVE_ESCROW.appendTag("LiveAudienceEscrowEntryDialog"), "failed to getEscrowEntryInfo", p0);
       p0 = tb.h;
       if (p0 != null) {
          p0.onResult(false);
       }
       tb.dismiss();
       return;
    }
}
