package com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import fg6.a;
import com.google.gson.Gson;

public class LivePassThruParamExtraInfo implements Serializable	// class@000f8d
{
    public String mActivitySource;
    public boolean mEnableAdLog;
    public PhotoAdvertisement$FanstopLiveInfo mFansTopLiveInfo;
    public Map mFollowExtraInfo;
    public String mHotSpotId;
    public LivePassThruParamExtraInfo$LiveExtraInfo mLiveExtraInfo;
    public LivePassThruParamExtraInfo$LiveGameExtraInfo mLiveGameExtraInfo;
    public LivePassThruParamExtraInfo$LiveGzoneExtraInfo mLiveGzoneExtraInfo;
    public LivePassThruParamExtraInfo$LiveMerchantExtraParam mLiveMerchantExtraParam;
    public String mLivePathExtraInfo;
    public String mSlideGuideText;
    public static final long serialVersionUID = 0x353f8e1ccf3a3476;

    public void LivePassThruParamExtraInfo(){
       super();
    }
    public static LivePassThruParamExtraInfo extraFromSourceUrl(String p0){
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, LivePassThruParamExtraInfo.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!TextUtils.x(p0)) {
          Uri uri = Uri.parse(p0);
          obj1 = uri.getScheme();
          if (("kwai").equals(obj1) || ("kwailive").equals(obj1)) {
             uri = x0.a(uri, "extraInfo");
             if (!TextUtils.x(uri)) {
                obj = a.a.h(uri, LivePassThruParamExtraInfo.class);
             }
          }
       }
       return obj;
    }
}
