package com.kwai.components.nearbymodel.model.LocalSimpleLabelInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class LocalSimpleLabelInfo implements Serializable	// class@000c92
{
    public boolean mDisableAnimation;
    public boolean mEnableReloadGuideInfo;
    public boolean mHasGuideText;
    public boolean mIsGuideShowing;
    public boolean mIsReload;
    public boolean mIsSubTextShowing;
    public String mLeftIcon;
    public String mLinkGuideText;
    public String mLinkGuideType;
    public String mLinkUrl;
    public String mReloadParam;
    public String mSubTitleText;
    public String mTagType;
    public String mText;
    public int mViewWidth;
    public static final long serialVersionUID = 0x1808f74dc0935197;

    public void LocalSimpleLabelInfo(){
       super();
    }
    public boolean isAnimGuide(){
       Object obj = PatchProxy.apply(null, this, LocalSimpleLabelInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.isEmpty(this.mSubTitleText) && this.mDisableAnimation == null)? true: false;
       return b;
    }
}
