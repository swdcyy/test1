package h22.x;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.Object;
import android.content.DialogInterface;
import com.kuaishou.live.core.show.activityredpacket.r;
import lnc.c3$a;
import lnc.c3;

public final class x implements DialogInterface$OnShowListener	// class@002c13
{
    public final LiveActivityRedPacketPresenter b;

    public void x(LiveActivityRedPacketPresenter p0){
       this.b = p0;
    }
    public final void onShow(DialogInterface p0){
       c3.c(this.b.A, r.a);
    }
}
