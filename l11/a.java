package l11.a;
import mq5.h;
import l11.b;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.String;
import m11.l;

public final class a implements h	// class@002e53
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       this.b.P.d("AUTHOR_END_LIVE");
    }
}