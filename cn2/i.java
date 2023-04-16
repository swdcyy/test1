package cn2.i;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import com.kuaishou.live.core.show.wish.model.KrnLocationCityInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o96.u;
import fg6.a;
import com.google.gson.Gson;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import cn2.e;
import cn2.f;
import cn2.g;
import cn2.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import cn2.a;
import cn2.b;
import cn2.c;
import cn2.d;
import com.kuaishou.live.common.core.component.wishroom.LiveAudienceWishDetail;
import com.kwai.feature.api.danmaku.model.LiveDanmakuData;
import java.util.Random;
import com.kwai.feature.api.danmaku.model.DanmakuData;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kuaishou.live.common.core.component.wishroom.LiveAudienceWishDetail$Location;

public class i	// class@000577
{

    public void i(){
       super();
    }
    public static KrnLocationCityInfo a(LocationCityInfo p0){
       KrnLocationCityInfo obj = PatchProxy.applyOneRefs(p0, null, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KrnLocationCityInfo();
       obj.mCityName = (("NULL").equals(p0.mCityName))? p0.mProvince: p0.mCityName;
       obj.mLongitude = p0.mLongitude;
       obj.mLatitude = p0.mLatitude;
       obj.mProvince = p0.mProvince;
       obj.mAddress = p0.mAddress;
       obj.mCountry = p0.mCountry;
       obj.mCounty = p0.mCounty;
       return obj;
    }
    public static String b(){
       Object[] objArray = null;
       LocationCityInfo obj = PatchProxy.apply(objArray, objArray, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u.d();
       if (obj != null) {
          return i.c(a.a.q(i.a(obj)));
       }
       return objArray;
    }
    public static String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return "";
       }
       try{
          return URLEncoder.encode(p0, "UTF-8");
       }catch(java.io.UnsupportedEncodingException e3){
          e3.printStackTrace();
          return v1;
       }
    }
    public static String d(LiveStreamFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = k0.d(p0, e.a, f.a, g.a, h.a).orNull();
       if (!TextUtils.x(str)) {
          return str;
       }
       return null;
    }
    public static String e(LiveStreamFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = k0.d(p0, a.a, b.a, c.a, d.a).orNull();
       if (!TextUtils.x(str)) {
          return str;
       }
       return null;
    }
    public static LiveDanmakuData f(LiveAudienceWishDetail p0){
       LiveDanmakuData obj = PatchProxy.applyOneRefs(p0, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveDanmakuData(p0.mBarrageContent, (long)new Random().nextInt(2000));
       obj.mId = p0.mWishId;
       obj.mWishNo = p0.mWishNo;
       obj.mVisibleStatus = p0.mVisibleStatus;
       obj.mTagType = p0.mWishType;
       obj.mPropType = p0.mPropType;
       obj.mLiveStreamId = p0.mLiveStreamId;
       LiveAudienceWishDetail mUserInfo = p0.mUserInfo;
       obj.mUserId = mUserInfo.mId;
       obj.mUserName = mUserInfo.mName;
       obj.mUserSex = mUserInfo.mSex;
       obj.mHeadUrls = mUserInfo.mHeadUrls;
       UserInfo mExtraInfo = mUserInfo.mExtraInfo;
       if (mExtraInfo != null) {
          obj.mUserRoleInfoList = mExtraInfo.mRoleInfos;
       }
       obj.mLikeCount = p0.mBarrageLikeCount;
       obj.mDisplayLikeCount = p0.mBarrageDisplayLikeCount;
       obj.mTagUrl = p0.mBarrageTagUrl;
       obj.mPropsUrl = p0.mBarragePropsUrl;
       obj.mBackgroundCdnUrl = p0.mBarrageBackgroundUrl;
       p0 = p0.mLocation;
       if (p0 != null) {
          obj.mLatitude = p0.mLatitude;
          obj.mLongitude = p0.mLongitude;
          obj.mCity = p0.mCity;
          obj.mProvince = p0.mProvince;
          obj.mSubLocality = p0.mSubLocality;
       }
       return obj;
    }
}
