package du2.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.online.userlist.a;
import java.lang.Object;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.voiceparty.online.userlist.b;
import im8.f;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.k1;

public final class a implements View$OnClickListener	// class@00259d
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a f = tb.F;
       int i = 1;
       boolean b = (f != null && f.role != i)? true: false;
       k1.c(tb.H, tb.G, f, (tb.q.get().intValue() + i), tb.p.mApplyUserInfo.mId, tb.R8(), tb.V8(), b);
       return;
    }
}
