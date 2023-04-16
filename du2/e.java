package du2.e;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.online.userlist.b;
import java.lang.Object;
import android.view.View;
import im8.f;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import du2.g;

public final class e implements View$OnClickListener	// class@0025a1
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       b e = tb.E;
       if (e != null) {
          e.c(tb.p, tb.q.get().intValue(), tb.r, tb.V8());
       }
       return;
    }
}
