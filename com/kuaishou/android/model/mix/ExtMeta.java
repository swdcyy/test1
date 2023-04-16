package com.kuaishou.android.model.mix.ExtMeta;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class ExtMeta implements Serializable, a	// class@000c69
{
    public boolean isKaraokeEntry;
    public String karaokeTitle;
    public ImageMeta$Atlas mAtlas;
    public int mColor;
    public String mColorStr;
    public int mDelay;
    public CDNUrl[] mExtraLogoUrls;
    public int mHeight;
    public String mHintText;
    public String mLiveAudienceCount;
    public String mLiveLikeCount;
    public String mLiveStreamIds;
    public long mSeenTime;
    public ImageMeta$SinglePicture mSinglePicture;
    public int mStyle;
    public int mTkOffset;
    public String mTubeKoi;
    public int mType;
    public long mVideoDuration;
    public long mVideoViewCount;
    public int mWidth;
    public static final long serialVersionUID = 0x686431044d43d490;

    public void ExtMeta(){
       super();
       this.mColorStr = "00000000";
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, ExtMeta.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.mColorStr)) {
          String str = "#";
          this.mColor = ((this.mColorStr).startsWith(str))? TextUtils.J(this.mColorStr, 0): TextUtils.J(str+this.mColorStr, 0);
       }
    label_003f :
       return;
    }
    public boolean isSinglePicture(){
       boolean b = (this.mSinglePicture != null)? true: false;
       return b;
    }
}
