package com.kwai.framework.model.user.UserExtraInfo$RoleInfo;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class UserExtraInfo$RoleInfo implements Serializable	// class@001747
{
    public CDNUrl[] mHeadUrls;
    public String mRoleName;
    public int mRoleType;
    public static final long serialVersionUID = 0xa0964d1c443ce0b6;

    public void UserExtraInfo$RoleInfo(){
       super();
       this.mRoleName = "";
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.mHeadUrls = uCDNUrlArray;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UserExtraInfo$RoleInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RoleInfo{mRoleType="+this.mRoleType+", mRoleName=\'"+this.mRoleName+'''+", mHeadUrls="+Arrays.toString(this.mHeadUrls)+'}';
    }
}
