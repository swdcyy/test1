package com.yxcorp.plugin.setting.config.AboutUsEntryConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra6.a;
import com.yxcorp.utility.TextUtils;

public class AboutUsEntryConfig implements Serializable	// class@00083d
{
    public String mExtParam;
    public String mLinkUrl;
    public String mNameEn;
    public String mNameSc;
    public String mNameTc;
    public String mSubtitle;
    public int mType;
    public static final long serialVersionUID = 0xe27100ef6769a195;

    public void AboutUsEntryConfig(){
       super();
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, AboutUsEntryConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a.d();
       if (i == 2) {
          return TextUtils.i(this.mNameTc, this.mNameSc);
       }
       if (i != 3) {
          return this.mNameSc;
       }
       return TextUtils.i(this.mNameEn, this.mNameSc);
    }
}
