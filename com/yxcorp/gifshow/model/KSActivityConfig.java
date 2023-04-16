package com.yxcorp.gifshow.model.KSActivityConfig;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zf6.k;
import java.lang.StringBuilder;

public class KSActivityConfig implements a	// class@001e3b
{
    public int b;
    public String mColorStr;
    public String mConfigId;
    public String mDarkColorStr;
    public String mEntranceUrl;
    public String mHomeIconUrl;
    public String mIconUrl;
    public String mKsOrderId;
    public String mRedDotKsOrderId;
    public String mTitle;

    public void KSActivityConfig(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, KSActivityConfig.class, "1")) {
          return;
       }
       if (TextUtils.x(this.mColorStr)) {
          return;
       }
       String str = "#";
       if ((this.mColorStr).startsWith(str)) {
          KSActivityConfig tmDarkColorS = (k.d())? this.mDarkColorStr: this.mColorStr;
          this.b = TextUtils.J(tmDarkColorS, 0);
       }else {
          StringBuilder str1 = str;
          KSActivityConfig tmDarkColorS1 = (k.d())? this.mDarkColorStr: this.mColorStr;
          this.b = TextUtils.J(str1+tmDarkColorS1, 0);
       }
       return;
    }
}
