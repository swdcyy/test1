package com.yxcorp.login.http.response.ResetSelectResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.login.http.response.ResetSelectUser;
import com.kwai.framework.model.user.User;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.login.http.response.CheckAntispamResponse;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.util.HashMap;
import com.kwai.framework.model.user.UserInfo;

public class ResetSelectResponse implements Serializable	// class@001ad4
{
    public String mAccountToken;
    public String mCountryCode;
    public List mMultiRetrieveUserInfo;
    public String mPhone;
    public int mResult;
    public int mUserIndex;
    public static final long serialVersionUID = 0x7aa5b2135c09e1f2;

    public void ResetSelectResponse(){
       super();
    }
    public String getCurrentAuthToken(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ResetSelectResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mMultiRetrieveUserInfo)) {
          return objArray;
       }
       return this.mMultiRetrieveUserInfo.get(this.mUserIndex).mAuthToken;
    }
    public User getCurrentUser(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ResetSelectResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mMultiRetrieveUserInfo)) {
          return objArray;
       }
       return this.mMultiRetrieveUserInfo.get(this.mUserIndex).toUser();
    }
    public List toMultiRetrieveUser(){
       ArrayList obj = PatchProxy.apply(null, this, ResetSelectResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mMultiRetrieveUserInfo.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().toUser());
       }
       return obj;
    }
    public LoginUserResponse transformLoginUserResponse(CheckAntispamResponse p0){
       LoginUserResponse obj = PatchProxy.applyOneRefs(p0, this, ResetSelectResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LoginUserResponse();
       obj.mMultiRetrieveUserInfo = this.toMultiRetrieveUser();
       HashMap hashMap = new HashMap();
       if (p0 != null) {
          hashMap.put("resetToken", p0.mUser.mAuthToken);
          obj.mUserInfo = UserInfo.convertFromQUser(p0.mUser.toUser());
       }
       obj.mTokenResetInfo = hashMap;
       return obj;
    }
}
