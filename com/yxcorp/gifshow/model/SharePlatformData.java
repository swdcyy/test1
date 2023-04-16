package com.yxcorp.gifshow.model.SharePlatformData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import java.lang.StringBuilder;

public class SharePlatformData implements Serializable	// class@001e8e
{
    public SharePlatformData$ShareConfig mShareConfig;
    public String mShareId;
    public String mShareMethod;
    public String mShareMode;
    public String mSharePlatform;
    public static final long serialVersionUID = 0xb0a3f4fa52435610;

    public void SharePlatformData(){
       super();
    }
    public static int getH5MaxTitleLength(String p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, SharePlatformData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       switch (p0.hashCode()){
           case 0xd0ce8b26:
             if (p0.equals("wechat")) {
                i = 0;
             }else {
             }
             break;
           case 0x66c7f54:
             if (p0.equals("qq2.0")) {
                i = 1;
             }else {
             }
             break;
           case 0x671839d:
             if (p0.equals("qzone")) {
                i = 2;
             }else {
             }
             break;
           case 0x236c6a5a:
             if (p0.equals("wechat_moments")) {
                i = 3;
             }else {
             }
             break;
           default:
             i = -1;
       }
       switch (i){
           case 0:
           case 1:
             return 26;
           case 2:
           case 3:
             return 36;
           default:
             return -1;
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SharePlatformData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SharePlatformData{mShareId=\'"+this.mShareId+'''+", mSharePlatform=\'"+this.mSharePlatform+'''+", mShareMethod=\'"+this.mShareMethod+'''+", mShareMode=\'"+this.mShareMode+'''+", mShareConfig="+this.mShareConfig+'}';
    }
}
