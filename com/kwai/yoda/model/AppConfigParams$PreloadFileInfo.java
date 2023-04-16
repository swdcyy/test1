package com.kwai.yoda.model.AppConfigParams$PreloadFileInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import yb7.o;

public class AppConfigParams$PreloadFileInfo implements Serializable	// class@0012b8
{
    public String mMd5;
    public String mName;
    public String mPlatform;
    public String mUrl;
    public static final long serialVersionUID = 0xae9a546f76371b33;

    public void AppConfigParams$PreloadFileInfo(){
       super();
       this.mMd5 = "";
       this.mUrl = "";
       this.mName = "";
       this.mPlatform = "";
    }
    public boolean isMatchedPlatform(){
       Object obj = PatchProxy.apply(null, this, AppConfigParams$PreloadFileInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!o.c(this.mPlatform) && (("ALL").equalsIgnoreCase(this.mPlatform) || ("ANDROID_PHONE").equalsIgnoreCase(this.mPlatform)))? true: false;
       return b;
    }
}
