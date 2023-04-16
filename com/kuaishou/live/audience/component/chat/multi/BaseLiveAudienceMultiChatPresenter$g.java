package com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$g;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorVoipQoSSliceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import ow0.a;
import k2b.u1;

public final class BaseLiveAudienceMultiChatPresenter$g implements Runnable	// class@000a7f
{
    public final int b;
    public final String c;

    public void BaseLiveAudienceMultiChatPresenter$g(int p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceMultiChatPresenter$g.class, "1")) {
          return;
       }
       try{
          if (this.b == 1) {
             JSONObject jSONObject = new JSONObject(this.c);
             jSONObject.put("vtxOrigCapH", 320);
             jSONObject.put("vtxOrigCapW", 180);
             jSONObject.put("vtxPrevH", 320);
             jSONObject.put("vtxPrevW", 180);
             ClientStat$AnchorVoipQoSSliceStatEvent uAnchorVoipQ = new ClientStat$AnchorVoipQoSSliceStatEvent();
             uAnchorVoipQ.livePushQosInfo = jSONObject.toString();
             ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
             statPackage.anchorVoipQosSliceStatEvent = uAnchorVoipQ;
             u1.k0(statPackage, a.c());
          }
          return;
       }catch(org.json.JSONException e0){
       }
    }
}
