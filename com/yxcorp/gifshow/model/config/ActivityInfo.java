package com.yxcorp.gifshow.model.config.ActivityInfo;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.graphics.Color;

public class ActivityInfo implements Serializable, a	// class@001eb3
{
    public int mColor;
    public String mColorStr;
    public boolean mForceRedirectUrl;
    public boolean mHasIcon;
    public String mKeyword;
    public String mKsOrderId;
    public int mPressedColor;
    public String mTagId;
    public int mTagType;
    public String mUrl;
    public static final long serialVersionUID = 0xc78eab5768accbeb;

    public void ActivityInfo(){
       super();
       this.mHasIcon = true;
       this.mColor = 0;
       this.mPressedColor = 0;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, ActivityInfo.class, "1")) {
          return;
       }
       if (TextUtils.x(this.mColorStr)) {
          return;
       }
       String str = "#";
       int i = 0;
       this.mColor = ((this.mColorStr).startsWith(str))? TextUtils.J(this.mColorStr, i): TextUtils.J(str+this.mColorStr, i);
       this.mPressedColor = Color.argb(128, Color.red(this.mColor), Color.green(this.mColor), Color.blue(this.mColor));
       return;
    }
}
