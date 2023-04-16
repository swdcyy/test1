package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$a;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainPicture;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import lnc.e0;

public final class LiveRedPackRainResource$a	// class@000f09
{

    public void LiveRedPackRainResource$a(){
       super();
    }
    public static CDNUrl[] a(LiveRedPackRainMessage$RedPackRainPicture p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPackRainResource$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.picUrl;
          if (p0 != null) {
             return e0.i(p0);
          }
       }
       return null;
    }
}
