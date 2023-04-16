package du2.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.online.userlist.b;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import im8.f;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import du2.g;

public final class b implements View$OnClickListener	// class@00259e
{
    public final b b;

    public void b(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       b e = tb.E;
       if (e != null) {
          e.b(tb.p.mApplyUserInfo, tb.q.get().intValue(), tb.V8(), tb.p.mStatus);
       }
       return;
    }
}
