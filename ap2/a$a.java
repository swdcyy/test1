package ap2.a$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorVoipQoSSliceStatEvent;
import org.json.JSONObject;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import jp3.a;
import k2b.u1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class a$a implements Runnable	// class@0002a4
{
    public final String b;

    public void a$a(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       try{
          ClientStat$AnchorVoipQoSSliceStatEvent uAnchorVoipQ = new ClientStat$AnchorVoipQoSSliceStatEvent();
          uAnchorVoipQ.livePushQosInfo = new JSONObject(this.b).toString();
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          statPackage.anchorVoipQosSliceStatEvent = uAnchorVoipQ;
          u1.k0(statPackage, a.h());
       }catch(org.json.JSONException e0){
          b.I(LiveLogTag.LIVE_VOICE_PARTY, "AryaQosObserver", e0);
       }
       return;
    }
}
