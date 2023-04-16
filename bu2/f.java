package bu2.f;
import erd.g;
import sx1.a;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import java.lang.Object;
import com.kwai.user.base.chat.target.bean.UserSimpleInfo;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class f implements g	// class@000459
{
    public final a b;
    public final VoicePartyOnlineUser c;
    public final g d;
    public final int e;

    public void f(a p0,VoicePartyOnlineUser p1,g p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       this.b.d(p0);
       this.c.mStatus = 2;
       this.d.l0(this.e);
    }
}
