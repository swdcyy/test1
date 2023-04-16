package com.kwai.feature.api.live.floatingscreen.data.LiveEnterRoomEffectBackgroudPicInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$StretchablePicture;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;

public class LiveEnterRoomEffectBackgroudPicInfo implements Serializable	// class@000fb5
{
    public int mInsetBottomDp;
    public int mInsetLeftDp;
    public int mInsetRightDp;
    public int mInsetTopDp;
    public CDNUrl[] mPicUrls;
    public static final long serialVersionUID = 0x9083466be3753c94;

    public void LiveEnterRoomEffectBackgroudPicInfo(){
       super();
    }
    public static LiveEnterRoomEffectBackgroudPicInfo convertFromProto(LiveCommonNoticeMessages$StretchablePicture p0){
       LiveEnterRoomEffectBackgroudPicInfo obj = PatchProxy.applyOneRefs(p0, null, LiveEnterRoomEffectBackgroudPicInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveEnterRoomEffectBackgroudPicInfo();
       obj.mInsetLeftDp = p0.insetLeftDp;
       obj.mInsetRightDp = p0.insetRightDp;
       obj.mInsetTopDp = p0.insetTopDp;
       obj.mInsetBottomDp = p0.insetBottomDp;
       p0 = p0.picUrl;
       if (p0 != null) {
          obj.mPicUrls = LiveEnterRoomEffectBackgroudPicInfo.parsePicUrl(p0);
       }
       return obj;
    }
    public static CDNUrl[] parsePicUrl(UserInfos$PicUrl[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveEnterRoomEffectBackgroudPicInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (p0 == null || p0.length <= 0) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[i];
          return uCDNUrlArray;
       }else {
          CDNUrl[] uCDNUrlArray1 = new CDNUrl[p0.length];
          for (; i < p0.length; i = i + 1) {
             uCDNUrlArray1[i] = new CDNUrl(p0[i].cdn, p0[i].url, p0[i].ip, p0[i].urlPattern);
          }
          return uCDNUrlArray1;
       }
    }
}
