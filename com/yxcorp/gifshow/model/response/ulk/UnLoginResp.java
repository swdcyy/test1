package com.yxcorp.gifshow.model.response.ulk.UnLoginResp;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class UnLoginResp implements Serializable	// class@001f9c
{
    public String mEmail;
    public String mPassword;
    public String mUserId;
    public static final long serialVersionUID = 0xab1beab33caa8bfd;

    public void UnLoginResp(){
       super();
    }
    public String getReportStr(){
       JsonObject obj = PatchProxy.apply(null, this, UnLoginResp.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("userId", this.mUserId);
       obj.c0("email", this.mEmail);
       obj.c0("password", this.mPassword);
       return obj.toString();
    }
}
