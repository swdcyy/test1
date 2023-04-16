package c12.h;
import mq5.h;
import c12.k;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.util.Objects;

public final class h implements h	// class@0004a1
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       Objects.requireNonNull(this.b);
    }
}
