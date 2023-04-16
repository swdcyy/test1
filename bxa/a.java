package bxa.a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorVoipQoSSliceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import gj3.a;
import k2b.u1;

public final class a implements Runnable	// class@000486
{
    public final String b;

    public void a(String p0){
       this.b = p0;
    }
    public final void run(){
       ClientStat$AnchorVoipQoSSliceStatEvent uAnchorVoipQ = new ClientStat$AnchorVoipQoSSliceStatEvent();
       uAnchorVoipQ.livePushQosInfo = this.b;
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.anchorVoipQosSliceStatEvent = uAnchorVoipQ;
       u1.k0(statPackage, a.a());
    }
}
