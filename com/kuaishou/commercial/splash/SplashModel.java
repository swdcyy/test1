package com.kuaishou.commercial.splash.SplashModel;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.VideoFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.PhotoType;
import com.kuaishou.android.model.mix.ExtMeta;
import kp.c;
import com.kuaishou.android.model.mix.CommonMeta;
import wkd.b;
import tb6.b;
import kka.h;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.VideoMeta;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.SplashInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo;
import java.lang.Number;

public class SplashModel implements Serializable, a	// class@001580
{
    public BaseFeed mBaseFeed;
    public PhotoAdvertisement mNonEyeMaxData;
    public String mSplashId;
    public SplashMaterialInfo mSplashMaterialInfo;
    public static int PLAYABLE_MATERIAL_TYPE_IMAGE = 2;
    public static int PLAYABLE_MATERIAL_TYPE_VIDEO = 1;
    public static final long serialVersionUID = 0x6035b53c53814586;

    public void SplashModel(){
       super();
    }
    public static VideoFeed getDefaultFeed(PhotoAdvertisement p0){
       VideoFeed obj = PatchProxy.applyOneRefs(p0, null, SplashModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new VideoFeed();
       obj.mExtMeta = c.a(PhotoType.VIDEO, 1, 1);
       CommonMeta uCommonMeta = new CommonMeta();
       obj.mCommonMeta = uCommonMeta;
       uCommonMeta.mCurrentNetwork = b.a(0x13545612).a();
       obj.mCommonMeta.mCurrentFreeTrafficType = b.a(-1592356291).c();
       obj.mCoverMeta = new CoverMeta();
       PhotoMeta photoMeta = new PhotoMeta();
       obj.mPhotoMeta = photoMeta;
       photoMeta.mPhotoId = "0";
       obj.mVideoModel = new VideoMeta();
       obj.mAd = p0;
       return obj;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, SplashModel.class, "3")) {
          return;
       }
       if (this.mBaseFeed != null) {
          return;
       }
       SplashModel tmNonEyeMaxD = this.mNonEyeMaxData;
       if (tmNonEyeMaxD == null) {
          return;
       }
       this.mBaseFeed = SplashModel.getDefaultFeed(tmNonEyeMaxD);
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SplashModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof SplashModel) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       return TextUtils.n(this.mSplashId, p0.mSplashId);
    }
    public String getSplashDarkLogoUrl(){
       SplashModel obj = PatchProxy.apply(null, this, SplashModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBaseFeed;
       if (obj == null) {
          return null;
       }
       PhotoAdvertisement photoAdverti = obj.get("AD");
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData mSplashInfo = photoAdverti.mSplashInfo;
             if (mSplashInfo != null) {
                SplashInfo mSplashLogoI = mSplashInfo.mSplashLogoInfo;
                if (mSplashLogoI != null) {
                   return mSplashLogoI.mLogoDarkUrl;
                }
             }
          }
       }
       return null;
    }
    public String getSplashLogoUrl(){
       SplashModel obj = PatchProxy.apply(null, this, SplashModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBaseFeed;
       if (obj == null) {
          return null;
       }
       PhotoAdvertisement photoAdverti = obj.get("AD");
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData mSplashInfo = photoAdverti.mSplashInfo;
             if (mSplashInfo != null) {
                SplashInfo mSplashLogoI = mSplashInfo.mSplashLogoInfo;
                if (mSplashLogoI != null) {
                   return mSplashLogoI.mLogoUrl;
                }
             }
          }
       }
       return null;
    }
    public int hashCode(){
       SplashModel obj = PatchProxy.apply(null, this, SplashModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mSplashId;
       if (obj != null) {
          return obj.hashCode();
       }
       return super.hashCode();
    }
}
