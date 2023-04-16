package ik1.c0;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Boolean;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;

public class c0	// class@00291f
{

    public void c0(){
       super();
    }
    public static ClientContent$ContentPackage a(ClientContent$LiveStreamPackage p0,GiftMessage p1){
       ClientContent$ContentPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, c0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p0;
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = TextUtils.k(p1.mUser.mId);
       obj.userPackage = userPackage;
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.identity = String.valueOf(p1.mGiftId);
       obj.giftPackage = giftPackage;
       return obj;
    }
    public static ClientEvent$ElementPackage b(String p0,boolean p1,boolean p2){
       ClientEvent$ElementPackage obj;
       if (PatchProxy.isSupport(c0.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, c0.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       i3 oi3 = i3.f();
       oi3.c("has_head", Integer.valueOf(p1));
       oi3.c("has_friend_icon", Integer.valueOf(p2));
       obj.params = oi3.e();
       return obj;
    }
}
