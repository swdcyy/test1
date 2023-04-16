package com.yxcorp.gifshow.ad.response.ReserveAppResponse$AppInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ReserveAppResponse$AppInfo implements Serializable	// class@0017e5
{
    public String mAppIconUrl;
    public String mAppName;
    public String mDownloadUrl;
    public boolean mExpire;
    public String mOrderId;
    public String mPackageName;
    public static final long serialVersionUID = 0x64764422c260714a;

    public void ReserveAppResponse$AppInfo(){
       super();
       this.mAppName = "";
       this.mAppIconUrl = "";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReserveAppResponse$AppInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AppInfo{mOrderId="+this.mOrderId+", mExpire="+this.mExpire+", mUrl=\'"+this.mDownloadUrl+'''+", mAppName=\'"+this.mAppName+'''+", mPackageName=\'"+this.mPackageName+'''+", mAppIconUrl=\'"+this.mAppIconUrl+'''+'}';
    }
}
