package n21.g;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;

public class g	// class@00328a
{

    public void g(){
       super();
    }
    public static ClientContent$ContentPackage a(ClientContent$LiveStreamPackage p0,String p1,int p2,String p3){
       ClientContent$ContentPackage obj;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, g.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.id = p1;
       moreInfoPack.type = String.valueOf(p2);
       moreInfoPack.params = TextUtils.k(p3);
       obj.liveStreamPackage = p0;
       obj.moreInfoPackage = moreInfoPack;
       return obj;
    }
    public static ClientEvent$ElementPackage b(){
       ClientEvent$ElementPackage obj = PatchProxy.apply(null, null, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "LIVE_ACTIVITY_PENDANT_BUTTON";
       return obj;
    }
}
