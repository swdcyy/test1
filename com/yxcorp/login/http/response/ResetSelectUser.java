package com.yxcorp.login.http.response.ResetSelectUser;
import com.kwai.feature.api.social.relation.model.SimpleUserInfo;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;

public class ResetSelectUser extends SimpleUserInfo	// class@001ad5
{
    public String mAuthToken;
    public static final long serialVersionUID = 0x8ffb608f60736e16;

    public void ResetSelectUser(){
       super();
    }
    public User toUser(){
       Object obj = PatchProxy.apply(null, this, ResetSelectUser.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       User user = new User(this.userId, this.mUserName, "", this.headUrl, this.headUrls);
       return obj;
    }
}
