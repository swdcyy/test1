package com.kuaishou.live.model.LiveUserInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.socket.nano.UserInfos$PicUrl;

public class LiveUserInfo implements Serializable	// class@000cf2
{
    public String mAvatar;
    public CDNUrl[] mAvatars;
    public String mId;
    public String mKwaiId;
    public String mName;
    public String mSex;
    public static final long serialVersionUID = 0x2f0707d9eac8ead3;

    public void LiveUserInfo(){
       super();
    }
    public void LiveUserInfo(String p0,String p1,String p2,String p3,CDNUrl[] p4){
       super();
       if (p0 == null) {
          p0 = "0";
       }
       this.mId = p0;
       if (p1 == null) {
          p1 = "";
       }
       this.mName = p1;
       if (p2 == null) {
          p2 = "U";
       }
       this.mSex = p2;
       this.mAvatar = p3;
       this.mAvatars = p4;
       return;
    }
    public static LiveUserInfo convertFromProto(UserInfos$UserInfo p0){
       LiveUserInfo obj = PatchProxy.applyOneRefs(p0, null, LiveUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveUserInfo();
       obj.mId = String.valueOf(p0.userId);
       obj.mName = p0.userName;
       obj.mSex = p0.userGender;
       p0 = p0.headUrls;
       if (p0 != null) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[p0.length];
          obj.mAvatars = uCDNUrlArray;
          int len = p0.length;
          int i1 = 0;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = p0[i];
             obj.mAvatars[i1] = new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern);
             i1 = i1 + 1;
          }
       }
       return obj;
    }
    public String getId(){
       return this.mId;
    }
    public String getName(){
       return this.mName;
    }
}
