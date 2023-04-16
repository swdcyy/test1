package com.kwai.framework.model.user.UserCoverMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.graphics.Color;
import java.lang.Exception;

public class UserCoverMeta implements Serializable	// class@00173b
{
    public String mAnchorPath;
    public String mColorStr;
    public String mCoverId;
    public CDNUrl[] mCoverThumbnailUrls;
    public CDNUrl[] mCoverUrls;
    public int mDelay;
    public String mExpTag;
    public CDNUrl[] mFFCoverThumbnailUrls;
    public int mHeight;
    public CDNUrl[] mOverrideCoverThumbnailUrls;
    public String mPhotoID;
    public int mType;
    public int mVideoCount;
    public long mVideoDuration;
    public int mWidth;
    public static final long serialVersionUID = 0xc6c3f5d4ab54fb5b;

    public void UserCoverMeta(){
       super();
       this.mColorStr = "00000000";
    }
    public int getColor(){
       Object obj = PatchProxy.apply(null, this, UserCoverMeta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0xff000000;
       if (!TextUtils.isEmpty(this.mColorStr)) {
          return Color.parseColor("#"+this.mColorStr);
       }
    }
}
