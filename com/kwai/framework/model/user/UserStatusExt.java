package com.kwai.framework.model.user.UserStatusExt;
import java.io.Serializable;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pa6.e0;
import java.util.Map;
import java.util.HashMap;

public class UserStatusExt implements Serializable, g	// class@001779
{
    public String mMoodTips;
    public UserStatus mUserStatusMeta;
    public static final long serialVersionUID = 0x6ddd1840cc2fa545;

    public void UserStatusExt(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserStatusExt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, UserStatusExt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(UserStatusExt.class, new e0());
       }else {
          obj.put(UserStatusExt.class, null);
       }
       return obj;
    }
}
