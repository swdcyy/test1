package com.kwai.user.base.http.response.IMChatTargetBasicResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.user.base.http.response.IMChatTargetBasicResponse$IMChatTargetData;
import java.util.Collections;

public class IMChatTargetBasicResponse implements Serializable	// class@001988
{
    public IMChatTargetBasicResponse$IMChatTargetData mData;
    public static final long serialVersionUID = 0x74dd558179edcd4;

    public void IMChatTargetBasicResponse(){
       super();
    }
    public List getUsers(){
       IMChatTargetBasicResponse obj = PatchProxy.apply(null, this, IMChatTargetBasicResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mData;
       if (obj != null) {
          IMChatTargetBasicResponse$IMChatTargetData mUsers = obj.mUsers;
          if (mUsers != null) {
             return mUsers;
          }
       }
       return Collections.emptyList();
    }
}
