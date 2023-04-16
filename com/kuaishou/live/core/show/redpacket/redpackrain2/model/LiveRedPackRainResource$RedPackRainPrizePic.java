package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainPrizePic;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainPrizePic;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import java.util.ArrayList;

public class LiveRedPackRainResource$RedPackRainPrizePic implements Serializable	// class@000f07
{
    public CDNUrl[] mPicUrls;
    public String mPrizeId;
    public int mPrizeType;
    public static final long serialVersionUID = 0xa038c176e6a335a3;

    public void LiveRedPackRainResource$RedPackRainPrizePic(){
       super();
    }
    public static LiveRedPackRainResource$RedPackRainPrizePic fromSCMessage(LiveRedPackRainMessage$RedPackRainPrizePic p0){
       Object obj = null;
       LiveRedPackRainResource$RedPackRainPrizePic obj1 = PatchProxy.applyOneRefs(p0, obj, LiveRedPackRainResource$RedPackRainPrizePic.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null || j.h(p0.picUrl)) {
          return obj;
       }
       obj1 = new LiveRedPackRainResource$RedPackRainPrizePic();
       obj1.mPicUrls = e0.i(p0.picUrl);
       obj1.mPrizeId = p0.prizeId;
       obj1.mPrizeType = p0.prizeType;
       return obj1;
    }
    public static List fromSCMessage(LiveRedPackRainMessage$RedPackRainPrizePic[] p0){
       Object obj = null;
       ArrayList obj1 = PatchProxy.applyOneRefs(p0, obj, LiveRedPackRainResource$RedPackRainPrizePic.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (j.h(p0)) {
          return obj;
       }
       obj1 = new ArrayList();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          LiveRedPackRainResource$RedPackRainPrizePic redPackRainP = LiveRedPackRainResource$RedPackRainPrizePic.fromSCMessage(p0[i]);
          if (redPackRainP != null) {
             obj1.add(redPackRainP);
          }
          i = i + 1;
       }
       return obj1;
    }
}
