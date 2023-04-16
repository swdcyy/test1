package com.kuaishou.android.model.mix.QComment$Label;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.TextUtils;

public class QComment$Label implements Serializable, a	// class@000dca
{
    public String mBackgroundBlackColor;
    public String mBackgroundWhiteColor;
    public String mBlackColor;
    public String mBubbleText;
    public QComment$LabelExtra mExtra;
    public int mLabelBackgroundBlackColor;
    public int mLabelBackgroundColor;
    public int mLabelBackgroundWhiteColor;
    public int mLabelBlackColor;
    public int mLabelColor;
    public String mLabelName;
    public Integer mLabelType;
    public int mLabelWhiteColor;
    public String mLinkUrl;
    public String mWhiteColor;
    public static final long serialVersionUID = 0x45b430e6d6e8f8ea;

    public void QComment$Label(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, QComment$Label.class, "1")) {
          return;
       }
       this.mLabelWhiteColor = TextUtils.J(this.mWhiteColor, 0);
       this.mLabelBlackColor = TextUtils.J(this.mBlackColor, 0);
       this.mLabelBackgroundWhiteColor = TextUtils.J(this.mBackgroundWhiteColor, 0);
       this.mLabelBackgroundBlackColor = TextUtils.J(this.mBackgroundBlackColor, 0);
       return;
    }
}
