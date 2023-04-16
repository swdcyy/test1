package a72.g;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.livestream.message.nano.SCLiveActivityPushV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import d61.h0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;

public class g	// class@000077
{

    public void g(){
       super();
    }
    public static ClientContent$ContentPackage a(ClientContent$LiveStreamPackage p0,SCLiveActivityPushV2 p1){
       ClientContent$ContentPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p0;
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = p1.activityId;
       moreInfoPack.identity = h0.a(p1.targetLiveStreamId);
       moreInfoPack.type = String.valueOf(p1.bizType);
       moreInfoPack.extraInfo = p1.extraInfo;
       obj.moreInfoPackage = moreInfoPack;
       ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
       ksOrderInfoP.ksOrderId = p1.ksOrderId;
       obj.ksOrderInfoPackage = ksOrderInfoP;
       return obj;
    }
}
