package com.kwai.user.base.http.response.IMChatTargetResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.user.base.http.response.IMChatTargetResponse$IMChatTargetData;
import java.util.Collections;

public class IMChatTargetResponse implements Serializable	// class@00198c
{
    public IMChatTargetResponse$IMChatTargetData mData;
    public static final long serialVersionUID = 0xd5e3ebab78f61da2;

    public void IMChatTargetResponse(){
       super();
    }
    public List getUsers(){
       IMChatTargetResponse obj = PatchProxy.apply(null, this, IMChatTargetResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mData;
       if (obj != null) {
          IMChatTargetResponse$IMChatTargetData mUsers = obj.mUsers;
          if (mUsers != null) {
             return mUsers;
          }
       }
       return Collections.emptyList();
    }
}
