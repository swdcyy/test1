package com.yxcorp.login.http.response.SharedAccountInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;

public final class SharedAccountInfo implements Serializable	// class@001ad7
{
    public String mAvatar;
    public CDNUrl[] mAvatars;
    public String mSex;
    public String uid;
    public String userName;

    public void SharedAccountInfo(){
       super();
       this.uid = "";
    }
    public final User convertToQUser(){
       Object obj = PatchProxy.apply(null, this, SharedAccountInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       User user = new User(this.uid, this.userName, this.mSex, this.mAvatar, this.mAvatars);
       return obj;
    }
    public final String getMAvatar(){
       return this.mAvatar;
    }
    public final CDNUrl[] getMAvatars(){
       return this.mAvatars;
    }
    public final String getMSex(){
       return this.mSex;
    }
    public final String getUid(){
       return this.uid;
    }
    public final String getUserName(){
       return this.userName;
    }
    public final boolean isValid(){
       Object obj = PatchProxy.apply(null, this, SharedAccountInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.uid) ^ 0x01);
    }
    public final void setMAvatar(String p0){
       this.mAvatar = p0;
    }
    public final void setMAvatars(CDNUrl[] p0){
       this.mAvatars = p0;
    }
    public final void setMSex(String p0){
       this.mSex = p0;
    }
    public final void setUid(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SharedAccountInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.uid = p0;
       return;
    }
    public final void setUserName(String p0){
       this.userName = p0;
    }
}
