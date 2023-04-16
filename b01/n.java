package b01.n;
import java.lang.Object;
import k2b.e0;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveProp;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class n	// class@0002f1
{

    public void n(){
       super();
    }
    public static void a(e0 p0,LiveProp p1,ClientContent$LiveStreamPackage p2,ClientContent$LiveVoicePartyPackageV2 p3,int p4,int p5){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, on, "3")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "GIFT_ITEM";
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.index = String.valueOf(p5);
       moreInfoPack.type = "PROP_LIST_PANEL";
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.sourceType = p4;
       giftPackage.identity = p1.mPropId;
       giftPackage.position = p1.mPropPosition;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       uContentPack.moreInfoPackage = moreInfoPack;
       uContentPack.giftPackage = giftPackage;
       uContentPack.liveVoicePartyPackage = p3;
       u1.C0("", p0, 3, uElementPack, uContentPack);
       return;
    }
}
