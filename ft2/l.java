package ft2.l;
import android.content.DialogInterface$OnDismissListener;
import ft2.h;
import com.kuaishou.livestream.message.nano.SCMicSeatsInvitationInfo;
import java.lang.Object;
import android.content.DialogInterface;

public final class l implements DialogInterface$OnDismissListener	// class@0029d3
{
    public final h b;
    public final SCMicSeatsInvitationInfo c;

    public void l(h p0,SCMicSeatsInvitationInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       p0.f = null;
    }
}
