package a44.c;
import p14.c;
import a44.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveItemVolumeChangeSignal;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.Map;

public final class c	// class@000025
{

    public static final b a(c p0){
       c c;
       Object obj = null;
       b obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new b();
       obj1.status = Integer.valueOf(p0.a);
       c = p0.c;
       if (c != null) {
          obj1.lastVolume = Integer.valueOf(c.lastVolume);
          obj1.volume = Integer.valueOf(p0.c.volume);
          obj1.displayIntervalMillis = Integer.valueOf(p0.c.displayIntervalMillis);
          LiveRoomSignalMessage$LiveItemVolumeChangeSignal itemInfo = p0.c.itemInfo;
          if (itemInfo != null) {
             obj1.imageArray = e0.i(itemInfo.smallHotSaleAnimateUrl);
          }
       }
       p0 = p0.d;
       p0 = (p0 != null)? p0.get("data"): obj;
       if (p0 instanceof String) {
          obj = p0;
       }
       obj1.dynamicDataStr = obj;
       return obj1;
    }
}
