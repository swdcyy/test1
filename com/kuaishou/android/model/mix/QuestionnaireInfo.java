package com.kuaishou.android.model.mix.QuestionnaireInfo;
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

public class QuestionnaireInfo implements Serializable, a	// class@000dd9
{
    public int mBackgroundColor;
    public String mBackgroundColorStr;
    public int mFontSize;
    public int mHeight;
    public boolean mIsBold;
    public String mKsOrderId;
    public int mOperationType;
    public int mPressedBackgroundColor;
    public int mPressedTextColor;
    public String mTargetUrl;
    public String mText;
    public int mTextColor;
    public String mTextColorStr;

    public void QuestionnaireInfo(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, QuestionnaireInfo.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.mTextColorStr) && !TextUtils.x(this.mBackgroundColorStr)) {
          String str = "#";
          int i = 0;
          this.mTextColor = ((this.mTextColorStr).startsWith(str))? TextUtils.J(this.mTextColorStr, i): TextUtils.J(str+this.mTextColorStr, i);
          float f = 0x3f000000;
          this.mPressedTextColor = Color.argb((int)((float)Color.alpha(this.mTextColor) * f), Color.red(this.mTextColor), Color.green(this.mTextColor), Color.blue(this.mTextColor));
          this.mBackgroundColor = ((this.mBackgroundColorStr).startsWith(str))? TextUtils.J(this.mBackgroundColorStr, i): TextUtils.J(str+this.mBackgroundColorStr, i);
          this.mPressedBackgroundColor = Color.argb((int)((float)Color.alpha(this.mBackgroundColor) * f), Color.red(this.mBackgroundColor), Color.green(this.mBackgroundColor), Color.blue(this.mBackgroundColor));
       }
       return;
    }
}
