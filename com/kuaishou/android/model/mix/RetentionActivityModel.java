package com.kuaishou.android.model.mix.RetentionActivityModel;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zf6.k;
import java.lang.StringBuilder;

public class RetentionActivityModel implements Serializable, a	// class@000de7
{
    public String mBgImageUrl;
    public int mColor;
    public String mColorStr;
    public String mDarkColorStr;
    public String mIconUrl;
    public String mKsOrderId;
    public String mLinkUrl;
    public String mMoney;
    public String mRedDotKsOrderId;
    public String mText;
    public String mThumbnailUrl;
    public static final long serialVersionUID = 0x160525fda46f95a4;

    public void RetentionActivityModel(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RetentionActivityModel.class, "1")) {
          return;
       }
       if (TextUtils.x(this.mColorStr)) {
          return;
       }
       String str = "#";
       if ((this.mColorStr).startsWith(str)) {
          RetentionActivityModel tmDarkColorS = (k.d())? this.mDarkColorStr: this.mColorStr;
          this.mColor = TextUtils.J(tmDarkColorS, 0);
       }else {
          StringBuilder str1 = str;
          RetentionActivityModel tmDarkColorS1 = (k.d())? this.mDarkColorStr: this.mColorStr;
          this.mColor = TextUtils.J(str1+tmDarkColorS1, 0);
       }
       return;
    }
}
