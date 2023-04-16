package com.yxcorp.gifshow.common.http.response.SocialShareUserInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Map;

public class SocialShareUserInfoResponse implements Serializable	// class@00117c
{
    public Map users;
    public static final long serialVersionUID = 0x8c57afc794acf131;

    public void SocialShareUserInfoResponse(){
       super();
    }
    public String toString(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, SocialShareUserInfoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "SocialShareUserInfoResponse{, users=";
       if (this.users != null) {
          objArray = this.users.size()+this.users.toString();
       }
       return obj+objArray+'}';
    }
}
