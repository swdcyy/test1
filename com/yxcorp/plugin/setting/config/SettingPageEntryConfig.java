package com.yxcorp.plugin.setting.config.SettingPageEntryConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zf6.k;
import ra6.a;
import com.yxcorp.utility.TextUtils;

public class SettingPageEntryConfig implements Serializable	// class@00083e
{
    public String itemKey;
    public String mIconDarkUrl;
    public String mIconUrl;
    public String mLogName;
    public String mSchemeUrl;
    public String mTitleEn;
    public String mTitleSc;
    public String mTitleTc;
    public static final long serialVersionUID = 0x35e97215cecef4c9;

    public void SettingPageEntryConfig(){
       super();
    }
    public String getIconUrl(){
       Object obj = PatchProxy.apply(null, this, SettingPageEntryConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (k.d()) {
          return this.mIconDarkUrl;
       }
       return this.mIconUrl;
    }
    public String getTitle(){
       Object obj = PatchProxy.apply(null, this, SettingPageEntryConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a.d();
       if (i == 2) {
          return TextUtils.i(this.mTitleTc, this.mTitleSc);
       }
       if (i != 3) {
          return this.mTitleSc;
       }
       return TextUtils.i(this.mTitleEn, this.mTitleSc);
    }
}
