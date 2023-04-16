package com.kuaishou.android.model.mix.HyperTag;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class HyperTag implements Serializable	// class@000cb2
{
    public boolean isAnimationShowed;
    public String mActionUrl;
    public String mCommentId;
    public List mCommentIds;
    public boolean mDisableTailSpace;
    public boolean mEnableShowCommentPanel;
    public UserExtraInfo mExtraData;
    public String mExtraTagText;
    public String mHyperTagType;
    public CDNUrl[] mIcons;
    public boolean mMustUseHyperTag;
    public HyperTag$Icon mNormalIcon;
    public int mPymlFollowingIntensifyType;
    public boolean mShowArrow;
    public boolean mShowSeparator;
    public Map mTrackMap;
    public String mTruncableText;
    public String mUntruncableText;
    public boolean mUseInteract;
    public boolean mUseRecoTextInfo;
    public static final long serialVersionUID = 0x54f6cfc7d9af40d2;

    public void HyperTag(){
       super();
       this.isAnimationShowed = false;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, HyperTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.mUntruncableText) ^ 0x01);
    }
}
