package hl2.e;
import java.lang.Object;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo;
import com.kuaishou.live.core.show.template.LiveActivityPopupDialog;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.lang.Integer;

public final class e	// class@002dbf
{

    public void e(){
       super();
    }
    public static LiveActivityPopupDialog a(UserInfos$PicUrl[] p0,LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo p1){
       LiveActivityPopupDialog obj = null;
       CDNUrl[] obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, e.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       CDNUrl[] uCDNUrlArray = e0.i(p0);
       obj1 = (p1 == null)? obj: e0.i(p1.webpUrl);
       int i = 0;
       int i1 = (p1 == null)? 0: p1.translateX;
       int i2 = (p1 == null)? 0: p1.translateY;
       int i3 = (p1 == null)? 0: p1.loopCount;
       if (PatchProxy.isSupport(LiveActivityPopupDialog.class)) {
          Object[] objArray = new Object[]{uCDNUrlArray,obj1,Integer.valueOf(i1),Integer.valueOf(i2),Integer.valueOf(i3)};
          obj = PatchProxy.apply(objArray, obj, LiveActivityPopupDialog.class, "2");
          if (obj != PatchProxyResult.class) {
          label_0074 :
             return obj;
          }
       }
       obj = new LiveActivityPopupDialog();
       obj.w = uCDNUrlArray;
       obj.x = obj1;
       obj.y = i1;
       obj.z = i2;
       obj.A = i3;
       goto label_0074 ;
    }
}
